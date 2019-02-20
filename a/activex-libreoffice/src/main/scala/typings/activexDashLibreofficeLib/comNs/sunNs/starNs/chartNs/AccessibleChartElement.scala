package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This service is supported by all components that are contained in the view of a chart document that are controlled by the chart. Shapes added by a
  * user via the clipboard are not treated as chart elements.
  *
  * The list of objects that implement this service is {@link com.sun.star.chart.ChartTitle} , {@link com.sun.star.chart.ChartLegend} , {@link
  * com.sun.star.chart.Diagram} , {@link com.sun.star.chart.ChartAxis} , {@link com.sun.star.chart.ChartDataRowProperties} , {@link
  * com.sun.star.chart.ChartDataPointProperties} .
  *
  * The {@link com.sun.star.accessibility.XAccessibleExtendedComponent} is supported by all chart elements.
  * @since OOo 1.1.2
  */
trait AccessibleChartElement
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessibleExtendedComponent
     with activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessible
     with activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs.XAccessibleContext


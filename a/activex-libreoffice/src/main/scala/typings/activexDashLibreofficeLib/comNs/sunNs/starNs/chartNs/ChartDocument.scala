package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is the service for a chart document.
  *
  * A chart document consists of a reference to the data source, the diagram and some additional elements like a main title, a sub-title or a legend.
  * @see Diagram
  * @see ChartLegend
  * @see ChartTitle
  * @see ChartDataArray
  */
trait ChartDocument
  extends XChartDocument
     with activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.UserDefinedAttributesSupplier
     with activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
     with activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.XDrawPageSupplier {
  /** determines if the legend is shown or hidden. */
  var HasLegend: scala.Boolean
  /** determines if the main title is shown or hidden. */
  var HasMainTitle: scala.Boolean
  /** determines if the subtitle is shown or hidden. */
  var HasSubTitle: scala.Boolean
}


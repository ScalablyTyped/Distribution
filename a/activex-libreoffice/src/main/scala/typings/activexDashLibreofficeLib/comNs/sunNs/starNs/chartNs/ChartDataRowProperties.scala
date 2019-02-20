package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies the properties for a group of graphic elements which belong to a data row (also known as data series).
  *
  * For this service, the properties supported by {@link ChartDataPointProperties} are applied to all data point elements contained in this group. They
  * serve as a template; thus, when changing a data point property afterwards
  * @see ChartDataPointProperties
  */
trait ChartDataRowProperties
  extends ChartDataPointProperties
     with ChartStatistics {
  /**
    * determines to which axis the data row is assigned.
    *
    * The axis must be a primary or secondary y-axis
    * @see ChartAxisAssign
    * @see ChartAxisYSupplier
    * @see ChartTwoAxisYSupplier
    */
  var Axis: scala.Double
  /**
    * holds the properties of the error markers, if those are enabled.
    * @see ChartLine
    * @see ChartStatistics
    */
  var DataErrorProperties: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
  /**
    * holds the properties of the average line, if such one is enabled.
    * @see ChartLine
    * @see ChartStatistics
    */
  var DataMeanValueProperties: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
  /**
    * holds the properties of the regression line, if such one is enabled.
    * @see ChartLine
    * @see ChartStatistics
    */
  var DataRegressionProperties: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
}


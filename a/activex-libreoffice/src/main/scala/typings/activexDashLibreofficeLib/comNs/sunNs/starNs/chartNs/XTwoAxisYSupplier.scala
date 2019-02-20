package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * gives access to both the primary and the secondary y-axis of a diagram.
  * @see XChartDocument
  */
trait XTwoAxisYSupplier extends XAxisYSupplier {
  /**
    * @returns the properties of the secondary **y** -axis of the diagram.  The returned property set contains scaling properties as well as formatting properties.
    * @see ChartAxis
    */
  val SecondaryYAxis: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
  /**
    * @returns the properties of the secondary **y** -axis of the diagram.  The returned property set contains scaling properties as well as formatting properties.
    * @see ChartAxis
    */
  def getSecondaryYAxis(): activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
}


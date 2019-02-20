package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * gives access to both the primary and the secondary **x** -axis of a chart.
  * @see XDiagram
  */
trait XTwoAxisXSupplier extends XAxisXSupplier {
  /**
    * @returns the properties of the secondary **x** -axis of the diagram.  The returned property set contains scaling properties as well as formatting properties.
    * @see ChartAxis
    */
  val SecondaryXAxis: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
  /**
    * @returns the properties of the secondary **x** -axis of the diagram.  The returned property set contains scaling properties as well as formatting properties.
    * @see ChartAxis
    */
  def getSecondaryXAxis(): activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet
}


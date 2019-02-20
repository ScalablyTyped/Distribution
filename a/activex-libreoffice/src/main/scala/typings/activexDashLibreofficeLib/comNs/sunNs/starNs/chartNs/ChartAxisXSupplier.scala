package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** has to be supported by charts providing the capabilities of a horizontal axis, i.e., an **x** -axis. */
trait ChartAxisXSupplier extends XAxisXSupplier {
  /**
    * This property determines if the x-axis is shown or hidden.
    * @see ChartAxis
    */
  var HasXAxis: scala.Boolean
  /** Determines if the description of the x-axis is shown or hidden. */
  var HasXAxisDescription: scala.Boolean
  /**
    * Determines if the major grid of the x-axis is shown or hidden.
    * @see ChartGrid
    */
  var HasXAxisGrid: scala.Boolean
  /**
    * Determines if the minor grid of the x-axis is shown or hidden.
    * @see ChartGrid
    */
  var HasXAxisHelpGrid: scala.Boolean
  /**
    * Determines if the title of the x-axis is shown or hidden.
    * @see ChartTitle
    */
  var HasXAxisTitle: scala.Boolean
}


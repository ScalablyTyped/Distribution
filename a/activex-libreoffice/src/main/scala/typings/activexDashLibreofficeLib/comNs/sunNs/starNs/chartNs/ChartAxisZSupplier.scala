package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.chartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A helper service for chart documents which supply a z-axis. */
trait ChartAxisZSupplier extends XAxisZSupplier {
  /**
    * Determines if the z-axis is shown or hidden.
    * @see ChartAxis
    */
  var HasZAxis: scala.Boolean
  /** Determines if the description of the z-axis is shown or hidden. */
  var HasZAxisDescription: scala.Boolean
  /**
    * Determines if the major grid of the z-axis is shown or hidden.
    * @see ChartGrid
    */
  var HasZAxisGrid: scala.Boolean
  /**
    * Determines if the minor grid of the z-axis is shown or hidden.
    * @see ChartGrid
    */
  var HasZAxisHelpGrid: scala.Boolean
  /**
    * Determines if the title of the z-axis is shown or hidden.
    * @see ChartTitle
    */
  var HasZAxisTitle: scala.Boolean
}


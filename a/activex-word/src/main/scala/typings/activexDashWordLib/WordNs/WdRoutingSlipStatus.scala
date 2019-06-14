package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - activexDashWordLib.activexDashWordLibNumbers.`0`
  - activexDashWordLib.activexDashWordLibNumbers.`2`
  - activexDashWordLib.activexDashWordLibNumbers.`1`
*/
trait WdRoutingSlipStatus extends js.Object

object WdRoutingSlipStatus {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def wdNotYetRouted: activexDashWordLib.activexDashWordLibNumbers.`0` = this.cast(0)
  @scala.inline
  def wdRouteComplete: activexDashWordLib.activexDashWordLibNumbers.`2` = this.cast(2)
  @scala.inline
  def wdRouteInProgress: activexDashWordLib.activexDashWordLibNumbers.`1` = this.cast(1)
}


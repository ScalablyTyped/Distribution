package typings
package adoneLib.adoneNs.eventNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropagateEventsEnder extends js.Object {
  def end(): scala.Unit
}

object PropagateEventsEnder {
  @scala.inline
  def apply(end: js.Function0[scala.Unit]): PropagateEventsEnder = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("end")(end)
    __obj.asInstanceOf[PropagateEventsEnder]
  }
}


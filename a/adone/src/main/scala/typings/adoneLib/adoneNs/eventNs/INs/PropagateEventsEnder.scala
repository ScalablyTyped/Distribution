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
  def apply(end: () => scala.Unit): PropagateEventsEnder = {
    val __obj = js.Dynamic.literal(end = js.Any.fromFunction0(end))
  
    __obj.asInstanceOf[PropagateEventsEnder]
  }
}


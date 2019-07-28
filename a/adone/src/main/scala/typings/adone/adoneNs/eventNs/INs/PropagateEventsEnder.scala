package typings.adone.adoneNs.eventNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropagateEventsEnder extends js.Object {
  def end(): Unit
}

object PropagateEventsEnder {
  @scala.inline
  def apply(end: () => Unit): PropagateEventsEnder = {
    val __obj = js.Dynamic.literal(end = js.Any.fromFunction0(end))
  
    __obj.asInstanceOf[PropagateEventsEnder]
  }
}


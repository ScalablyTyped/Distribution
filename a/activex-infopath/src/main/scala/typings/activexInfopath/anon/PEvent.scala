package typings.activexInfopath.anon

import typings.activexInfopath.InfoPath.DocActionEventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PEvent extends js.Object {
  val pEvent: DocActionEventObject
}

object PEvent {
  @scala.inline
  def apply(pEvent: DocActionEventObject): PEvent = {
    val __obj = js.Dynamic.literal(pEvent = pEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[PEvent]
  }
}


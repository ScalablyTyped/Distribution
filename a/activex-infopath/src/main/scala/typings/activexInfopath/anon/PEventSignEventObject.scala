package typings.activexInfopath.anon

import typings.activexInfopath.InfoPath.SignEventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PEventSignEventObject extends js.Object {
  val pEvent: SignEventObject
}

object PEventSignEventObject {
  @scala.inline
  def apply(pEvent: SignEventObject): PEventSignEventObject = {
    val __obj = js.Dynamic.literal(pEvent = pEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[PEventSignEventObject]
  }
}


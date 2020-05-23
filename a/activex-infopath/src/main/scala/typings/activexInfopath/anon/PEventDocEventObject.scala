package typings.activexInfopath.anon

import typings.activexInfopath.InfoPath.DocEventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PEventDocEventObject extends js.Object {
  val pEvent: DocEventObject
}

object PEventDocEventObject {
  @scala.inline
  def apply(pEvent: DocEventObject): PEventDocEventObject = {
    val __obj = js.Dynamic.literal(pEvent = pEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[PEventDocEventObject]
  }
}


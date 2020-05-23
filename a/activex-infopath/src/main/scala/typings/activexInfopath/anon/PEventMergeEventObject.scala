package typings.activexInfopath.anon

import typings.activexInfopath.InfoPath.MergeEventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PEventMergeEventObject extends js.Object {
  val pEvent: MergeEventObject
}

object PEventMergeEventObject {
  @scala.inline
  def apply(pEvent: MergeEventObject): PEventMergeEventObject = {
    val __obj = js.Dynamic.literal(pEvent = pEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[PEventMergeEventObject]
  }
}


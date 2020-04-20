package typings.activexWord

import typings.activexWord.Word.ContentControl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOldContentControl extends js.Object {
  val InUndoRedo: Boolean
  val OldContentControl: ContentControl
}

object AnonOldContentControl {
  @scala.inline
  def apply(InUndoRedo: Boolean, OldContentControl: ContentControl): AnonOldContentControl = {
    val __obj = js.Dynamic.literal(InUndoRedo = InUndoRedo.asInstanceOf[js.Any], OldContentControl = OldContentControl.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOldContentControl]
  }
}


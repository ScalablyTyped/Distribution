package typings.activexWord

import typings.activexWord.Word.ContentControl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonInUndoRedoOldContentControl extends js.Object {
  val InUndoRedo: Boolean
  val OldContentControl: ContentControl
}

object AnonInUndoRedoOldContentControl {
  @scala.inline
  def apply(InUndoRedo: Boolean, OldContentControl: ContentControl): AnonInUndoRedoOldContentControl = {
    val __obj = js.Dynamic.literal(InUndoRedo = InUndoRedo.asInstanceOf[js.Any], OldContentControl = OldContentControl.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonInUndoRedoOldContentControl]
  }
}


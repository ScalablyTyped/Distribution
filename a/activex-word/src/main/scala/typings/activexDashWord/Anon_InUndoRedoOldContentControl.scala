package typings.activexDashWord

import typings.activexDashWord.Word.ContentControl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_InUndoRedoOldContentControl extends js.Object {
  val InUndoRedo: Boolean
  val OldContentControl: ContentControl
}

object Anon_InUndoRedoOldContentControl {
  @scala.inline
  def apply(InUndoRedo: Boolean, OldContentControl: ContentControl): Anon_InUndoRedoOldContentControl = {
    val __obj = js.Dynamic.literal(InUndoRedo = InUndoRedo.asInstanceOf[js.Any], OldContentControl = OldContentControl.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_InUndoRedoOldContentControl]
  }
}


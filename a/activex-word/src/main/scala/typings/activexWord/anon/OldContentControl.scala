package typings.activexWord.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OldContentControl extends js.Object {
  val InUndoRedo: Boolean
  val OldContentControl: typings.activexWord.Word.ContentControl
}

object OldContentControl {
  @scala.inline
  def apply(InUndoRedo: Boolean, OldContentControl: typings.activexWord.Word.ContentControl): OldContentControl = {
    val __obj = js.Dynamic.literal(InUndoRedo = InUndoRedo.asInstanceOf[js.Any], OldContentControl = OldContentControl.asInstanceOf[js.Any])
    __obj.asInstanceOf[OldContentControl]
  }
}


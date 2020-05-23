package typings.activexWord.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InUndoRedo extends js.Object {
  val InUndoRedo: Boolean
  val NewContentControl: typings.activexWord.Word.ContentControl
}

object InUndoRedo {
  @scala.inline
  def apply(InUndoRedo: Boolean, NewContentControl: typings.activexWord.Word.ContentControl): InUndoRedo = {
    val __obj = js.Dynamic.literal(InUndoRedo = InUndoRedo.asInstanceOf[js.Any], NewContentControl = NewContentControl.asInstanceOf[js.Any])
    __obj.asInstanceOf[InUndoRedo]
  }
}


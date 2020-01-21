package typings.activexWord

import typings.activexWord.Word.ContentControl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonInUndoRedo extends js.Object {
  val InUndoRedo: Boolean
  val NewContentControl: ContentControl
}

object AnonInUndoRedo {
  @scala.inline
  def apply(InUndoRedo: Boolean, NewContentControl: ContentControl): AnonInUndoRedo = {
    val __obj = js.Dynamic.literal(InUndoRedo = InUndoRedo.asInstanceOf[js.Any], NewContentControl = NewContentControl.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonInUndoRedo]
  }
}


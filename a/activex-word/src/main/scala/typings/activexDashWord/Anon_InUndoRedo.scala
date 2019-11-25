package typings.activexDashWord

import typings.activexDashWord.Word.ContentControl
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_InUndoRedo extends js.Object {
  val InUndoRedo: Boolean
  val NewContentControl: ContentControl
}

object Anon_InUndoRedo {
  @scala.inline
  def apply(InUndoRedo: Boolean, NewContentControl: ContentControl): Anon_InUndoRedo = {
    val __obj = js.Dynamic.literal(InUndoRedo = InUndoRedo.asInstanceOf[js.Any], NewContentControl = NewContentControl.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_InUndoRedo]
  }
}


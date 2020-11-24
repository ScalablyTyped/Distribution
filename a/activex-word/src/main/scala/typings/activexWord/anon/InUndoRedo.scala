package typings.activexWord.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InUndoRedo extends js.Object {
  
  val InUndoRedo: Boolean = js.native
  
  val NewContentControl: typings.activexWord.Word.ContentControl = js.native
}
object InUndoRedo {
  
  @scala.inline
  def apply(InUndoRedo: Boolean, NewContentControl: typings.activexWord.Word.ContentControl): InUndoRedo = {
    val __obj = js.Dynamic.literal(InUndoRedo = InUndoRedo.asInstanceOf[js.Any], NewContentControl = NewContentControl.asInstanceOf[js.Any])
    __obj.asInstanceOf[InUndoRedo]
  }
  
  @scala.inline
  implicit class InUndoRedoOps[Self <: InUndoRedo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setInUndoRedo(value: Boolean): Self = this.set("InUndoRedo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewContentControl(value: typings.activexWord.Word.ContentControl): Self = this.set("NewContentControl", value.asInstanceOf[js.Any])
  }
}

package typings.activexWord.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OldContentControl extends js.Object {
  
  val InUndoRedo: Boolean = js.native
  
  val OldContentControl: typings.activexWord.Word.ContentControl = js.native
}
object OldContentControl {
  
  @scala.inline
  def apply(InUndoRedo: Boolean, OldContentControl: typings.activexWord.Word.ContentControl): OldContentControl = {
    val __obj = js.Dynamic.literal(InUndoRedo = InUndoRedo.asInstanceOf[js.Any], OldContentControl = OldContentControl.asInstanceOf[js.Any])
    __obj.asInstanceOf[OldContentControl]
  }
  
  @scala.inline
  implicit class OldContentControlOps[Self <: OldContentControl] (val x: Self) extends AnyVal {
    
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
    def setOldContentControl(value: typings.activexWord.Word.ContentControl): Self = this.set("OldContentControl", value.asInstanceOf[js.Any])
  }
}

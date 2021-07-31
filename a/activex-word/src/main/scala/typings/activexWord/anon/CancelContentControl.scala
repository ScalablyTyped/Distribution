package typings.activexWord.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelContentControl extends StObject {
  
  var Cancel: Boolean
  
  val ContentControl: typings.activexWord.Word.ContentControl
}
object CancelContentControl {
  
  @scala.inline
  def apply(Cancel: Boolean, ContentControl: typings.activexWord.Word.ContentControl): CancelContentControl = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], ContentControl = ContentControl.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelContentControl]
  }
  
  @scala.inline
  implicit class CancelContentControlMutableBuilder[Self <: CancelContentControl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCancel(value: Boolean): Self = StObject.set(x, "Cancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentControl(value: typings.activexWord.Word.ContentControl): Self = StObject.set(x, "ContentControl", value.asInstanceOf[js.Any])
  }
}

package typings.activexExcel.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelSaveAsUI extends StObject {
  
  var Cancel: Boolean
  
  val SaveAsUI: Boolean
}
object CancelSaveAsUI {
  
  @scala.inline
  def apply(Cancel: Boolean, SaveAsUI: Boolean): CancelSaveAsUI = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], SaveAsUI = SaveAsUI.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelSaveAsUI]
  }
  
  @scala.inline
  implicit class CancelSaveAsUIMutableBuilder[Self <: CancelSaveAsUI] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCancel(value: Boolean): Self = StObject.set(x, "Cancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSaveAsUI(value: Boolean): Self = StObject.set(x, "SaveAsUI", value.asInstanceOf[js.Any])
  }
}

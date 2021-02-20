package typings.antdMobile.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BackspaceLabel extends StObject {
  
  var backspaceLabel: String = js.native
  
  var cancelKeyboardLabel: String = js.native
  
  var confirmLabel: String = js.native
}
object BackspaceLabel {
  
  @scala.inline
  def apply(backspaceLabel: String, cancelKeyboardLabel: String, confirmLabel: String): BackspaceLabel = {
    val __obj = js.Dynamic.literal(backspaceLabel = backspaceLabel.asInstanceOf[js.Any], cancelKeyboardLabel = cancelKeyboardLabel.asInstanceOf[js.Any], confirmLabel = confirmLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackspaceLabel]
  }
  
  @scala.inline
  implicit class BackspaceLabelMutableBuilder[Self <: BackspaceLabel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackspaceLabel(value: String): Self = StObject.set(x, "backspaceLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelKeyboardLabel(value: String): Self = StObject.set(x, "cancelKeyboardLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfirmLabel(value: String): Self = StObject.set(x, "confirmLabel", value.asInstanceOf[js.Any])
  }
}

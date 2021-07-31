package typings.antdMobile.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActivateText extends StObject {
  
  var activateText: String
  
  var deactivateText: String
  
  var finishText: String
}
object ActivateText {
  
  @scala.inline
  def apply(activateText: String, deactivateText: String, finishText: String): ActivateText = {
    val __obj = js.Dynamic.literal(activateText = activateText.asInstanceOf[js.Any], deactivateText = deactivateText.asInstanceOf[js.Any], finishText = finishText.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivateText]
  }
  
  @scala.inline
  implicit class ActivateTextMutableBuilder[Self <: ActivateText] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActivateText(value: String): Self = StObject.set(x, "activateText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeactivateText(value: String): Self = StObject.set(x, "deactivateText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFinishText(value: String): Self = StObject.set(x, "finishText", value.asInstanceOf[js.Any])
  }
}

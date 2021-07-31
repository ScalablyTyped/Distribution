package typings.atom.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Buttons extends StObject {
  
  var buttons: js.UndefOr[js.Array[String]] = js.undefined
  
  var detailedMessage: js.UndefOr[String] = js.undefined
  
  var message: String
}
object Buttons {
  
  @scala.inline
  def apply(message: String): Buttons = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[Buttons]
  }
  
  @scala.inline
  implicit class ButtonsMutableBuilder[Self <: Buttons] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setButtons(value: js.Array[String]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
    
    @scala.inline
    def setButtonsVarargs(value: String*): Self = StObject.set(x, "buttons", js.Array(value :_*))
    
    @scala.inline
    def setDetailedMessage(value: String): Self = StObject.set(x, "detailedMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetailedMessageUndefined: Self = StObject.set(x, "detailedMessage", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}

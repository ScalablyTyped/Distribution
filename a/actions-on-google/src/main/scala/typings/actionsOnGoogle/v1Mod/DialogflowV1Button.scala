package typings.actionsOnGoogle.v1Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DialogflowV1Button extends StObject {
  
  var postback: js.UndefOr[String] = js.native
  
  var text: js.UndefOr[String] = js.native
}
object DialogflowV1Button {
  
  @scala.inline
  def apply(): DialogflowV1Button = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DialogflowV1Button]
  }
  
  @scala.inline
  implicit class DialogflowV1ButtonMutableBuilder[Self <: DialogflowV1Button] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPostback(value: String): Self = StObject.set(x, "postback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostbackUndefined: Self = StObject.set(x, "postback", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}

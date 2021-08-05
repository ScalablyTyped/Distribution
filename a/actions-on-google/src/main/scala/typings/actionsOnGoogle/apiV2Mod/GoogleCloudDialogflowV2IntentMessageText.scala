package typings.actionsOnGoogle.apiV2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowV2IntentMessageText extends StObject {
  
  var text: js.UndefOr[js.Array[String]] = js.undefined
}
object GoogleCloudDialogflowV2IntentMessageText {
  
  inline def apply(): GoogleCloudDialogflowV2IntentMessageText = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2IntentMessageText]
  }
  
  extension [Self <: GoogleCloudDialogflowV2IntentMessageText](x: Self) {
    
    inline def setText(value: js.Array[String]): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setTextVarargs(value: String*): Self = StObject.set(x, "text", js.Array(value :_*))
  }
}

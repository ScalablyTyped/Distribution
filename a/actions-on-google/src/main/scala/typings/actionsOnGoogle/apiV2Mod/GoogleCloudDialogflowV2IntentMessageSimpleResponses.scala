package typings.actionsOnGoogle.apiV2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowV2IntentMessageSimpleResponses extends StObject {
  
  var simpleResponses: js.UndefOr[js.Array[GoogleCloudDialogflowV2IntentMessageSimpleResponse]] = js.undefined
}
object GoogleCloudDialogflowV2IntentMessageSimpleResponses {
  
  inline def apply(): GoogleCloudDialogflowV2IntentMessageSimpleResponses = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2IntentMessageSimpleResponses]
  }
  
  extension [Self <: GoogleCloudDialogflowV2IntentMessageSimpleResponses](x: Self) {
    
    inline def setSimpleResponses(value: js.Array[GoogleCloudDialogflowV2IntentMessageSimpleResponse]): Self = StObject.set(x, "simpleResponses", value.asInstanceOf[js.Any])
    
    inline def setSimpleResponsesUndefined: Self = StObject.set(x, "simpleResponses", js.undefined)
    
    inline def setSimpleResponsesVarargs(value: GoogleCloudDialogflowV2IntentMessageSimpleResponse*): Self = StObject.set(x, "simpleResponses", js.Array(value*))
  }
}

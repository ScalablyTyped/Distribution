package typings.actionsOnGoogle.apiV2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDialogflowV2IntentMessageSimpleResponses extends StObject {
  
  var simpleResponses: js.UndefOr[js.Array[GoogleCloudDialogflowV2IntentMessageSimpleResponse]] = js.native
}
object GoogleCloudDialogflowV2IntentMessageSimpleResponses {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowV2IntentMessageSimpleResponses = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2IntentMessageSimpleResponses]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowV2IntentMessageSimpleResponsesMutableBuilder[Self <: GoogleCloudDialogflowV2IntentMessageSimpleResponses] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSimpleResponses(value: js.Array[GoogleCloudDialogflowV2IntentMessageSimpleResponse]): Self = StObject.set(x, "simpleResponses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSimpleResponsesUndefined: Self = StObject.set(x, "simpleResponses", js.undefined)
    
    @scala.inline
    def setSimpleResponsesVarargs(value: GoogleCloudDialogflowV2IntentMessageSimpleResponse*): Self = StObject.set(x, "simpleResponses", js.Array(value :_*))
  }
}

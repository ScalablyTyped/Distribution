package typings.actionsOnGoogle.distServiceDialogflowApiV2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowV2IntentMessageSuggestion extends StObject {
  
  var title: js.UndefOr[String] = js.undefined
}
object GoogleCloudDialogflowV2IntentMessageSuggestion {
  
  inline def apply(): GoogleCloudDialogflowV2IntentMessageSuggestion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2IntentMessageSuggestion]
  }
  
  extension [Self <: GoogleCloudDialogflowV2IntentMessageSuggestion](x: Self) {
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}

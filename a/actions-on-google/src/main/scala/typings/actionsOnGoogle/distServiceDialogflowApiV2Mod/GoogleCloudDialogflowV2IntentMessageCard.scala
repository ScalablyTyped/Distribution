package typings.actionsOnGoogle.distServiceDialogflowApiV2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowV2IntentMessageCard extends StObject {
  
  var buttons: js.UndefOr[js.Array[GoogleCloudDialogflowV2IntentMessageCardButton]] = js.undefined
  
  var imageUri: js.UndefOr[String] = js.undefined
  
  var subtitle: js.UndefOr[String] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
}
object GoogleCloudDialogflowV2IntentMessageCard {
  
  inline def apply(): GoogleCloudDialogflowV2IntentMessageCard = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2IntentMessageCard]
  }
  
  extension [Self <: GoogleCloudDialogflowV2IntentMessageCard](x: Self) {
    
    inline def setButtons(value: js.Array[GoogleCloudDialogflowV2IntentMessageCardButton]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    inline def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
    
    inline def setButtonsVarargs(value: GoogleCloudDialogflowV2IntentMessageCardButton*): Self = StObject.set(x, "buttons", js.Array(value*))
    
    inline def setImageUri(value: String): Self = StObject.set(x, "imageUri", value.asInstanceOf[js.Any])
    
    inline def setImageUriUndefined: Self = StObject.set(x, "imageUri", js.undefined)
    
    inline def setSubtitle(value: String): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
    
    inline def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}

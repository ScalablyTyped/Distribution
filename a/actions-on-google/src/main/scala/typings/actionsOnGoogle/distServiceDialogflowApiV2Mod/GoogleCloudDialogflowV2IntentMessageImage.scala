package typings.actionsOnGoogle.distServiceDialogflowApiV2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowV2IntentMessageImage extends StObject {
  
  var accessibilityText: js.UndefOr[String] = js.undefined
  
  var imageUri: js.UndefOr[String] = js.undefined
}
object GoogleCloudDialogflowV2IntentMessageImage {
  
  inline def apply(): GoogleCloudDialogflowV2IntentMessageImage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2IntentMessageImage]
  }
  
  extension [Self <: GoogleCloudDialogflowV2IntentMessageImage](x: Self) {
    
    inline def setAccessibilityText(value: String): Self = StObject.set(x, "accessibilityText", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityTextUndefined: Self = StObject.set(x, "accessibilityText", js.undefined)
    
    inline def setImageUri(value: String): Self = StObject.set(x, "imageUri", value.asInstanceOf[js.Any])
    
    inline def setImageUriUndefined: Self = StObject.set(x, "imageUri", js.undefined)
  }
}

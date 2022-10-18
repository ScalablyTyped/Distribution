package typings.actionsOnGoogle.distServiceDialogflowApiV2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowV2IntentMessageCarouselSelectItem extends StObject {
  
  var description: js.UndefOr[String] = js.undefined
  
  var image: js.UndefOr[GoogleCloudDialogflowV2IntentMessageImage] = js.undefined
  
  var info: js.UndefOr[GoogleCloudDialogflowV2IntentMessageSelectItemInfo] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
}
object GoogleCloudDialogflowV2IntentMessageCarouselSelectItem {
  
  inline def apply(): GoogleCloudDialogflowV2IntentMessageCarouselSelectItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2IntentMessageCarouselSelectItem]
  }
  
  extension [Self <: GoogleCloudDialogflowV2IntentMessageCarouselSelectItem](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setImage(value: GoogleCloudDialogflowV2IntentMessageImage): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    inline def setInfo(value: GoogleCloudDialogflowV2IntentMessageSelectItemInfo): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    inline def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}

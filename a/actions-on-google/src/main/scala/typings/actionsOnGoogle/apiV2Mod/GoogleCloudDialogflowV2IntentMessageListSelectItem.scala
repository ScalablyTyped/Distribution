package typings.actionsOnGoogle.apiV2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDialogflowV2IntentMessageListSelectItem extends StObject {
  
  var description: js.UndefOr[String] = js.undefined
  
  var image: js.UndefOr[GoogleCloudDialogflowV2IntentMessageImage] = js.undefined
  
  var info: js.UndefOr[GoogleCloudDialogflowV2IntentMessageSelectItemInfo] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
}
object GoogleCloudDialogflowV2IntentMessageListSelectItem {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowV2IntentMessageListSelectItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2IntentMessageListSelectItem]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowV2IntentMessageListSelectItemMutableBuilder[Self <: GoogleCloudDialogflowV2IntentMessageListSelectItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setImage(value: GoogleCloudDialogflowV2IntentMessageImage): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    @scala.inline
    def setInfo(value: GoogleCloudDialogflowV2IntentMessageSelectItemInfo): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}

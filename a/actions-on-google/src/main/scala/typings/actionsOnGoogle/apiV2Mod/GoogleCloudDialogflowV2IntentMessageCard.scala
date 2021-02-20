package typings.actionsOnGoogle.apiV2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDialogflowV2IntentMessageCard extends StObject {
  
  var buttons: js.UndefOr[js.Array[GoogleCloudDialogflowV2IntentMessageCardButton]] = js.native
  
  var imageUri: js.UndefOr[String] = js.native
  
  var subtitle: js.UndefOr[String] = js.native
  
  var title: js.UndefOr[String] = js.native
}
object GoogleCloudDialogflowV2IntentMessageCard {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowV2IntentMessageCard = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2IntentMessageCard]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowV2IntentMessageCardMutableBuilder[Self <: GoogleCloudDialogflowV2IntentMessageCard] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setButtons(value: js.Array[GoogleCloudDialogflowV2IntentMessageCardButton]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
    
    @scala.inline
    def setButtonsVarargs(value: GoogleCloudDialogflowV2IntentMessageCardButton*): Self = StObject.set(x, "buttons", js.Array(value :_*))
    
    @scala.inline
    def setImageUri(value: String): Self = StObject.set(x, "imageUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUriUndefined: Self = StObject.set(x, "imageUri", js.undefined)
    
    @scala.inline
    def setSubtitle(value: String): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}

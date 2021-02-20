package typings.actionsOnGoogle.apiV2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudDialogflowV2IntentMessageCarouselSelect extends StObject {
  
  var items: js.UndefOr[js.Array[GoogleCloudDialogflowV2IntentMessageCarouselSelectItem]] = js.native
}
object GoogleCloudDialogflowV2IntentMessageCarouselSelect {
  
  @scala.inline
  def apply(): GoogleCloudDialogflowV2IntentMessageCarouselSelect = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDialogflowV2IntentMessageCarouselSelect]
  }
  
  @scala.inline
  implicit class GoogleCloudDialogflowV2IntentMessageCarouselSelectMutableBuilder[Self <: GoogleCloudDialogflowV2IntentMessageCarouselSelect] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[GoogleCloudDialogflowV2IntentMessageCarouselSelectItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: GoogleCloudDialogflowV2IntentMessageCarouselSelectItem*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}

package typings.actionsOnGoogle.distServiceActionssdkApiV2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleActionsV2UiElementsListSelect extends StObject {
  
  /**
    * min: 2 max: 30
    */
  var items: js.UndefOr[js.Array[GoogleActionsV2UiElementsListSelectListItem]] = js.undefined
  
  /**
    * Subtitle of the list.
    * Optional.
    */
  var subtitle: js.UndefOr[String] = js.undefined
  
  /**
    * Overall title of the list.
    * Optional.
    */
  var title: js.UndefOr[String] = js.undefined
}
object GoogleActionsV2UiElementsListSelect {
  
  inline def apply(): GoogleActionsV2UiElementsListSelect = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2UiElementsListSelect]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleActionsV2UiElementsListSelect] (val x: Self) extends AnyVal {
    
    inline def setItems(value: js.Array[GoogleActionsV2UiElementsListSelectListItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: GoogleActionsV2UiElementsListSelectListItem*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setSubtitle(value: String): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
    
    inline def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}

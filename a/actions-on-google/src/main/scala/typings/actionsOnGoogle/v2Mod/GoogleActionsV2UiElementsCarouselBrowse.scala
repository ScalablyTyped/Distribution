package typings.actionsOnGoogle.v2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleActionsV2UiElementsCarouselBrowse extends StObject {
  
  /**
    * Type of image display option.
    * Optional.
    */
  var imageDisplayOptions: js.UndefOr[GoogleActionsV2UiElementsCarouselBrowseImageDisplayOptions] = js.undefined
  
  /**
    * Min: 2. Max: 10.
    */
  var items: js.UndefOr[js.Array[GoogleActionsV2UiElementsCarouselBrowseItem]] = js.undefined
}
object GoogleActionsV2UiElementsCarouselBrowse {
  
  inline def apply(): GoogleActionsV2UiElementsCarouselBrowse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2UiElementsCarouselBrowse]
  }
  
  extension [Self <: GoogleActionsV2UiElementsCarouselBrowse](x: Self) {
    
    inline def setImageDisplayOptions(value: GoogleActionsV2UiElementsCarouselBrowseImageDisplayOptions): Self = StObject.set(x, "imageDisplayOptions", value.asInstanceOf[js.Any])
    
    inline def setImageDisplayOptionsUndefined: Self = StObject.set(x, "imageDisplayOptions", js.undefined)
    
    inline def setItems(value: js.Array[GoogleActionsV2UiElementsCarouselBrowseItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: GoogleActionsV2UiElementsCarouselBrowseItem*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}

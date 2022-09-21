package typings.actionsOnGoogle.v2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleActionsV2UiElementsCarouselSelect extends StObject {
  
  /**
    * Type of image display option. Optional.
    */
  var imageDisplayOptions: js.UndefOr[GoogleActionsV2UiElementsCarouselSelectImageDisplayOptions] = js.undefined
  
  /**
    * min: 2 max: 10
    */
  var items: js.UndefOr[js.Array[GoogleActionsV2UiElementsCarouselSelectCarouselItem]] = js.undefined
  
  /**
    * Subtitle of the carousel. Optional.
    */
  var subtitle: js.UndefOr[String] = js.undefined
  
  /**
    * Title of the carousel. Optional.
    */
  var title: js.UndefOr[String] = js.undefined
}
object GoogleActionsV2UiElementsCarouselSelect {
  
  inline def apply(): GoogleActionsV2UiElementsCarouselSelect = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2UiElementsCarouselSelect]
  }
  
  extension [Self <: GoogleActionsV2UiElementsCarouselSelect](x: Self) {
    
    inline def setImageDisplayOptions(value: GoogleActionsV2UiElementsCarouselSelectImageDisplayOptions): Self = StObject.set(x, "imageDisplayOptions", value.asInstanceOf[js.Any])
    
    inline def setImageDisplayOptionsUndefined: Self = StObject.set(x, "imageDisplayOptions", js.undefined)
    
    inline def setItems(value: js.Array[GoogleActionsV2UiElementsCarouselSelectCarouselItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: GoogleActionsV2UiElementsCarouselSelectCarouselItem*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setSubtitle(value: String): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
    
    inline def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}

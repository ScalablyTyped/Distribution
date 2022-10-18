package typings.actionsOnGoogle.distServiceActionssdkApiV2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleActionsV2OptionValueSpec extends StObject {
  
  /**
    * A select with a card carousel GUI, use collection_select instead.
    */
  var carouselSelect: js.UndefOr[GoogleActionsV2UiElementsCarouselSelect] = js.undefined
  
  /**
    * A select with a card collection GUI
    */
  var collectionSelect: js.UndefOr[GoogleActionsV2UiElementsCollectionSelect] = js.undefined
  
  /**
    * A select with a list card GUI
    */
  var listSelect: js.UndefOr[GoogleActionsV2UiElementsListSelect] = js.undefined
  
  /**
    * A simple select with no associated GUI
    */
  var simpleSelect: js.UndefOr[GoogleActionsV2SimpleSelect] = js.undefined
}
object GoogleActionsV2OptionValueSpec {
  
  inline def apply(): GoogleActionsV2OptionValueSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2OptionValueSpec]
  }
  
  extension [Self <: GoogleActionsV2OptionValueSpec](x: Self) {
    
    inline def setCarouselSelect(value: GoogleActionsV2UiElementsCarouselSelect): Self = StObject.set(x, "carouselSelect", value.asInstanceOf[js.Any])
    
    inline def setCarouselSelectUndefined: Self = StObject.set(x, "carouselSelect", js.undefined)
    
    inline def setCollectionSelect(value: GoogleActionsV2UiElementsCollectionSelect): Self = StObject.set(x, "collectionSelect", value.asInstanceOf[js.Any])
    
    inline def setCollectionSelectUndefined: Self = StObject.set(x, "collectionSelect", js.undefined)
    
    inline def setListSelect(value: GoogleActionsV2UiElementsListSelect): Self = StObject.set(x, "listSelect", value.asInstanceOf[js.Any])
    
    inline def setListSelectUndefined: Self = StObject.set(x, "listSelect", js.undefined)
    
    inline def setSimpleSelect(value: GoogleActionsV2SimpleSelect): Self = StObject.set(x, "simpleSelect", value.asInstanceOf[js.Any])
    
    inline def setSimpleSelectUndefined: Self = StObject.set(x, "simpleSelect", js.undefined)
  }
}

package typings.actionsOnGoogle.distServiceActionssdkApiV2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleActionsV2UiElementsBasicCard extends StObject {
  
  /**
    * Buttons.
    * Currently at most 1 button is supported.
    * Optional.
    */
  var buttons: js.UndefOr[js.Array[GoogleActionsV2UiElementsButton]] = js.undefined
  
  /**
    * Body text of the card.
    * Supports a limited set of markdown syntax for formatting.
    * Required, unless image is present.
    */
  var formattedText: js.UndefOr[String] = js.undefined
  
  /**
    * A hero image for the card. The height is fixed to 192dp.
    * Optional.
    */
  var image: js.UndefOr[GoogleActionsV2UiElementsImage] = js.undefined
  
  /**
    * Type of image display option. Optional.
    */
  var imageDisplayOptions: js.UndefOr[GoogleActionsV2UiElementsBasicCardImageDisplayOptions] = js.undefined
  
  /**
    * Optional.
    */
  var subtitle: js.UndefOr[String] = js.undefined
  
  /**
    * Overall title of the card.
    * Optional.
    */
  var title: js.UndefOr[String] = js.undefined
}
object GoogleActionsV2UiElementsBasicCard {
  
  inline def apply(): GoogleActionsV2UiElementsBasicCard = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2UiElementsBasicCard]
  }
  
  extension [Self <: GoogleActionsV2UiElementsBasicCard](x: Self) {
    
    inline def setButtons(value: js.Array[GoogleActionsV2UiElementsButton]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    inline def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
    
    inline def setButtonsVarargs(value: GoogleActionsV2UiElementsButton*): Self = StObject.set(x, "buttons", js.Array(value*))
    
    inline def setFormattedText(value: String): Self = StObject.set(x, "formattedText", value.asInstanceOf[js.Any])
    
    inline def setFormattedTextUndefined: Self = StObject.set(x, "formattedText", js.undefined)
    
    inline def setImage(value: GoogleActionsV2UiElementsImage): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageDisplayOptions(value: GoogleActionsV2UiElementsBasicCardImageDisplayOptions): Self = StObject.set(x, "imageDisplayOptions", value.asInstanceOf[js.Any])
    
    inline def setImageDisplayOptionsUndefined: Self = StObject.set(x, "imageDisplayOptions", js.undefined)
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    inline def setSubtitle(value: String): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
    
    inline def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}

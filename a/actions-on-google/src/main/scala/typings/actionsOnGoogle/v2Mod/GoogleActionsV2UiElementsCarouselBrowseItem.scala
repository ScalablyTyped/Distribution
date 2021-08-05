package typings.actionsOnGoogle.v2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleActionsV2UiElementsCarouselBrowseItem extends StObject {
  
  /**
    * Description of the carousel item.
    * Optional.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Footer text for the carousel item, displayed below the description.
    * Single line of text, truncated with an ellipsis.
    * Optional.
    */
  var footer: js.UndefOr[String] = js.undefined
  
  /**
    * Hero image for the carousel item.
    * Optional.
    */
  var image: js.UndefOr[GoogleActionsV2UiElementsImage] = js.undefined
  
  /**
    * URL of the document associated with the carousel item.
    * The document can contain HTML content or, if \"url_type_hint\" is set to
    * AMP_CONTENT, AMP content.
    * Required.
    */
  var openUrlAction: js.UndefOr[GoogleActionsV2UiElementsOpenUrlAction] = js.undefined
  
  /**
    * Title of the carousel item.
    * Required.
    */
  var title: js.UndefOr[String] = js.undefined
}
object GoogleActionsV2UiElementsCarouselBrowseItem {
  
  inline def apply(): GoogleActionsV2UiElementsCarouselBrowseItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2UiElementsCarouselBrowseItem]
  }
  
  extension [Self <: GoogleActionsV2UiElementsCarouselBrowseItem](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setFooter(value: String): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
    
    inline def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
    
    inline def setImage(value: GoogleActionsV2UiElementsImage): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    inline def setOpenUrlAction(value: GoogleActionsV2UiElementsOpenUrlAction): Self = StObject.set(x, "openUrlAction", value.asInstanceOf[js.Any])
    
    inline def setOpenUrlActionUndefined: Self = StObject.set(x, "openUrlAction", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}

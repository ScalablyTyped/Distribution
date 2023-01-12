package typings.actionsOnGoogle.distServiceActionssdkApiV2Mod

import typings.actionsOnGoogle.distServiceActionssdkConversationResponseRichMod._RichResponseItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleActionsV2RichResponseItem
  extends StObject
     with _RichResponseItem {
  
  /**
    * A basic card.
    */
  var basicCard: js.UndefOr[GoogleActionsV2UiElementsBasicCard] = js.undefined
  
  /**
    * Carousel browse card, use collection_browse instead..
    */
  var carouselBrowse: js.UndefOr[GoogleActionsV2UiElementsCarouselBrowse] = js.undefined
  
  /**
    * Html response used to render on Canvas.
    */
  var htmlResponse: js.UndefOr[GoogleActionsV2UiElementsHtmlResponse] = js.undefined
  
  /**
    * Response indicating a set of media to be played.
    */
  var mediaResponse: js.UndefOr[GoogleActionsV2MediaResponse] = js.undefined
  
  /**
    * Optional named identifier of this Item.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Voice and text-only response.
    */
  var simpleResponse: js.UndefOr[GoogleActionsV2SimpleResponse] = js.undefined
  
  /**
    * Structured payload to be processed by Google.
    */
  var structuredResponse: js.UndefOr[GoogleActionsV2StructuredResponse] = js.undefined
  
  /**
    * Table card.
    */
  var tableCard: js.UndefOr[GoogleActionsV2UiElementsTableCard] = js.undefined
}
object GoogleActionsV2RichResponseItem {
  
  inline def apply(): GoogleActionsV2RichResponseItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2RichResponseItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleActionsV2RichResponseItem] (val x: Self) extends AnyVal {
    
    inline def setBasicCard(value: GoogleActionsV2UiElementsBasicCard): Self = StObject.set(x, "basicCard", value.asInstanceOf[js.Any])
    
    inline def setBasicCardUndefined: Self = StObject.set(x, "basicCard", js.undefined)
    
    inline def setCarouselBrowse(value: GoogleActionsV2UiElementsCarouselBrowse): Self = StObject.set(x, "carouselBrowse", value.asInstanceOf[js.Any])
    
    inline def setCarouselBrowseUndefined: Self = StObject.set(x, "carouselBrowse", js.undefined)
    
    inline def setHtmlResponse(value: GoogleActionsV2UiElementsHtmlResponse): Self = StObject.set(x, "htmlResponse", value.asInstanceOf[js.Any])
    
    inline def setHtmlResponseUndefined: Self = StObject.set(x, "htmlResponse", js.undefined)
    
    inline def setMediaResponse(value: GoogleActionsV2MediaResponse): Self = StObject.set(x, "mediaResponse", value.asInstanceOf[js.Any])
    
    inline def setMediaResponseUndefined: Self = StObject.set(x, "mediaResponse", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSimpleResponse(value: GoogleActionsV2SimpleResponse): Self = StObject.set(x, "simpleResponse", value.asInstanceOf[js.Any])
    
    inline def setSimpleResponseUndefined: Self = StObject.set(x, "simpleResponse", js.undefined)
    
    inline def setStructuredResponse(value: GoogleActionsV2StructuredResponse): Self = StObject.set(x, "structuredResponse", value.asInstanceOf[js.Any])
    
    inline def setStructuredResponseUndefined: Self = StObject.set(x, "structuredResponse", js.undefined)
    
    inline def setTableCard(value: GoogleActionsV2UiElementsTableCard): Self = StObject.set(x, "tableCard", value.asInstanceOf[js.Any])
    
    inline def setTableCardUndefined: Self = StObject.set(x, "tableCard", js.undefined)
  }
}

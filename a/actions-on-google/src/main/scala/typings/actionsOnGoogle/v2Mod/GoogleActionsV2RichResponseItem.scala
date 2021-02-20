package typings.actionsOnGoogle.v2Mod

import typings.actionsOnGoogle.richMod._RichResponseItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleActionsV2RichResponseItem extends _RichResponseItem {
  
  /**
    * A basic card.
    */
  var basicCard: js.UndefOr[GoogleActionsV2UiElementsBasicCard] = js.native
  
  /**
    * Carousel browse card, use collection_browse instead..
    */
  var carouselBrowse: js.UndefOr[GoogleActionsV2UiElementsCarouselBrowse] = js.native
  
  /**
    * Html response used to render on Canvas.
    */
  var htmlResponse: js.UndefOr[GoogleActionsV2UiElementsHtmlResponse] = js.native
  
  /**
    * Response indicating a set of media to be played.
    */
  var mediaResponse: js.UndefOr[GoogleActionsV2MediaResponse] = js.native
  
  /**
    * Optional named identifier of this Item.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Voice and text-only response.
    */
  var simpleResponse: js.UndefOr[GoogleActionsV2SimpleResponse] = js.native
  
  /**
    * Structured payload to be processed by Google.
    */
  var structuredResponse: js.UndefOr[GoogleActionsV2StructuredResponse] = js.native
  
  /**
    * Table card.
    */
  var tableCard: js.UndefOr[GoogleActionsV2UiElementsTableCard] = js.native
}
object GoogleActionsV2RichResponseItem {
  
  @scala.inline
  def apply(): GoogleActionsV2RichResponseItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2RichResponseItem]
  }
  
  @scala.inline
  implicit class GoogleActionsV2RichResponseItemMutableBuilder[Self <: GoogleActionsV2RichResponseItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBasicCard(value: GoogleActionsV2UiElementsBasicCard): Self = StObject.set(x, "basicCard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBasicCardUndefined: Self = StObject.set(x, "basicCard", js.undefined)
    
    @scala.inline
    def setCarouselBrowse(value: GoogleActionsV2UiElementsCarouselBrowse): Self = StObject.set(x, "carouselBrowse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCarouselBrowseUndefined: Self = StObject.set(x, "carouselBrowse", js.undefined)
    
    @scala.inline
    def setHtmlResponse(value: GoogleActionsV2UiElementsHtmlResponse): Self = StObject.set(x, "htmlResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtmlResponseUndefined: Self = StObject.set(x, "htmlResponse", js.undefined)
    
    @scala.inline
    def setMediaResponse(value: GoogleActionsV2MediaResponse): Self = StObject.set(x, "mediaResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaResponseUndefined: Self = StObject.set(x, "mediaResponse", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setSimpleResponse(value: GoogleActionsV2SimpleResponse): Self = StObject.set(x, "simpleResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSimpleResponseUndefined: Self = StObject.set(x, "simpleResponse", js.undefined)
    
    @scala.inline
    def setStructuredResponse(value: GoogleActionsV2StructuredResponse): Self = StObject.set(x, "structuredResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStructuredResponseUndefined: Self = StObject.set(x, "structuredResponse", js.undefined)
    
    @scala.inline
    def setTableCard(value: GoogleActionsV2UiElementsTableCard): Self = StObject.set(x, "tableCard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableCardUndefined: Self = StObject.set(x, "tableCard", js.undefined)
  }
}

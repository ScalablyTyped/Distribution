package typings.actionsOnGoogle.v2Mod

import typings.actionsOnGoogle.richMod._RichResponseItem
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
  implicit class GoogleActionsV2RichResponseItemOps[Self <: GoogleActionsV2RichResponseItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBasicCard(value: GoogleActionsV2UiElementsBasicCard): Self = this.set("basicCard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBasicCard: Self = this.set("basicCard", js.undefined)
    
    @scala.inline
    def setCarouselBrowse(value: GoogleActionsV2UiElementsCarouselBrowse): Self = this.set("carouselBrowse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCarouselBrowse: Self = this.set("carouselBrowse", js.undefined)
    
    @scala.inline
    def setHtmlResponse(value: GoogleActionsV2UiElementsHtmlResponse): Self = this.set("htmlResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHtmlResponse: Self = this.set("htmlResponse", js.undefined)
    
    @scala.inline
    def setMediaResponse(value: GoogleActionsV2MediaResponse): Self = this.set("mediaResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMediaResponse: Self = this.set("mediaResponse", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setSimpleResponse(value: GoogleActionsV2SimpleResponse): Self = this.set("simpleResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSimpleResponse: Self = this.set("simpleResponse", js.undefined)
    
    @scala.inline
    def setStructuredResponse(value: GoogleActionsV2StructuredResponse): Self = this.set("structuredResponse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStructuredResponse: Self = this.set("structuredResponse", js.undefined)
    
    @scala.inline
    def setTableCard(value: GoogleActionsV2UiElementsTableCard): Self = this.set("tableCard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTableCard: Self = this.set("tableCard", js.undefined)
  }
}

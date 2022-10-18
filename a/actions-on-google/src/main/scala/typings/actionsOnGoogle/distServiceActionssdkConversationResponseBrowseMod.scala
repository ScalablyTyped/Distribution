package typings.actionsOnGoogle

import typings.actionsOnGoogle.distServiceActionssdkApiV2Mod.GoogleActionsV2UiElementsCarouselBrowse
import typings.actionsOnGoogle.distServiceActionssdkApiV2Mod.GoogleActionsV2UiElementsCarouselBrowseImageDisplayOptions
import typings.actionsOnGoogle.distServiceActionssdkApiV2Mod.GoogleActionsV2UiElementsCarouselBrowseItem
import typings.actionsOnGoogle.distServiceActionssdkApiV2Mod.GoogleActionsV2UiElementsImage
import typings.actionsOnGoogle.distServiceActionssdkApiV2Mod.GoogleActionsV2UiElementsOpenUrlAction
import typings.actionsOnGoogle.distServiceActionssdkConversationResponseRichMod._RichResponseItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distServiceActionssdkConversationResponseBrowseMod {
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/response/browse", "BrowseCarousel")
  @js.native
  open class BrowseCarousel protected ()
    extends StObject
       with GoogleActionsV2UiElementsCarouselBrowse
       with _RichResponseItem {
    /**
      * @param items BrowseCarousel items
      * @public
      */
    def this(items: GoogleActionsV2UiElementsCarouselBrowseItem*) = this()
    /**
      * @param items BrowseCarousel items
      * @public
      */
    def this(items: js.Array[GoogleActionsV2UiElementsCarouselBrowseItem]) = this()
    /**
      * @param options BrowseCarousel options
      * @public
      */
    def this(options: BrowseCarouselOptions) = this()
  }
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/response/browse", "BrowseCarouselItem")
  @js.native
  open class BrowseCarouselItem protected ()
    extends StObject
       with GoogleActionsV2UiElementsCarouselBrowseItem {
    /**
      * @param options BrowseCarouselItem options
      * @public
      */
    def this(options: BrowseCarouselItemOptions) = this()
  }
  
  trait BrowseCarouselItemOptions extends StObject {
    
    /**
      * Description text of the item.
      * @public
      */
    var description: js.UndefOr[String] = js.undefined
    
    /**
      * Footer text of the item.
      * @public
      */
    var footer: js.UndefOr[String] = js.undefined
    
    /**
      * Image to show on item.
      * @public
      */
    var image: js.UndefOr[GoogleActionsV2UiElementsImage] = js.undefined
    
    /**
      * The URL action that occurs by clicking the BrowseCarouselItem.
      * You should either set this field or `url` but not both.
      * @public
      */
    var openUrlAction: js.UndefOr[GoogleActionsV2UiElementsOpenUrlAction] = js.undefined
    
    /**
      * Title of the option item.
      * @public
      */
    var title: String
    
    /**
      * The URL of the link opened by clicking the BrowseCarouselItem.
      * You should either set this field or `openUrlAction` but not both.
      * @public
      */
    var url: js.UndefOr[String] = js.undefined
  }
  object BrowseCarouselItemOptions {
    
    inline def apply(title: String): BrowseCarouselItemOptions = {
      val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[BrowseCarouselItemOptions]
    }
    
    extension [Self <: BrowseCarouselItemOptions](x: Self) {
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setFooter(value: String): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
      
      inline def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
      
      inline def setImage(value: GoogleActionsV2UiElementsImage): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
      
      inline def setOpenUrlAction(value: GoogleActionsV2UiElementsOpenUrlAction): Self = StObject.set(x, "openUrlAction", value.asInstanceOf[js.Any])
      
      inline def setOpenUrlActionUndefined: Self = StObject.set(x, "openUrlAction", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  trait BrowseCarouselOptions extends StObject {
    
    /**
      * Sets the display options for the images in this carousel.
      * @public
      */
    var display: js.UndefOr[GoogleActionsV2UiElementsCarouselBrowseImageDisplayOptions] = js.undefined
    
    /**
      * List of 2-20 items to show in this carousel.
      * @public
      */
    var items: js.Array[GoogleActionsV2UiElementsCarouselBrowseItem]
  }
  object BrowseCarouselOptions {
    
    inline def apply(items: js.Array[GoogleActionsV2UiElementsCarouselBrowseItem]): BrowseCarouselOptions = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
      __obj.asInstanceOf[BrowseCarouselOptions]
    }
    
    extension [Self <: BrowseCarouselOptions](x: Self) {
      
      inline def setDisplay(value: GoogleActionsV2UiElementsCarouselBrowseImageDisplayOptions): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
      
      inline def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
      
      inline def setItems(value: js.Array[GoogleActionsV2UiElementsCarouselBrowseItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsVarargs(value: GoogleActionsV2UiElementsCarouselBrowseItem*): Self = StObject.set(x, "items", js.Array(value*))
    }
  }
}

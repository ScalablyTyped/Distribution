package typings.actionsOnGoogle

import typings.actionsOnGoogle.richMod._RichResponseItem
import typings.actionsOnGoogle.v2Mod.GoogleActionsV2UiElementsCarouselBrowse
import typings.actionsOnGoogle.v2Mod.GoogleActionsV2UiElementsCarouselBrowseImageDisplayOptions
import typings.actionsOnGoogle.v2Mod.GoogleActionsV2UiElementsCarouselBrowseItem
import typings.actionsOnGoogle.v2Mod.GoogleActionsV2UiElementsImage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object browseMod {
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/response/browse", "BrowseCarousel")
  @js.native
  class BrowseCarousel protected ()
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
  class BrowseCarouselItem protected ()
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
      * Title of the option item.
      * @public
      */
    var title: String
    
    /**
      * The URL of the link opened by clicking the BrowseCarouselItem.
      * @public
      */
    var url: String
  }
  object BrowseCarouselItemOptions {
    
    inline def apply(title: String, url: String): BrowseCarouselItemOptions = {
      val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[BrowseCarouselItemOptions]
    }
    
    extension [Self <: BrowseCarouselItemOptions](x: Self) {
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setFooter(value: String): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
      
      inline def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
      
      inline def setImage(value: GoogleActionsV2UiElementsImage): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
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
      
      inline def setItemsVarargs(value: GoogleActionsV2UiElementsCarouselBrowseItem*): Self = StObject.set(x, "items", js.Array(value :_*))
    }
  }
}

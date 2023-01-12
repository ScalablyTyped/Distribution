package typings.actionsOnGoogle

import typings.actionsOnGoogle.actionsOnGoogleStrings.actionsDotintentDotOPTION
import typings.actionsOnGoogle.distServiceActionssdkApiV2Mod.GoogleActionsV2OptionValueSpec
import typings.actionsOnGoogle.distServiceActionssdkApiV2Mod.GoogleActionsV2UiElementsCarouselSelectCarouselItem
import typings.actionsOnGoogle.distServiceActionssdkApiV2Mod.GoogleActionsV2UiElementsCarouselSelectImageDisplayOptions
import typings.actionsOnGoogle.distServiceActionssdkConversationHelperHelperMod.Helper
import typings.actionsOnGoogle.distServiceActionssdkConversationHelperOptionOptionMod.OptionArgument
import typings.actionsOnGoogle.distServiceActionssdkConversationHelperOptionOptionMod.OptionItem
import typings.actionsOnGoogle.distServiceActionssdkConversationHelperOptionOptionMod.OptionItems
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distServiceActionssdkConversationHelperOptionCarouselMod {
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/helper/option/carousel", "Carousel")
  @js.native
  open class Carousel protected () extends Helper[actionsDotintentDotOPTION, GoogleActionsV2OptionValueSpec] {
    /**
      * @param options Carousel option
      * @public
      */
    def this(options: CarouselOptions) = this()
  }
  
  type CarouselArgument = OptionArgument
  
  trait CarouselOptionItem
    extends StObject
       with OptionItem {
    
    /**
      * Description text of the item.
      * @public
      */
    @JSName("description")
    var description_CarouselOptionItem: String
  }
  object CarouselOptionItem {
    
    inline def apply(description: String, title: String): CarouselOptionItem = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[CarouselOptionItem]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CarouselOptionItem] (val x: Self) extends AnyVal {
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    }
  }
  
  trait CarouselOptions extends StObject {
    
    /**
      * Sets the display options for the images in this carousel.
      * @public
      */
    var display: js.UndefOr[GoogleActionsV2UiElementsCarouselSelectImageDisplayOptions] = js.undefined
    
    /**
      * List of 2-20 items to show in this carousel. Required.
      * @public
      */
    var items: OptionItems[CarouselOptionItem] | js.Array[GoogleActionsV2UiElementsCarouselSelectCarouselItem]
  }
  object CarouselOptions {
    
    inline def apply(
      items: OptionItems[CarouselOptionItem] | js.Array[GoogleActionsV2UiElementsCarouselSelectCarouselItem]
    ): CarouselOptions = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
      __obj.asInstanceOf[CarouselOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CarouselOptions] (val x: Self) extends AnyVal {
      
      inline def setDisplay(value: GoogleActionsV2UiElementsCarouselSelectImageDisplayOptions): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
      
      inline def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
      
      inline def setItems(
        value: OptionItems[CarouselOptionItem] | js.Array[GoogleActionsV2UiElementsCarouselSelectCarouselItem]
      ): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsVarargs(value: GoogleActionsV2UiElementsCarouselSelectCarouselItem*): Self = StObject.set(x, "items", js.Array(value*))
    }
  }
}

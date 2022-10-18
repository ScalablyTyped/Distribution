package typings.actionsOnGoogle

import typings.actionsOnGoogle.distServiceActionssdkConversationHelperOptionCarouselMod.CarouselOptions
import typings.actionsOnGoogle.distServiceActionssdkConversationHelperOptionListMod.ListOptions
import typings.actionsOnGoogle.distServiceActionssdkConversationHelperOptionOptionMod.ApiOptionItem
import typings.actionsOnGoogle.distServiceActionssdkConversationHelperOptionOptionMod.OptionItem
import typings.actionsOnGoogle.distServiceActionssdkConversationHelperOptionOptionMod.OptionItems
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distServiceActionssdkConversationHelperOptionMod {
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/helper/option", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/helper/option", "Carousel")
  @js.native
  open class Carousel protected ()
    extends typings.actionsOnGoogle.distServiceActionssdkConversationHelperOptionCarouselMod.Carousel {
    /**
      * @param options Carousel option
      * @public
      */
    def this(options: CarouselOptions) = this()
  }
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/helper/option", "List")
  @js.native
  open class List protected ()
    extends typings.actionsOnGoogle.distServiceActionssdkConversationHelperOptionListMod.List {
    /**
      * @param options List options
      * @public
      */
    def this(options: ListOptions) = this()
  }
  
  inline def convert(items: OptionItems[OptionItem | String]): js.Array[ApiOptionItem] = ^.asInstanceOf[js.Dynamic].applyDynamic("convert")(items.asInstanceOf[js.Any]).asInstanceOf[js.Array[ApiOptionItem]]
}

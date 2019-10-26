package typings.actionsDashOnDashGoogle

import typings.actionsDashOnDashGoogle.distServiceActionssdkConversationHelperOptionCarouselMod.CarouselOptions
import typings.actionsDashOnDashGoogle.distServiceActionssdkConversationHelperOptionListMod.ListOptions
import typings.actionsDashOnDashGoogle.distServiceActionssdkConversationHelperOptionOptionMod.ApiOptionItem
import typings.actionsDashOnDashGoogle.distServiceActionssdkConversationHelperOptionOptionMod.OptionItem
import typings.actionsDashOnDashGoogle.distServiceActionssdkConversationHelperOptionOptionMod.OptionItems
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("actions-on-google/dist/service/actionssdk/conversation/helper/option", JSImport.Namespace)
@js.native
object distServiceActionssdkConversationHelperOptionMod extends js.Object {
  @js.native
  class Carousel protected ()
    extends typings.actionsDashOnDashGoogle.distServiceActionssdkConversationHelperOptionCarouselMod.Carousel {
    /**
      * @param options Carousel option
      * @public
      */
    def this(options: CarouselOptions) = this()
  }
  
  @js.native
  class List protected ()
    extends typings.actionsDashOnDashGoogle.distServiceActionssdkConversationHelperOptionListMod.List {
    /**
      * @param options List options
      * @public
      */
    def this(options: ListOptions) = this()
  }
  
  def convert(items: OptionItems[String | OptionItem]): js.Array[ApiOptionItem] = js.native
}


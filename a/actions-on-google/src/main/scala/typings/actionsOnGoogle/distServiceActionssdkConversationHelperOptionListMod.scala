package typings.actionsOnGoogle

import typings.actionsOnGoogle.actionsOnGoogleStrings.actionsDotintentDotOPTION
import typings.actionsOnGoogle.distServiceActionssdkApiV2Mod.GoogleActionsV2OptionValueSpec
import typings.actionsOnGoogle.distServiceActionssdkApiV2Mod.GoogleActionsV2UiElementsListSelectListItem
import typings.actionsOnGoogle.distServiceActionssdkConversationHelperHelperMod.Helper
import typings.actionsOnGoogle.distServiceActionssdkConversationHelperOptionOptionMod.OptionArgument
import typings.actionsOnGoogle.distServiceActionssdkConversationHelperOptionOptionMod.OptionItem
import typings.actionsOnGoogle.distServiceActionssdkConversationHelperOptionOptionMod.OptionItems
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distServiceActionssdkConversationHelperOptionListMod {
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/helper/option/list", "List")
  @js.native
  open class List protected () extends Helper[actionsDotintentDotOPTION, GoogleActionsV2OptionValueSpec] {
    /**
      * @param options List options
      * @public
      */
    def this(options: ListOptions) = this()
  }
  
  type ListArgument = OptionArgument
  
  trait ListOptions extends StObject {
    
    /** @public */
    var items: (OptionItems[OptionItem | String]) | js.Array[GoogleActionsV2UiElementsListSelectListItem]
    
    /** @public */
    var title: js.UndefOr[String] = js.undefined
  }
  object ListOptions {
    
    inline def apply(items: (OptionItems[OptionItem | String]) | js.Array[GoogleActionsV2UiElementsListSelectListItem]): ListOptions = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListOptions]
    }
    
    extension [Self <: ListOptions](x: Self) {
      
      inline def setItems(value: (OptionItems[OptionItem | String]) | js.Array[GoogleActionsV2UiElementsListSelectListItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsVarargs(value: GoogleActionsV2UiElementsListSelectListItem*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}

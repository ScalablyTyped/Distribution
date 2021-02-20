package typings.actionsOnGoogle

import typings.actionsOnGoogle.actionsOnGoogleStrings.actionsDotintentDotOPTION
import typings.actionsOnGoogle.helperHelperMod.Helper
import typings.actionsOnGoogle.optionOptionMod.OptionArgument
import typings.actionsOnGoogle.optionOptionMod.OptionItem
import typings.actionsOnGoogle.optionOptionMod.OptionItems
import typings.actionsOnGoogle.v2Mod.GoogleActionsV2OptionValueSpec
import typings.actionsOnGoogle.v2Mod.GoogleActionsV2UiElementsListSelectListItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listMod {
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/helper/option/list", "List")
  @js.native
  class List protected () extends Helper[actionsDotintentDotOPTION, GoogleActionsV2OptionValueSpec] {
    /**
      * @param options List options
      * @public
      */
    def this(options: ListOptions) = this()
  }
  
  type ListArgument = OptionArgument
  
  @js.native
  trait ListOptions extends StObject {
    
    /** @public */
    var items: (OptionItems[OptionItem | String]) | js.Array[GoogleActionsV2UiElementsListSelectListItem] = js.native
    
    /** @public */
    var title: js.UndefOr[String] = js.native
  }
  object ListOptions {
    
    @scala.inline
    def apply(items: (OptionItems[OptionItem | String]) | js.Array[GoogleActionsV2UiElementsListSelectListItem]): ListOptions = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListOptions]
    }
    
    @scala.inline
    implicit class ListOptionsMutableBuilder[Self <: ListOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setItems(value: (OptionItems[OptionItem | String]) | js.Array[GoogleActionsV2UiElementsListSelectListItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsVarargs(value: GoogleActionsV2UiElementsListSelectListItem*): Self = StObject.set(x, "items", js.Array(value :_*))
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}

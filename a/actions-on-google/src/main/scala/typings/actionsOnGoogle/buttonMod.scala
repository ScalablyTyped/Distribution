package typings.actionsOnGoogle

import typings.actionsOnGoogle.v2Mod.GoogleActionsV2UiElementsButton
import typings.actionsOnGoogle.v2Mod.GoogleActionsV2UiElementsOpenUrlAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buttonMod {
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/response/card/button", "Button")
  @js.native
  class Button protected () extends GoogleActionsV2UiElementsButton {
    /**
      * @param options Button options
      * @public
      */
    def this(options: ButtonOptions) = this()
  }
  
  @js.native
  trait ButtonOptions extends StObject {
    
    /**
      * Action to take when selected. Recommended to use the url property for simple web page url open.
      * @public
      */
    var action: js.UndefOr[GoogleActionsV2UiElementsOpenUrlAction] = js.native
    
    /**
      * Text shown on the button.
      * @public
      */
    var title: String = js.native
    
    /**
      * String URL to open.
      * @public
      */
    var url: js.UndefOr[String] = js.native
  }
  object ButtonOptions {
    
    @scala.inline
    def apply(title: String): ButtonOptions = {
      val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[ButtonOptions]
    }
    
    @scala.inline
    implicit class ButtonOptionsMutableBuilder[Self <: ButtonOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAction(value: GoogleActionsV2UiElementsOpenUrlAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
}

package typings.actionsOnGoogle

import typings.actionsOnGoogle.v2Mod.GoogleActionsV2UiElementsButton
import typings.actionsOnGoogle.v2Mod.GoogleActionsV2UiElementsOpenUrlAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buttonMod {
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/response/card/button", "Button")
  @js.native
  open class Button protected ()
    extends StObject
       with GoogleActionsV2UiElementsButton {
    /**
      * @param options Button options
      * @public
      */
    def this(options: ButtonOptions) = this()
  }
  
  trait ButtonOptions extends StObject {
    
    /**
      * Action to take when selected. Recommended to use the url property for simple web page url open.
      * @public
      */
    var action: js.UndefOr[GoogleActionsV2UiElementsOpenUrlAction] = js.undefined
    
    /**
      * Text shown on the button.
      * @public
      */
    var title: String
    
    /**
      * String URL to open.
      * @public
      */
    var url: js.UndefOr[String] = js.undefined
  }
  object ButtonOptions {
    
    inline def apply(title: String): ButtonOptions = {
      val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[ButtonOptions]
    }
    
    extension [Self <: ButtonOptions](x: Self) {
      
      inline def setAction(value: GoogleActionsV2UiElementsOpenUrlAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
}

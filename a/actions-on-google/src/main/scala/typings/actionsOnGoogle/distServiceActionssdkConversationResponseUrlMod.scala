package typings.actionsOnGoogle

import typings.actionsOnGoogle.distServiceActionssdkApiV2Mod.GoogleActionsV2UiElementsOpenUrlAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distServiceActionssdkConversationResponseUrlMod {
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/response/url", "OpenUrlAction")
  @js.native
  open class OpenUrlAction protected ()
    extends StObject
       with GoogleActionsV2UiElementsOpenUrlAction {
    /** @public */
    def this(options: OpenUrlActionOptions) = this()
  }
  
  trait OpenUrlActionOptions extends StObject {
    
    /** @public */
    var url: String
  }
  object OpenUrlActionOptions {
    
    inline def apply(url: String): OpenUrlActionOptions = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[OpenUrlActionOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OpenUrlActionOptions] (val x: Self) extends AnyVal {
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}

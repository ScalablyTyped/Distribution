package typings.actionsOnGoogle

import typings.actionsOnGoogle.distServiceActionssdkApiV2Mod.GoogleActionsV2SimpleResponse
import typings.actionsOnGoogle.distServiceActionssdkConversationResponseRichMod._RichResponseItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distServiceActionssdkConversationResponseSimpleMod {
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/response/simple", "SimpleResponse")
  @js.native
  open class SimpleResponse protected ()
    extends StObject
       with GoogleActionsV2SimpleResponse
       with _RichResponseItem {
    def this(options: String) = this()
    /**
      * @param options SimpleResponse options
      * @public
      */
    def this(options: SimpleResponseOptions) = this()
  }
  
  trait SimpleResponseOptions extends StObject {
    
    /**
      * Speech to be spoken to user. SSML allowed.
      * @public
      */
    var speech: String
    
    /**
      * Optional text to be shown to user
      * @public
      */
    var text: js.UndefOr[String] = js.undefined
  }
  object SimpleResponseOptions {
    
    inline def apply(speech: String): SimpleResponseOptions = {
      val __obj = js.Dynamic.literal(speech = speech.asInstanceOf[js.Any])
      __obj.asInstanceOf[SimpleResponseOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SimpleResponseOptions] (val x: Self) extends AnyVal {
      
      inline def setSpeech(value: String): Self = StObject.set(x, "speech", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
}

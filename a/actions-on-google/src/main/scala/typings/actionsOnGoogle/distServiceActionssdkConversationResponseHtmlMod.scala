package typings.actionsOnGoogle

import typings.actionsOnGoogle.distCommonMod.JsonObject
import typings.actionsOnGoogle.distServiceActionssdkApiV2Mod.GoogleActionsV2UiElementsHtmlResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distServiceActionssdkConversationResponseHtmlMod {
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/response/html", "HtmlResponse")
  @js.native
  /**
    * @param options Canvas options
    * @public
    */
  open class HtmlResponse[TData /* <: JsonObject */] ()
    extends StObject
       with GoogleActionsV2UiElementsHtmlResponse {
    def this(options: GoogleActionsV2UiElementsHtmlResponse) = this()
    def this(options: HtmlResponseOptions[TData]) = this()
    
    /** @public */
    def data: TData = js.native
    /** @public */
    def data_=(data: TData): Unit = js.native
    
    /** @public */
    def suppress: Boolean = js.native
    /** @public */
    def suppress_=(suppress: Boolean): Unit = js.native
  }
  
  trait HtmlResponseOptions[TData /* <: JsonObject */] extends StObject {
    
    /**
      * Communicate the following JSON object to the web app.
      *
      * Alias of `updatedState`
      * @public
      */
    var data: js.UndefOr[TData] = js.undefined
    
    /**
      * Configure if the mic is closed after this html response.
      *
      * Alias of `suppressMic`
      * @public
      */
    var suppress: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The url of the web app.
      *
      * @public
      */
    var url: js.UndefOr[String] = js.undefined
  }
  object HtmlResponseOptions {
    
    inline def apply[TData /* <: JsonObject */](): HtmlResponseOptions[TData] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HtmlResponseOptions[TData]]
    }
    
    extension [Self <: HtmlResponseOptions[?], TData /* <: JsonObject */](x: Self & HtmlResponseOptions[TData]) {
      
      inline def setData(value: TData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setSuppress(value: Boolean): Self = StObject.set(x, "suppress", value.asInstanceOf[js.Any])
      
      inline def setSuppressUndefined: Self = StObject.set(x, "suppress", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
}

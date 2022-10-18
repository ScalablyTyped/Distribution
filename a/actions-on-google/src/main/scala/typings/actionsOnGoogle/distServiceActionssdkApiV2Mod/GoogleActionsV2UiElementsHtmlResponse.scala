package typings.actionsOnGoogle.distServiceActionssdkApiV2Mod

import typings.actionsOnGoogle.distCommonMod.ApiClientObjectMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleActionsV2UiElementsHtmlResponse extends StObject {
  
  /**
    * Provide an option so that mic won't be opened after this immersive
    * response.
    */
  var suppressMic: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Communicate the following JSON object to the app.
    */
  var updatedState: js.UndefOr[ApiClientObjectMap[Any]] = js.undefined
  
  /**
    * The url of the application.
    */
  var url: js.UndefOr[String] = js.undefined
}
object GoogleActionsV2UiElementsHtmlResponse {
  
  inline def apply(): GoogleActionsV2UiElementsHtmlResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2UiElementsHtmlResponse]
  }
  
  extension [Self <: GoogleActionsV2UiElementsHtmlResponse](x: Self) {
    
    inline def setSuppressMic(value: Boolean): Self = StObject.set(x, "suppressMic", value.asInstanceOf[js.Any])
    
    inline def setSuppressMicUndefined: Self = StObject.set(x, "suppressMic", js.undefined)
    
    inline def setUpdatedState(value: ApiClientObjectMap[Any]): Self = StObject.set(x, "updatedState", value.asInstanceOf[js.Any])
    
    inline def setUpdatedStateUndefined: Self = StObject.set(x, "updatedState", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}

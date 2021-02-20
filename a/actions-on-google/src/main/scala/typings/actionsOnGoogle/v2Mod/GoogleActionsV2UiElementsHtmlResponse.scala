package typings.actionsOnGoogle.v2Mod

import typings.actionsOnGoogle.commonMod.ApiClientObjectMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleActionsV2UiElementsHtmlResponse extends StObject {
  
  /**
    * Provide an option so that mic won't be opened after this immersive
    * response.
    */
  var suppressMic: js.UndefOr[Boolean] = js.native
  
  /**
    * Communicate the following JSON object to the app.
    */
  var updatedState: js.UndefOr[ApiClientObjectMap[_]] = js.native
  
  /**
    * The url of the application.
    */
  var url: js.UndefOr[String] = js.native
}
object GoogleActionsV2UiElementsHtmlResponse {
  
  @scala.inline
  def apply(): GoogleActionsV2UiElementsHtmlResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2UiElementsHtmlResponse]
  }
  
  @scala.inline
  implicit class GoogleActionsV2UiElementsHtmlResponseMutableBuilder[Self <: GoogleActionsV2UiElementsHtmlResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSuppressMic(value: Boolean): Self = StObject.set(x, "suppressMic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuppressMicUndefined: Self = StObject.set(x, "suppressMic", js.undefined)
    
    @scala.inline
    def setUpdatedState(value: ApiClientObjectMap[_]): Self = StObject.set(x, "updatedState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedStateUndefined: Self = StObject.set(x, "updatedState", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}

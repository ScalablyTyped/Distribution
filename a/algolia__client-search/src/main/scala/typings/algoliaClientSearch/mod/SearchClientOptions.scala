package typings.algoliaClientSearch.mod

import typings.algoliaClientCommon.mod.AuthModeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchClientOptions extends StObject {
  
  /**
    * The api key.
    */
  val apiKey: String = js.native
  
  /**
    * The application id.
    */
  val appId: String = js.native
  
  /**
    * The auth mode type. In browser environments credentials may
    * be passed within the headers.
    */
  val authMode: js.UndefOr[AuthModeType] = js.native
}
object SearchClientOptions {
  
  @scala.inline
  def apply(apiKey: String, appId: String): SearchClientOptions = {
    val __obj = js.Dynamic.literal(apiKey = apiKey.asInstanceOf[js.Any], appId = appId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchClientOptions]
  }
  
  @scala.inline
  implicit class SearchClientOptionsMutableBuilder[Self <: SearchClientOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApiKey(value: String): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthMode(value: AuthModeType): Self = StObject.set(x, "authMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthModeUndefined: Self = StObject.set(x, "authMode", js.undefined)
  }
}

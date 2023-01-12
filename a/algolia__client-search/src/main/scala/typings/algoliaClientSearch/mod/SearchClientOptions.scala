package typings.algoliaClientSearch.mod

import typings.algoliaClientCommon.mod.AuthModeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchClientOptions extends StObject {
  
  /**
    * The api key.
    */
  val apiKey: String
  
  /**
    * The application id.
    */
  val appId: String
  
  /**
    * The auth mode type. In browser environments credentials may
    * be passed within the headers.
    */
  val authMode: js.UndefOr[AuthModeType] = js.undefined
}
object SearchClientOptions {
  
  inline def apply(apiKey: String, appId: String): SearchClientOptions = {
    val __obj = js.Dynamic.literal(apiKey = apiKey.asInstanceOf[js.Any], appId = appId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchClientOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SearchClientOptions] (val x: Self) extends AnyVal {
    
    inline def setApiKey(value: String): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
    
    inline def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    inline def setAuthMode(value: AuthModeType): Self = StObject.set(x, "authMode", value.asInstanceOf[js.Any])
    
    inline def setAuthModeUndefined: Self = StObject.set(x, "authMode", js.undefined)
  }
}

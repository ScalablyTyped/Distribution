package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdentityManagerGenerateTokenOptions extends StObject {
  
  /**
  		 * The server URL.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-IdentityManager.html#generateToken)
  		 */
  var serverUrl: String
  
  /**
  		 * Indicates if the server requires SSL.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-IdentityManager.html#generateToken)
  		 */
  var ssl: Boolean
  
  /**
  		 * The server token.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-identity-IdentityManager.html#generateToken)
  		 */
  var token: String
}
object IdentityManagerGenerateTokenOptions {
  
  inline def apply(serverUrl: String, ssl: Boolean, token: String): IdentityManagerGenerateTokenOptions = {
    val __obj = js.Dynamic.literal(serverUrl = serverUrl.asInstanceOf[js.Any], ssl = ssl.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentityManagerGenerateTokenOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IdentityManagerGenerateTokenOptions] (val x: Self) extends AnyVal {
    
    inline def setServerUrl(value: String): Self = StObject.set(x, "serverUrl", value.asInstanceOf[js.Any])
    
    inline def setSsl(value: Boolean): Self = StObject.set(x, "ssl", value.asInstanceOf[js.Any])
    
    inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
  }
}

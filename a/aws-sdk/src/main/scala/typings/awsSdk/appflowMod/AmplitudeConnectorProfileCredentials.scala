package typings.awsSdk.appflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AmplitudeConnectorProfileCredentials extends StObject {
  
  /**
    *  A unique alphanumeric identifier used to authenticate a user, developer, or calling program to your API. 
    */
  var apiKey: ApiKey
  
  /**
    *  The Secret Access Key portion of the credentials. 
    */
  var secretKey: SecretKey
}
object AmplitudeConnectorProfileCredentials {
  
  inline def apply(apiKey: ApiKey, secretKey: SecretKey): AmplitudeConnectorProfileCredentials = {
    val __obj = js.Dynamic.literal(apiKey = apiKey.asInstanceOf[js.Any], secretKey = secretKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AmplitudeConnectorProfileCredentials]
  }
  
  extension [Self <: AmplitudeConnectorProfileCredentials](x: Self) {
    
    inline def setApiKey(value: ApiKey): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
    
    inline def setSecretKey(value: SecretKey): Self = StObject.set(x, "secretKey", value.asInstanceOf[js.Any])
  }
}

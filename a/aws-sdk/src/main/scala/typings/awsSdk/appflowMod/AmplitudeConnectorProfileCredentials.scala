package typings.awsSdk.appflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AmplitudeConnectorProfileCredentials extends StObject {
  
  /**
    *  A unique alphanumeric identifier used to authenticate a user, developer, or calling program to your API. 
    */
  var apiKey: ApiKey = js.native
  
  /**
    *  The Secret Access Key portion of the credentials. 
    */
  var secretKey: SecretKey = js.native
}
object AmplitudeConnectorProfileCredentials {
  
  @scala.inline
  def apply(apiKey: ApiKey, secretKey: SecretKey): AmplitudeConnectorProfileCredentials = {
    val __obj = js.Dynamic.literal(apiKey = apiKey.asInstanceOf[js.Any], secretKey = secretKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AmplitudeConnectorProfileCredentials]
  }
  
  @scala.inline
  implicit class AmplitudeConnectorProfileCredentialsMutableBuilder[Self <: AmplitudeConnectorProfileCredentials] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApiKey(value: ApiKey): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecretKey(value: SecretKey): Self = StObject.set(x, "secretKey", value.asInstanceOf[js.Any])
  }
}

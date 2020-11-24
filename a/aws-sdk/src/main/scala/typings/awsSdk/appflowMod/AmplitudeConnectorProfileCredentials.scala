package typings.awsSdk.appflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AmplitudeConnectorProfileCredentials extends js.Object {
  
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
  implicit class AmplitudeConnectorProfileCredentialsOps[Self <: AmplitudeConnectorProfileCredentials] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setApiKey(value: ApiKey): Self = this.set("apiKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecretKey(value: SecretKey): Self = this.set("secretKey", value.asInstanceOf[js.Any])
  }
}

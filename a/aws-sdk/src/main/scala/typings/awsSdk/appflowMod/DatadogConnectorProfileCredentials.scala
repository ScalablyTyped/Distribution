package typings.awsSdk.appflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DatadogConnectorProfileCredentials extends js.Object {
  
  /**
    *  A unique alphanumeric identifier used to authenticate a user, developer, or calling program to your API. 
    */
  var apiKey: ApiKey = js.native
  
  /**
    *  Application keys, in conjunction with your API key, give you full access to Datadog’s programmatic API. Application keys are associated with the user account that created them. The application key is used to log all requests made to the API. 
    */
  var applicationKey: ApplicationKey = js.native
}
object DatadogConnectorProfileCredentials {
  
  @scala.inline
  def apply(apiKey: ApiKey, applicationKey: ApplicationKey): DatadogConnectorProfileCredentials = {
    val __obj = js.Dynamic.literal(apiKey = apiKey.asInstanceOf[js.Any], applicationKey = applicationKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatadogConnectorProfileCredentials]
  }
  
  @scala.inline
  implicit class DatadogConnectorProfileCredentialsOps[Self <: DatadogConnectorProfileCredentials] (val x: Self) extends AnyVal {
    
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
    def setApplicationKey(value: ApplicationKey): Self = this.set("applicationKey", value.asInstanceOf[js.Any])
  }
}

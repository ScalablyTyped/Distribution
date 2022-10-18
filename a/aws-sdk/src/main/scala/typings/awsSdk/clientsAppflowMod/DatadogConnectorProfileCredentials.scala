package typings.awsSdk.clientsAppflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatadogConnectorProfileCredentials extends StObject {
  
  /**
    *  A unique alphanumeric identifier used to authenticate a user, developer, or calling program to your API. 
    */
  var apiKey: ApiKey
  
  /**
    *  Application keys, in conjunction with your API key, give you full access to Datadog’s programmatic API. Application keys are associated with the user account that created them. The application key is used to log all requests made to the API. 
    */
  var applicationKey: ApplicationKey
}
object DatadogConnectorProfileCredentials {
  
  inline def apply(apiKey: ApiKey, applicationKey: ApplicationKey): DatadogConnectorProfileCredentials = {
    val __obj = js.Dynamic.literal(apiKey = apiKey.asInstanceOf[js.Any], applicationKey = applicationKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatadogConnectorProfileCredentials]
  }
  
  extension [Self <: DatadogConnectorProfileCredentials](x: Self) {
    
    inline def setApiKey(value: ApiKey): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
    
    inline def setApplicationKey(value: ApplicationKey): Self = StObject.set(x, "applicationKey", value.asInstanceOf[js.Any])
  }
}

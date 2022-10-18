package typings.awsSdk.clientsAppflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SingularConnectorProfileCredentials extends StObject {
  
  /**
    *  A unique alphanumeric identifier used to authenticate a user, developer, or calling program to your API. 
    */
  var apiKey: ApiKey
}
object SingularConnectorProfileCredentials {
  
  inline def apply(apiKey: ApiKey): SingularConnectorProfileCredentials = {
    val __obj = js.Dynamic.literal(apiKey = apiKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SingularConnectorProfileCredentials]
  }
  
  extension [Self <: SingularConnectorProfileCredentials](x: Self) {
    
    inline def setApiKey(value: ApiKey): Self = StObject.set(x, "apiKey", value.asInstanceOf[js.Any])
  }
}

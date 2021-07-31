package typings.awsSdk.appflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DynatraceConnectorProfileCredentials extends StObject {
  
  /**
    *  The API tokens used by Dynatrace API to authenticate various API calls. 
    */
  var apiToken: ApiToken
}
object DynatraceConnectorProfileCredentials {
  
  @scala.inline
  def apply(apiToken: ApiToken): DynatraceConnectorProfileCredentials = {
    val __obj = js.Dynamic.literal(apiToken = apiToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DynatraceConnectorProfileCredentials]
  }
  
  @scala.inline
  implicit class DynatraceConnectorProfileCredentialsMutableBuilder[Self <: DynatraceConnectorProfileCredentials] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApiToken(value: ApiToken): Self = StObject.set(x, "apiToken", value.asInstanceOf[js.Any])
  }
}

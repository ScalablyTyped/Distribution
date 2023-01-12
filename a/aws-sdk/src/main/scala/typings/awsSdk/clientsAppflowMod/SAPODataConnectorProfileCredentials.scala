package typings.awsSdk.clientsAppflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SAPODataConnectorProfileCredentials extends StObject {
  
  /**
    *  The SAPOData basic authentication credentials. 
    */
  var basicAuthCredentials: js.UndefOr[BasicAuthCredentials] = js.undefined
  
  /**
    *  The SAPOData OAuth type authentication credentials. 
    */
  var oAuthCredentials: js.UndefOr[OAuthCredentials] = js.undefined
}
object SAPODataConnectorProfileCredentials {
  
  inline def apply(): SAPODataConnectorProfileCredentials = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SAPODataConnectorProfileCredentials]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SAPODataConnectorProfileCredentials] (val x: Self) extends AnyVal {
    
    inline def setBasicAuthCredentials(value: BasicAuthCredentials): Self = StObject.set(x, "basicAuthCredentials", value.asInstanceOf[js.Any])
    
    inline def setBasicAuthCredentialsUndefined: Self = StObject.set(x, "basicAuthCredentials", js.undefined)
    
    inline def setOAuthCredentials(value: OAuthCredentials): Self = StObject.set(x, "oAuthCredentials", value.asInstanceOf[js.Any])
    
    inline def setOAuthCredentialsUndefined: Self = StObject.set(x, "oAuthCredentials", js.undefined)
  }
}

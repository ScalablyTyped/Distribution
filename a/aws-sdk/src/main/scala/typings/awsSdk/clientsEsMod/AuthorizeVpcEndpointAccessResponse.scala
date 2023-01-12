package typings.awsSdk.clientsEsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthorizeVpcEndpointAccessResponse extends StObject {
  
  /**
    * Information about the account or service that was provided access to the domain.
    */
  var AuthorizedPrincipal: typings.awsSdk.clientsEsMod.AuthorizedPrincipal
}
object AuthorizeVpcEndpointAccessResponse {
  
  inline def apply(AuthorizedPrincipal: AuthorizedPrincipal): AuthorizeVpcEndpointAccessResponse = {
    val __obj = js.Dynamic.literal(AuthorizedPrincipal = AuthorizedPrincipal.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthorizeVpcEndpointAccessResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AuthorizeVpcEndpointAccessResponse] (val x: Self) extends AnyVal {
    
    inline def setAuthorizedPrincipal(value: AuthorizedPrincipal): Self = StObject.set(x, "AuthorizedPrincipal", value.asInstanceOf[js.Any])
  }
}

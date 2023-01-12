package typings.awsSdk.clientsEsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListVpcEndpointAccessResponse extends StObject {
  
  /**
    * List of AuthorizedPrincipal describing the details of the permissions to manage VPC endpoints against the specified domain.
    */
  var AuthorizedPrincipalList: typings.awsSdk.clientsEsMod.AuthorizedPrincipalList
  
  /**
    * Provides an identifier to allow retrieval of paginated results.
    */
  var NextToken: typings.awsSdk.clientsEsMod.NextToken
}
object ListVpcEndpointAccessResponse {
  
  inline def apply(AuthorizedPrincipalList: AuthorizedPrincipalList, NextToken: NextToken): ListVpcEndpointAccessResponse = {
    val __obj = js.Dynamic.literal(AuthorizedPrincipalList = AuthorizedPrincipalList.asInstanceOf[js.Any], NextToken = NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListVpcEndpointAccessResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListVpcEndpointAccessResponse] (val x: Self) extends AnyVal {
    
    inline def setAuthorizedPrincipalList(value: AuthorizedPrincipalList): Self = StObject.set(x, "AuthorizedPrincipalList", value.asInstanceOf[js.Any])
    
    inline def setAuthorizedPrincipalListVarargs(value: AuthorizedPrincipal*): Self = StObject.set(x, "AuthorizedPrincipalList", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
  }
}

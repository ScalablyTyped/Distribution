package typings.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListVpcEndpointAccessResponse extends StObject {
  
  /**
    * A list of IAM principals that can currently access the domain.
    */
  var AuthorizedPrincipalList: typings.awsSdk.clientsOpensearchMod.AuthorizedPrincipalList
  
  /**
    * When nextToken is returned, there are more results available. The value of nextToken is a unique pagination token for each page. Make the call again using the returned token to retrieve the next page.
    */
  var NextToken: typings.awsSdk.clientsOpensearchMod.NextToken
}
object ListVpcEndpointAccessResponse {
  
  inline def apply(AuthorizedPrincipalList: AuthorizedPrincipalList, NextToken: NextToken): ListVpcEndpointAccessResponse = {
    val __obj = js.Dynamic.literal(AuthorizedPrincipalList = AuthorizedPrincipalList.asInstanceOf[js.Any], NextToken = NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListVpcEndpointAccessResponse]
  }
  
  extension [Self <: ListVpcEndpointAccessResponse](x: Self) {
    
    inline def setAuthorizedPrincipalList(value: AuthorizedPrincipalList): Self = StObject.set(x, "AuthorizedPrincipalList", value.asInstanceOf[js.Any])
    
    inline def setAuthorizedPrincipalListVarargs(value: AuthorizedPrincipal*): Self = StObject.set(x, "AuthorizedPrincipalList", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
  }
}

package typings.awsSdk.clientsEsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthorizeVpcEndpointAccessRequest extends StObject {
  
  /**
    * The account ID to grant access to.
    */
  var Account: AWSAccount
  
  /**
    * The name of the OpenSearch Service domain to provide access to.
    */
  var DomainName: typings.awsSdk.clientsEsMod.DomainName
}
object AuthorizeVpcEndpointAccessRequest {
  
  inline def apply(Account: AWSAccount, DomainName: DomainName): AuthorizeVpcEndpointAccessRequest = {
    val __obj = js.Dynamic.literal(Account = Account.asInstanceOf[js.Any], DomainName = DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthorizeVpcEndpointAccessRequest]
  }
  
  extension [Self <: AuthorizeVpcEndpointAccessRequest](x: Self) {
    
    inline def setAccount(value: AWSAccount): Self = StObject.set(x, "Account", value.asInstanceOf[js.Any])
    
    inline def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
  }
}

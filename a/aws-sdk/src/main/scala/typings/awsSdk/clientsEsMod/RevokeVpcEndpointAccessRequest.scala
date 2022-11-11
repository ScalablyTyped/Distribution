package typings.awsSdk.clientsEsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RevokeVpcEndpointAccessRequest extends StObject {
  
  /**
    * The account ID to revoke access from.
    */
  var Account: AWSAccount
  
  /**
    * The name of the OpenSearch Service domain.
    */
  var DomainName: typings.awsSdk.clientsEsMod.DomainName
}
object RevokeVpcEndpointAccessRequest {
  
  inline def apply(Account: AWSAccount, DomainName: DomainName): RevokeVpcEndpointAccessRequest = {
    val __obj = js.Dynamic.literal(Account = Account.asInstanceOf[js.Any], DomainName = DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[RevokeVpcEndpointAccessRequest]
  }
  
  extension [Self <: RevokeVpcEndpointAccessRequest](x: Self) {
    
    inline def setAccount(value: AWSAccount): Self = StObject.set(x, "Account", value.asInstanceOf[js.Any])
    
    inline def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
  }
}

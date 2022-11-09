package typings.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListVpcEndpointAccessRequest extends StObject {
  
  /**
    * The name of the OpenSearch Service domain to retrieve access information for.
    */
  var DomainName: typings.awsSdk.clientsOpensearchMod.DomainName
  
  /**
    * If your initial ListVpcEndpointAccess operation returns a nextToken, you can include the returned nextToken in subsequent ListVpcEndpointAccess operations, which returns results in the next page.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsOpensearchMod.NextToken] = js.undefined
}
object ListVpcEndpointAccessRequest {
  
  inline def apply(DomainName: DomainName): ListVpcEndpointAccessRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListVpcEndpointAccessRequest]
  }
  
  extension [Self <: ListVpcEndpointAccessRequest](x: Self) {
    
    inline def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}

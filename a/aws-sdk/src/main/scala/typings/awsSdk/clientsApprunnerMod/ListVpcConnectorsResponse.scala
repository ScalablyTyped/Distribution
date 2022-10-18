package typings.awsSdk.clientsApprunnerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListVpcConnectorsResponse extends StObject {
  
  /**
    * The token that you can pass in a subsequent request to get the next result page. It's returned in a paginated request.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsApprunnerMod.NextToken] = js.undefined
  
  /**
    * A list of information records for VPC connectors. In a paginated request, the request returns up to MaxResults records for each call.
    */
  var VpcConnectors: typings.awsSdk.clientsApprunnerMod.VpcConnectors
}
object ListVpcConnectorsResponse {
  
  inline def apply(VpcConnectors: VpcConnectors): ListVpcConnectorsResponse = {
    val __obj = js.Dynamic.literal(VpcConnectors = VpcConnectors.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListVpcConnectorsResponse]
  }
  
  extension [Self <: ListVpcConnectorsResponse](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setVpcConnectors(value: VpcConnectors): Self = StObject.set(x, "VpcConnectors", value.asInstanceOf[js.Any])
    
    inline def setVpcConnectorsVarargs(value: VpcConnector*): Self = StObject.set(x, "VpcConnectors", js.Array(value*))
  }
}

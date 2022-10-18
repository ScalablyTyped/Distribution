package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeVpcPeeringConnectionsResult extends StObject {
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * Information about the VPC peering connections.
    */
  var VpcPeeringConnections: js.UndefOr[VpcPeeringConnectionList] = js.undefined
}
object DescribeVpcPeeringConnectionsResult {
  
  inline def apply(): DescribeVpcPeeringConnectionsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeVpcPeeringConnectionsResult]
  }
  
  extension [Self <: DescribeVpcPeeringConnectionsResult](x: Self) {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setVpcPeeringConnections(value: VpcPeeringConnectionList): Self = StObject.set(x, "VpcPeeringConnections", value.asInstanceOf[js.Any])
    
    inline def setVpcPeeringConnectionsUndefined: Self = StObject.set(x, "VpcPeeringConnections", js.undefined)
    
    inline def setVpcPeeringConnectionsVarargs(value: VpcPeeringConnection*): Self = StObject.set(x, "VpcPeeringConnections", js.Array(value*))
  }
}

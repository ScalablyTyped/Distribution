package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeVpcEndpointConnectionsResult extends StObject {
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * Information about one or more VPC endpoint connections.
    */
  var VpcEndpointConnections: js.UndefOr[VpcEndpointConnectionSet] = js.undefined
}
object DescribeVpcEndpointConnectionsResult {
  
  inline def apply(): DescribeVpcEndpointConnectionsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeVpcEndpointConnectionsResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeVpcEndpointConnectionsResult] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setVpcEndpointConnections(value: VpcEndpointConnectionSet): Self = StObject.set(x, "VpcEndpointConnections", value.asInstanceOf[js.Any])
    
    inline def setVpcEndpointConnectionsUndefined: Self = StObject.set(x, "VpcEndpointConnections", js.undefined)
    
    inline def setVpcEndpointConnectionsVarargs(value: VpcEndpointConnection*): Self = StObject.set(x, "VpcEndpointConnections", js.Array(value*))
  }
}

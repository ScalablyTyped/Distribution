package typings.awsSdk.clientsEsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeOutboundCrossClusterSearchConnectionsResponse extends StObject {
  
  /**
    * Consists of list of OutboundCrossClusterSearchConnection matching the specified filter criteria.
    */
  var CrossClusterSearchConnections: js.UndefOr[OutboundCrossClusterSearchConnections] = js.undefined
  
  /**
    * If more results are available and NextToken is present, make the next request to the same API with the received NextToken to paginate the remaining results. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsEsMod.NextToken] = js.undefined
}
object DescribeOutboundCrossClusterSearchConnectionsResponse {
  
  inline def apply(): DescribeOutboundCrossClusterSearchConnectionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeOutboundCrossClusterSearchConnectionsResponse]
  }
  
  extension [Self <: DescribeOutboundCrossClusterSearchConnectionsResponse](x: Self) {
    
    inline def setCrossClusterSearchConnections(value: OutboundCrossClusterSearchConnections): Self = StObject.set(x, "CrossClusterSearchConnections", value.asInstanceOf[js.Any])
    
    inline def setCrossClusterSearchConnectionsUndefined: Self = StObject.set(x, "CrossClusterSearchConnections", js.undefined)
    
    inline def setCrossClusterSearchConnectionsVarargs(value: OutboundCrossClusterSearchConnection*): Self = StObject.set(x, "CrossClusterSearchConnections", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}

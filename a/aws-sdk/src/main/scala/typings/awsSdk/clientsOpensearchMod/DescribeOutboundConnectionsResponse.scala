package typings.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeOutboundConnectionsResponse extends StObject {
  
  /**
    * A list of  OutboundConnection  matching the specified filter criteria. 
    */
  var Connections: js.UndefOr[OutboundConnections] = js.undefined
  
  /**
    * If more results are available and NextToken is present, make the next request to the same API with the received NextToken to paginate the remaining results. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsOpensearchMod.NextToken] = js.undefined
}
object DescribeOutboundConnectionsResponse {
  
  inline def apply(): DescribeOutboundConnectionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeOutboundConnectionsResponse]
  }
  
  extension [Self <: DescribeOutboundConnectionsResponse](x: Self) {
    
    inline def setConnections(value: OutboundConnections): Self = StObject.set(x, "Connections", value.asInstanceOf[js.Any])
    
    inline def setConnectionsUndefined: Self = StObject.set(x, "Connections", js.undefined)
    
    inline def setConnectionsVarargs(value: OutboundConnection*): Self = StObject.set(x, "Connections", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}

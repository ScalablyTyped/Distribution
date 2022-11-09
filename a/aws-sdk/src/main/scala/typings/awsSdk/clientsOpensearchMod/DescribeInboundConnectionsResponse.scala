package typings.awsSdk.clientsOpensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeInboundConnectionsResponse extends StObject {
  
  /**
    * List of inbound connections.
    */
  var Connections: js.UndefOr[InboundConnections] = js.undefined
  
  /**
    * When nextToken is returned, there are more results available. The value of nextToken is a unique pagination token for each page. Make the call again using the returned token to retrieve the next page.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsOpensearchMod.NextToken] = js.undefined
}
object DescribeInboundConnectionsResponse {
  
  inline def apply(): DescribeInboundConnectionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeInboundConnectionsResponse]
  }
  
  extension [Self <: DescribeInboundConnectionsResponse](x: Self) {
    
    inline def setConnections(value: InboundConnections): Self = StObject.set(x, "Connections", value.asInstanceOf[js.Any])
    
    inline def setConnectionsUndefined: Self = StObject.set(x, "Connections", js.undefined)
    
    inline def setConnectionsVarargs(value: InboundConnection*): Self = StObject.set(x, "Connections", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}

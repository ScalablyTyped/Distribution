package typings.awsSdk.clientsNetworkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetConnectionsResponse extends StObject {
  
  /**
    * Information about the connections.
    */
  var Connections: js.UndefOr[ConnectionList] = js.undefined
  
  /**
    * The token to use for the next page of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsNetworkmanagerMod.NextToken] = js.undefined
}
object GetConnectionsResponse {
  
  inline def apply(): GetConnectionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetConnectionsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetConnectionsResponse] (val x: Self) extends AnyVal {
    
    inline def setConnections(value: ConnectionList): Self = StObject.set(x, "Connections", value.asInstanceOf[js.Any])
    
    inline def setConnectionsUndefined: Self = StObject.set(x, "Connections", js.undefined)
    
    inline def setConnectionsVarargs(value: Connection*): Self = StObject.set(x, "Connections", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}

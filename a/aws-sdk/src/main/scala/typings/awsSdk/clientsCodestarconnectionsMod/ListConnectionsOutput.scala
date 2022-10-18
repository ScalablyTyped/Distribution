package typings.awsSdk.clientsCodestarconnectionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListConnectionsOutput extends StObject {
  
  /**
    * A list of connections and the details for each connection, such as status, owner, and provider type.
    */
  var Connections: js.UndefOr[ConnectionList] = js.undefined
  
  /**
    * A token that can be used in the next ListConnections call. To view all items in the list, continue to call this operation with each subsequent token until no more nextToken values are returned.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsCodestarconnectionsMod.NextToken] = js.undefined
}
object ListConnectionsOutput {
  
  inline def apply(): ListConnectionsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListConnectionsOutput]
  }
  
  extension [Self <: ListConnectionsOutput](x: Self) {
    
    inline def setConnections(value: ConnectionList): Self = StObject.set(x, "Connections", value.asInstanceOf[js.Any])
    
    inline def setConnectionsUndefined: Self = StObject.set(x, "Connections", js.undefined)
    
    inline def setConnectionsVarargs(value: Connection*): Self = StObject.set(x, "Connections", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}

package typings.awsSdk.clientsGamesparksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPlayerConnectionStatusResult extends StObject {
  
  /**
    * The list of connection ids, one for each connection in use by the player.
    */
  var Connections: js.UndefOr[ConnectionList] = js.undefined
}
object GetPlayerConnectionStatusResult {
  
  inline def apply(): GetPlayerConnectionStatusResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetPlayerConnectionStatusResult]
  }
  
  extension [Self <: GetPlayerConnectionStatusResult](x: Self) {
    
    inline def setConnections(value: ConnectionList): Self = StObject.set(x, "Connections", value.asInstanceOf[js.Any])
    
    inline def setConnectionsUndefined: Self = StObject.set(x, "Connections", js.undefined)
    
    inline def setConnectionsVarargs(value: Connection*): Self = StObject.set(x, "Connections", js.Array(value*))
  }
}

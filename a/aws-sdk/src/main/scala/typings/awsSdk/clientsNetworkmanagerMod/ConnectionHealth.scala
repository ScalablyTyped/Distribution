package typings.awsSdk.clientsNetworkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectionHealth extends StObject {
  
  /**
    * The connection status.
    */
  var Status: js.UndefOr[ConnectionStatus] = js.undefined
  
  /**
    * The time the status was last updated.
    */
  var Timestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The connection type.
    */
  var Type: js.UndefOr[ConnectionType] = js.undefined
}
object ConnectionHealth {
  
  inline def apply(): ConnectionHealth = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectionHealth]
  }
  
  extension [Self <: ConnectionHealth](x: Self) {
    
    inline def setStatus(value: ConnectionStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setTimestamp(value: js.Date): Self = StObject.set(x, "Timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampUndefined: Self = StObject.set(x, "Timestamp", js.undefined)
    
    inline def setType(value: ConnectionType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}

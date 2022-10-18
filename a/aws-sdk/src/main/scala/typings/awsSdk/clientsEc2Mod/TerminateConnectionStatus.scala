package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TerminateConnectionStatus extends StObject {
  
  /**
    * The ID of the client connection.
    */
  var ConnectionId: js.UndefOr[String] = js.undefined
  
  /**
    * A message about the status of the client connection, if applicable.
    */
  var CurrentStatus: js.UndefOr[ClientVpnConnectionStatus] = js.undefined
  
  /**
    * The state of the client connection.
    */
  var PreviousStatus: js.UndefOr[ClientVpnConnectionStatus] = js.undefined
}
object TerminateConnectionStatus {
  
  inline def apply(): TerminateConnectionStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TerminateConnectionStatus]
  }
  
  extension [Self <: TerminateConnectionStatus](x: Self) {
    
    inline def setConnectionId(value: String): Self = StObject.set(x, "ConnectionId", value.asInstanceOf[js.Any])
    
    inline def setConnectionIdUndefined: Self = StObject.set(x, "ConnectionId", js.undefined)
    
    inline def setCurrentStatus(value: ClientVpnConnectionStatus): Self = StObject.set(x, "CurrentStatus", value.asInstanceOf[js.Any])
    
    inline def setCurrentStatusUndefined: Self = StObject.set(x, "CurrentStatus", js.undefined)
    
    inline def setPreviousStatus(value: ClientVpnConnectionStatus): Self = StObject.set(x, "PreviousStatus", value.asInstanceOf[js.Any])
    
    inline def setPreviousStatusUndefined: Self = StObject.set(x, "PreviousStatus", js.undefined)
  }
}

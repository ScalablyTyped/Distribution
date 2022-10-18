package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThingConnectivity extends StObject {
  
  /**
    * True if the thing is connected to the Amazon Web Services IoT Core service; false if it is not connected.
    */
  var connected: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The reason why the client is disconnected. If the thing has been disconnected for approximately an hour, the disconnectReason value might be missing.
    */
  var disconnectReason: js.UndefOr[DisconnectReason] = js.undefined
  
  /**
    * The epoch time (in milliseconds) when the thing last connected or disconnected. If the thing has been disconnected for approximately an hour, the time value might be missing.
    */
  var timestamp: js.UndefOr[ConnectivityTimestamp] = js.undefined
}
object ThingConnectivity {
  
  inline def apply(): ThingConnectivity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThingConnectivity]
  }
  
  extension [Self <: ThingConnectivity](x: Self) {
    
    inline def setConnected(value: Boolean): Self = StObject.set(x, "connected", value.asInstanceOf[js.Any])
    
    inline def setConnectedUndefined: Self = StObject.set(x, "connected", js.undefined)
    
    inline def setDisconnectReason(value: DisconnectReason): Self = StObject.set(x, "disconnectReason", value.asInstanceOf[js.Any])
    
    inline def setDisconnectReasonUndefined: Self = StObject.set(x, "disconnectReason", js.undefined)
    
    inline def setTimestamp(value: ConnectivityTimestamp): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
  }
}

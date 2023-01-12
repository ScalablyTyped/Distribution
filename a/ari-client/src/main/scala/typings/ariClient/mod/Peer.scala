package typings.ariClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Peer extends StObject {
  
  /**
    * The IP address of the peer.
    */
  var address: js.UndefOr[String] = js.undefined
  
  /**
    * An optional reason associated with the change in peer_status.
    */
  var cause: js.UndefOr[String] = js.undefined
  
  /**
    * The current state of the peer. Note that the values of the status are dependent on the underlying peer technology.
    */
  var peer_status: String
  
  /**
    * The port of the peer.
    */
  var port: js.UndefOr[String] = js.undefined
  
  /**
    * The last known time the peer was contacted.
    */
  var time: js.UndefOr[String] = js.undefined
}
object Peer {
  
  inline def apply(peer_status: String): Peer = {
    val __obj = js.Dynamic.literal(peer_status = peer_status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Peer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Peer] (val x: Self) extends AnyVal {
    
    inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    inline def setCause(value: String): Self = StObject.set(x, "cause", value.asInstanceOf[js.Any])
    
    inline def setCauseUndefined: Self = StObject.set(x, "cause", js.undefined)
    
    inline def setPeer_status(value: String): Self = StObject.set(x, "peer_status", value.asInstanceOf[js.Any])
    
    inline def setPort(value: String): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    inline def setTime(value: String): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    inline def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
  }
}

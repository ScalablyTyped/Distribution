package typings.ariClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PeerStatusChange
  extends StObject
     with Event {
  
  /**
    * Endpoint.
    */
  var endpoint: Endpoint
  
  /**
    * Peer.
    */
  var peer: Peer
}
object PeerStatusChange {
  
  inline def apply(application: String, endpoint: Endpoint, peer: Peer, timestamp: js.Date, `type`: String): PeerStatusChange = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], endpoint = endpoint.asInstanceOf[js.Any], peer = peer.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PeerStatusChange]
  }
  
  extension [Self <: PeerStatusChange](x: Self) {
    
    inline def setEndpoint(value: Endpoint): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
    
    inline def setPeer(value: Peer): Self = StObject.set(x, "peer", value.asInstanceOf[js.Any])
  }
}

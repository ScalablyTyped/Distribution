package typings.ariClient.mod

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dial
  extends StObject
     with Event {
  
  /**
    * The calling channel.
    */
  var caller: js.UndefOr[Channel] = js.undefined
  
  /**
    * Current status of the dialing attempt to the peer.
    */
  var dialstatus: String
  
  /**
    * The dial string for calling the peer channel.
    */
  var dialstring: js.UndefOr[String] = js.undefined
  
  /**
    * Forwarding target requested by the original dialed channel.
    */
  var forward: js.UndefOr[String] = js.undefined
  
  /**
    * Channel that the caller has been forwarded to.
    */
  var forwarded: js.UndefOr[Channel] = js.undefined
  
  /**
    * The dialed channel.
    */
  var peer: Channel
}
object Dial {
  
  inline def apply(application: String, dialstatus: String, peer: Channel, timestamp: Date, `type`: String): Dial = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], dialstatus = dialstatus.asInstanceOf[js.Any], peer = peer.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dial]
  }
  
  extension [Self <: Dial](x: Self) {
    
    inline def setCaller(value: Channel): Self = StObject.set(x, "caller", value.asInstanceOf[js.Any])
    
    inline def setCallerUndefined: Self = StObject.set(x, "caller", js.undefined)
    
    inline def setDialstatus(value: String): Self = StObject.set(x, "dialstatus", value.asInstanceOf[js.Any])
    
    inline def setDialstring(value: String): Self = StObject.set(x, "dialstring", value.asInstanceOf[js.Any])
    
    inline def setDialstringUndefined: Self = StObject.set(x, "dialstring", js.undefined)
    
    inline def setForward(value: String): Self = StObject.set(x, "forward", value.asInstanceOf[js.Any])
    
    inline def setForwardUndefined: Self = StObject.set(x, "forward", js.undefined)
    
    inline def setForwarded(value: Channel): Self = StObject.set(x, "forwarded", value.asInstanceOf[js.Any])
    
    inline def setForwardedUndefined: Self = StObject.set(x, "forwarded", js.undefined)
    
    inline def setPeer(value: Channel): Self = StObject.set(x, "peer", value.asInstanceOf[js.Any])
  }
}

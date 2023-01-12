package typings.agoraRtcSdk.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Configurations for a TURN server in {@link setTurnServer} or {@link createClient}.
  */
trait TurnServer extends StObject {
  
  /**
    * Sets whether to force data transfer by TURN Server:
    * - `true`: Force data transfer.
    * - `false`: (default) Not to force data transfer.
    */
  var forceturn: js.UndefOr[Boolean] = js.undefined
  
  /** Your TURN Server password. ASCII characters only, and the string length must be greater than 0 and less than 256 bytes. */
  var password: String
  
  /** The TCP port(s) you want add to TURN Server. Numeric characters only, and the string length must be greater than 0 and less than 256 bytes. */
  var tcpport: js.UndefOr[String] = js.undefined
  
  /** Your TURN Server URL address. ASCII characters only, and the string length must be greater than 0 and less than 256 bytes. */
  var turnServerURL: String
  
  /** The UDP port(s) you want to add to TURN Server. Numeric characters only, and the string length must be greater than 0 and less than 256 bytes. */
  var udpport: String
  
  /** Your TURN Server username. ASCII characters only, and the string length must be greater than 0 and less than 256 bytes. */
  var username: String
}
object TurnServer {
  
  inline def apply(password: String, turnServerURL: String, udpport: String, username: String): TurnServer = {
    val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], turnServerURL = turnServerURL.asInstanceOf[js.Any], udpport = udpport.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[TurnServer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TurnServer] (val x: Self) extends AnyVal {
    
    inline def setForceturn(value: Boolean): Self = StObject.set(x, "forceturn", value.asInstanceOf[js.Any])
    
    inline def setForceturnUndefined: Self = StObject.set(x, "forceturn", js.undefined)
    
    inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setTcpport(value: String): Self = StObject.set(x, "tcpport", value.asInstanceOf[js.Any])
    
    inline def setTcpportUndefined: Self = StObject.set(x, "tcpport", js.undefined)
    
    inline def setTurnServerURL(value: String): Self = StObject.set(x, "turnServerURL", value.asInstanceOf[js.Any])
    
    inline def setUdpport(value: String): Self = StObject.set(x, "udpport", value.asInstanceOf[js.Any])
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
  }
}

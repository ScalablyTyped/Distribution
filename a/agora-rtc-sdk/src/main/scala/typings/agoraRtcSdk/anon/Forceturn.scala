package typings.agoraRtcSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Forceturn extends StObject {
  
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
object Forceturn {
  
  @scala.inline
  def apply(password: String, turnServerURL: String, udpport: String, username: String): Forceturn = {
    val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], turnServerURL = turnServerURL.asInstanceOf[js.Any], udpport = udpport.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[Forceturn]
  }
  
  @scala.inline
  implicit class ForceturnMutableBuilder[Self <: Forceturn] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setForceturn(value: Boolean): Self = StObject.set(x, "forceturn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceturnUndefined: Self = StObject.set(x, "forceturn", js.undefined)
    
    @scala.inline
    def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTcpport(value: String): Self = StObject.set(x, "tcpport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTcpportUndefined: Self = StObject.set(x, "tcpport", js.undefined)
    
    @scala.inline
    def setTurnServerURL(value: String): Self = StObject.set(x, "turnServerURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUdpport(value: String): Self = StObject.set(x, "udpport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
  }
}

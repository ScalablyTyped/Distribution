package typings.ariClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AsteriskPing extends StObject {
  
  /**
    * Asterisk id info.
    */
  var asterisk_id: String
  
  /**
    * Always string value is pong.
    */
  var ping: String
  
  /**
    * The timestamp string of request received time.
    */
  var timestamp: String
}
object AsteriskPing {
  
  @scala.inline
  def apply(asterisk_id: String, ping: String, timestamp: String): AsteriskPing = {
    val __obj = js.Dynamic.literal(asterisk_id = asterisk_id.asInstanceOf[js.Any], ping = ping.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsteriskPing]
  }
  
  @scala.inline
  implicit class AsteriskPingMutableBuilder[Self <: AsteriskPing] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAsterisk_id(value: String): Self = StObject.set(x, "asterisk_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPing(value: String): Self = StObject.set(x, "ping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}

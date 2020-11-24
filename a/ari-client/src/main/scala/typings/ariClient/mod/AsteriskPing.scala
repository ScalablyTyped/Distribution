package typings.ariClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AsteriskPing extends js.Object {
  
  /**
    * Asterisk id info.
    */
  var asterisk_id: String = js.native
  
  /**
    * Always string value is pong.
    */
  var ping: String = js.native
  
  /**
    * The timestamp string of request received time.
    */
  var timestamp: String = js.native
}
object AsteriskPing {
  
  @scala.inline
  def apply(asterisk_id: String, ping: String, timestamp: String): AsteriskPing = {
    val __obj = js.Dynamic.literal(asterisk_id = asterisk_id.asInstanceOf[js.Any], ping = ping.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsteriskPing]
  }
  
  @scala.inline
  implicit class AsteriskPingOps[Self <: AsteriskPing] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAsterisk_id(value: String): Self = this.set("asterisk_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPing(value: String): Self = this.set("ping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: String): Self = this.set("timestamp", value.asInstanceOf[js.Any])
  }
}

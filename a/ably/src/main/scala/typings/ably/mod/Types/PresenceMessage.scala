package typings.ably.mod.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PresenceMessage extends js.Object {
  
  var action: PresenceAction = js.native
  
  var clientId: String = js.native
  
  var connectionId: String = js.native
  
  var data: js.Any = js.native
  
  var encoding: String = js.native
  
  var id: String = js.native
  
  var timestamp: Double = js.native
}
object PresenceMessage {
  
  @scala.inline
  def apply(
    action: PresenceAction,
    clientId: String,
    connectionId: String,
    data: js.Any,
    encoding: String,
    id: String,
    timestamp: Double
  ): PresenceMessage = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any], connectionId = connectionId.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], encoding = encoding.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[PresenceMessage]
  }
  
  @scala.inline
  implicit class PresenceMessageOps[Self <: PresenceMessage] (val x: Self) extends AnyVal {
    
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
    def setAction(value: PresenceAction): Self = this.set("action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientId(value: String): Self = this.set("clientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionId(value: String): Self = this.set("connectionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncoding(value: String): Self = this.set("encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: Double): Self = this.set("timestamp", value.asInstanceOf[js.Any])
  }
}

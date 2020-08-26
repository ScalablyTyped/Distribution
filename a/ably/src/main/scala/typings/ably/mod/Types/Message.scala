package typings.ably.mod.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Message extends js.Object {
  var clientId: String = js.native
  var connectionId: String = js.native
  var data: js.Any = js.native
  var encoding: String = js.native
  var extras: js.Any = js.native
  var id: String = js.native
  var name: String = js.native
  var timestamp: Double = js.native
}

object Message {
  @scala.inline
  def apply(
    clientId: String,
    connectionId: String,
    data: js.Any,
    encoding: String,
    extras: js.Any,
    id: String,
    name: String,
    timestamp: Double
  ): Message = {
    val __obj = js.Dynamic.literal(clientId = clientId.asInstanceOf[js.Any], connectionId = connectionId.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], encoding = encoding.asInstanceOf[js.Any], extras = extras.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[Message]
  }
  @scala.inline
  implicit class MessageOps[Self <: Message] (val x: Self) extends AnyVal {
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
    def setClientId(value: String): Self = this.set("clientId", value.asInstanceOf[js.Any])
    @scala.inline
    def setConnectionId(value: String): Self = this.set("connectionId", value.asInstanceOf[js.Any])
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setEncoding(value: String): Self = this.set("encoding", value.asInstanceOf[js.Any])
    @scala.inline
    def setExtras(value: js.Any): Self = this.set("extras", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimestamp(value: Double): Self = this.set("timestamp", value.asInstanceOf[js.Any])
  }
  
}


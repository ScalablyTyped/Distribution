package typings.ariClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Channel extends js.Object {
  var bridgeId: String = js.native
  var channel: String | js.Array[String] = js.native
}

object Channel {
  @scala.inline
  def apply(bridgeId: String, channel: String | js.Array[String]): Channel = {
    val __obj = js.Dynamic.literal(bridgeId = bridgeId.asInstanceOf[js.Any], channel = channel.asInstanceOf[js.Any])
    __obj.asInstanceOf[Channel]
  }
  @scala.inline
  implicit class ChannelOps[Self <: Channel] (val x: Self) extends AnyVal {
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
    def setBridgeId(value: String): Self = this.set("bridgeId", value.asInstanceOf[js.Any])
    @scala.inline
    def setChannelVarargs(value: String*): Self = this.set("channel", js.Array(value :_*))
    @scala.inline
    def setChannel(value: String | js.Array[String]): Self = this.set("channel", value.asInstanceOf[js.Any])
  }
  
}


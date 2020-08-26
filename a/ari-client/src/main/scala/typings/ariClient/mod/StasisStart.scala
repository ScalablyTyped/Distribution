package typings.ariClient.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StasisStart extends Event {
  /**
    * Arguments to the application.
    */
  var args: String | js.Array[String] = js.native
  /**
    * Channel.
    */
  var channel: Channel = js.native
  /**
    * Replace_channel.
    */
  var replace_channel: js.UndefOr[Channel] = js.native
}

object StasisStart {
  @scala.inline
  def apply(
    application: String,
    args: String | js.Array[String],
    channel: Channel,
    timestamp: Date,
    `type`: String
  ): StasisStart = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], args = args.asInstanceOf[js.Any], channel = channel.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StasisStart]
  }
  @scala.inline
  implicit class StasisStartOps[Self <: StasisStart] (val x: Self) extends AnyVal {
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
    def setArgsVarargs(value: String*): Self = this.set("args", js.Array(value :_*))
    @scala.inline
    def setArgs(value: String | js.Array[String]): Self = this.set("args", value.asInstanceOf[js.Any])
    @scala.inline
    def setChannel(value: Channel): Self = this.set("channel", value.asInstanceOf[js.Any])
    @scala.inline
    def setReplace_channel(value: Channel): Self = this.set("replace_channel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplace_channel: Self = this.set("replace_channel", js.undefined)
  }
  
}


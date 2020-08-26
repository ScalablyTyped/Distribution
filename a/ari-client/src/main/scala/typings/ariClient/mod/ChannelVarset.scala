package typings.ariClient.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChannelVarset extends Event {
  /**
    * The channel on which the variable was set. If missing, the variable is a global variable.
    */
  var channel: js.UndefOr[Channel] = js.native
  /**
    * The new value of the variable.
    */
  var value: String = js.native
  /**
    * The variable that changed.
    */
  var variable: String = js.native
}

object ChannelVarset {
  @scala.inline
  def apply(application: String, timestamp: Date, `type`: String, value: String, variable: String): ChannelVarset = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], variable = variable.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelVarset]
  }
  @scala.inline
  implicit class ChannelVarsetOps[Self <: ChannelVarset] (val x: Self) extends AnyVal {
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
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def setVariable(value: String): Self = this.set("variable", value.asInstanceOf[js.Any])
    @scala.inline
    def setChannel(value: Channel): Self = this.set("channel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChannel: Self = this.set("channel", js.undefined)
  }
  
}


package typings.ariClient.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChannelDialplan extends Event {
  
  /**
    * The channel that changed dialplan location.
    */
  var channel: Channel = js.native
  
  /**
    * The application about to be executed.
    */
  var dialplan_app: String = js.native
  
  /**
    * The data to be passed to the application.
    */
  var dialplan_app_data: String = js.native
}
object ChannelDialplan {
  
  @scala.inline
  def apply(
    application: String,
    channel: Channel,
    dialplan_app: String,
    dialplan_app_data: String,
    timestamp: Date,
    `type`: String
  ): ChannelDialplan = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], channel = channel.asInstanceOf[js.Any], dialplan_app = dialplan_app.asInstanceOf[js.Any], dialplan_app_data = dialplan_app_data.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelDialplan]
  }
  
  @scala.inline
  implicit class ChannelDialplanOps[Self <: ChannelDialplan] (val x: Self) extends AnyVal {
    
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
    def setChannel(value: Channel): Self = this.set("channel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDialplan_app(value: String): Self = this.set("dialplan_app", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDialplan_app_data(value: String): Self = this.set("dialplan_app_data", value.asInstanceOf[js.Any])
  }
}

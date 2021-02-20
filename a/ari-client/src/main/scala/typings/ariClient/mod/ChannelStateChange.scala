package typings.ariClient.mod

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChannelStateChange extends Event {
  
  /**
    * Channel.
    */
  var channel: Channel = js.native
}
object ChannelStateChange {
  
  @scala.inline
  def apply(application: String, channel: Channel, timestamp: Date, `type`: String): ChannelStateChange = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], channel = channel.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelStateChange]
  }
  
  @scala.inline
  implicit class ChannelStateChangeMutableBuilder[Self <: ChannelStateChange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannel(value: Channel): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
  }
}

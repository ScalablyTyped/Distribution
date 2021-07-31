package typings.ariClient.mod

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChannelCreated
  extends StObject
     with Event {
  
  /**
    * Channel.
    */
  var channel: Channel
}
object ChannelCreated {
  
  @scala.inline
  def apply(application: String, channel: Channel, timestamp: Date, `type`: String): ChannelCreated = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], channel = channel.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelCreated]
  }
  
  @scala.inline
  implicit class ChannelCreatedMutableBuilder[Self <: ChannelCreated] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannel(value: Channel): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
  }
}

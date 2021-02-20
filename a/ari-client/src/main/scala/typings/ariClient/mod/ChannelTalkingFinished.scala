package typings.ariClient.mod

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChannelTalkingFinished extends Event {
  
  /**
    * The channel on which talking completed.
    */
  var channel: Channel = js.native
  
  /**
    * The length of time, in milliseconds, that talking was detected on the channel.
    */
  var duration: Double = js.native
}
object ChannelTalkingFinished {
  
  @scala.inline
  def apply(application: String, channel: Channel, duration: Double, timestamp: Date, `type`: String): ChannelTalkingFinished = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], channel = channel.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelTalkingFinished]
  }
  
  @scala.inline
  implicit class ChannelTalkingFinishedMutableBuilder[Self <: ChannelTalkingFinished] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChannel(value: Channel): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
  }
}

package typings.ariClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChannelTalkingFinished
  extends StObject
     with Event {
  
  /**
    * The channel on which talking completed.
    */
  var channel: Channel
  
  /**
    * The length of time, in milliseconds, that talking was detected on the channel.
    */
  var duration: Double
}
object ChannelTalkingFinished {
  
  inline def apply(application: String, channel: Channel, duration: Double, timestamp: js.Date, `type`: String): ChannelTalkingFinished = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], channel = channel.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelTalkingFinished]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChannelTalkingFinished] (val x: Self) extends AnyVal {
    
    inline def setChannel(value: Channel): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
  }
}

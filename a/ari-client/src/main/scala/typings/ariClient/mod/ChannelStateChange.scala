package typings.ariClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChannelStateChange
  extends StObject
     with Event {
  
  /**
    * Channel.
    */
  var channel: Channel
}
object ChannelStateChange {
  
  inline def apply(application: String, channel: Channel, timestamp: js.Date, `type`: String): ChannelStateChange = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], channel = channel.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelStateChange]
  }
  
  extension [Self <: ChannelStateChange](x: Self) {
    
    inline def setChannel(value: Channel): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
  }
}

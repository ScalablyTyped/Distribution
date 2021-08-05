package typings.ariClient.mod

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChannelUnhold
  extends StObject
     with Event {
  
  /**
    * The channel that initiated the unhold event.
    */
  var channel: Channel
}
object ChannelUnhold {
  
  inline def apply(application: String, channel: Channel, timestamp: Date, `type`: String): ChannelUnhold = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], channel = channel.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelUnhold]
  }
  
  extension [Self <: ChannelUnhold](x: Self) {
    
    inline def setChannel(value: Channel): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
  }
}

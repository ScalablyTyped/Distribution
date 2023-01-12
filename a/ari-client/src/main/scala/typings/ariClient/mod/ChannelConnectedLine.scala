package typings.ariClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChannelConnectedLine
  extends StObject
     with Event {
  
  /**
    * The channel whose connected line has changed.
    */
  var channel: Channel
}
object ChannelConnectedLine {
  
  inline def apply(application: String, channel: Channel, timestamp: js.Date, `type`: String): ChannelConnectedLine = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], channel = channel.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelConnectedLine]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChannelConnectedLine] (val x: Self) extends AnyVal {
    
    inline def setChannel(value: Channel): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
  }
}

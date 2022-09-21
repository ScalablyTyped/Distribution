package typings.ariClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChannelHold
  extends StObject
     with Event {
  
  /**
    * The channel that initiated the hold event.
    */
  var channel: Channel
  
  /**
    * The music on hold class that the initiator requested.
    */
  var musicclass: js.UndefOr[String] = js.undefined
}
object ChannelHold {
  
  inline def apply(application: String, channel: Channel, timestamp: js.Date, `type`: String): ChannelHold = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], channel = channel.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelHold]
  }
  
  extension [Self <: ChannelHold](x: Self) {
    
    inline def setChannel(value: Channel): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    inline def setMusicclass(value: String): Self = StObject.set(x, "musicclass", value.asInstanceOf[js.Any])
    
    inline def setMusicclassUndefined: Self = StObject.set(x, "musicclass", js.undefined)
  }
}

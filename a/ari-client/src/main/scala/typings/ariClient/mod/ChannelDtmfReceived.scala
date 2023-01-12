package typings.ariClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChannelDtmfReceived
  extends StObject
     with Event {
  
  /**
    * The channel on which DTMF was received.
    */
  var channel: Channel
  
  /**
    * DTMF digit received (0-9, A-E, # or *).
    */
  var digit: String
  
  /**
    * Number of milliseconds DTMF was received.
    */
  var duration_ms: Double
}
object ChannelDtmfReceived {
  
  inline def apply(
    application: String,
    channel: Channel,
    digit: String,
    duration_ms: Double,
    timestamp: js.Date,
    `type`: String
  ): ChannelDtmfReceived = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], channel = channel.asInstanceOf[js.Any], digit = digit.asInstanceOf[js.Any], duration_ms = duration_ms.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelDtmfReceived]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChannelDtmfReceived] (val x: Self) extends AnyVal {
    
    inline def setChannel(value: Channel): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    inline def setDigit(value: String): Self = StObject.set(x, "digit", value.asInstanceOf[js.Any])
    
    inline def setDuration_ms(value: Double): Self = StObject.set(x, "duration_ms", value.asInstanceOf[js.Any])
  }
}

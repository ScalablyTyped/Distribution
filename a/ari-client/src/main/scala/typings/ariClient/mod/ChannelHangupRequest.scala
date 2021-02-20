package typings.ariClient.mod

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChannelHangupRequest extends Event {
  
  /**
    * Integer representation of the cause of the hangup.
    */
  var cause: Double = js.native
  
  /**
    * The channel on which the hangup was requested.
    */
  var channel: Channel = js.native
  
  /**
    * Whether the hangup request was a soft hangup request.
    */
  var soft: Boolean = js.native
}
object ChannelHangupRequest {
  
  @scala.inline
  def apply(
    application: String,
    cause: Double,
    channel: Channel,
    soft: Boolean,
    timestamp: Date,
    `type`: String
  ): ChannelHangupRequest = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], cause = cause.asInstanceOf[js.Any], channel = channel.asInstanceOf[js.Any], soft = soft.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelHangupRequest]
  }
  
  @scala.inline
  implicit class ChannelHangupRequestMutableBuilder[Self <: ChannelHangupRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCause(value: Double): Self = StObject.set(x, "cause", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannel(value: Channel): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSoft(value: Boolean): Self = StObject.set(x, "soft", value.asInstanceOf[js.Any])
  }
}

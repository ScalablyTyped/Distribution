package typings.ariClient.mod

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChannelDestroyed
  extends StObject
     with Event {
  
  /**
    * Integer representation of the cause of the hangup.
    */
  var cause: Double
  
  /**
    * Text representation of the cause of the hangup.
    */
  var cause_txt: String
  
  /**
    * Channel.
    */
  var channel: Channel
}
object ChannelDestroyed {
  
  @scala.inline
  def apply(
    application: String,
    cause: Double,
    cause_txt: String,
    channel: Channel,
    timestamp: Date,
    `type`: String
  ): ChannelDestroyed = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], cause = cause.asInstanceOf[js.Any], cause_txt = cause_txt.asInstanceOf[js.Any], channel = channel.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelDestroyed]
  }
  
  @scala.inline
  implicit class ChannelDestroyedMutableBuilder[Self <: ChannelDestroyed] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCause(value: Double): Self = StObject.set(x, "cause", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCause_txt(value: String): Self = StObject.set(x, "cause_txt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannel(value: Channel): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
  }
}

package typings.ariClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChannelDialplan
  extends StObject
     with Event {
  
  /**
    * The channel that changed dialplan location.
    */
  var channel: Channel
  
  /**
    * The application about to be executed.
    */
  var dialplan_app: String
  
  /**
    * The data to be passed to the application.
    */
  var dialplan_app_data: String
}
object ChannelDialplan {
  
  inline def apply(
    application: String,
    channel: Channel,
    dialplan_app: String,
    dialplan_app_data: String,
    timestamp: js.Date,
    `type`: String
  ): ChannelDialplan = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], channel = channel.asInstanceOf[js.Any], dialplan_app = dialplan_app.asInstanceOf[js.Any], dialplan_app_data = dialplan_app_data.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelDialplan]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChannelDialplan] (val x: Self) extends AnyVal {
    
    inline def setChannel(value: Channel): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    inline def setDialplan_app(value: String): Self = StObject.set(x, "dialplan_app", value.asInstanceOf[js.Any])
    
    inline def setDialplan_app_data(value: String): Self = StObject.set(x, "dialplan_app_data", value.asInstanceOf[js.Any])
  }
}

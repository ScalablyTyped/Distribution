package typings.ariClient.mod

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChannelUserevent extends Event {
  
  /**
    * A bridge that is signaled with the user event.
    */
  var bridge: js.UndefOr[Bridge] = js.native
  
  /**
    * A channel that is signaled with the user event.
    */
  var channel: js.UndefOr[Channel] = js.native
  
  /**
    * A endpoint that is signaled with the user event.
    */
  var endpoint: js.UndefOr[Endpoint] = js.native
  
  /**
    * The name of the user event.
    */
  var eventname: String = js.native
  
  /**
    * Custom Userevent data.
    */
  var userevent: IndexableObject = js.native
}
object ChannelUserevent {
  
  @scala.inline
  def apply(
    application: String,
    eventname: String,
    timestamp: Date,
    `type`: String,
    userevent: IndexableObject
  ): ChannelUserevent = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], eventname = eventname.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], userevent = userevent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelUserevent]
  }
  
  @scala.inline
  implicit class ChannelUsereventMutableBuilder[Self <: ChannelUserevent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBridge(value: Bridge): Self = StObject.set(x, "bridge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBridgeUndefined: Self = StObject.set(x, "bridge", js.undefined)
    
    @scala.inline
    def setChannel(value: Channel): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelUndefined: Self = StObject.set(x, "channel", js.undefined)
    
    @scala.inline
    def setEndpoint(value: Endpoint): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
    
    @scala.inline
    def setEventname(value: String): Self = StObject.set(x, "eventname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserevent(value: IndexableObject): Self = StObject.set(x, "userevent", value.asInstanceOf[js.Any])
  }
}

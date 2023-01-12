package typings.ariClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChannelUserevent
  extends StObject
     with Event {
  
  /**
    * A bridge that is signaled with the user event.
    */
  var bridge: js.UndefOr[Bridge] = js.undefined
  
  /**
    * A channel that is signaled with the user event.
    */
  var channel: js.UndefOr[Channel] = js.undefined
  
  /**
    * A endpoint that is signaled with the user event.
    */
  var endpoint: js.UndefOr[Endpoint] = js.undefined
  
  /**
    * The name of the user event.
    */
  var eventname: String
  
  /**
    * Custom Userevent data.
    */
  var userevent: IndexableObject
}
object ChannelUserevent {
  
  inline def apply(
    application: String,
    eventname: String,
    timestamp: js.Date,
    `type`: String,
    userevent: IndexableObject
  ): ChannelUserevent = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any], eventname = eventname.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], userevent = userevent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelUserevent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChannelUserevent] (val x: Self) extends AnyVal {
    
    inline def setBridge(value: Bridge): Self = StObject.set(x, "bridge", value.asInstanceOf[js.Any])
    
    inline def setBridgeUndefined: Self = StObject.set(x, "bridge", js.undefined)
    
    inline def setChannel(value: Channel): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
    
    inline def setChannelUndefined: Self = StObject.set(x, "channel", js.undefined)
    
    inline def setEndpoint(value: Endpoint): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
    
    inline def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
    
    inline def setEventname(value: String): Self = StObject.set(x, "eventname", value.asInstanceOf[js.Any])
    
    inline def setUserevent(value: IndexableObject): Self = StObject.set(x, "userevent", value.asInstanceOf[js.Any])
  }
}

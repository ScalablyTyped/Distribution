package typings.awsSdk.clientsCloudtrailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateChannelRequest extends StObject {
  
  /**
    * The ARN or ID (the ARN suffix) of the channel that you want to update.
    */
  var Channel: ChannelArn
  
  /**
    * The ARNs of event data stores that you want to log events arriving through the channel.
    */
  var Destinations: js.UndefOr[typings.awsSdk.clientsCloudtrailMod.Destinations] = js.undefined
  
  /**
    *  Changes the name of the channel. 
    */
  var Name: js.UndefOr[ChannelName] = js.undefined
}
object UpdateChannelRequest {
  
  inline def apply(Channel: ChannelArn): UpdateChannelRequest = {
    val __obj = js.Dynamic.literal(Channel = Channel.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateChannelRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateChannelRequest] (val x: Self) extends AnyVal {
    
    inline def setChannel(value: ChannelArn): Self = StObject.set(x, "Channel", value.asInstanceOf[js.Any])
    
    inline def setDestinations(value: Destinations): Self = StObject.set(x, "Destinations", value.asInstanceOf[js.Any])
    
    inline def setDestinationsUndefined: Self = StObject.set(x, "Destinations", js.undefined)
    
    inline def setDestinationsVarargs(value: Destination*): Self = StObject.set(x, "Destinations", js.Array(value*))
    
    inline def setName(value: ChannelName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}

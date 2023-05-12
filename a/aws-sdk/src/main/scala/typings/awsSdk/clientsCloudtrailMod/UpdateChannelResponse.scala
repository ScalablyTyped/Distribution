package typings.awsSdk.clientsCloudtrailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateChannelResponse extends StObject {
  
  /**
    * The ARN of the channel that was updated.
    */
  var ChannelArn: js.UndefOr[typings.awsSdk.clientsCloudtrailMod.ChannelArn] = js.undefined
  
  /**
    * The event data stores that log events arriving through the channel.
    */
  var Destinations: js.UndefOr[typings.awsSdk.clientsCloudtrailMod.Destinations] = js.undefined
  
  /**
    * The name of the channel that was updated.
    */
  var Name: js.UndefOr[ChannelName] = js.undefined
  
  /**
    * The event source of the channel that was updated.
    */
  var Source: js.UndefOr[typings.awsSdk.clientsCloudtrailMod.Source] = js.undefined
}
object UpdateChannelResponse {
  
  inline def apply(): UpdateChannelResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateChannelResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateChannelResponse] (val x: Self) extends AnyVal {
    
    inline def setChannelArn(value: ChannelArn): Self = StObject.set(x, "ChannelArn", value.asInstanceOf[js.Any])
    
    inline def setChannelArnUndefined: Self = StObject.set(x, "ChannelArn", js.undefined)
    
    inline def setDestinations(value: Destinations): Self = StObject.set(x, "Destinations", value.asInstanceOf[js.Any])
    
    inline def setDestinationsUndefined: Self = StObject.set(x, "Destinations", js.undefined)
    
    inline def setDestinationsVarargs(value: Destination*): Self = StObject.set(x, "Destinations", js.Array(value*))
    
    inline def setName(value: ChannelName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setSource(value: Source): Self = StObject.set(x, "Source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "Source", js.undefined)
  }
}

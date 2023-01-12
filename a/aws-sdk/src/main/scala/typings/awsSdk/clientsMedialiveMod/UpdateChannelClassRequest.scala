package typings.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateChannelClassRequest extends StObject {
  
  /**
    * The channel class that you wish to update this channel to use.
    */
  var ChannelClass: typings.awsSdk.clientsMedialiveMod.ChannelClass
  
  /**
    * Channel Id of the channel whose class should be updated.
    */
  var ChannelId: string
  
  /**
    * A list of output destinations for this channel.
    */
  var Destinations: js.UndefOr[listOfOutputDestination] = js.undefined
}
object UpdateChannelClassRequest {
  
  inline def apply(ChannelClass: ChannelClass, ChannelId: string): UpdateChannelClassRequest = {
    val __obj = js.Dynamic.literal(ChannelClass = ChannelClass.asInstanceOf[js.Any], ChannelId = ChannelId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateChannelClassRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateChannelClassRequest] (val x: Self) extends AnyVal {
    
    inline def setChannelClass(value: ChannelClass): Self = StObject.set(x, "ChannelClass", value.asInstanceOf[js.Any])
    
    inline def setChannelId(value: string): Self = StObject.set(x, "ChannelId", value.asInstanceOf[js.Any])
    
    inline def setDestinations(value: listOfOutputDestination): Self = StObject.set(x, "Destinations", value.asInstanceOf[js.Any])
    
    inline def setDestinationsUndefined: Self = StObject.set(x, "Destinations", js.undefined)
    
    inline def setDestinationsVarargs(value: OutputDestination*): Self = StObject.set(x, "Destinations", js.Array(value*))
  }
}

package typings.awsSdk.clientsCloudtrailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateChannelRequest extends StObject {
  
  /**
    * One or more event data stores to which events arriving through a channel will be logged.
    */
  var Destinations: typings.awsSdk.clientsCloudtrailMod.Destinations
  
  /**
    * The name of the channel.
    */
  var Name: ChannelName
  
  /**
    * The name of the partner or external event source. You cannot change this name after you create the channel. A maximum of one channel is allowed per source.  A source can be either Custom for all valid non-Amazon Web Services events, or the name of a partner event source. For information about the source names for available partners, see Additional information about integration partners in the CloudTrail User Guide. 
    */
  var Source: typings.awsSdk.clientsCloudtrailMod.Source
  
  var Tags: js.UndefOr[TagsList] = js.undefined
}
object CreateChannelRequest {
  
  inline def apply(Destinations: Destinations, Name: ChannelName, Source: Source): CreateChannelRequest = {
    val __obj = js.Dynamic.literal(Destinations = Destinations.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateChannelRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateChannelRequest] (val x: Self) extends AnyVal {
    
    inline def setDestinations(value: Destinations): Self = StObject.set(x, "Destinations", value.asInstanceOf[js.Any])
    
    inline def setDestinationsVarargs(value: Destination*): Self = StObject.set(x, "Destinations", js.Array(value*))
    
    inline def setName(value: ChannelName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setSource(value: Source): Self = StObject.set(x, "Source", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagsList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}

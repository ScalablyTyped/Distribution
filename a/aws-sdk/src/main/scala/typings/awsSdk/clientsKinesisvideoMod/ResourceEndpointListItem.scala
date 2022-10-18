package typings.awsSdk.clientsKinesisvideoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceEndpointListItem extends StObject {
  
  /**
    * The protocol of the signaling channel returned by the GetSignalingChannelEndpoint API.
    */
  var Protocol: js.UndefOr[ChannelProtocol] = js.undefined
  
  /**
    * The endpoint of the signaling channel returned by the GetSignalingChannelEndpoint API.
    */
  var ResourceEndpoint: js.UndefOr[typings.awsSdk.clientsKinesisvideoMod.ResourceEndpoint] = js.undefined
}
object ResourceEndpointListItem {
  
  inline def apply(): ResourceEndpointListItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceEndpointListItem]
  }
  
  extension [Self <: ResourceEndpointListItem](x: Self) {
    
    inline def setProtocol(value: ChannelProtocol): Self = StObject.set(x, "Protocol", value.asInstanceOf[js.Any])
    
    inline def setProtocolUndefined: Self = StObject.set(x, "Protocol", js.undefined)
    
    inline def setResourceEndpoint(value: ResourceEndpoint): Self = StObject.set(x, "ResourceEndpoint", value.asInstanceOf[js.Any])
    
    inline def setResourceEndpointUndefined: Self = StObject.set(x, "ResourceEndpoint", js.undefined)
  }
}

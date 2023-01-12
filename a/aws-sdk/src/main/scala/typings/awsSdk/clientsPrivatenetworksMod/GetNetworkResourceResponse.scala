package typings.awsSdk.clientsPrivatenetworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetNetworkResourceResponse extends StObject {
  
  /**
    * Information about the network resource.
    */
  var networkResource: NetworkResource
  
  /**
    *  The network resource tags. 
    */
  var tags: js.UndefOr[TagMap] = js.undefined
}
object GetNetworkResourceResponse {
  
  inline def apply(networkResource: NetworkResource): GetNetworkResourceResponse = {
    val __obj = js.Dynamic.literal(networkResource = networkResource.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetNetworkResourceResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetNetworkResourceResponse] (val x: Self) extends AnyVal {
    
    inline def setNetworkResource(value: NetworkResource): Self = StObject.set(x, "networkResource", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}

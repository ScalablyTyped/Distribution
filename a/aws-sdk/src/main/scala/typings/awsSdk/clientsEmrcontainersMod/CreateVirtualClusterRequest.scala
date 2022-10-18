package typings.awsSdk.clientsEmrcontainersMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateVirtualClusterRequest extends StObject {
  
  /**
    * The client token of the virtual cluster.
    */
  var clientToken: ClientToken
  
  /**
    * The container provider of the virtual cluster.
    */
  var containerProvider: ContainerProvider
  
  /**
    * The specified name of the virtual cluster.
    */
  var name: ResourceNameString
  
  /**
    * The tags assigned to the virtual cluster.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
}
object CreateVirtualClusterRequest {
  
  inline def apply(clientToken: ClientToken, containerProvider: ContainerProvider, name: ResourceNameString): CreateVirtualClusterRequest = {
    val __obj = js.Dynamic.literal(clientToken = clientToken.asInstanceOf[js.Any], containerProvider = containerProvider.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateVirtualClusterRequest]
  }
  
  extension [Self <: CreateVirtualClusterRequest](x: Self) {
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setContainerProvider(value: ContainerProvider): Self = StObject.set(x, "containerProvider", value.asInstanceOf[js.Any])
    
    inline def setName(value: ResourceNameString): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}

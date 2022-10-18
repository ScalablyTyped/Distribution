package typings.awsSdk.clientsEmrcontainersMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteManagedEndpointRequest extends StObject {
  
  /**
    * The ID of the managed endpoint.
    */
  var id: ResourceIdString
  
  /**
    * The ID of the endpoint's virtual cluster.
    */
  var virtualClusterId: ResourceIdString
}
object DeleteManagedEndpointRequest {
  
  inline def apply(id: ResourceIdString, virtualClusterId: ResourceIdString): DeleteManagedEndpointRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], virtualClusterId = virtualClusterId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteManagedEndpointRequest]
  }
  
  extension [Self <: DeleteManagedEndpointRequest](x: Self) {
    
    inline def setId(value: ResourceIdString): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setVirtualClusterId(value: ResourceIdString): Self = StObject.set(x, "virtualClusterId", value.asInstanceOf[js.Any])
  }
}

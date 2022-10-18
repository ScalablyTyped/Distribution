package typings.awsSdk.clientsEmrcontainersMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteManagedEndpointResponse extends StObject {
  
  /**
    * The output displays the ID of the managed endpoint.
    */
  var id: js.UndefOr[ResourceIdString] = js.undefined
  
  /**
    * The output displays the ID of the endpoint's virtual cluster.
    */
  var virtualClusterId: js.UndefOr[ResourceIdString] = js.undefined
}
object DeleteManagedEndpointResponse {
  
  inline def apply(): DeleteManagedEndpointResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteManagedEndpointResponse]
  }
  
  extension [Self <: DeleteManagedEndpointResponse](x: Self) {
    
    inline def setId(value: ResourceIdString): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setVirtualClusterId(value: ResourceIdString): Self = StObject.set(x, "virtualClusterId", value.asInstanceOf[js.Any])
    
    inline def setVirtualClusterIdUndefined: Self = StObject.set(x, "virtualClusterId", js.undefined)
  }
}

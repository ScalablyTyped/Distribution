package typings.awsSdk.clientsGroundstationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteDataflowEndpointGroupRequest extends StObject {
  
  /**
    * UUID of a dataflow endpoint group.
    */
  var dataflowEndpointGroupId: Uuid
}
object DeleteDataflowEndpointGroupRequest {
  
  inline def apply(dataflowEndpointGroupId: Uuid): DeleteDataflowEndpointGroupRequest = {
    val __obj = js.Dynamic.literal(dataflowEndpointGroupId = dataflowEndpointGroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDataflowEndpointGroupRequest]
  }
  
  extension [Self <: DeleteDataflowEndpointGroupRequest](x: Self) {
    
    inline def setDataflowEndpointGroupId(value: Uuid): Self = StObject.set(x, "dataflowEndpointGroupId", value.asInstanceOf[js.Any])
  }
}

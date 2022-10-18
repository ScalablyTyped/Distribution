package typings.awsSdk.clientsGroundstationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteDataflowEndpointGroupRequest extends StObject {
  
  /**
    * UUID of a dataflow endpoint group.
    */
  var dataflowEndpointGroupId: String
}
object DeleteDataflowEndpointGroupRequest {
  
  inline def apply(dataflowEndpointGroupId: String): DeleteDataflowEndpointGroupRequest = {
    val __obj = js.Dynamic.literal(dataflowEndpointGroupId = dataflowEndpointGroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDataflowEndpointGroupRequest]
  }
  
  extension [Self <: DeleteDataflowEndpointGroupRequest](x: Self) {
    
    inline def setDataflowEndpointGroupId(value: String): Self = StObject.set(x, "dataflowEndpointGroupId", value.asInstanceOf[js.Any])
  }
}

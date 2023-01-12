package typings.awsSdk.clientsGroundstationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDataflowEndpointGroupRequest extends StObject {
  
  /**
    * UUID of a dataflow endpoint group.
    */
  var dataflowEndpointGroupId: Uuid
}
object GetDataflowEndpointGroupRequest {
  
  inline def apply(dataflowEndpointGroupId: Uuid): GetDataflowEndpointGroupRequest = {
    val __obj = js.Dynamic.literal(dataflowEndpointGroupId = dataflowEndpointGroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDataflowEndpointGroupRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetDataflowEndpointGroupRequest] (val x: Self) extends AnyVal {
    
    inline def setDataflowEndpointGroupId(value: Uuid): Self = StObject.set(x, "dataflowEndpointGroupId", value.asInstanceOf[js.Any])
  }
}

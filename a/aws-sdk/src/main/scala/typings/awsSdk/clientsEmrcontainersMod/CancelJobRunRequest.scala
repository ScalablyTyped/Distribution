package typings.awsSdk.clientsEmrcontainersMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelJobRunRequest extends StObject {
  
  /**
    * The ID of the job run to cancel.
    */
  var id: ResourceIdString
  
  /**
    * The ID of the virtual cluster for which the job run will be canceled.
    */
  var virtualClusterId: ResourceIdString
}
object CancelJobRunRequest {
  
  inline def apply(id: ResourceIdString, virtualClusterId: ResourceIdString): CancelJobRunRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], virtualClusterId = virtualClusterId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelJobRunRequest]
  }
  
  extension [Self <: CancelJobRunRequest](x: Self) {
    
    inline def setId(value: ResourceIdString): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setVirtualClusterId(value: ResourceIdString): Self = StObject.set(x, "virtualClusterId", value.asInstanceOf[js.Any])
  }
}

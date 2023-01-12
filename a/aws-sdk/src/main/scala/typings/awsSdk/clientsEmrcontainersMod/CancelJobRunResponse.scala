package typings.awsSdk.clientsEmrcontainersMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelJobRunResponse extends StObject {
  
  /**
    * The output contains the ID of the cancelled job run.
    */
  var id: js.UndefOr[ResourceIdString] = js.undefined
  
  /**
    * The output contains the virtual cluster ID for which the job run is cancelled.
    */
  var virtualClusterId: js.UndefOr[ResourceIdString] = js.undefined
}
object CancelJobRunResponse {
  
  inline def apply(): CancelJobRunResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CancelJobRunResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CancelJobRunResponse] (val x: Self) extends AnyVal {
    
    inline def setId(value: ResourceIdString): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setVirtualClusterId(value: ResourceIdString): Self = StObject.set(x, "virtualClusterId", value.asInstanceOf[js.Any])
    
    inline def setVirtualClusterIdUndefined: Self = StObject.set(x, "virtualClusterId", js.undefined)
  }
}

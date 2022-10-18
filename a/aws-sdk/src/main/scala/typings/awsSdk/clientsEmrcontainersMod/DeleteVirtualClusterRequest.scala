package typings.awsSdk.clientsEmrcontainersMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteVirtualClusterRequest extends StObject {
  
  /**
    * The ID of the virtual cluster that will be deleted.
    */
  var id: ResourceIdString
}
object DeleteVirtualClusterRequest {
  
  inline def apply(id: ResourceIdString): DeleteVirtualClusterRequest = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteVirtualClusterRequest]
  }
  
  extension [Self <: DeleteVirtualClusterRequest](x: Self) {
    
    inline def setId(value: ResourceIdString): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}

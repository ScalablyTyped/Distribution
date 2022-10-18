package typings.awsSdk.clientsMemorydbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchUpdateClusterRequest extends StObject {
  
  /**
    * The cluster names to apply the updates.
    */
  var ClusterNames: ClusterNameList
  
  /**
    * The unique ID of the service update
    */
  var ServiceUpdate: js.UndefOr[ServiceUpdateRequest] = js.undefined
}
object BatchUpdateClusterRequest {
  
  inline def apply(ClusterNames: ClusterNameList): BatchUpdateClusterRequest = {
    val __obj = js.Dynamic.literal(ClusterNames = ClusterNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchUpdateClusterRequest]
  }
  
  extension [Self <: BatchUpdateClusterRequest](x: Self) {
    
    inline def setClusterNames(value: ClusterNameList): Self = StObject.set(x, "ClusterNames", value.asInstanceOf[js.Any])
    
    inline def setClusterNamesVarargs(value: String*): Self = StObject.set(x, "ClusterNames", js.Array(value*))
    
    inline def setServiceUpdate(value: ServiceUpdateRequest): Self = StObject.set(x, "ServiceUpdate", value.asInstanceOf[js.Any])
    
    inline def setServiceUpdateUndefined: Self = StObject.set(x, "ServiceUpdate", js.undefined)
  }
}

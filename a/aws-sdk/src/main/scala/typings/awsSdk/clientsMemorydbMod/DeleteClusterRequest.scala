package typings.awsSdk.clientsMemorydbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteClusterRequest extends StObject {
  
  /**
    * The name of the cluster to be deleted
    */
  var ClusterName: String
  
  /**
    * The user-supplied name of a final cluster snapshot. This is the unique name that identifies the snapshot. MemoryDB creates the snapshot, and then deletes the cluster immediately afterward.
    */
  var FinalSnapshotName: js.UndefOr[String] = js.undefined
}
object DeleteClusterRequest {
  
  inline def apply(ClusterName: String): DeleteClusterRequest = {
    val __obj = js.Dynamic.literal(ClusterName = ClusterName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteClusterRequest]
  }
  
  extension [Self <: DeleteClusterRequest](x: Self) {
    
    inline def setClusterName(value: String): Self = StObject.set(x, "ClusterName", value.asInstanceOf[js.Any])
    
    inline def setFinalSnapshotName(value: String): Self = StObject.set(x, "FinalSnapshotName", value.asInstanceOf[js.Any])
    
    inline def setFinalSnapshotNameUndefined: Self = StObject.set(x, "FinalSnapshotName", js.undefined)
  }
}

package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RestoreSnapshotFromRecycleBinRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ID of the snapshot to restore.
    */
  var SnapshotId: typings.awsSdk.clientsEc2Mod.SnapshotId
}
object RestoreSnapshotFromRecycleBinRequest {
  
  inline def apply(SnapshotId: SnapshotId): RestoreSnapshotFromRecycleBinRequest = {
    val __obj = js.Dynamic.literal(SnapshotId = SnapshotId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestoreSnapshotFromRecycleBinRequest]
  }
  
  extension [Self <: RestoreSnapshotFromRecycleBinRequest](x: Self) {
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setSnapshotId(value: SnapshotId): Self = StObject.set(x, "SnapshotId", value.asInstanceOf[js.Any])
  }
}

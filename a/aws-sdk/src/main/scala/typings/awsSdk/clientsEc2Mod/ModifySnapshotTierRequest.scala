package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifySnapshotTierRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ID of the snapshot.
    */
  var SnapshotId: typings.awsSdk.clientsEc2Mod.SnapshotId
  
  /**
    * The name of the storage tier. You must specify archive.
    */
  var StorageTier: js.UndefOr[TargetStorageTier] = js.undefined
}
object ModifySnapshotTierRequest {
  
  inline def apply(SnapshotId: SnapshotId): ModifySnapshotTierRequest = {
    val __obj = js.Dynamic.literal(SnapshotId = SnapshotId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifySnapshotTierRequest]
  }
  
  extension [Self <: ModifySnapshotTierRequest](x: Self) {
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setSnapshotId(value: SnapshotId): Self = StObject.set(x, "SnapshotId", value.asInstanceOf[js.Any])
    
    inline def setStorageTier(value: TargetStorageTier): Self = StObject.set(x, "StorageTier", value.asInstanceOf[js.Any])
    
    inline def setStorageTierUndefined: Self = StObject.set(x, "StorageTier", js.undefined)
  }
}

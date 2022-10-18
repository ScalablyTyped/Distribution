package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RestoreSnapshotTierRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether to permanently restore an archived snapshot. To permanently restore an archived snapshot, specify true and omit the RestoreSnapshotTierRequest$TemporaryRestoreDays parameter.
    */
  var PermanentRestore: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ID of the snapshot to restore.
    */
  var SnapshotId: typings.awsSdk.clientsEc2Mod.SnapshotId
  
  /**
    * Specifies the number of days for which to temporarily restore an archived snapshot. Required for temporary restores only. The snapshot will be automatically re-archived after this period. To temporarily restore an archived snapshot, specify the number of days and omit the PermanentRestore parameter or set it to false.
    */
  var TemporaryRestoreDays: js.UndefOr[RestoreSnapshotTierRequestTemporaryRestoreDays] = js.undefined
}
object RestoreSnapshotTierRequest {
  
  inline def apply(SnapshotId: SnapshotId): RestoreSnapshotTierRequest = {
    val __obj = js.Dynamic.literal(SnapshotId = SnapshotId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestoreSnapshotTierRequest]
  }
  
  extension [Self <: RestoreSnapshotTierRequest](x: Self) {
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setPermanentRestore(value: Boolean): Self = StObject.set(x, "PermanentRestore", value.asInstanceOf[js.Any])
    
    inline def setPermanentRestoreUndefined: Self = StObject.set(x, "PermanentRestore", js.undefined)
    
    inline def setSnapshotId(value: SnapshotId): Self = StObject.set(x, "SnapshotId", value.asInstanceOf[js.Any])
    
    inline def setTemporaryRestoreDays(value: RestoreSnapshotTierRequestTemporaryRestoreDays): Self = StObject.set(x, "TemporaryRestoreDays", value.asInstanceOf[js.Any])
    
    inline def setTemporaryRestoreDaysUndefined: Self = StObject.set(x, "TemporaryRestoreDays", js.undefined)
  }
}

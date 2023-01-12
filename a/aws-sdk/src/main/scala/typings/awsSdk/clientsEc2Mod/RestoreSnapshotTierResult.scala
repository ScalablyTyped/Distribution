package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RestoreSnapshotTierResult extends StObject {
  
  /**
    * Indicates whether the snapshot is permanently restored. true indicates a permanent restore. false indicates a temporary restore.
    */
  var IsPermanentRestore: js.UndefOr[Boolean] = js.undefined
  
  /**
    * For temporary restores only. The number of days for which the archived snapshot is temporarily restored.
    */
  var RestoreDuration: js.UndefOr[Integer] = js.undefined
  
  /**
    * The date and time when the snapshot restore process started.
    */
  var RestoreStartTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The ID of the snapshot.
    */
  var SnapshotId: js.UndefOr[String] = js.undefined
}
object RestoreSnapshotTierResult {
  
  inline def apply(): RestoreSnapshotTierResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RestoreSnapshotTierResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RestoreSnapshotTierResult] (val x: Self) extends AnyVal {
    
    inline def setIsPermanentRestore(value: Boolean): Self = StObject.set(x, "IsPermanentRestore", value.asInstanceOf[js.Any])
    
    inline def setIsPermanentRestoreUndefined: Self = StObject.set(x, "IsPermanentRestore", js.undefined)
    
    inline def setRestoreDuration(value: Integer): Self = StObject.set(x, "RestoreDuration", value.asInstanceOf[js.Any])
    
    inline def setRestoreDurationUndefined: Self = StObject.set(x, "RestoreDuration", js.undefined)
    
    inline def setRestoreStartTime(value: js.Date): Self = StObject.set(x, "RestoreStartTime", value.asInstanceOf[js.Any])
    
    inline def setRestoreStartTimeUndefined: Self = StObject.set(x, "RestoreStartTime", js.undefined)
    
    inline def setSnapshotId(value: String): Self = StObject.set(x, "SnapshotId", value.asInstanceOf[js.Any])
    
    inline def setSnapshotIdUndefined: Self = StObject.set(x, "SnapshotId", js.undefined)
  }
}

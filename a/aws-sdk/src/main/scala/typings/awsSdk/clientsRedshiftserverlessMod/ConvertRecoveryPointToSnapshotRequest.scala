package typings.awsSdk.clientsRedshiftserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConvertRecoveryPointToSnapshotRequest extends StObject {
  
  /**
    * The unique identifier of the recovery point.
    */
  var recoveryPointId: String
  
  /**
    * How long to retain the snapshot.
    */
  var retentionPeriod: js.UndefOr[Integer] = js.undefined
  
  /**
    * The name of the snapshot.
    */
  var snapshotName: String
}
object ConvertRecoveryPointToSnapshotRequest {
  
  inline def apply(recoveryPointId: String, snapshotName: String): ConvertRecoveryPointToSnapshotRequest = {
    val __obj = js.Dynamic.literal(recoveryPointId = recoveryPointId.asInstanceOf[js.Any], snapshotName = snapshotName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConvertRecoveryPointToSnapshotRequest]
  }
  
  extension [Self <: ConvertRecoveryPointToSnapshotRequest](x: Self) {
    
    inline def setRecoveryPointId(value: String): Self = StObject.set(x, "recoveryPointId", value.asInstanceOf[js.Any])
    
    inline def setRetentionPeriod(value: Integer): Self = StObject.set(x, "retentionPeriod", value.asInstanceOf[js.Any])
    
    inline def setRetentionPeriodUndefined: Self = StObject.set(x, "retentionPeriod", js.undefined)
    
    inline def setSnapshotName(value: String): Self = StObject.set(x, "snapshotName", value.asInstanceOf[js.Any])
  }
}

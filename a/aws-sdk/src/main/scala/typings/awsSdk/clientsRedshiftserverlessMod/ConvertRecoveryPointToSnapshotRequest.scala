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
  
  /**
    * An array of Tag objects to associate with the created snapshot.
    */
  var tags: js.UndefOr[TagList] = js.undefined
}
object ConvertRecoveryPointToSnapshotRequest {
  
  inline def apply(recoveryPointId: String, snapshotName: String): ConvertRecoveryPointToSnapshotRequest = {
    val __obj = js.Dynamic.literal(recoveryPointId = recoveryPointId.asInstanceOf[js.Any], snapshotName = snapshotName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConvertRecoveryPointToSnapshotRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConvertRecoveryPointToSnapshotRequest] (val x: Self) extends AnyVal {
    
    inline def setRecoveryPointId(value: String): Self = StObject.set(x, "recoveryPointId", value.asInstanceOf[js.Any])
    
    inline def setRetentionPeriod(value: Integer): Self = StObject.set(x, "retentionPeriod", value.asInstanceOf[js.Any])
    
    inline def setRetentionPeriodUndefined: Self = StObject.set(x, "retentionPeriod", js.undefined)
    
    inline def setSnapshotName(value: String): Self = StObject.set(x, "snapshotName", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value*))
  }
}

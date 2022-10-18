package typings.awsSdk.clientsRedshiftserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateSnapshotRequest extends StObject {
  
  /**
    * The new retention period of the snapshot.
    */
  var retentionPeriod: js.UndefOr[Integer] = js.undefined
  
  /**
    * The name of the snapshot.
    */
  var snapshotName: String
}
object UpdateSnapshotRequest {
  
  inline def apply(snapshotName: String): UpdateSnapshotRequest = {
    val __obj = js.Dynamic.literal(snapshotName = snapshotName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateSnapshotRequest]
  }
  
  extension [Self <: UpdateSnapshotRequest](x: Self) {
    
    inline def setRetentionPeriod(value: Integer): Self = StObject.set(x, "retentionPeriod", value.asInstanceOf[js.Any])
    
    inline def setRetentionPeriodUndefined: Self = StObject.set(x, "retentionPeriod", js.undefined)
    
    inline def setSnapshotName(value: String): Self = StObject.set(x, "snapshotName", value.asInstanceOf[js.Any])
  }
}

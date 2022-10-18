package typings.awsSdk.clientsDirectoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RestoreFromSnapshotRequest extends StObject {
  
  /**
    * The identifier of the snapshot to restore from.
    */
  var SnapshotId: typings.awsSdk.clientsDirectoryserviceMod.SnapshotId
}
object RestoreFromSnapshotRequest {
  
  inline def apply(SnapshotId: SnapshotId): RestoreFromSnapshotRequest = {
    val __obj = js.Dynamic.literal(SnapshotId = SnapshotId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestoreFromSnapshotRequest]
  }
  
  extension [Self <: RestoreFromSnapshotRequest](x: Self) {
    
    inline def setSnapshotId(value: SnapshotId): Self = StObject.set(x, "SnapshotId", value.asInstanceOf[js.Any])
  }
}

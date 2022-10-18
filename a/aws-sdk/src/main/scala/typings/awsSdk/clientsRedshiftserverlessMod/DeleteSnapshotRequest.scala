package typings.awsSdk.clientsRedshiftserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteSnapshotRequest extends StObject {
  
  /**
    * The name of the snapshot to be deleted.
    */
  var snapshotName: String
}
object DeleteSnapshotRequest {
  
  inline def apply(snapshotName: String): DeleteSnapshotRequest = {
    val __obj = js.Dynamic.literal(snapshotName = snapshotName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteSnapshotRequest]
  }
  
  extension [Self <: DeleteSnapshotRequest](x: Self) {
    
    inline def setSnapshotName(value: String): Self = StObject.set(x, "snapshotName", value.asInstanceOf[js.Any])
  }
}

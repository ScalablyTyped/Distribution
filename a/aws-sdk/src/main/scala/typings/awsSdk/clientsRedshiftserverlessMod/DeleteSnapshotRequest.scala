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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteSnapshotRequest] (val x: Self) extends AnyVal {
    
    inline def setSnapshotName(value: String): Self = StObject.set(x, "snapshotName", value.asInstanceOf[js.Any])
  }
}

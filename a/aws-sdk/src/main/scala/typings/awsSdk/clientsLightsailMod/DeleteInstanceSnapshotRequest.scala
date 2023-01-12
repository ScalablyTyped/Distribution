package typings.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteInstanceSnapshotRequest extends StObject {
  
  /**
    * The name of the snapshot to delete.
    */
  var instanceSnapshotName: ResourceName
}
object DeleteInstanceSnapshotRequest {
  
  inline def apply(instanceSnapshotName: ResourceName): DeleteInstanceSnapshotRequest = {
    val __obj = js.Dynamic.literal(instanceSnapshotName = instanceSnapshotName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteInstanceSnapshotRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteInstanceSnapshotRequest] (val x: Self) extends AnyVal {
    
    inline def setInstanceSnapshotName(value: ResourceName): Self = StObject.set(x, "instanceSnapshotName", value.asInstanceOf[js.Any])
  }
}

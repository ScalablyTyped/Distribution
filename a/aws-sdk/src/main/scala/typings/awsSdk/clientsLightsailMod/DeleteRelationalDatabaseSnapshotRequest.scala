package typings.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteRelationalDatabaseSnapshotRequest extends StObject {
  
  /**
    * The name of the database snapshot that you are deleting.
    */
  var relationalDatabaseSnapshotName: ResourceName
}
object DeleteRelationalDatabaseSnapshotRequest {
  
  inline def apply(relationalDatabaseSnapshotName: ResourceName): DeleteRelationalDatabaseSnapshotRequest = {
    val __obj = js.Dynamic.literal(relationalDatabaseSnapshotName = relationalDatabaseSnapshotName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteRelationalDatabaseSnapshotRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteRelationalDatabaseSnapshotRequest] (val x: Self) extends AnyVal {
    
    inline def setRelationalDatabaseSnapshotName(value: ResourceName): Self = StObject.set(x, "relationalDatabaseSnapshotName", value.asInstanceOf[js.Any])
  }
}

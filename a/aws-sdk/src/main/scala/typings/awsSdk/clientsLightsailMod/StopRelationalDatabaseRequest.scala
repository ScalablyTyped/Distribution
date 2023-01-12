package typings.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopRelationalDatabaseRequest extends StObject {
  
  /**
    * The name of your database to stop.
    */
  var relationalDatabaseName: ResourceName
  
  /**
    * The name of your new database snapshot to be created before stopping your database.
    */
  var relationalDatabaseSnapshotName: js.UndefOr[ResourceName] = js.undefined
}
object StopRelationalDatabaseRequest {
  
  inline def apply(relationalDatabaseName: ResourceName): StopRelationalDatabaseRequest = {
    val __obj = js.Dynamic.literal(relationalDatabaseName = relationalDatabaseName.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopRelationalDatabaseRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StopRelationalDatabaseRequest] (val x: Self) extends AnyVal {
    
    inline def setRelationalDatabaseName(value: ResourceName): Self = StObject.set(x, "relationalDatabaseName", value.asInstanceOf[js.Any])
    
    inline def setRelationalDatabaseSnapshotName(value: ResourceName): Self = StObject.set(x, "relationalDatabaseSnapshotName", value.asInstanceOf[js.Any])
    
    inline def setRelationalDatabaseSnapshotNameUndefined: Self = StObject.set(x, "relationalDatabaseSnapshotName", js.undefined)
  }
}

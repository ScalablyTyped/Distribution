package typings.awsSdk.clientsKinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationSnapshotConfigurationUpdate extends StObject {
  
  /**
    * Describes updates to whether snapshots are enabled for an application.
    */
  var SnapshotsEnabledUpdate: BooleanObject
}
object ApplicationSnapshotConfigurationUpdate {
  
  inline def apply(SnapshotsEnabledUpdate: BooleanObject): ApplicationSnapshotConfigurationUpdate = {
    val __obj = js.Dynamic.literal(SnapshotsEnabledUpdate = SnapshotsEnabledUpdate.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationSnapshotConfigurationUpdate]
  }
  
  extension [Self <: ApplicationSnapshotConfigurationUpdate](x: Self) {
    
    inline def setSnapshotsEnabledUpdate(value: BooleanObject): Self = StObject.set(x, "SnapshotsEnabledUpdate", value.asInstanceOf[js.Any])
  }
}

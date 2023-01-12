package typings.awsSdk.clientsKinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationSnapshotConfiguration extends StObject {
  
  /**
    * Describes whether snapshots are enabled for a Flink-based Kinesis Data Analytics application.
    */
  var SnapshotsEnabled: BooleanObject
}
object ApplicationSnapshotConfiguration {
  
  inline def apply(SnapshotsEnabled: BooleanObject): ApplicationSnapshotConfiguration = {
    val __obj = js.Dynamic.literal(SnapshotsEnabled = SnapshotsEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationSnapshotConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ApplicationSnapshotConfiguration] (val x: Self) extends AnyVal {
    
    inline def setSnapshotsEnabled(value: BooleanObject): Self = StObject.set(x, "SnapshotsEnabled", value.asInstanceOf[js.Any])
  }
}

package typings.awsSdk.clientsRedshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteClusterSnapshotResult extends StObject {
  
  var Snapshot: js.UndefOr[typings.awsSdk.clientsRedshiftMod.Snapshot] = js.undefined
}
object DeleteClusterSnapshotResult {
  
  inline def apply(): DeleteClusterSnapshotResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteClusterSnapshotResult]
  }
  
  extension [Self <: DeleteClusterSnapshotResult](x: Self) {
    
    inline def setSnapshot(value: Snapshot): Self = StObject.set(x, "Snapshot", value.asInstanceOf[js.Any])
    
    inline def setSnapshotUndefined: Self = StObject.set(x, "Snapshot", js.undefined)
  }
}

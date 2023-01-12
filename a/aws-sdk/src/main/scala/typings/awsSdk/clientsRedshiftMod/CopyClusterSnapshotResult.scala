package typings.awsSdk.clientsRedshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CopyClusterSnapshotResult extends StObject {
  
  var Snapshot: js.UndefOr[typings.awsSdk.clientsRedshiftMod.Snapshot] = js.undefined
}
object CopyClusterSnapshotResult {
  
  inline def apply(): CopyClusterSnapshotResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CopyClusterSnapshotResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CopyClusterSnapshotResult] (val x: Self) extends AnyVal {
    
    inline def setSnapshot(value: Snapshot): Self = StObject.set(x, "Snapshot", value.asInstanceOf[js.Any])
    
    inline def setSnapshotUndefined: Self = StObject.set(x, "Snapshot", js.undefined)
  }
}

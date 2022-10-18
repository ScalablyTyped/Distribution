package typings.awsSdk.clientsElasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteSnapshotResult extends StObject {
  
  var Snapshot: js.UndefOr[typings.awsSdk.clientsElasticacheMod.Snapshot] = js.undefined
}
object DeleteSnapshotResult {
  
  inline def apply(): DeleteSnapshotResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteSnapshotResult]
  }
  
  extension [Self <: DeleteSnapshotResult](x: Self) {
    
    inline def setSnapshot(value: Snapshot): Self = StObject.set(x, "Snapshot", value.asInstanceOf[js.Any])
    
    inline def setSnapshotUndefined: Self = StObject.set(x, "Snapshot", js.undefined)
  }
}

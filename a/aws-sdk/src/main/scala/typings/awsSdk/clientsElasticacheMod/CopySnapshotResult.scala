package typings.awsSdk.clientsElasticacheMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CopySnapshotResult extends StObject {
  
  var Snapshot: js.UndefOr[typings.awsSdk.clientsElasticacheMod.Snapshot] = js.undefined
}
object CopySnapshotResult {
  
  inline def apply(): CopySnapshotResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CopySnapshotResult]
  }
  
  extension [Self <: CopySnapshotResult](x: Self) {
    
    inline def setSnapshot(value: Snapshot): Self = StObject.set(x, "Snapshot", value.asInstanceOf[js.Any])
    
    inline def setSnapshotUndefined: Self = StObject.set(x, "Snapshot", js.undefined)
  }
}

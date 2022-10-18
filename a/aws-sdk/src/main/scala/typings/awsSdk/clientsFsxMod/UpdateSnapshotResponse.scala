package typings.awsSdk.clientsFsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateSnapshotResponse extends StObject {
  
  /**
    * Returned after a successful UpdateSnapshot operation, describing the snapshot that you updated.
    */
  var Snapshot: js.UndefOr[typings.awsSdk.clientsFsxMod.Snapshot] = js.undefined
}
object UpdateSnapshotResponse {
  
  inline def apply(): UpdateSnapshotResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateSnapshotResponse]
  }
  
  extension [Self <: UpdateSnapshotResponse](x: Self) {
    
    inline def setSnapshot(value: Snapshot): Self = StObject.set(x, "Snapshot", value.asInstanceOf[js.Any])
    
    inline def setSnapshotUndefined: Self = StObject.set(x, "Snapshot", js.undefined)
  }
}

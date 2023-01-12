package typings.awsSdk.clientsMemorydbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CopySnapshotResponse extends StObject {
  
  /**
    * Represents a copy of an entire cluster as of the time when the snapshot was taken.
    */
  var Snapshot: js.UndefOr[typings.awsSdk.clientsMemorydbMod.Snapshot] = js.undefined
}
object CopySnapshotResponse {
  
  inline def apply(): CopySnapshotResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CopySnapshotResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CopySnapshotResponse] (val x: Self) extends AnyVal {
    
    inline def setSnapshot(value: Snapshot): Self = StObject.set(x, "Snapshot", value.asInstanceOf[js.Any])
    
    inline def setSnapshotUndefined: Self = StObject.set(x, "Snapshot", js.undefined)
  }
}

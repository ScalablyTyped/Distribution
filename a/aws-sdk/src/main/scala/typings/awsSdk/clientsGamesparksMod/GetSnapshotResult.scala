package typings.awsSdk.clientsGamesparksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSnapshotResult extends StObject {
  
  /**
    * Properties that provide details of the snapshot.
    */
  var Snapshot: js.UndefOr[SnapshotDetails] = js.undefined
}
object GetSnapshotResult {
  
  inline def apply(): GetSnapshotResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSnapshotResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetSnapshotResult] (val x: Self) extends AnyVal {
    
    inline def setSnapshot(value: SnapshotDetails): Self = StObject.set(x, "Snapshot", value.asInstanceOf[js.Any])
    
    inline def setSnapshotUndefined: Self = StObject.set(x, "Snapshot", js.undefined)
  }
}

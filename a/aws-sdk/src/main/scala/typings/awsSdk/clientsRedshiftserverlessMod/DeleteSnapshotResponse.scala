package typings.awsSdk.clientsRedshiftserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteSnapshotResponse extends StObject {
  
  /**
    * The deleted snapshot object.
    */
  var snapshot: js.UndefOr[Snapshot] = js.undefined
}
object DeleteSnapshotResponse {
  
  inline def apply(): DeleteSnapshotResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteSnapshotResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteSnapshotResponse] (val x: Self) extends AnyVal {
    
    inline def setSnapshot(value: Snapshot): Self = StObject.set(x, "snapshot", value.asInstanceOf[js.Any])
    
    inline def setSnapshotUndefined: Self = StObject.set(x, "snapshot", js.undefined)
  }
}

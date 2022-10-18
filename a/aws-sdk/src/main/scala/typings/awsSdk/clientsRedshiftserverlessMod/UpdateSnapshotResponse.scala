package typings.awsSdk.clientsRedshiftserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateSnapshotResponse extends StObject {
  
  /**
    * The updated snapshot object.
    */
  var snapshot: js.UndefOr[Snapshot] = js.undefined
}
object UpdateSnapshotResponse {
  
  inline def apply(): UpdateSnapshotResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateSnapshotResponse]
  }
  
  extension [Self <: UpdateSnapshotResponse](x: Self) {
    
    inline def setSnapshot(value: Snapshot): Self = StObject.set(x, "snapshot", value.asInstanceOf[js.Any])
    
    inline def setSnapshotUndefined: Self = StObject.set(x, "snapshot", js.undefined)
  }
}

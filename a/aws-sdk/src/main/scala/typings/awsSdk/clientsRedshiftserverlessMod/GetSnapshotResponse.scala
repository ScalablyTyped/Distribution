package typings.awsSdk.clientsRedshiftserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSnapshotResponse extends StObject {
  
  /**
    * The returned snapshot object.
    */
  var snapshot: js.UndefOr[Snapshot] = js.undefined
}
object GetSnapshotResponse {
  
  inline def apply(): GetSnapshotResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSnapshotResponse]
  }
  
  extension [Self <: GetSnapshotResponse](x: Self) {
    
    inline def setSnapshot(value: Snapshot): Self = StObject.set(x, "snapshot", value.asInstanceOf[js.Any])
    
    inline def setSnapshotUndefined: Self = StObject.set(x, "snapshot", js.undefined)
  }
}

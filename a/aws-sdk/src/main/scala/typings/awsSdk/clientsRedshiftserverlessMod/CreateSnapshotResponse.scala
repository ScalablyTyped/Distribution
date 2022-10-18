package typings.awsSdk.clientsRedshiftserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateSnapshotResponse extends StObject {
  
  /**
    * The created snapshot object.
    */
  var snapshot: js.UndefOr[Snapshot] = js.undefined
}
object CreateSnapshotResponse {
  
  inline def apply(): CreateSnapshotResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateSnapshotResponse]
  }
  
  extension [Self <: CreateSnapshotResponse](x: Self) {
    
    inline def setSnapshot(value: Snapshot): Self = StObject.set(x, "snapshot", value.asInstanceOf[js.Any])
    
    inline def setSnapshotUndefined: Self = StObject.set(x, "snapshot", js.undefined)
  }
}

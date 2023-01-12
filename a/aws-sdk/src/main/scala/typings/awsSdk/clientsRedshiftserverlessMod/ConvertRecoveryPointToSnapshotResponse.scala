package typings.awsSdk.clientsRedshiftserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConvertRecoveryPointToSnapshotResponse extends StObject {
  
  /**
    * The snapshot converted from the recovery point.
    */
  var snapshot: js.UndefOr[Snapshot] = js.undefined
}
object ConvertRecoveryPointToSnapshotResponse {
  
  inline def apply(): ConvertRecoveryPointToSnapshotResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConvertRecoveryPointToSnapshotResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConvertRecoveryPointToSnapshotResponse] (val x: Self) extends AnyVal {
    
    inline def setSnapshot(value: Snapshot): Self = StObject.set(x, "snapshot", value.asInstanceOf[js.Any])
    
    inline def setSnapshotUndefined: Self = StObject.set(x, "snapshot", js.undefined)
  }
}

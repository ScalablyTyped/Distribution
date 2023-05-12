package typings.awsSdk.clientsRedshiftserverlessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RestoreTableFromSnapshotResponse extends StObject {
  
  /**
    * The TableRestoreStatus object that contains the status of the restore operation.
    */
  var tableRestoreStatus: js.UndefOr[TableRestoreStatus] = js.undefined
}
object RestoreTableFromSnapshotResponse {
  
  inline def apply(): RestoreTableFromSnapshotResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RestoreTableFromSnapshotResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RestoreTableFromSnapshotResponse] (val x: Self) extends AnyVal {
    
    inline def setTableRestoreStatus(value: TableRestoreStatus): Self = StObject.set(x, "tableRestoreStatus", value.asInstanceOf[js.Any])
    
    inline def setTableRestoreStatusUndefined: Self = StObject.set(x, "tableRestoreStatus", js.undefined)
  }
}

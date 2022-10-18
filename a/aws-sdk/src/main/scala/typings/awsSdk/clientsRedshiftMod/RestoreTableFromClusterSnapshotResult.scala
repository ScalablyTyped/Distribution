package typings.awsSdk.clientsRedshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RestoreTableFromClusterSnapshotResult extends StObject {
  
  var TableRestoreStatus: js.UndefOr[typings.awsSdk.clientsRedshiftMod.TableRestoreStatus] = js.undefined
}
object RestoreTableFromClusterSnapshotResult {
  
  inline def apply(): RestoreTableFromClusterSnapshotResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RestoreTableFromClusterSnapshotResult]
  }
  
  extension [Self <: RestoreTableFromClusterSnapshotResult](x: Self) {
    
    inline def setTableRestoreStatus(value: TableRestoreStatus): Self = StObject.set(x, "TableRestoreStatus", value.asInstanceOf[js.Any])
    
    inline def setTableRestoreStatusUndefined: Self = StObject.set(x, "TableRestoreStatus", js.undefined)
  }
}

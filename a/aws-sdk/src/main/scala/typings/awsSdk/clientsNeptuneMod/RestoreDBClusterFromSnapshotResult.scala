package typings.awsSdk.clientsNeptuneMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RestoreDBClusterFromSnapshotResult extends StObject {
  
  var DBCluster: js.UndefOr[typings.awsSdk.clientsNeptuneMod.DBCluster] = js.undefined
}
object RestoreDBClusterFromSnapshotResult {
  
  inline def apply(): RestoreDBClusterFromSnapshotResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RestoreDBClusterFromSnapshotResult]
  }
  
  extension [Self <: RestoreDBClusterFromSnapshotResult](x: Self) {
    
    inline def setDBCluster(value: DBCluster): Self = StObject.set(x, "DBCluster", value.asInstanceOf[js.Any])
    
    inline def setDBClusterUndefined: Self = StObject.set(x, "DBCluster", js.undefined)
  }
}

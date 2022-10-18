package typings.awsSdk.clientsRdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDBClusterSnapshotResult extends StObject {
  
  var DBClusterSnapshot: js.UndefOr[typings.awsSdk.clientsRdsMod.DBClusterSnapshot] = js.undefined
}
object CreateDBClusterSnapshotResult {
  
  inline def apply(): CreateDBClusterSnapshotResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDBClusterSnapshotResult]
  }
  
  extension [Self <: CreateDBClusterSnapshotResult](x: Self) {
    
    inline def setDBClusterSnapshot(value: DBClusterSnapshot): Self = StObject.set(x, "DBClusterSnapshot", value.asInstanceOf[js.Any])
    
    inline def setDBClusterSnapshotUndefined: Self = StObject.set(x, "DBClusterSnapshot", js.undefined)
  }
}

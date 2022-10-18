package typings.awsSdk.clientsDocdbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteDBClusterSnapshotResult extends StObject {
  
  var DBClusterSnapshot: js.UndefOr[typings.awsSdk.clientsDocdbMod.DBClusterSnapshot] = js.undefined
}
object DeleteDBClusterSnapshotResult {
  
  inline def apply(): DeleteDBClusterSnapshotResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteDBClusterSnapshotResult]
  }
  
  extension [Self <: DeleteDBClusterSnapshotResult](x: Self) {
    
    inline def setDBClusterSnapshot(value: DBClusterSnapshot): Self = StObject.set(x, "DBClusterSnapshot", value.asInstanceOf[js.Any])
    
    inline def setDBClusterSnapshotUndefined: Self = StObject.set(x, "DBClusterSnapshot", js.undefined)
  }
}

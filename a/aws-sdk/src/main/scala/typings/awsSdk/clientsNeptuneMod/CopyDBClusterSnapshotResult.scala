package typings.awsSdk.clientsNeptuneMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CopyDBClusterSnapshotResult extends StObject {
  
  var DBClusterSnapshot: js.UndefOr[typings.awsSdk.clientsNeptuneMod.DBClusterSnapshot] = js.undefined
}
object CopyDBClusterSnapshotResult {
  
  inline def apply(): CopyDBClusterSnapshotResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CopyDBClusterSnapshotResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CopyDBClusterSnapshotResult] (val x: Self) extends AnyVal {
    
    inline def setDBClusterSnapshot(value: DBClusterSnapshot): Self = StObject.set(x, "DBClusterSnapshot", value.asInstanceOf[js.Any])
    
    inline def setDBClusterSnapshotUndefined: Self = StObject.set(x, "DBClusterSnapshot", js.undefined)
  }
}

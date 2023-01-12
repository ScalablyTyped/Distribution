package typings.awsSdk.clientsRdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteDBSnapshotResult extends StObject {
  
  var DBSnapshot: js.UndefOr[typings.awsSdk.clientsRdsMod.DBSnapshot] = js.undefined
}
object DeleteDBSnapshotResult {
  
  inline def apply(): DeleteDBSnapshotResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteDBSnapshotResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteDBSnapshotResult] (val x: Self) extends AnyVal {
    
    inline def setDBSnapshot(value: DBSnapshot): Self = StObject.set(x, "DBSnapshot", value.asInstanceOf[js.Any])
    
    inline def setDBSnapshotUndefined: Self = StObject.set(x, "DBSnapshot", js.undefined)
  }
}

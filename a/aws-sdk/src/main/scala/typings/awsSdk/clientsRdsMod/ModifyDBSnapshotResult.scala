package typings.awsSdk.clientsRdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyDBSnapshotResult extends StObject {
  
  var DBSnapshot: js.UndefOr[typings.awsSdk.clientsRdsMod.DBSnapshot] = js.undefined
}
object ModifyDBSnapshotResult {
  
  inline def apply(): ModifyDBSnapshotResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyDBSnapshotResult]
  }
  
  extension [Self <: ModifyDBSnapshotResult](x: Self) {
    
    inline def setDBSnapshot(value: DBSnapshot): Self = StObject.set(x, "DBSnapshot", value.asInstanceOf[js.Any])
    
    inline def setDBSnapshotUndefined: Self = StObject.set(x, "DBSnapshot", js.undefined)
  }
}

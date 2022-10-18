package typings.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRelationalDatabaseSnapshotResult extends StObject {
  
  /**
    * An object describing the specified database snapshot.
    */
  var relationalDatabaseSnapshot: js.UndefOr[RelationalDatabaseSnapshot] = js.undefined
}
object GetRelationalDatabaseSnapshotResult {
  
  inline def apply(): GetRelationalDatabaseSnapshotResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRelationalDatabaseSnapshotResult]
  }
  
  extension [Self <: GetRelationalDatabaseSnapshotResult](x: Self) {
    
    inline def setRelationalDatabaseSnapshot(value: RelationalDatabaseSnapshot): Self = StObject.set(x, "relationalDatabaseSnapshot", value.asInstanceOf[js.Any])
    
    inline def setRelationalDatabaseSnapshotUndefined: Self = StObject.set(x, "relationalDatabaseSnapshot", js.undefined)
  }
}

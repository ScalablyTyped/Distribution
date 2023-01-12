package typings.awsSdk.clientsDocdbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyDBClusterSnapshotAttributeResult extends StObject {
  
  var DBClusterSnapshotAttributesResult: js.UndefOr[typings.awsSdk.clientsDocdbMod.DBClusterSnapshotAttributesResult] = js.undefined
}
object ModifyDBClusterSnapshotAttributeResult {
  
  inline def apply(): ModifyDBClusterSnapshotAttributeResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyDBClusterSnapshotAttributeResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ModifyDBClusterSnapshotAttributeResult] (val x: Self) extends AnyVal {
    
    inline def setDBClusterSnapshotAttributesResult(value: DBClusterSnapshotAttributesResult): Self = StObject.set(x, "DBClusterSnapshotAttributesResult", value.asInstanceOf[js.Any])
    
    inline def setDBClusterSnapshotAttributesResultUndefined: Self = StObject.set(x, "DBClusterSnapshotAttributesResult", js.undefined)
  }
}

package typings.awsSdk.clientsRdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyDBSnapshotAttributeResult extends StObject {
  
  var DBSnapshotAttributesResult: js.UndefOr[typings.awsSdk.clientsRdsMod.DBSnapshotAttributesResult] = js.undefined
}
object ModifyDBSnapshotAttributeResult {
  
  inline def apply(): ModifyDBSnapshotAttributeResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModifyDBSnapshotAttributeResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ModifyDBSnapshotAttributeResult] (val x: Self) extends AnyVal {
    
    inline def setDBSnapshotAttributesResult(value: DBSnapshotAttributesResult): Self = StObject.set(x, "DBSnapshotAttributesResult", value.asInstanceOf[js.Any])
    
    inline def setDBSnapshotAttributesResultUndefined: Self = StObject.set(x, "DBSnapshotAttributesResult", js.undefined)
  }
}

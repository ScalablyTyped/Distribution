package typings.awsSdk.clientsRdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDBSnapshotAttributesResult extends StObject {
  
  var DBSnapshotAttributesResult: js.UndefOr[typings.awsSdk.clientsRdsMod.DBSnapshotAttributesResult] = js.undefined
}
object DescribeDBSnapshotAttributesResult {
  
  inline def apply(): DescribeDBSnapshotAttributesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDBSnapshotAttributesResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeDBSnapshotAttributesResult] (val x: Self) extends AnyVal {
    
    inline def setDBSnapshotAttributesResult(value: DBSnapshotAttributesResult): Self = StObject.set(x, "DBSnapshotAttributesResult", value.asInstanceOf[js.Any])
    
    inline def setDBSnapshotAttributesResultUndefined: Self = StObject.set(x, "DBSnapshotAttributesResult", js.undefined)
  }
}

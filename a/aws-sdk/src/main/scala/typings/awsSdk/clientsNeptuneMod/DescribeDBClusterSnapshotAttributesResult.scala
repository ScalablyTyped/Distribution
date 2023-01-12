package typings.awsSdk.clientsNeptuneMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDBClusterSnapshotAttributesResult extends StObject {
  
  var DBClusterSnapshotAttributesResult: js.UndefOr[typings.awsSdk.clientsNeptuneMod.DBClusterSnapshotAttributesResult] = js.undefined
}
object DescribeDBClusterSnapshotAttributesResult {
  
  inline def apply(): DescribeDBClusterSnapshotAttributesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDBClusterSnapshotAttributesResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeDBClusterSnapshotAttributesResult] (val x: Self) extends AnyVal {
    
    inline def setDBClusterSnapshotAttributesResult(value: DBClusterSnapshotAttributesResult): Self = StObject.set(x, "DBClusterSnapshotAttributesResult", value.asInstanceOf[js.Any])
    
    inline def setDBClusterSnapshotAttributesResultUndefined: Self = StObject.set(x, "DBClusterSnapshotAttributesResult", js.undefined)
  }
}

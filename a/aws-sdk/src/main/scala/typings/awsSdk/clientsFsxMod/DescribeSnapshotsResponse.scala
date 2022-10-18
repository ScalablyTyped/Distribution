package typings.awsSdk.clientsFsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeSnapshotsResponse extends StObject {
  
  var NextToken: js.UndefOr[typings.awsSdk.clientsFsxMod.NextToken] = js.undefined
  
  /**
    * An array of snapshots.
    */
  var Snapshots: js.UndefOr[typings.awsSdk.clientsFsxMod.Snapshots] = js.undefined
}
object DescribeSnapshotsResponse {
  
  inline def apply(): DescribeSnapshotsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSnapshotsResponse]
  }
  
  extension [Self <: DescribeSnapshotsResponse](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setSnapshots(value: Snapshots): Self = StObject.set(x, "Snapshots", value.asInstanceOf[js.Any])
    
    inline def setSnapshotsUndefined: Self = StObject.set(x, "Snapshots", js.undefined)
    
    inline def setSnapshotsVarargs(value: Snapshot*): Self = StObject.set(x, "Snapshots", js.Array(value*))
  }
}

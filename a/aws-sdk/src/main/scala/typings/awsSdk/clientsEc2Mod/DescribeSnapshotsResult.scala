package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeSnapshotsResult extends StObject {
  
  /**
    * The token to include in another request to return the next page of snapshots. This value is null when there are no more snapshots to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * Information about the snapshots.
    */
  var Snapshots: js.UndefOr[SnapshotList] = js.undefined
}
object DescribeSnapshotsResult {
  
  inline def apply(): DescribeSnapshotsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSnapshotsResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeSnapshotsResult] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setSnapshots(value: SnapshotList): Self = StObject.set(x, "Snapshots", value.asInstanceOf[js.Any])
    
    inline def setSnapshotsUndefined: Self = StObject.set(x, "Snapshots", js.undefined)
    
    inline def setSnapshotsVarargs(value: Snapshot*): Self = StObject.set(x, "Snapshots", js.Array(value*))
  }
}

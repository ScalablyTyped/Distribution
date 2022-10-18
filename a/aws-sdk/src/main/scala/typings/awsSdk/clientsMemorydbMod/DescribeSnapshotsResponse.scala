package typings.awsSdk.clientsMemorydbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeSnapshotsResponse extends StObject {
  
  /**
    * An optional argument to pass in case the total number of records exceeds the value of MaxResults. If nextToken is returned, there are more results available. The value of nextToken is a unique pagination token for each page. Make the call again using the returned token to retrieve the next page. Keep all other arguments unchanged. 
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * A list of snapshots. Each item in the list contains detailed information about one snapshot.
    */
  var Snapshots: js.UndefOr[SnapshotList] = js.undefined
}
object DescribeSnapshotsResponse {
  
  inline def apply(): DescribeSnapshotsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSnapshotsResponse]
  }
  
  extension [Self <: DescribeSnapshotsResponse](x: Self) {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setSnapshots(value: SnapshotList): Self = StObject.set(x, "Snapshots", value.asInstanceOf[js.Any])
    
    inline def setSnapshotsUndefined: Self = StObject.set(x, "Snapshots", js.undefined)
    
    inline def setSnapshotsVarargs(value: Snapshot*): Self = StObject.set(x, "Snapshots", js.Array(value*))
  }
}

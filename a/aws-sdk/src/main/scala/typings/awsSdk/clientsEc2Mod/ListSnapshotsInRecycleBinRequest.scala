package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSnapshotsInRecycleBinRequest extends StObject {
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The maximum number of results to return with a single call. To retrieve the remaining results, make another call with the returned nextToken value.
    */
  var MaxResults: js.UndefOr[ListSnapshotsInRecycleBinMaxResults] = js.undefined
  
  /**
    * The token for the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * The IDs of the snapshots to list. Omit this parameter to list all of the snapshots that are in the Recycle Bin.
    */
  var SnapshotIds: js.UndefOr[SnapshotIdStringList] = js.undefined
}
object ListSnapshotsInRecycleBinRequest {
  
  inline def apply(): ListSnapshotsInRecycleBinRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSnapshotsInRecycleBinRequest]
  }
  
  extension [Self <: ListSnapshotsInRecycleBinRequest](x: Self) {
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setMaxResults(value: ListSnapshotsInRecycleBinMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setSnapshotIds(value: SnapshotIdStringList): Self = StObject.set(x, "SnapshotIds", value.asInstanceOf[js.Any])
    
    inline def setSnapshotIdsUndefined: Self = StObject.set(x, "SnapshotIds", js.undefined)
    
    inline def setSnapshotIdsVarargs(value: SnapshotId*): Self = StObject.set(x, "SnapshotIds", js.Array(value*))
  }
}

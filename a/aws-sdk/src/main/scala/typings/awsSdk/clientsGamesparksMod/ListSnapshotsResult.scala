package typings.awsSdk.clientsGamesparksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSnapshotsResult extends StObject {
  
  /**
    * The token that indicates the start of the next sequential page of results.  Use this value when making the next call to this operation to continue where the last one finished. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsGamesparksMod.NextToken] = js.undefined
  
  /**
    *  A list of snapshot summaries. You can use the returned snapshot IDs in the UpdateSnapshot and GetSnapshot operations. 
    */
  var Snapshots: js.UndefOr[SnapshotSummaryList] = js.undefined
}
object ListSnapshotsResult {
  
  inline def apply(): ListSnapshotsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSnapshotsResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListSnapshotsResult] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setSnapshots(value: SnapshotSummaryList): Self = StObject.set(x, "Snapshots", value.asInstanceOf[js.Any])
    
    inline def setSnapshotsUndefined: Self = StObject.set(x, "Snapshots", js.undefined)
    
    inline def setSnapshotsVarargs(value: SnapshotSummary*): Self = StObject.set(x, "Snapshots", js.Array(value*))
  }
}

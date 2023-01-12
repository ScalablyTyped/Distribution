package typings.awsSdk.clientsDrsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeRecoverySnapshotsRequest extends StObject {
  
  /**
    * A set of filters by which to return Recovery Snapshots.
    */
  var filters: js.UndefOr[DescribeRecoverySnapshotsRequestFilters] = js.undefined
  
  /**
    * Maximum number of Recovery Snapshots to retrieve.
    */
  var maxResults: js.UndefOr[StrictlyPositiveInteger] = js.undefined
  
  /**
    * The token of the next Recovery Snapshot to retrieve.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * The sorted ordering by which to return Recovery Snapshots.
    */
  var order: js.UndefOr[RecoverySnapshotsOrder] = js.undefined
  
  /**
    * Filter Recovery Snapshots by Source Server ID.
    */
  var sourceServerID: SourceServerID
}
object DescribeRecoverySnapshotsRequest {
  
  inline def apply(sourceServerID: SourceServerID): DescribeRecoverySnapshotsRequest = {
    val __obj = js.Dynamic.literal(sourceServerID = sourceServerID.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeRecoverySnapshotsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeRecoverySnapshotsRequest] (val x: Self) extends AnyVal {
    
    inline def setFilters(value: DescribeRecoverySnapshotsRequestFilters): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
    
    inline def setMaxResults(value: StrictlyPositiveInteger): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setOrder(value: RecoverySnapshotsOrder): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    
    inline def setSourceServerID(value: SourceServerID): Self = StObject.set(x, "sourceServerID", value.asInstanceOf[js.Any])
  }
}

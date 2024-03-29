package typings.awsSdk.clientsFsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeSnapshotsRequest extends StObject {
  
  /**
    * The filters structure. The supported names are file-system-id or volume-id.
    */
  var Filters: js.UndefOr[SnapshotFilters] = js.undefined
  
  var MaxResults: js.UndefOr[typings.awsSdk.clientsFsxMod.MaxResults] = js.undefined
  
  var NextToken: js.UndefOr[typings.awsSdk.clientsFsxMod.NextToken] = js.undefined
  
  /**
    * The IDs of the snapshots that you want to retrieve. This parameter value overrides any filters. If any IDs aren't found, a SnapshotNotFound error occurs.
    */
  var SnapshotIds: js.UndefOr[typings.awsSdk.clientsFsxMod.SnapshotIds] = js.undefined
}
object DescribeSnapshotsRequest {
  
  inline def apply(): DescribeSnapshotsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSnapshotsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeSnapshotsRequest] (val x: Self) extends AnyVal {
    
    inline def setFilters(value: SnapshotFilters): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    inline def setFiltersVarargs(value: SnapshotFilter*): Self = StObject.set(x, "Filters", js.Array(value*))
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setSnapshotIds(value: SnapshotIds): Self = StObject.set(x, "SnapshotIds", value.asInstanceOf[js.Any])
    
    inline def setSnapshotIdsUndefined: Self = StObject.set(x, "SnapshotIds", js.undefined)
    
    inline def setSnapshotIdsVarargs(value: SnapshotId*): Self = StObject.set(x, "SnapshotIds", js.Array(value*))
  }
}

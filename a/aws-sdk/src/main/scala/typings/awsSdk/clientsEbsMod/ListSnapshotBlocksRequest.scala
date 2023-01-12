package typings.awsSdk.clientsEbsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSnapshotBlocksRequest extends StObject {
  
  /**
    * The maximum number of blocks to be returned by the request. Even if additional blocks can be retrieved from the snapshot, the request can return less blocks than MaxResults or an empty array of blocks. To retrieve the next set of blocks from the snapshot, make another request with the returned NextToken value. The value of NextToken is null when there are no more blocks to return.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsEbsMod.MaxResults] = js.undefined
  
  /**
    * The token to request the next page of results. If you specify NextToken, then StartingBlockIndex is ignored.
    */
  var NextToken: js.UndefOr[PageToken] = js.undefined
  
  /**
    * The ID of the snapshot from which to get block indexes and block tokens.
    */
  var SnapshotId: typings.awsSdk.clientsEbsMod.SnapshotId
  
  /**
    * The block index from which the list should start. The list in the response will start from this block index or the next valid block index in the snapshot. If you specify NextToken, then StartingBlockIndex is ignored.
    */
  var StartingBlockIndex: js.UndefOr[BlockIndex] = js.undefined
}
object ListSnapshotBlocksRequest {
  
  inline def apply(SnapshotId: SnapshotId): ListSnapshotBlocksRequest = {
    val __obj = js.Dynamic.literal(SnapshotId = SnapshotId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListSnapshotBlocksRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListSnapshotBlocksRequest] (val x: Self) extends AnyVal {
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: PageToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setSnapshotId(value: SnapshotId): Self = StObject.set(x, "SnapshotId", value.asInstanceOf[js.Any])
    
    inline def setStartingBlockIndex(value: BlockIndex): Self = StObject.set(x, "StartingBlockIndex", value.asInstanceOf[js.Any])
    
    inline def setStartingBlockIndexUndefined: Self = StObject.set(x, "StartingBlockIndex", js.undefined)
  }
}

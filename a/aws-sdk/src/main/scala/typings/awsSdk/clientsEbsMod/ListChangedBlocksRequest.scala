package typings.awsSdk.clientsEbsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListChangedBlocksRequest extends StObject {
  
  /**
    * The ID of the first snapshot to use for the comparison.  The FirstSnapshotID parameter must be specified with a SecondSnapshotId parameter; otherwise, an error occurs. 
    */
  var FirstSnapshotId: js.UndefOr[SnapshotId] = js.undefined
  
  /**
    * The maximum number of blocks to be returned by the request. Even if additional blocks can be retrieved from the snapshot, the request can return less blocks than MaxResults or an empty array of blocks. To retrieve the next set of blocks from the snapshot, make another request with the returned NextToken value. The value of NextToken is null when there are no more blocks to return.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsEbsMod.MaxResults] = js.undefined
  
  /**
    * The token to request the next page of results. If you specify NextToken, then StartingBlockIndex is ignored.
    */
  var NextToken: js.UndefOr[PageToken] = js.undefined
  
  /**
    * The ID of the second snapshot to use for the comparison.  The SecondSnapshotId parameter must be specified with a FirstSnapshotID parameter; otherwise, an error occurs. 
    */
  var SecondSnapshotId: SnapshotId
  
  /**
    * The block index from which the comparison should start. The list in the response will start from this block index or the next valid block index in the snapshots. If you specify NextToken, then StartingBlockIndex is ignored.
    */
  var StartingBlockIndex: js.UndefOr[BlockIndex] = js.undefined
}
object ListChangedBlocksRequest {
  
  inline def apply(SecondSnapshotId: SnapshotId): ListChangedBlocksRequest = {
    val __obj = js.Dynamic.literal(SecondSnapshotId = SecondSnapshotId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListChangedBlocksRequest]
  }
  
  extension [Self <: ListChangedBlocksRequest](x: Self) {
    
    inline def setFirstSnapshotId(value: SnapshotId): Self = StObject.set(x, "FirstSnapshotId", value.asInstanceOf[js.Any])
    
    inline def setFirstSnapshotIdUndefined: Self = StObject.set(x, "FirstSnapshotId", js.undefined)
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: PageToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setSecondSnapshotId(value: SnapshotId): Self = StObject.set(x, "SecondSnapshotId", value.asInstanceOf[js.Any])
    
    inline def setStartingBlockIndex(value: BlockIndex): Self = StObject.set(x, "StartingBlockIndex", value.asInstanceOf[js.Any])
    
    inline def setStartingBlockIndexUndefined: Self = StObject.set(x, "StartingBlockIndex", js.undefined)
  }
}

package typings.awsSdk.clientsEbsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSnapshotBlocksResponse extends StObject {
  
  /**
    * The size of the blocks in the snapshot, in bytes.
    */
  var BlockSize: js.UndefOr[typings.awsSdk.clientsEbsMod.BlockSize] = js.undefined
  
  /**
    * An array of objects containing information about the blocks.
    */
  var Blocks: js.UndefOr[typings.awsSdk.clientsEbsMod.Blocks] = js.undefined
  
  /**
    * The time when the BlockToken expires.
    */
  var ExpiryTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[PageToken] = js.undefined
  
  /**
    * The size of the volume in GB.
    */
  var VolumeSize: js.UndefOr[typings.awsSdk.clientsEbsMod.VolumeSize] = js.undefined
}
object ListSnapshotBlocksResponse {
  
  inline def apply(): ListSnapshotBlocksResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSnapshotBlocksResponse]
  }
  
  extension [Self <: ListSnapshotBlocksResponse](x: Self) {
    
    inline def setBlockSize(value: BlockSize): Self = StObject.set(x, "BlockSize", value.asInstanceOf[js.Any])
    
    inline def setBlockSizeUndefined: Self = StObject.set(x, "BlockSize", js.undefined)
    
    inline def setBlocks(value: Blocks): Self = StObject.set(x, "Blocks", value.asInstanceOf[js.Any])
    
    inline def setBlocksUndefined: Self = StObject.set(x, "Blocks", js.undefined)
    
    inline def setBlocksVarargs(value: Block*): Self = StObject.set(x, "Blocks", js.Array(value*))
    
    inline def setExpiryTime(value: js.Date): Self = StObject.set(x, "ExpiryTime", value.asInstanceOf[js.Any])
    
    inline def setExpiryTimeUndefined: Self = StObject.set(x, "ExpiryTime", js.undefined)
    
    inline def setNextToken(value: PageToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setVolumeSize(value: VolumeSize): Self = StObject.set(x, "VolumeSize", value.asInstanceOf[js.Any])
    
    inline def setVolumeSizeUndefined: Self = StObject.set(x, "VolumeSize", js.undefined)
  }
}

package typings.awsSdk.clientsEbsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChangedBlock extends StObject {
  
  /**
    * The block index.
    */
  var BlockIndex: js.UndefOr[typings.awsSdk.clientsEbsMod.BlockIndex] = js.undefined
  
  /**
    * The block token for the block index of the FirstSnapshotId specified in the ListChangedBlocks operation. This value is absent if the first snapshot does not have the changed block that is on the second snapshot.
    */
  var FirstBlockToken: js.UndefOr[BlockToken] = js.undefined
  
  /**
    * The block token for the block index of the SecondSnapshotId specified in the ListChangedBlocks operation.
    */
  var SecondBlockToken: js.UndefOr[BlockToken] = js.undefined
}
object ChangedBlock {
  
  inline def apply(): ChangedBlock = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChangedBlock]
  }
  
  extension [Self <: ChangedBlock](x: Self) {
    
    inline def setBlockIndex(value: BlockIndex): Self = StObject.set(x, "BlockIndex", value.asInstanceOf[js.Any])
    
    inline def setBlockIndexUndefined: Self = StObject.set(x, "BlockIndex", js.undefined)
    
    inline def setFirstBlockToken(value: BlockToken): Self = StObject.set(x, "FirstBlockToken", value.asInstanceOf[js.Any])
    
    inline def setFirstBlockTokenUndefined: Self = StObject.set(x, "FirstBlockToken", js.undefined)
    
    inline def setSecondBlockToken(value: BlockToken): Self = StObject.set(x, "SecondBlockToken", value.asInstanceOf[js.Any])
    
    inline def setSecondBlockTokenUndefined: Self = StObject.set(x, "SecondBlockToken", js.undefined)
  }
}

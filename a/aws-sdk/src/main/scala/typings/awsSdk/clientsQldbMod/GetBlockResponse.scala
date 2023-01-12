package typings.awsSdk.clientsQldbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBlockResponse extends StObject {
  
  /**
    * The block data object in Amazon Ion format.
    */
  var Block: ValueHolder
  
  /**
    * The proof object in Amazon Ion format returned by a GetBlock request. A proof contains the list of hash values required to recalculate the specified digest using a Merkle tree, starting with the specified block.
    */
  var Proof: js.UndefOr[ValueHolder] = js.undefined
}
object GetBlockResponse {
  
  inline def apply(Block: ValueHolder): GetBlockResponse = {
    val __obj = js.Dynamic.literal(Block = Block.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBlockResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetBlockResponse] (val x: Self) extends AnyVal {
    
    inline def setBlock(value: ValueHolder): Self = StObject.set(x, "Block", value.asInstanceOf[js.Any])
    
    inline def setProof(value: ValueHolder): Self = StObject.set(x, "Proof", value.asInstanceOf[js.Any])
    
    inline def setProofUndefined: Self = StObject.set(x, "Proof", js.undefined)
  }
}

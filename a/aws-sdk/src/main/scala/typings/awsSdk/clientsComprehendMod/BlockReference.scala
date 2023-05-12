package typings.awsSdk.clientsComprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BlockReference extends StObject {
  
  /**
    * Offset of the start of the block within its parent block.
    */
  var BeginOffset: js.UndefOr[Integer] = js.undefined
  
  /**
    * Unique identifier for the block.
    */
  var BlockId: js.UndefOr[String] = js.undefined
  
  /**
    * List of child blocks within this block.
    */
  var ChildBlocks: js.UndefOr[ListOfChildBlocks] = js.undefined
  
  /**
    * Offset of the end of the block within its parent block.
    */
  var EndOffset: js.UndefOr[Integer] = js.undefined
}
object BlockReference {
  
  inline def apply(): BlockReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BlockReference]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BlockReference] (val x: Self) extends AnyVal {
    
    inline def setBeginOffset(value: Integer): Self = StObject.set(x, "BeginOffset", value.asInstanceOf[js.Any])
    
    inline def setBeginOffsetUndefined: Self = StObject.set(x, "BeginOffset", js.undefined)
    
    inline def setBlockId(value: String): Self = StObject.set(x, "BlockId", value.asInstanceOf[js.Any])
    
    inline def setBlockIdUndefined: Self = StObject.set(x, "BlockId", js.undefined)
    
    inline def setChildBlocks(value: ListOfChildBlocks): Self = StObject.set(x, "ChildBlocks", value.asInstanceOf[js.Any])
    
    inline def setChildBlocksUndefined: Self = StObject.set(x, "ChildBlocks", js.undefined)
    
    inline def setChildBlocksVarargs(value: ChildBlock*): Self = StObject.set(x, "ChildBlocks", js.Array(value*))
    
    inline def setEndOffset(value: Integer): Self = StObject.set(x, "EndOffset", value.asInstanceOf[js.Any])
    
    inline def setEndOffsetUndefined: Self = StObject.set(x, "EndOffset", js.undefined)
  }
}

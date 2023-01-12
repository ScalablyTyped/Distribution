package typings.awsSdk.clientsEbsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Block extends StObject {
  
  /**
    * The block index.
    */
  var BlockIndex: js.UndefOr[typings.awsSdk.clientsEbsMod.BlockIndex] = js.undefined
  
  /**
    * The block token for the block index.
    */
  var BlockToken: js.UndefOr[typings.awsSdk.clientsEbsMod.BlockToken] = js.undefined
}
object Block {
  
  inline def apply(): Block = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Block]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Block] (val x: Self) extends AnyVal {
    
    inline def setBlockIndex(value: BlockIndex): Self = StObject.set(x, "BlockIndex", value.asInstanceOf[js.Any])
    
    inline def setBlockIndexUndefined: Self = StObject.set(x, "BlockIndex", js.undefined)
    
    inline def setBlockToken(value: BlockToken): Self = StObject.set(x, "BlockToken", value.asInstanceOf[js.Any])
    
    inline def setBlockTokenUndefined: Self = StObject.set(x, "BlockToken", js.undefined)
  }
}

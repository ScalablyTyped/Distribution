package typings.awsSdk.clientsComprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChildBlock extends StObject {
  
  /**
    * Offset of the start of the child block within its parent block.
    */
  var BeginOffset: js.UndefOr[Integer] = js.undefined
  
  /**
    * Unique identifier for the child block.
    */
  var ChildBlockId: js.UndefOr[String] = js.undefined
  
  /**
    * Offset of the end of the child block within its parent block.
    */
  var EndOffset: js.UndefOr[Integer] = js.undefined
}
object ChildBlock {
  
  inline def apply(): ChildBlock = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChildBlock]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChildBlock] (val x: Self) extends AnyVal {
    
    inline def setBeginOffset(value: Integer): Self = StObject.set(x, "BeginOffset", value.asInstanceOf[js.Any])
    
    inline def setBeginOffsetUndefined: Self = StObject.set(x, "BeginOffset", js.undefined)
    
    inline def setChildBlockId(value: String): Self = StObject.set(x, "ChildBlockId", value.asInstanceOf[js.Any])
    
    inline def setChildBlockIdUndefined: Self = StObject.set(x, "ChildBlockId", js.undefined)
    
    inline def setEndOffset(value: Integer): Self = StObject.set(x, "EndOffset", value.asInstanceOf[js.Any])
    
    inline def setEndOffsetUndefined: Self = StObject.set(x, "EndOffset", js.undefined)
  }
}

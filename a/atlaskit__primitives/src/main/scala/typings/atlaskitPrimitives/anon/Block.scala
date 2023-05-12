package typings.atlaskitPrimitives.anon

import typings.atlaskitPrimitives.atlaskitPrimitivesStrings.`inline-block`
import typings.atlaskitPrimitives.atlaskitPrimitivesStrings.`inline-flex`
import typings.atlaskitPrimitives.atlaskitPrimitivesStrings.`inline`
import typings.atlaskitPrimitives.atlaskitPrimitivesStrings.block
import typings.atlaskitPrimitives.atlaskitPrimitivesStrings.flex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Block extends StObject {
  
  val block: typings.atlaskitPrimitives.atlaskitPrimitivesStrings.block
  
  val flex: typings.atlaskitPrimitives.atlaskitPrimitivesStrings.flex
  
  val `inline`: typings.atlaskitPrimitives.atlaskitPrimitivesStrings.`inline`
  
  val inlineBlock: `inline-block`
  
  val inlineFlex: `inline-flex`
}
object Block {
  
  inline def apply(): Block = {
    val __obj = js.Dynamic.literal(block = "block", flex = "flex", inlineBlock = "inline-block", inlineFlex = "inline-flex")
    __obj.updateDynamic("inline")("inline")
    __obj.asInstanceOf[Block]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Block] (val x: Self) extends AnyVal {
    
    inline def setBlock(value: block): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
    
    inline def setFlex(value: flex): Self = StObject.set(x, "flex", value.asInstanceOf[js.Any])
    
    inline def setInline(value: `inline`): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
    
    inline def setInlineBlock(value: `inline-block`): Self = StObject.set(x, "inlineBlock", value.asInstanceOf[js.Any])
    
    inline def setInlineFlex(value: `inline-flex`): Self = StObject.set(x, "inlineFlex", value.asInstanceOf[js.Any])
  }
}

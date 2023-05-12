package typings.atlaskitDsExplorations.anon

import typings.emotionUtils.mod.SerializedStyles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Block extends StObject {
  
  var block: SerializedStyles
  
  var flex: SerializedStyles
  
  var `inline`: SerializedStyles
  
  var inlineBlock: SerializedStyles
  
  var inlineFlex: SerializedStyles
}
object Block {
  
  inline def apply(
    block: SerializedStyles,
    flex: SerializedStyles,
    `inline`: SerializedStyles,
    inlineBlock: SerializedStyles,
    inlineFlex: SerializedStyles
  ): Block = {
    val __obj = js.Dynamic.literal(block = block.asInstanceOf[js.Any], flex = flex.asInstanceOf[js.Any], inlineBlock = inlineBlock.asInstanceOf[js.Any], inlineFlex = inlineFlex.asInstanceOf[js.Any])
    __obj.updateDynamic("inline")(`inline`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Block]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Block] (val x: Self) extends AnyVal {
    
    inline def setBlock(value: SerializedStyles): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
    
    inline def setFlex(value: SerializedStyles): Self = StObject.set(x, "flex", value.asInstanceOf[js.Any])
    
    inline def setInline(value: SerializedStyles): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
    
    inline def setInlineBlock(value: SerializedStyles): Self = StObject.set(x, "inlineBlock", value.asInstanceOf[js.Any])
    
    inline def setInlineFlex(value: SerializedStyles): Self = StObject.set(x, "inlineFlex", value.asInstanceOf[js.Any])
  }
}

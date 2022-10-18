package typings.adobeCssTools.distCjsTypeMod

import typings.adobeCssTools.distCjsTypeMod.CssTypes.keyframes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CssKeyframesAST
  extends StObject
     with CssCommonPositionAST
     with CssAtRuleAST {
  
  var keyframes: js.Array[CssKeyframeAST | CssCommentAST]
  
  var name: String
  
  @JSName("type")
  var type_CssKeyframesAST: keyframes
  
  var vendor: js.UndefOr[String] = js.undefined
}
object CssKeyframesAST {
  
  inline def apply(keyframes: js.Array[CssKeyframeAST | CssCommentAST], name: String, `type`: keyframes): CssKeyframesAST = {
    val __obj = js.Dynamic.literal(keyframes = keyframes.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssKeyframesAST]
  }
  
  extension [Self <: CssKeyframesAST](x: Self) {
    
    inline def setKeyframes(value: js.Array[CssKeyframeAST | CssCommentAST]): Self = StObject.set(x, "keyframes", value.asInstanceOf[js.Any])
    
    inline def setKeyframesVarargs(value: (CssKeyframeAST | CssCommentAST)*): Self = StObject.set(x, "keyframes", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: keyframes): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setVendor(value: String): Self = StObject.set(x, "vendor", value.asInstanceOf[js.Any])
    
    inline def setVendorUndefined: Self = StObject.set(x, "vendor", js.undefined)
  }
}

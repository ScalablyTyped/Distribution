package typings.adobeCssTools.typeMod

import typings.adobeCssTools.typeMod.CssTypes.keyframe
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CssKeyframeAST
  extends StObject
     with CssCommonPositionAST
     with CssAllNodesAST {
  
  var declarations: js.Array[CssDeclarationAST | CssCommentAST]
  
  @JSName("type")
  var type_CssKeyframeAST: keyframe
  
  var values: js.Array[String]
}
object CssKeyframeAST {
  
  inline def apply(
    declarations: js.Array[CssDeclarationAST | CssCommentAST],
    `type`: keyframe,
    values: js.Array[String]
  ): CssKeyframeAST = {
    val __obj = js.Dynamic.literal(declarations = declarations.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssKeyframeAST]
  }
  
  extension [Self <: CssKeyframeAST](x: Self) {
    
    inline def setDeclarations(value: js.Array[CssDeclarationAST | CssCommentAST]): Self = StObject.set(x, "declarations", value.asInstanceOf[js.Any])
    
    inline def setDeclarationsVarargs(value: (CssDeclarationAST | CssCommentAST)*): Self = StObject.set(x, "declarations", js.Array(value*))
    
    inline def setType(value: keyframe): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value*))
  }
}

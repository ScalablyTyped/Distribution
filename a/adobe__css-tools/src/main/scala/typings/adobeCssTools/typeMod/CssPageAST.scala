package typings.adobeCssTools.typeMod

import typings.adobeCssTools.typeMod.CssTypes.page
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CssPageAST
  extends StObject
     with CssCommonPositionAST
     with CssAtRuleAST {
  
  var declarations: js.Array[CssDeclarationAST | CssCommentAST]
  
  var selectors: js.Array[String]
  
  @JSName("type")
  var type_CssPageAST: page
}
object CssPageAST {
  
  inline def apply(
    declarations: js.Array[CssDeclarationAST | CssCommentAST],
    selectors: js.Array[String],
    `type`: page
  ): CssPageAST = {
    val __obj = js.Dynamic.literal(declarations = declarations.asInstanceOf[js.Any], selectors = selectors.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssPageAST]
  }
  
  extension [Self <: CssPageAST](x: Self) {
    
    inline def setDeclarations(value: js.Array[CssDeclarationAST | CssCommentAST]): Self = StObject.set(x, "declarations", value.asInstanceOf[js.Any])
    
    inline def setDeclarationsVarargs(value: (CssDeclarationAST | CssCommentAST)*): Self = StObject.set(x, "declarations", js.Array(value*))
    
    inline def setSelectors(value: js.Array[String]): Self = StObject.set(x, "selectors", value.asInstanceOf[js.Any])
    
    inline def setSelectorsVarargs(value: String*): Self = StObject.set(x, "selectors", js.Array(value*))
    
    inline def setType(value: page): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

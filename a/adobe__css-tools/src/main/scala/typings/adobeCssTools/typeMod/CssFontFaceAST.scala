package typings.adobeCssTools.typeMod

import typings.adobeCssTools.typeMod.CssTypes.fontFace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CssFontFaceAST
  extends StObject
     with CssCommonPositionAST
     with CssAtRuleAST {
  
  var declarations: js.Array[CssDeclarationAST | CssCommentAST]
  
  @JSName("type")
  var type_CssFontFaceAST: fontFace
}
object CssFontFaceAST {
  
  inline def apply(declarations: js.Array[CssDeclarationAST | CssCommentAST], `type`: fontFace): CssFontFaceAST = {
    val __obj = js.Dynamic.literal(declarations = declarations.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssFontFaceAST]
  }
  
  extension [Self <: CssFontFaceAST](x: Self) {
    
    inline def setDeclarations(value: js.Array[CssDeclarationAST | CssCommentAST]): Self = StObject.set(x, "declarations", value.asInstanceOf[js.Any])
    
    inline def setDeclarationsVarargs(value: (CssDeclarationAST | CssCommentAST)*): Self = StObject.set(x, "declarations", js.Array(value*))
    
    inline def setType(value: fontFace): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

package typings.adobeCssTools.typeMod

import typings.adobeCssTools.typeMod.CssTypes.comment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CssCommentAST
  extends StObject
     with CssCommonPositionAST
     with CssAtRuleAST {
  
  var comment: String
  
  @JSName("type")
  var type_CssCommentAST: comment
}
object CssCommentAST {
  
  inline def apply(comment: String, `type`: comment): CssCommentAST = {
    val __obj = js.Dynamic.literal(comment = comment.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssCommentAST]
  }
  
  extension [Self <: CssCommentAST](x: Self) {
    
    inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setType(value: comment): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

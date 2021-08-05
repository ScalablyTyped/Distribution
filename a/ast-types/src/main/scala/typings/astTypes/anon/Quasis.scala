package typings.astTypes.anon

import typings.astTypes.kindsMod.CommentKind
import typings.astTypes.kindsMod.ExpressionKind
import typings.astTypes.kindsMod.SourceLocationKind
import typings.astTypes.kindsMod.TemplateElementKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Quasis extends StObject {
  
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  
  var expressions: js.Array[ExpressionKind]
  
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  
  var quasis: js.Array[TemplateElementKind]
}
object Quasis {
  
  inline def apply(expressions: js.Array[ExpressionKind], quasis: js.Array[TemplateElementKind]): Quasis = {
    val __obj = js.Dynamic.literal(expressions = expressions.asInstanceOf[js.Any], quasis = quasis.asInstanceOf[js.Any])
    __obj.asInstanceOf[Quasis]
  }
  
  extension [Self <: Quasis](x: Self) {
    
    inline def setComments(value: js.Array[CommentKind]): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    inline def setCommentsNull: Self = StObject.set(x, "comments", null)
    
    inline def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
    
    inline def setCommentsVarargs(value: CommentKind*): Self = StObject.set(x, "comments", js.Array(value :_*))
    
    inline def setExpressions(value: js.Array[ExpressionKind]): Self = StObject.set(x, "expressions", value.asInstanceOf[js.Any])
    
    inline def setExpressionsVarargs(value: ExpressionKind*): Self = StObject.set(x, "expressions", js.Array(value :_*))
    
    inline def setLoc(value: SourceLocationKind): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
    
    inline def setLocNull: Self = StObject.set(x, "loc", null)
    
    inline def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
    
    inline def setQuasis(value: js.Array[TemplateElementKind]): Self = StObject.set(x, "quasis", value.asInstanceOf[js.Any])
    
    inline def setQuasisVarargs(value: TemplateElementKind*): Self = StObject.set(x, "quasis", js.Array(value :_*))
  }
}

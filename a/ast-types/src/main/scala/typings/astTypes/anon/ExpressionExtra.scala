package typings.astTypes.anon

import typings.astTypes.kindsMod.CommentKind
import typings.astTypes.kindsMod.ExpressionKind
import typings.astTypes.kindsMod.SourceLocationKind
import typings.astTypes.kindsMod.TSTypeKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExpressionExtra extends StObject {
  
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  
  var expression: ExpressionKind
  
  var extra: js.UndefOr[Parenthesized | Null] = js.undefined
  
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  
  var typeAnnotation: TSTypeKind
}
object ExpressionExtra {
  
  inline def apply(expression: ExpressionKind, typeAnnotation: TSTypeKind): ExpressionExtra = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], typeAnnotation = typeAnnotation.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpressionExtra]
  }
  
  extension [Self <: ExpressionExtra](x: Self) {
    
    inline def setComments(value: js.Array[CommentKind]): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    inline def setCommentsNull: Self = StObject.set(x, "comments", null)
    
    inline def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
    
    inline def setCommentsVarargs(value: CommentKind*): Self = StObject.set(x, "comments", js.Array(value :_*))
    
    inline def setExpression(value: ExpressionKind): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setExtra(value: Parenthesized): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
    
    inline def setExtraNull: Self = StObject.set(x, "extra", null)
    
    inline def setExtraUndefined: Self = StObject.set(x, "extra", js.undefined)
    
    inline def setLoc(value: SourceLocationKind): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
    
    inline def setLocNull: Self = StObject.set(x, "loc", null)
    
    inline def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
    
    inline def setTypeAnnotation(value: TSTypeKind): Self = StObject.set(x, "typeAnnotation", value.asInstanceOf[js.Any])
  }
}

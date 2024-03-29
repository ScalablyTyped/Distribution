package typings.astTypes.namedTypesMod.namedTypes

import typings.astTypes.kindsMod.CommentKind
import typings.astTypes.kindsMod.ExpressionKind
import typings.astTypes.kindsMod.NodeKind
import typings.astTypes.kindsMod.PrintableKind
import typings.astTypes.kindsMod.SourceLocationKind
import typings.astTypes.kindsMod.TemplateElementKind
import typings.astTypes.typesMod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/namedTypes.namedTypes.Expression, 'type'> */
trait TemplateLiteral
  extends StObject
     with ASTNode
     with ExpressionKind
     with NodeKind
     with PrintableKind {
  
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  
  var expressions: js.Array[ExpressionKind]
  
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  
  var quasis: js.Array[TemplateElementKind]
  
  var `type`: typings.astTypes.astTypesStrings.TemplateLiteral
}
object TemplateLiteral {
  
  @JSImport("ast-types/gen/namedTypes", "namedTypes.TemplateLiteral")
  @js.native
  val ^ : Type[TemplateLiteral] = js.native
  
  extension [Self <: TemplateLiteral](x: Self) {
    
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
    
    inline def setType(value: typings.astTypes.astTypesStrings.TemplateLiteral): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}

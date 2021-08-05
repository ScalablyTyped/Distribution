package typings.astTypes.namedTypesMod.namedTypes

import typings.astTypes.anon.Parenthesized
import typings.astTypes.kindsMod.CommentKind
import typings.astTypes.kindsMod.ExpressionKind
import typings.astTypes.kindsMod.NodeKind
import typings.astTypes.kindsMod.PatternKind
import typings.astTypes.kindsMod.PrintableKind
import typings.astTypes.kindsMod.SourceLocationKind
import typings.astTypes.kindsMod.TSTypeKind
import typings.astTypes.typesMod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/namedTypes.namedTypes.Expression, 'type'> */
/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/namedTypes.namedTypes.Pattern, 'type'> */
trait TSAsExpression
  extends StObject
     with ASTNode
     with ExpressionKind
     with NodeKind
     with PatternKind
     with PrintableKind {
  
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  
  var expression: ExpressionKind
  
  var extra: js.UndefOr[Parenthesized | Null] = js.undefined
  
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  
  var `type`: typings.astTypes.astTypesStrings.TSAsExpression
  
  var typeAnnotation: TSTypeKind
}
object TSAsExpression {
  
  @JSImport("ast-types/gen/namedTypes", "namedTypes.TSAsExpression")
  @js.native
  val ^ : Type[TSAsExpression] = js.native
  
  extension [Self <: TSAsExpression](x: Self) {
    
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
    
    inline def setType(value: typings.astTypes.astTypesStrings.TSAsExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeAnnotation(value: TSTypeKind): Self = StObject.set(x, "typeAnnotation", value.asInstanceOf[js.Any])
  }
}

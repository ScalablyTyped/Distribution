package typings.astTypes.namedTypesMod.namedTypes

import typings.astTypes.kindsMod.CallExpressionKind
import typings.astTypes.kindsMod.ChainElementKind
import typings.astTypes.kindsMod.CommentKind
import typings.astTypes.kindsMod.ExpressionKind
import typings.astTypes.kindsMod.NodeKind
import typings.astTypes.kindsMod.PrintableKind
import typings.astTypes.kindsMod.SourceLocationKind
import typings.astTypes.kindsMod.SpreadElementKind
import typings.astTypes.kindsMod.TypeParameterInstantiationKind
import typings.astTypes.typesMod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/namedTypes.namedTypes.Expression, 'type'> */
/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/namedTypes.namedTypes.ChainElement, 'type'> */
trait CallExpression
  extends StObject
     with ASTNode
     with CallExpressionKind
     with ChainElementKind
     with ExpressionKind
     with NodeKind
     with PrintableKind {
  
  var arguments: js.Array[ExpressionKind | SpreadElementKind]
  
  var callee: ExpressionKind
  
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  
  var optional: js.UndefOr[Boolean] = js.undefined
  
  var `type`: typings.astTypes.astTypesStrings.CallExpression
  
  var typeArguments: js.UndefOr[Null | TypeParameterInstantiationKind] = js.undefined
}
object CallExpression {
  
  @JSImport("ast-types/gen/namedTypes", "namedTypes.CallExpression")
  @js.native
  val ^ : Type[CallExpression] = js.native
  
  @scala.inline
  implicit class CallExpressionMutableBuilder[Self <: CallExpression] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArguments(value: js.Array[ExpressionKind | SpreadElementKind]): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgumentsVarargs(value: (ExpressionKind | SpreadElementKind)*): Self = StObject.set(x, "arguments", js.Array(value :_*))
    
    @scala.inline
    def setCallee(value: ExpressionKind): Self = StObject.set(x, "callee", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComments(value: js.Array[CommentKind]): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentsNull: Self = StObject.set(x, "comments", null)
    
    @scala.inline
    def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
    
    @scala.inline
    def setCommentsVarargs(value: CommentKind*): Self = StObject.set(x, "comments", js.Array(value :_*))
    
    @scala.inline
    def setLoc(value: SourceLocationKind): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocNull: Self = StObject.set(x, "loc", null)
    
    @scala.inline
    def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
    
    @scala.inline
    def setOptional(value: Boolean): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionalUndefined: Self = StObject.set(x, "optional", js.undefined)
    
    @scala.inline
    def setType(value: typings.astTypes.astTypesStrings.CallExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeArguments(value: TypeParameterInstantiationKind): Self = StObject.set(x, "typeArguments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeArgumentsNull: Self = StObject.set(x, "typeArguments", null)
    
    @scala.inline
    def setTypeArgumentsUndefined: Self = StObject.set(x, "typeArguments", js.undefined)
  }
}

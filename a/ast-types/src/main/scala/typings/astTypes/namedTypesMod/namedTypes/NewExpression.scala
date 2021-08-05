package typings.astTypes.namedTypesMod.namedTypes

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
trait NewExpression
  extends StObject
     with ASTNode
     with ExpressionKind
     with NodeKind
     with PrintableKind {
  
  var arguments: js.Array[ExpressionKind | SpreadElementKind]
  
  var callee: ExpressionKind
  
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  
  var `type`: typings.astTypes.astTypesStrings.NewExpression
  
  var typeArguments: js.UndefOr[Null | TypeParameterInstantiationKind] = js.undefined
}
object NewExpression {
  
  @JSImport("ast-types/gen/namedTypes", "namedTypes.NewExpression")
  @js.native
  val ^ : Type[NewExpression] = js.native
  
  extension [Self <: NewExpression](x: Self) {
    
    inline def setArguments(value: js.Array[ExpressionKind | SpreadElementKind]): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    inline def setArgumentsVarargs(value: (ExpressionKind | SpreadElementKind)*): Self = StObject.set(x, "arguments", js.Array(value :_*))
    
    inline def setCallee(value: ExpressionKind): Self = StObject.set(x, "callee", value.asInstanceOf[js.Any])
    
    inline def setComments(value: js.Array[CommentKind]): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    inline def setCommentsNull: Self = StObject.set(x, "comments", null)
    
    inline def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
    
    inline def setCommentsVarargs(value: CommentKind*): Self = StObject.set(x, "comments", js.Array(value :_*))
    
    inline def setLoc(value: SourceLocationKind): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
    
    inline def setLocNull: Self = StObject.set(x, "loc", null)
    
    inline def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
    
    inline def setType(value: typings.astTypes.astTypesStrings.NewExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeArguments(value: TypeParameterInstantiationKind): Self = StObject.set(x, "typeArguments", value.asInstanceOf[js.Any])
    
    inline def setTypeArgumentsNull: Self = StObject.set(x, "typeArguments", null)
    
    inline def setTypeArgumentsUndefined: Self = StObject.set(x, "typeArguments", js.undefined)
  }
}

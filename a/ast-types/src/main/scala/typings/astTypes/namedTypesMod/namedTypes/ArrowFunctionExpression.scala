package typings.astTypes.namedTypesMod.namedTypes

import typings.astTypes.astTypesBooleans.`false`
import typings.astTypes.kindsMod.BlockStatementKind
import typings.astTypes.kindsMod.CommentKind
import typings.astTypes.kindsMod.ExpressionKind
import typings.astTypes.kindsMod.FlowPredicateKind
import typings.astTypes.kindsMod.FunctionKind
import typings.astTypes.kindsMod.IdentifierKind
import typings.astTypes.kindsMod.NodeKind
import typings.astTypes.kindsMod.PatternKind
import typings.astTypes.kindsMod.PrintableKind
import typings.astTypes.kindsMod.SourceLocationKind
import typings.astTypes.kindsMod.TSTypeAnnotationKind
import typings.astTypes.kindsMod.TSTypeParameterDeclarationKind
import typings.astTypes.kindsMod.TypeAnnotationKind
import typings.astTypes.kindsMod.TypeParameterDeclarationKind
import typings.astTypes.typesMod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/namedTypes.namedTypes.Function, 'type' | 'id' | 'body' | 'generator'> */
/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/namedTypes.namedTypes.Expression, 'type'> */
trait ArrowFunctionExpression
  extends StObject
     with ASTNode
     with ExpressionKind
     with FunctionKind
     with NodeKind
     with PrintableKind {
  
  var async: js.UndefOr[Boolean] = js.undefined
  
  var body: BlockStatementKind | ExpressionKind
  
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  
  var defaults: js.UndefOr[js.Array[ExpressionKind | Null]] = js.undefined
  
  var expression: js.UndefOr[Boolean] = js.undefined
  
  var generator: js.UndefOr[`false`] = js.undefined
  
  var id: js.UndefOr[Null] = js.undefined
  
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  
  var params: js.Array[PatternKind]
  
  var predicate: js.UndefOr[FlowPredicateKind | Null] = js.undefined
  
  var rest: js.UndefOr[IdentifierKind | Null] = js.undefined
  
  var returnType: js.UndefOr[TypeAnnotationKind | TSTypeAnnotationKind | Null] = js.undefined
  
  var `type`: typings.astTypes.astTypesStrings.ArrowFunctionExpression
  
  var typeParameters: js.UndefOr[TypeParameterDeclarationKind | TSTypeParameterDeclarationKind | Null] = js.undefined
}
object ArrowFunctionExpression {
  
  @JSImport("ast-types/gen/namedTypes", "namedTypes.ArrowFunctionExpression")
  @js.native
  val ^ : Type[ArrowFunctionExpression] = js.native
  
  extension [Self <: ArrowFunctionExpression](x: Self) {
    
    inline def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
    
    inline def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
    
    inline def setBody(value: BlockStatementKind | ExpressionKind): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setComments(value: js.Array[CommentKind]): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    inline def setCommentsNull: Self = StObject.set(x, "comments", null)
    
    inline def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
    
    inline def setCommentsVarargs(value: CommentKind*): Self = StObject.set(x, "comments", js.Array(value :_*))
    
    inline def setDefaults(value: js.Array[ExpressionKind | Null]): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
    
    inline def setDefaultsUndefined: Self = StObject.set(x, "defaults", js.undefined)
    
    inline def setDefaultsVarargs(value: (ExpressionKind | Null)*): Self = StObject.set(x, "defaults", js.Array(value :_*))
    
    inline def setExpression(value: Boolean): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setExpressionUndefined: Self = StObject.set(x, "expression", js.undefined)
    
    inline def setGenerator(value: `false`): Self = StObject.set(x, "generator", value.asInstanceOf[js.Any])
    
    inline def setGeneratorUndefined: Self = StObject.set(x, "generator", js.undefined)
    
    inline def setLoc(value: SourceLocationKind): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
    
    inline def setLocNull: Self = StObject.set(x, "loc", null)
    
    inline def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
    
    inline def setParams(value: js.Array[PatternKind]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsVarargs(value: PatternKind*): Self = StObject.set(x, "params", js.Array(value :_*))
    
    inline def setPredicate(value: FlowPredicateKind): Self = StObject.set(x, "predicate", value.asInstanceOf[js.Any])
    
    inline def setPredicateNull: Self = StObject.set(x, "predicate", null)
    
    inline def setPredicateUndefined: Self = StObject.set(x, "predicate", js.undefined)
    
    inline def setRest(value: IdentifierKind): Self = StObject.set(x, "rest", value.asInstanceOf[js.Any])
    
    inline def setRestNull: Self = StObject.set(x, "rest", null)
    
    inline def setRestUndefined: Self = StObject.set(x, "rest", js.undefined)
    
    inline def setReturnType(value: TypeAnnotationKind | TSTypeAnnotationKind): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
    
    inline def setReturnTypeNull: Self = StObject.set(x, "returnType", null)
    
    inline def setReturnTypeUndefined: Self = StObject.set(x, "returnType", js.undefined)
    
    inline def setType(value: typings.astTypes.astTypesStrings.ArrowFunctionExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeParameters(value: TypeParameterDeclarationKind | TSTypeParameterDeclarationKind): Self = StObject.set(x, "typeParameters", value.asInstanceOf[js.Any])
    
    inline def setTypeParametersNull: Self = StObject.set(x, "typeParameters", null)
    
    inline def setTypeParametersUndefined: Self = StObject.set(x, "typeParameters", js.undefined)
  }
}

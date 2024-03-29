package typings.astTypes.anon

import typings.astTypes.astTypesBooleans.`false`
import typings.astTypes.kindsMod.BlockStatementKind
import typings.astTypes.kindsMod.CommentKind
import typings.astTypes.kindsMod.ExpressionKind
import typings.astTypes.kindsMod.FlowPredicateKind
import typings.astTypes.kindsMod.IdentifierKind
import typings.astTypes.kindsMod.PatternKind
import typings.astTypes.kindsMod.SourceLocationKind
import typings.astTypes.kindsMod.TSTypeAnnotationKind
import typings.astTypes.kindsMod.TSTypeParameterDeclarationKind
import typings.astTypes.kindsMod.TypeAnnotationKind
import typings.astTypes.kindsMod.TypeParameterDeclarationKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Generator extends StObject {
  
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
  
  var typeParameters: js.UndefOr[TypeParameterDeclarationKind | TSTypeParameterDeclarationKind | Null] = js.undefined
}
object Generator {
  
  inline def apply(body: BlockStatementKind | ExpressionKind, params: js.Array[PatternKind]): Generator = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.asInstanceOf[Generator]
  }
  
  extension [Self <: Generator](x: Self) {
    
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
    
    inline def setTypeParameters(value: TypeParameterDeclarationKind | TSTypeParameterDeclarationKind): Self = StObject.set(x, "typeParameters", value.asInstanceOf[js.Any])
    
    inline def setTypeParametersNull: Self = StObject.set(x, "typeParameters", null)
    
    inline def setTypeParametersUndefined: Self = StObject.set(x, "typeParameters", js.undefined)
  }
}

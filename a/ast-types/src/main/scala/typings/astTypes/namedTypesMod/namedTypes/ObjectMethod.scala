package typings.astTypes.namedTypesMod.namedTypes

import typings.astTypes.astTypesStrings.get
import typings.astTypes.astTypesStrings.method
import typings.astTypes.astTypesStrings.set
import typings.astTypes.kindsMod.BlockStatementKind
import typings.astTypes.kindsMod.CommentKind
import typings.astTypes.kindsMod.DecoratorKind
import typings.astTypes.kindsMod.ExpressionKind
import typings.astTypes.kindsMod.FlowPredicateKind
import typings.astTypes.kindsMod.FunctionKind
import typings.astTypes.kindsMod.IdentifierKind
import typings.astTypes.kindsMod.LiteralKind
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

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/namedTypes.namedTypes.Node, 'type'> */
/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/namedTypes.namedTypes.Function, 'type' | 'params' | 'body' | 'generator' | 'async'> */
trait ObjectMethod
  extends StObject
     with ASTNode
     with FunctionKind
     with NodeKind
     with PrintableKind {
  
  var accessibility: js.UndefOr[LiteralKind | Null] = js.undefined
  
  var async: js.UndefOr[Boolean] = js.undefined
  
  var body: BlockStatementKind
  
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  
  var computed: js.UndefOr[Boolean] = js.undefined
  
  var decorators: js.UndefOr[js.Array[DecoratorKind] | Null] = js.undefined
  
  var defaults: js.UndefOr[js.Array[ExpressionKind | Null]] = js.undefined
  
  var expression: js.UndefOr[Boolean] = js.undefined
  
  var generator: js.UndefOr[Boolean] = js.undefined
  
  var id: js.UndefOr[IdentifierKind | Null] = js.undefined
  
  var key: LiteralKind | IdentifierKind | ExpressionKind
  
  var kind: method | get | set
  
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  
  var params: js.Array[PatternKind]
  
  var predicate: js.UndefOr[FlowPredicateKind | Null] = js.undefined
  
  var rest: js.UndefOr[IdentifierKind | Null] = js.undefined
  
  var returnType: js.UndefOr[TypeAnnotationKind | TSTypeAnnotationKind | Null] = js.undefined
  
  var `type`: typings.astTypes.astTypesStrings.ObjectMethod
  
  var typeParameters: js.UndefOr[TypeParameterDeclarationKind | TSTypeParameterDeclarationKind | Null] = js.undefined
}
object ObjectMethod {
  
  @JSImport("ast-types/gen/namedTypes", "namedTypes.ObjectMethod")
  @js.native
  val ^ : Type[ObjectMethod] = js.native
  
  @scala.inline
  implicit class ObjectMethodMutableBuilder[Self <: ObjectMethod] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessibility(value: LiteralKind): Self = StObject.set(x, "accessibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityNull: Self = StObject.set(x, "accessibility", null)
    
    @scala.inline
    def setAccessibilityUndefined: Self = StObject.set(x, "accessibility", js.undefined)
    
    @scala.inline
    def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
    
    @scala.inline
    def setBody(value: BlockStatementKind): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComments(value: js.Array[CommentKind]): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentsNull: Self = StObject.set(x, "comments", null)
    
    @scala.inline
    def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
    
    @scala.inline
    def setCommentsVarargs(value: CommentKind*): Self = StObject.set(x, "comments", js.Array(value :_*))
    
    @scala.inline
    def setComputed(value: Boolean): Self = StObject.set(x, "computed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComputedUndefined: Self = StObject.set(x, "computed", js.undefined)
    
    @scala.inline
    def setDecorators(value: js.Array[DecoratorKind]): Self = StObject.set(x, "decorators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecoratorsNull: Self = StObject.set(x, "decorators", null)
    
    @scala.inline
    def setDecoratorsUndefined: Self = StObject.set(x, "decorators", js.undefined)
    
    @scala.inline
    def setDecoratorsVarargs(value: DecoratorKind*): Self = StObject.set(x, "decorators", js.Array(value :_*))
    
    @scala.inline
    def setDefaults(value: js.Array[ExpressionKind | Null]): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultsUndefined: Self = StObject.set(x, "defaults", js.undefined)
    
    @scala.inline
    def setDefaultsVarargs(value: (ExpressionKind | Null)*): Self = StObject.set(x, "defaults", js.Array(value :_*))
    
    @scala.inline
    def setExpression(value: Boolean): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpressionUndefined: Self = StObject.set(x, "expression", js.undefined)
    
    @scala.inline
    def setGenerator(value: Boolean): Self = StObject.set(x, "generator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeneratorUndefined: Self = StObject.set(x, "generator", js.undefined)
    
    @scala.inline
    def setId(value: IdentifierKind): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdNull: Self = StObject.set(x, "id", null)
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setKey(value: LiteralKind | IdentifierKind | ExpressionKind): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: method | get | set): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoc(value: SourceLocationKind): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocNull: Self = StObject.set(x, "loc", null)
    
    @scala.inline
    def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
    
    @scala.inline
    def setParams(value: js.Array[PatternKind]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsVarargs(value: PatternKind*): Self = StObject.set(x, "params", js.Array(value :_*))
    
    @scala.inline
    def setPredicate(value: FlowPredicateKind): Self = StObject.set(x, "predicate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPredicateNull: Self = StObject.set(x, "predicate", null)
    
    @scala.inline
    def setPredicateUndefined: Self = StObject.set(x, "predicate", js.undefined)
    
    @scala.inline
    def setRest(value: IdentifierKind): Self = StObject.set(x, "rest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestNull: Self = StObject.set(x, "rest", null)
    
    @scala.inline
    def setRestUndefined: Self = StObject.set(x, "rest", js.undefined)
    
    @scala.inline
    def setReturnType(value: TypeAnnotationKind | TSTypeAnnotationKind): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnTypeNull: Self = StObject.set(x, "returnType", null)
    
    @scala.inline
    def setReturnTypeUndefined: Self = StObject.set(x, "returnType", js.undefined)
    
    @scala.inline
    def setType(value: typings.astTypes.astTypesStrings.ObjectMethod): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeParameters(value: TypeParameterDeclarationKind | TSTypeParameterDeclarationKind): Self = StObject.set(x, "typeParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeParametersNull: Self = StObject.set(x, "typeParameters", null)
    
    @scala.inline
    def setTypeParametersUndefined: Self = StObject.set(x, "typeParameters", js.undefined)
  }
}

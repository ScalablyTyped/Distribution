package typings.astTypes.anon

import typings.astTypes.astTypesStrings.`private`
import typings.astTypes.astTypesStrings.`protected`
import typings.astTypes.astTypesStrings.constructor
import typings.astTypes.astTypesStrings.get
import typings.astTypes.astTypesStrings.method
import typings.astTypes.astTypesStrings.public
import typings.astTypes.astTypesStrings.set
import typings.astTypes.kindsMod.CommentKind
import typings.astTypes.kindsMod.DecoratorKind
import typings.astTypes.kindsMod.ExpressionKind
import typings.astTypes.kindsMod.IdentifierKind
import typings.astTypes.kindsMod.NoopKind
import typings.astTypes.kindsMod.NumericLiteralKind
import typings.astTypes.kindsMod.PatternKind
import typings.astTypes.kindsMod.SourceLocationKind
import typings.astTypes.kindsMod.StringLiteralKind
import typings.astTypes.kindsMod.TSTypeAnnotationKind
import typings.astTypes.kindsMod.TSTypeParameterDeclarationKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccessAccessibility extends StObject {
  
  var `abstract`: js.UndefOr[Boolean] = js.undefined
  
  var access: js.UndefOr[public | `private` | `protected`] = js.undefined
  
  var accessibility: js.UndefOr[public | `private` | `protected`] = js.undefined
  
  var async: js.UndefOr[Boolean] = js.undefined
  
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  
  var computed: js.UndefOr[Boolean] = js.undefined
  
  var decorators: js.UndefOr[js.Array[DecoratorKind] | Null] = js.undefined
  
  var generator: js.UndefOr[Boolean] = js.undefined
  
  var key: IdentifierKind | StringLiteralKind | NumericLiteralKind | ExpressionKind
  
  var kind: js.UndefOr[get | set | method | constructor] = js.undefined
  
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  
  var optional: js.UndefOr[Boolean] = js.undefined
  
  var params: js.Array[PatternKind]
  
  var returnType: js.UndefOr[TSTypeAnnotationKind | NoopKind | Null] = js.undefined
  
  var static: js.UndefOr[Boolean] = js.undefined
  
  var typeParameters: js.UndefOr[TSTypeParameterDeclarationKind | Null] = js.undefined
}
object AccessAccessibility {
  
  inline def apply(
    key: IdentifierKind | StringLiteralKind | NumericLiteralKind | ExpressionKind,
    params: js.Array[PatternKind]
  ): AccessAccessibility = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessAccessibility]
  }
  
  extension [Self <: AccessAccessibility](x: Self) {
    
    inline def setAbstract(value: Boolean): Self = StObject.set(x, "abstract", value.asInstanceOf[js.Any])
    
    inline def setAbstractUndefined: Self = StObject.set(x, "abstract", js.undefined)
    
    inline def setAccess(value: public | `private` | `protected`): Self = StObject.set(x, "access", value.asInstanceOf[js.Any])
    
    inline def setAccessUndefined: Self = StObject.set(x, "access", js.undefined)
    
    inline def setAccessibility(value: public | `private` | `protected`): Self = StObject.set(x, "accessibility", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityUndefined: Self = StObject.set(x, "accessibility", js.undefined)
    
    inline def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
    
    inline def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
    
    inline def setComments(value: js.Array[CommentKind]): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    inline def setCommentsNull: Self = StObject.set(x, "comments", null)
    
    inline def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
    
    inline def setCommentsVarargs(value: CommentKind*): Self = StObject.set(x, "comments", js.Array(value :_*))
    
    inline def setComputed(value: Boolean): Self = StObject.set(x, "computed", value.asInstanceOf[js.Any])
    
    inline def setComputedUndefined: Self = StObject.set(x, "computed", js.undefined)
    
    inline def setDecorators(value: js.Array[DecoratorKind]): Self = StObject.set(x, "decorators", value.asInstanceOf[js.Any])
    
    inline def setDecoratorsNull: Self = StObject.set(x, "decorators", null)
    
    inline def setDecoratorsUndefined: Self = StObject.set(x, "decorators", js.undefined)
    
    inline def setDecoratorsVarargs(value: DecoratorKind*): Self = StObject.set(x, "decorators", js.Array(value :_*))
    
    inline def setGenerator(value: Boolean): Self = StObject.set(x, "generator", value.asInstanceOf[js.Any])
    
    inline def setGeneratorUndefined: Self = StObject.set(x, "generator", js.undefined)
    
    inline def setKey(value: IdentifierKind | StringLiteralKind | NumericLiteralKind | ExpressionKind): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKind(value: get | set | method | constructor): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setLoc(value: SourceLocationKind): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
    
    inline def setLocNull: Self = StObject.set(x, "loc", null)
    
    inline def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
    
    inline def setOptional(value: Boolean): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
    
    inline def setOptionalUndefined: Self = StObject.set(x, "optional", js.undefined)
    
    inline def setParams(value: js.Array[PatternKind]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsVarargs(value: PatternKind*): Self = StObject.set(x, "params", js.Array(value :_*))
    
    inline def setReturnType(value: TSTypeAnnotationKind | NoopKind): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
    
    inline def setReturnTypeNull: Self = StObject.set(x, "returnType", null)
    
    inline def setReturnTypeUndefined: Self = StObject.set(x, "returnType", js.undefined)
    
    inline def setStatic(value: Boolean): Self = StObject.set(x, "static", value.asInstanceOf[js.Any])
    
    inline def setStaticUndefined: Self = StObject.set(x, "static", js.undefined)
    
    inline def setTypeParameters(value: TSTypeParameterDeclarationKind): Self = StObject.set(x, "typeParameters", value.asInstanceOf[js.Any])
    
    inline def setTypeParametersNull: Self = StObject.set(x, "typeParameters", null)
    
    inline def setTypeParametersUndefined: Self = StObject.set(x, "typeParameters", js.undefined)
  }
}

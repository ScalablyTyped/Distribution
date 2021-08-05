package typings.astTypes.anon

import typings.astTypes.kindsMod.ClassBodyKind
import typings.astTypes.kindsMod.ClassImplementsKind
import typings.astTypes.kindsMod.CommentKind
import typings.astTypes.kindsMod.ExpressionKind
import typings.astTypes.kindsMod.IdentifierKind
import typings.astTypes.kindsMod.SourceLocationKind
import typings.astTypes.kindsMod.TSExpressionWithTypeArgumentsKind
import typings.astTypes.kindsMod.TSTypeParameterDeclarationKind
import typings.astTypes.kindsMod.TSTypeParameterInstantiationKind
import typings.astTypes.kindsMod.TypeParameterDeclarationKind
import typings.astTypes.kindsMod.TypeParameterInstantiationKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SuperClass extends StObject {
  
  var body: ClassBodyKind
  
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  
  var id: js.UndefOr[IdentifierKind | Null] = js.undefined
  
  var implements: js.UndefOr[js.Array[ClassImplementsKind | TSExpressionWithTypeArgumentsKind]] = js.undefined
  
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  
  var superClass: js.UndefOr[ExpressionKind | Null] = js.undefined
  
  var superTypeParameters: js.UndefOr[TypeParameterInstantiationKind | TSTypeParameterInstantiationKind | Null] = js.undefined
  
  var typeParameters: js.UndefOr[TypeParameterDeclarationKind | TSTypeParameterDeclarationKind | Null] = js.undefined
}
object SuperClass {
  
  inline def apply(body: ClassBodyKind): SuperClass = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuperClass]
  }
  
  extension [Self <: SuperClass](x: Self) {
    
    inline def setBody(value: ClassBodyKind): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setComments(value: js.Array[CommentKind]): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    inline def setCommentsNull: Self = StObject.set(x, "comments", null)
    
    inline def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
    
    inline def setCommentsVarargs(value: CommentKind*): Self = StObject.set(x, "comments", js.Array(value :_*))
    
    inline def setId(value: IdentifierKind): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setImplements(value: js.Array[ClassImplementsKind | TSExpressionWithTypeArgumentsKind]): Self = StObject.set(x, "implements", value.asInstanceOf[js.Any])
    
    inline def setImplementsUndefined: Self = StObject.set(x, "implements", js.undefined)
    
    inline def setImplementsVarargs(value: (ClassImplementsKind | TSExpressionWithTypeArgumentsKind)*): Self = StObject.set(x, "implements", js.Array(value :_*))
    
    inline def setLoc(value: SourceLocationKind): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
    
    inline def setLocNull: Self = StObject.set(x, "loc", null)
    
    inline def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
    
    inline def setSuperClass(value: ExpressionKind): Self = StObject.set(x, "superClass", value.asInstanceOf[js.Any])
    
    inline def setSuperClassNull: Self = StObject.set(x, "superClass", null)
    
    inline def setSuperClassUndefined: Self = StObject.set(x, "superClass", js.undefined)
    
    inline def setSuperTypeParameters(value: TypeParameterInstantiationKind | TSTypeParameterInstantiationKind): Self = StObject.set(x, "superTypeParameters", value.asInstanceOf[js.Any])
    
    inline def setSuperTypeParametersNull: Self = StObject.set(x, "superTypeParameters", null)
    
    inline def setSuperTypeParametersUndefined: Self = StObject.set(x, "superTypeParameters", js.undefined)
    
    inline def setTypeParameters(value: TypeParameterDeclarationKind | TSTypeParameterDeclarationKind): Self = StObject.set(x, "typeParameters", value.asInstanceOf[js.Any])
    
    inline def setTypeParametersNull: Self = StObject.set(x, "typeParameters", null)
    
    inline def setTypeParametersUndefined: Self = StObject.set(x, "typeParameters", js.undefined)
  }
}

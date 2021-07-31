package typings.astTypes.namedTypesMod.namedTypes

import typings.astTypes.kindsMod.ClassBodyKind
import typings.astTypes.kindsMod.ClassImplementsKind
import typings.astTypes.kindsMod.CommentKind
import typings.astTypes.kindsMod.DeclarationKind
import typings.astTypes.kindsMod.ExpressionKind
import typings.astTypes.kindsMod.IdentifierKind
import typings.astTypes.kindsMod.NodeKind
import typings.astTypes.kindsMod.PrintableKind
import typings.astTypes.kindsMod.SourceLocationKind
import typings.astTypes.kindsMod.StatementKind
import typings.astTypes.kindsMod.TSExpressionWithTypeArgumentsKind
import typings.astTypes.kindsMod.TSTypeParameterDeclarationKind
import typings.astTypes.kindsMod.TSTypeParameterInstantiationKind
import typings.astTypes.kindsMod.TypeParameterDeclarationKind
import typings.astTypes.kindsMod.TypeParameterInstantiationKind
import typings.astTypes.typesMod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/namedTypes.namedTypes.Declaration, 'type'> */
trait ClassDeclaration
  extends StObject
     with ASTNode
     with DeclarationKind
     with NodeKind
     with PrintableKind
     with StatementKind {
  
  var body: ClassBodyKind
  
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  
  var id: IdentifierKind | Null
  
  var implements: js.UndefOr[js.Array[ClassImplementsKind | TSExpressionWithTypeArgumentsKind]] = js.undefined
  
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  
  var superClass: js.UndefOr[ExpressionKind | Null] = js.undefined
  
  var superTypeParameters: js.UndefOr[TypeParameterInstantiationKind | TSTypeParameterInstantiationKind | Null] = js.undefined
  
  var `type`: typings.astTypes.astTypesStrings.ClassDeclaration
  
  var typeParameters: js.UndefOr[TypeParameterDeclarationKind | TSTypeParameterDeclarationKind | Null] = js.undefined
}
object ClassDeclaration {
  
  @JSImport("ast-types/gen/namedTypes", "namedTypes.ClassDeclaration")
  @js.native
  val ^ : Type[ClassDeclaration] = js.native
  
  @scala.inline
  implicit class ClassDeclarationMutableBuilder[Self <: ClassDeclaration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: ClassBodyKind): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComments(value: js.Array[CommentKind]): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentsNull: Self = StObject.set(x, "comments", null)
    
    @scala.inline
    def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
    
    @scala.inline
    def setCommentsVarargs(value: CommentKind*): Self = StObject.set(x, "comments", js.Array(value :_*))
    
    @scala.inline
    def setId(value: IdentifierKind): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdNull: Self = StObject.set(x, "id", null)
    
    @scala.inline
    def setImplements(value: js.Array[ClassImplementsKind | TSExpressionWithTypeArgumentsKind]): Self = StObject.set(x, "implements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImplementsUndefined: Self = StObject.set(x, "implements", js.undefined)
    
    @scala.inline
    def setImplementsVarargs(value: (ClassImplementsKind | TSExpressionWithTypeArgumentsKind)*): Self = StObject.set(x, "implements", js.Array(value :_*))
    
    @scala.inline
    def setLoc(value: SourceLocationKind): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocNull: Self = StObject.set(x, "loc", null)
    
    @scala.inline
    def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
    
    @scala.inline
    def setSuperClass(value: ExpressionKind): Self = StObject.set(x, "superClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuperClassNull: Self = StObject.set(x, "superClass", null)
    
    @scala.inline
    def setSuperClassUndefined: Self = StObject.set(x, "superClass", js.undefined)
    
    @scala.inline
    def setSuperTypeParameters(value: TypeParameterInstantiationKind | TSTypeParameterInstantiationKind): Self = StObject.set(x, "superTypeParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuperTypeParametersNull: Self = StObject.set(x, "superTypeParameters", null)
    
    @scala.inline
    def setSuperTypeParametersUndefined: Self = StObject.set(x, "superTypeParameters", js.undefined)
    
    @scala.inline
    def setType(value: typings.astTypes.astTypesStrings.ClassDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeParameters(value: TypeParameterDeclarationKind | TSTypeParameterDeclarationKind): Self = StObject.set(x, "typeParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeParametersNull: Self = StObject.set(x, "typeParameters", null)
    
    @scala.inline
    def setTypeParametersUndefined: Self = StObject.set(x, "typeParameters", js.undefined)
  }
}

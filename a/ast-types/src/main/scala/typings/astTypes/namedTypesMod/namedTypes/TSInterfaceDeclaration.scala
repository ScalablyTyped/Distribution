package typings.astTypes.namedTypesMod.namedTypes

import typings.astTypes.kindsMod.CommentKind
import typings.astTypes.kindsMod.DeclarationKind
import typings.astTypes.kindsMod.IdentifierKind
import typings.astTypes.kindsMod.NodeKind
import typings.astTypes.kindsMod.PrintableKind
import typings.astTypes.kindsMod.SourceLocationKind
import typings.astTypes.kindsMod.StatementKind
import typings.astTypes.kindsMod.TSExpressionWithTypeArgumentsKind
import typings.astTypes.kindsMod.TSHasOptionalTypeParametersKind
import typings.astTypes.kindsMod.TSInterfaceBodyKind
import typings.astTypes.kindsMod.TSQualifiedNameKind
import typings.astTypes.kindsMod.TSTypeParameterDeclarationKind
import typings.astTypes.typesMod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent ast-types.ast-types/types.Omit<ast-types.ast-types/gen/namedTypes.namedTypes.Declaration, 'type'> */
/* Inlined parent ast-types.ast-types/gen/namedTypes.namedTypes.TSHasOptionalTypeParameters */
trait TSInterfaceDeclaration
  extends StObject
     with ASTNode
     with DeclarationKind
     with NodeKind
     with PrintableKind
     with StatementKind
     with TSHasOptionalTypeParametersKind {
  
  var body: TSInterfaceBodyKind
  
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  
  var declare: js.UndefOr[Boolean] = js.undefined
  
  var `extends`: js.UndefOr[js.Array[TSExpressionWithTypeArgumentsKind] | Null] = js.undefined
  
  var id: IdentifierKind | TSQualifiedNameKind
  
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  
  var `type`: typings.astTypes.astTypesStrings.TSInterfaceDeclaration
  
  var typeParameters: js.UndefOr[TSTypeParameterDeclarationKind | Null] = js.undefined
}
object TSInterfaceDeclaration {
  
  @JSImport("ast-types/gen/namedTypes", "namedTypes.TSInterfaceDeclaration")
  @js.native
  val ^ : Type[TSInterfaceDeclaration] = js.native
  
  @scala.inline
  implicit class TSInterfaceDeclarationMutableBuilder[Self <: TSInterfaceDeclaration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: TSInterfaceBodyKind): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComments(value: js.Array[CommentKind]): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentsNull: Self = StObject.set(x, "comments", null)
    
    @scala.inline
    def setCommentsUndefined: Self = StObject.set(x, "comments", js.undefined)
    
    @scala.inline
    def setCommentsVarargs(value: CommentKind*): Self = StObject.set(x, "comments", js.Array(value :_*))
    
    @scala.inline
    def setDeclare(value: Boolean): Self = StObject.set(x, "declare", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeclareUndefined: Self = StObject.set(x, "declare", js.undefined)
    
    @scala.inline
    def setExtends(value: js.Array[TSExpressionWithTypeArgumentsKind]): Self = StObject.set(x, "extends", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtendsNull: Self = StObject.set(x, "extends", null)
    
    @scala.inline
    def setExtendsUndefined: Self = StObject.set(x, "extends", js.undefined)
    
    @scala.inline
    def setExtendsVarargs(value: TSExpressionWithTypeArgumentsKind*): Self = StObject.set(x, "extends", js.Array(value :_*))
    
    @scala.inline
    def setId(value: IdentifierKind | TSQualifiedNameKind): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoc(value: SourceLocationKind): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocNull: Self = StObject.set(x, "loc", null)
    
    @scala.inline
    def setLocUndefined: Self = StObject.set(x, "loc", js.undefined)
    
    @scala.inline
    def setType(value: typings.astTypes.astTypesStrings.TSInterfaceDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeParameters(value: TSTypeParameterDeclarationKind): Self = StObject.set(x, "typeParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeParametersNull: Self = StObject.set(x, "typeParameters", null)
    
    @scala.inline
    def setTypeParametersUndefined: Self = StObject.set(x, "typeParameters", js.undefined)
  }
}

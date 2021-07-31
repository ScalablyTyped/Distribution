package typings.astTypes.anon

import typings.astTypes.kindsMod.CommentKind
import typings.astTypes.kindsMod.IdentifierKind
import typings.astTypes.kindsMod.SourceLocationKind
import typings.astTypes.kindsMod.TSExpressionWithTypeArgumentsKind
import typings.astTypes.kindsMod.TSInterfaceBodyKind
import typings.astTypes.kindsMod.TSQualifiedNameKind
import typings.astTypes.kindsMod.TSTypeParameterDeclarationKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeclareExtends extends StObject {
  
  var body: TSInterfaceBodyKind
  
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  
  var declare: js.UndefOr[Boolean] = js.undefined
  
  var `extends`: js.UndefOr[js.Array[TSExpressionWithTypeArgumentsKind] | Null] = js.undefined
  
  var id: IdentifierKind | TSQualifiedNameKind
  
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  
  var typeParameters: js.UndefOr[TSTypeParameterDeclarationKind | Null] = js.undefined
}
object DeclareExtends {
  
  @scala.inline
  def apply(body: TSInterfaceBodyKind, id: IdentifierKind | TSQualifiedNameKind): DeclareExtends = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeclareExtends]
  }
  
  @scala.inline
  implicit class DeclareExtendsMutableBuilder[Self <: DeclareExtends] (val x: Self) extends AnyVal {
    
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
    def setTypeParameters(value: TSTypeParameterDeclarationKind): Self = StObject.set(x, "typeParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeParametersNull: Self = StObject.set(x, "typeParameters", null)
    
    @scala.inline
    def setTypeParametersUndefined: Self = StObject.set(x, "typeParameters", js.undefined)
  }
}

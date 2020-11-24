package typings.astTypes.anon

import typings.astTypes.kindsMod.CommentKind
import typings.astTypes.kindsMod.IdentifierKind
import typings.astTypes.kindsMod.SourceLocationKind
import typings.astTypes.kindsMod.TSExpressionWithTypeArgumentsKind
import typings.astTypes.kindsMod.TSInterfaceBodyKind
import typings.astTypes.kindsMod.TSQualifiedNameKind
import typings.astTypes.kindsMod.TSTypeParameterDeclarationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeclareExtends extends js.Object {
  
  var body: TSInterfaceBodyKind = js.native
  
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.native
  
  var declare: js.UndefOr[Boolean] = js.native
  
  var `extends`: js.UndefOr[js.Array[TSExpressionWithTypeArgumentsKind] | Null] = js.native
  
  var id: IdentifierKind | TSQualifiedNameKind = js.native
  
  var loc: js.UndefOr[SourceLocationKind | Null] = js.native
  
  var typeParameters: js.UndefOr[TSTypeParameterDeclarationKind | Null] = js.native
}
object DeclareExtends {
  
  @scala.inline
  def apply(body: TSInterfaceBodyKind, id: IdentifierKind | TSQualifiedNameKind): DeclareExtends = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeclareExtends]
  }
  
  @scala.inline
  implicit class DeclareExtendsOps[Self <: DeclareExtends] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBody(value: TSInterfaceBodyKind): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: IdentifierKind | TSQualifiedNameKind): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentsVarargs(value: CommentKind*): Self = this.set("comments", js.Array(value :_*))
    
    @scala.inline
    def setComments(value: js.Array[CommentKind]): Self = this.set("comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComments: Self = this.set("comments", js.undefined)
    
    @scala.inline
    def setCommentsNull: Self = this.set("comments", null)
    
    @scala.inline
    def setDeclare(value: Boolean): Self = this.set("declare", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeclare: Self = this.set("declare", js.undefined)
    
    @scala.inline
    def setExtendsVarargs(value: TSExpressionWithTypeArgumentsKind*): Self = this.set("extends", js.Array(value :_*))
    
    @scala.inline
    def setExtends(value: js.Array[TSExpressionWithTypeArgumentsKind]): Self = this.set("extends", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtends: Self = this.set("extends", js.undefined)
    
    @scala.inline
    def setExtendsNull: Self = this.set("extends", null)
    
    @scala.inline
    def setLoc(value: SourceLocationKind): Self = this.set("loc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoc: Self = this.set("loc", js.undefined)
    
    @scala.inline
    def setLocNull: Self = this.set("loc", null)
    
    @scala.inline
    def setTypeParameters(value: TSTypeParameterDeclarationKind): Self = this.set("typeParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTypeParameters: Self = this.set("typeParameters", js.undefined)
    
    @scala.inline
    def setTypeParametersNull: Self = this.set("typeParameters", null)
  }
}

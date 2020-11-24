package typings.astTypes.anon

import typings.astTypes.kindsMod.CommentKind
import typings.astTypes.kindsMod.FlowTypeKind
import typings.astTypes.kindsMod.FunctionTypeParamKind
import typings.astTypes.kindsMod.SourceLocationKind
import typings.astTypes.kindsMod.TypeParameterDeclarationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Rest extends js.Object {
  
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.native
  
  var loc: js.UndefOr[SourceLocationKind | Null] = js.native
  
  var params: js.Array[FunctionTypeParamKind] = js.native
  
  var rest: FunctionTypeParamKind | Null = js.native
  
  var returnType: FlowTypeKind = js.native
  
  var typeParameters: TypeParameterDeclarationKind | Null = js.native
}
object Rest {
  
  @scala.inline
  def apply(params: js.Array[FunctionTypeParamKind], returnType: FlowTypeKind): Rest = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rest]
  }
  
  @scala.inline
  implicit class RestOps[Self <: Rest] (val x: Self) extends AnyVal {
    
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
    def setParamsVarargs(value: FunctionTypeParamKind*): Self = this.set("params", js.Array(value :_*))
    
    @scala.inline
    def setParams(value: js.Array[FunctionTypeParamKind]): Self = this.set("params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnType(value: FlowTypeKind): Self = this.set("returnType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentsVarargs(value: CommentKind*): Self = this.set("comments", js.Array(value :_*))
    
    @scala.inline
    def setComments(value: js.Array[CommentKind]): Self = this.set("comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComments: Self = this.set("comments", js.undefined)
    
    @scala.inline
    def setCommentsNull: Self = this.set("comments", null)
    
    @scala.inline
    def setLoc(value: SourceLocationKind): Self = this.set("loc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoc: Self = this.set("loc", js.undefined)
    
    @scala.inline
    def setLocNull: Self = this.set("loc", null)
    
    @scala.inline
    def setRest(value: FunctionTypeParamKind): Self = this.set("rest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestNull: Self = this.set("rest", null)
    
    @scala.inline
    def setTypeParameters(value: TypeParameterDeclarationKind): Self = this.set("typeParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeParametersNull: Self = this.set("typeParameters", null)
  }
}

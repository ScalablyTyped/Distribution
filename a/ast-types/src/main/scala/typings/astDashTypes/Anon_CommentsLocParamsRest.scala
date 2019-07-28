package typings.astDashTypes

import typings.astDashTypes.genKindsMod.CommentKind
import typings.astDashTypes.genKindsMod.FlowTypeKind
import typings.astDashTypes.genKindsMod.FunctionTypeParamKind
import typings.astDashTypes.genKindsMod.SourceLocationKind
import typings.astDashTypes.genKindsMod.TypeParameterDeclarationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CommentsLocParamsRest extends js.Object {
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  var params: js.Array[FunctionTypeParamKind]
  var rest: FunctionTypeParamKind | Null
  var returnType: FlowTypeKind
  var typeParameters: TypeParameterDeclarationKind | Null
}

object Anon_CommentsLocParamsRest {
  @scala.inline
  def apply(
    params: js.Array[FunctionTypeParamKind],
    returnType: FlowTypeKind,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null,
    rest: FunctionTypeParamKind = null,
    typeParameters: TypeParameterDeclarationKind = null
  ): Anon_CommentsLocParamsRest = {
    val __obj = js.Dynamic.literal(params = params, returnType = returnType)
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (rest != null) __obj.updateDynamic("rest")(rest)
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters)
    __obj.asInstanceOf[Anon_CommentsLocParamsRest]
  }
}


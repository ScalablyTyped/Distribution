package typings
package astDashTypesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CommentsLocParamsRest extends js.Object {
  var comments: js.UndefOr[js.Array[astDashTypesLib.genKindsMod.CommentKind] | scala.Null] = js.undefined
  var loc: js.UndefOr[astDashTypesLib.genKindsMod.SourceLocationKind | scala.Null] = js.undefined
  var params: js.Array[astDashTypesLib.genKindsMod.FunctionTypeParamKind]
  var rest: astDashTypesLib.genKindsMod.FunctionTypeParamKind | scala.Null
  var returnType: astDashTypesLib.genKindsMod.FlowTypeKind
  var typeParameters: astDashTypesLib.genKindsMod.TypeParameterDeclarationKind | scala.Null
}

object Anon_CommentsLocParamsRest {
  @scala.inline
  def apply(
    params: js.Array[astDashTypesLib.genKindsMod.FunctionTypeParamKind],
    returnType: astDashTypesLib.genKindsMod.FlowTypeKind,
    comments: js.Array[astDashTypesLib.genKindsMod.CommentKind] = null,
    loc: astDashTypesLib.genKindsMod.SourceLocationKind = null,
    rest: astDashTypesLib.genKindsMod.FunctionTypeParamKind = null,
    typeParameters: astDashTypesLib.genKindsMod.TypeParameterDeclarationKind = null
  ): Anon_CommentsLocParamsRest = {
    val __obj = js.Dynamic.literal(params = params, returnType = returnType)
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (rest != null) __obj.updateDynamic("rest")(rest)
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters)
    __obj.asInstanceOf[Anon_CommentsLocParamsRest]
  }
}


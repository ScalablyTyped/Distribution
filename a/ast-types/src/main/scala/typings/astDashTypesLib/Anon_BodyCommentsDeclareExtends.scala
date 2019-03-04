package typings
package astDashTypesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BodyCommentsDeclareExtends extends js.Object {
  var body: astDashTypesLib.genKindsMod.TSInterfaceBodyKind
  var comments: js.UndefOr[js.Array[astDashTypesLib.genKindsMod.CommentKind] | scala.Null] = js.undefined
  var declare: js.UndefOr[scala.Boolean] = js.undefined
  var `extends`: js.UndefOr[
    js.Array[astDashTypesLib.genKindsMod.TSExpressionWithTypeArgumentsKind] | scala.Null
  ] = js.undefined
  var id: astDashTypesLib.genKindsMod.IdentifierKind | astDashTypesLib.genKindsMod.TSQualifiedNameKind
  var loc: js.UndefOr[astDashTypesLib.genKindsMod.SourceLocationKind | scala.Null] = js.undefined
  var typeParameters: js.UndefOr[astDashTypesLib.genKindsMod.TSTypeParameterDeclarationKind | scala.Null] = js.undefined
}

object Anon_BodyCommentsDeclareExtends {
  @scala.inline
  def apply(
    body: astDashTypesLib.genKindsMod.TSInterfaceBodyKind,
    id: astDashTypesLib.genKindsMod.IdentifierKind | astDashTypesLib.genKindsMod.TSQualifiedNameKind,
    comments: js.Array[astDashTypesLib.genKindsMod.CommentKind] = null,
    declare: js.UndefOr[scala.Boolean] = js.undefined,
    `extends`: js.Array[astDashTypesLib.genKindsMod.TSExpressionWithTypeArgumentsKind] = null,
    loc: astDashTypesLib.genKindsMod.SourceLocationKind = null,
    typeParameters: astDashTypesLib.genKindsMod.TSTypeParameterDeclarationKind = null
  ): Anon_BodyCommentsDeclareExtends = {
    val __obj = js.Dynamic.literal(body = body, id = id.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (!js.isUndefined(declare)) __obj.updateDynamic("declare")(declare)
    if (`extends` != null) __obj.updateDynamic("extends")(`extends`)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (typeParameters != null) __obj.updateDynamic("typeParameters")(typeParameters)
    __obj.asInstanceOf[Anon_BodyCommentsDeclareExtends]
  }
}


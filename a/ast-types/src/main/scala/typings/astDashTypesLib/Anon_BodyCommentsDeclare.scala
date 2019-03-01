package typings
package astDashTypesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BodyCommentsDeclare extends js.Object {
  var body: js.UndefOr[
    astDashTypesLib.genKindsMod.TSModuleBlockKind | astDashTypesLib.genKindsMod.TSModuleDeclarationKind | scala.Null
  ] = js.undefined
  var comments: js.UndefOr[js.Array[astDashTypesLib.genKindsMod.CommentKind] | scala.Null] = js.undefined
  var declare: js.UndefOr[scala.Boolean] = js.undefined
  var global: js.UndefOr[scala.Boolean] = js.undefined
  var id: astDashTypesLib.genKindsMod.StringLiteralKind | astDashTypesLib.genKindsMod.IdentifierKind | astDashTypesLib.genKindsMod.TSQualifiedNameKind
  var loc: js.UndefOr[astDashTypesLib.genKindsMod.SourceLocationKind | scala.Null] = js.undefined
}

object Anon_BodyCommentsDeclare {
  @scala.inline
  def apply(
    id: astDashTypesLib.genKindsMod.StringLiteralKind | astDashTypesLib.genKindsMod.IdentifierKind | astDashTypesLib.genKindsMod.TSQualifiedNameKind,
    body: astDashTypesLib.genKindsMod.TSModuleBlockKind | astDashTypesLib.genKindsMod.TSModuleDeclarationKind = null,
    comments: js.Array[astDashTypesLib.genKindsMod.CommentKind] = null,
    declare: js.UndefOr[scala.Boolean] = js.undefined,
    global: js.UndefOr[scala.Boolean] = js.undefined,
    loc: astDashTypesLib.genKindsMod.SourceLocationKind = null
  ): Anon_BodyCommentsDeclare = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (!js.isUndefined(declare)) __obj.updateDynamic("declare")(declare)
    if (!js.isUndefined(global)) __obj.updateDynamic("global")(global)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[Anon_BodyCommentsDeclare]
  }
}


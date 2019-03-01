package typings
package astDashTypesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CommentsConstDeclare extends js.Object {
  var comments: js.UndefOr[js.Array[astDashTypesLib.genKindsMod.CommentKind] | scala.Null] = js.undefined
  var const: js.UndefOr[scala.Boolean] = js.undefined
  var declare: js.UndefOr[scala.Boolean] = js.undefined
  var id: astDashTypesLib.genKindsMod.IdentifierKind
  var initializer: js.UndefOr[astDashTypesLib.genKindsMod.ExpressionKind | scala.Null] = js.undefined
  var loc: js.UndefOr[astDashTypesLib.genKindsMod.SourceLocationKind | scala.Null] = js.undefined
  var members: js.Array[astDashTypesLib.genKindsMod.TSEnumMemberKind]
}

object Anon_CommentsConstDeclare {
  @scala.inline
  def apply(
    id: astDashTypesLib.genKindsMod.IdentifierKind,
    members: js.Array[astDashTypesLib.genKindsMod.TSEnumMemberKind],
    comments: js.Array[astDashTypesLib.genKindsMod.CommentKind] = null,
    const: js.UndefOr[scala.Boolean] = js.undefined,
    declare: js.UndefOr[scala.Boolean] = js.undefined,
    initializer: astDashTypesLib.genKindsMod.ExpressionKind = null,
    loc: astDashTypesLib.genKindsMod.SourceLocationKind = null
  ): Anon_CommentsConstDeclare = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("members")(members)
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (!js.isUndefined(const)) __obj.updateDynamic("const")(const)
    if (!js.isUndefined(declare)) __obj.updateDynamic("declare")(declare)
    if (initializer != null) __obj.updateDynamic("initializer")(initializer)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[Anon_CommentsConstDeclare]
  }
}


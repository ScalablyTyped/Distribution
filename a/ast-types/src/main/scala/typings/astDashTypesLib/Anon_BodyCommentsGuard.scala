package typings
package astDashTypesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BodyCommentsGuard extends js.Object {
  var body: astDashTypesLib.genKindsMod.BlockStatementKind
  var comments: js.UndefOr[js.Array[astDashTypesLib.genKindsMod.CommentKind] | scala.Null] = js.undefined
  var guard: js.UndefOr[astDashTypesLib.genKindsMod.ExpressionKind | scala.Null] = js.undefined
  var loc: js.UndefOr[astDashTypesLib.genKindsMod.SourceLocationKind | scala.Null] = js.undefined
  var param: js.UndefOr[astDashTypesLib.genKindsMod.PatternKind | scala.Null] = js.undefined
}

object Anon_BodyCommentsGuard {
  @scala.inline
  def apply(
    body: astDashTypesLib.genKindsMod.BlockStatementKind,
    comments: js.Array[astDashTypesLib.genKindsMod.CommentKind] = null,
    guard: astDashTypesLib.genKindsMod.ExpressionKind = null,
    loc: astDashTypesLib.genKindsMod.SourceLocationKind = null,
    param: astDashTypesLib.genKindsMod.PatternKind = null
  ): Anon_BodyCommentsGuard = {
    val __obj = js.Dynamic.literal(body = body)
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (guard != null) __obj.updateDynamic("guard")(guard)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (param != null) __obj.updateDynamic("param")(param)
    __obj.asInstanceOf[Anon_BodyCommentsGuard]
  }
}


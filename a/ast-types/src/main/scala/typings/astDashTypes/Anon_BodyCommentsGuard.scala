package typings.astDashTypes

import typings.astDashTypes.genKindsMod.BlockStatementKind
import typings.astDashTypes.genKindsMod.CommentKind
import typings.astDashTypes.genKindsMod.ExpressionKind
import typings.astDashTypes.genKindsMod.PatternKind
import typings.astDashTypes.genKindsMod.SourceLocationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BodyCommentsGuard extends js.Object {
  var body: BlockStatementKind
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  var guard: js.UndefOr[ExpressionKind | Null] = js.undefined
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  var param: js.UndefOr[PatternKind | Null] = js.undefined
}

object Anon_BodyCommentsGuard {
  @scala.inline
  def apply(
    body: BlockStatementKind,
    comments: js.Array[CommentKind] = null,
    guard: ExpressionKind = null,
    loc: SourceLocationKind = null,
    param: PatternKind = null
  ): Anon_BodyCommentsGuard = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (guard != null) __obj.updateDynamic("guard")(guard.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (param != null) __obj.updateDynamic("param")(param.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BodyCommentsGuard]
  }
}


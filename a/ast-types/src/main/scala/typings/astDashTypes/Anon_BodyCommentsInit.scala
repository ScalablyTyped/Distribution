package typings.astDashTypes

import typings.astDashTypes.genKindsMod.CommentKind
import typings.astDashTypes.genKindsMod.ExpressionKind
import typings.astDashTypes.genKindsMod.SourceLocationKind
import typings.astDashTypes.genKindsMod.StatementKind
import typings.astDashTypes.genKindsMod.VariableDeclarationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BodyCommentsInit extends js.Object {
  var body: StatementKind
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  var init: VariableDeclarationKind | ExpressionKind | Null
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  var test: ExpressionKind | Null
  var update: ExpressionKind | Null
}

object Anon_BodyCommentsInit {
  @scala.inline
  def apply(
    body: StatementKind,
    comments: js.Array[CommentKind] = null,
    init: VariableDeclarationKind | ExpressionKind = null,
    loc: SourceLocationKind = null,
    test: ExpressionKind = null,
    update: ExpressionKind = null
  ): Anon_BodyCommentsInit = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (init != null) __obj.updateDynamic("init")(init.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (test != null) __obj.updateDynamic("test")(test.asInstanceOf[js.Any])
    if (update != null) __obj.updateDynamic("update")(update.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BodyCommentsInit]
  }
}


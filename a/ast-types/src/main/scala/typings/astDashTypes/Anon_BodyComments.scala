package typings.astDashTypes

import typings.astDashTypes.genKindsMod.CommentKind
import typings.astDashTypes.genKindsMod.DirectiveKind
import typings.astDashTypes.genKindsMod.SourceLocationKind
import typings.astDashTypes.genKindsMod.StatementKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BodyComments extends js.Object {
  var body: js.Array[StatementKind]
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  var directives: js.UndefOr[js.Array[DirectiveKind]] = js.undefined
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
}

object Anon_BodyComments {
  @scala.inline
  def apply(
    body: js.Array[StatementKind],
    comments: js.Array[CommentKind] = null,
    directives: js.Array[DirectiveKind] = null,
    loc: SourceLocationKind = null
  ): Anon_BodyComments = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (directives != null) __obj.updateDynamic("directives")(directives.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BodyComments]
  }
}


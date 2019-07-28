package typings.astDashTypes

import typings.astDashTypes.genKindsMod.CommentKind
import typings.astDashTypes.genKindsMod.SourceLocationKind
import typings.astDashTypes.genKindsMod.StatementKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BodyCommentsLocArrayCommentKind extends js.Object {
  var body: js.Array[StatementKind]
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
}

object Anon_BodyCommentsLocArrayCommentKind {
  @scala.inline
  def apply(
    body: js.Array[StatementKind],
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): Anon_BodyCommentsLocArrayCommentKind = {
    val __obj = js.Dynamic.literal(body = body)
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[Anon_BodyCommentsLocArrayCommentKind]
  }
}


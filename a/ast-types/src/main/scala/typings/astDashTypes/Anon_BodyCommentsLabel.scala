package typings.astDashTypes

import typings.astDashTypes.genKindsMod.CommentKind
import typings.astDashTypes.genKindsMod.IdentifierKind
import typings.astDashTypes.genKindsMod.SourceLocationKind
import typings.astDashTypes.genKindsMod.StatementKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BodyCommentsLabel extends js.Object {
  var body: StatementKind
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  var label: IdentifierKind
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
}

object Anon_BodyCommentsLabel {
  @scala.inline
  def apply(
    body: StatementKind,
    label: IdentifierKind,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): Anon_BodyCommentsLabel = {
    val __obj = js.Dynamic.literal(body = body, label = label)
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[Anon_BodyCommentsLabel]
  }
}


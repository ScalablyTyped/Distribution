package typings.astDashTypes

import typings.astDashTypes.genKindsMod.BlockStatementKind
import typings.astDashTypes.genKindsMod.CommentKind
import typings.astDashTypes.genKindsMod.IdentifierKind
import typings.astDashTypes.genKindsMod.LiteralKind
import typings.astDashTypes.genKindsMod.SourceLocationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BodyCommentsIdLoc extends js.Object {
  var body: BlockStatementKind
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  var id: IdentifierKind | LiteralKind
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
}

object Anon_BodyCommentsIdLoc {
  @scala.inline
  def apply(
    body: BlockStatementKind,
    id: IdentifierKind | LiteralKind,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): Anon_BodyCommentsIdLoc = {
    val __obj = js.Dynamic.literal(body = body, id = id.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[Anon_BodyCommentsIdLoc]
  }
}


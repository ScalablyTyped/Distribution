package typings.astDashTypes

import typings.astDashTypes.genKindsMod.CommentKind
import typings.astDashTypes.genKindsMod.IdentifierKind
import typings.astDashTypes.genKindsMod.SourceLocationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CommentsIdLoc extends js.Object {
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  var id: js.UndefOr[IdentifierKind | Null] = js.undefined
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  var local: js.UndefOr[IdentifierKind | Null] = js.undefined
  var name: js.UndefOr[IdentifierKind | Null] = js.undefined
}

object Anon_CommentsIdLoc {
  @scala.inline
  def apply(
    comments: js.Array[CommentKind] = null,
    id: IdentifierKind = null,
    loc: SourceLocationKind = null,
    local: IdentifierKind = null,
    name: IdentifierKind = null
  ): Anon_CommentsIdLoc = {
    val __obj = js.Dynamic.literal()
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (id != null) __obj.updateDynamic("id")(id)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (local != null) __obj.updateDynamic("local")(local)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[Anon_CommentsIdLoc]
  }
}


package typings.astDashTypes

import typings.astDashTypes.genKindsMod.CommentKind
import typings.astDashTypes.genKindsMod.IdentifierKind
import typings.astDashTypes.genKindsMod.SourceLocationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CommentsExportedLoc extends js.Object {
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  var exported: IdentifierKind
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
}

object Anon_CommentsExportedLoc {
  @scala.inline
  def apply(exported: IdentifierKind, comments: js.Array[CommentKind] = null, loc: SourceLocationKind = null): Anon_CommentsExportedLoc = {
    val __obj = js.Dynamic.literal(exported = exported)
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[Anon_CommentsExportedLoc]
  }
}


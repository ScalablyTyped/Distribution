package typings.astDashTypes

import typings.astDashTypes.genKindsMod.CommentKind
import typings.astDashTypes.genKindsMod.IdentifierKind
import typings.astDashTypes.genKindsMod.LiteralKind
import typings.astDashTypes.genKindsMod.SourceLocationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CommentsExportedLocSource extends js.Object {
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  var exported: IdentifierKind | Null
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  var source: LiteralKind
}

object Anon_CommentsExportedLocSource {
  @scala.inline
  def apply(
    source: LiteralKind,
    comments: js.Array[CommentKind] = null,
    exported: IdentifierKind = null,
    loc: SourceLocationKind = null
  ): Anon_CommentsExportedLocSource = {
    val __obj = js.Dynamic.literal(source = source)
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (exported != null) __obj.updateDynamic("exported")(exported)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[Anon_CommentsExportedLocSource]
  }
}


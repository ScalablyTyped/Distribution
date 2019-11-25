package typings.astDashTypes

import typings.astDashTypes.genKindsMod.CommentKind
import typings.astDashTypes.genKindsMod.SourceLocationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CommentsExtraLoc extends js.Object {
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  var extra: js.UndefOr[Anon_RawRawValue] = js.undefined
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  var regex: js.UndefOr[Anon_Flags | Null] = js.undefined
  var value: String | Double
}

object Anon_CommentsExtraLoc {
  @scala.inline
  def apply(
    value: String | Double,
    comments: js.Array[CommentKind] = null,
    extra: Anon_RawRawValue = null,
    loc: SourceLocationKind = null,
    regex: Anon_Flags = null
  ): Anon_CommentsExtraLoc = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (extra != null) __obj.updateDynamic("extra")(extra.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (regex != null) __obj.updateDynamic("regex")(regex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CommentsExtraLoc]
  }
}


package typings.astDashTypes

import typings.astDashTypes.genKindsMod.CommentKind
import typings.astDashTypes.genKindsMod.SourceLocationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CommentsLocRegexValue extends js.Object {
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  var regex: js.UndefOr[Anon_Flags | Null] = js.undefined
  var value: String
}

object Anon_CommentsLocRegexValue {
  @scala.inline
  def apply(
    value: String,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null,
    regex: Anon_Flags = null
  ): Anon_CommentsLocRegexValue = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (regex != null) __obj.updateDynamic("regex")(regex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CommentsLocRegexValue]
  }
}


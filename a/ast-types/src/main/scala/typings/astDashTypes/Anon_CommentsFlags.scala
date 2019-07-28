package typings.astDashTypes

import typings.astDashTypes.genKindsMod.CommentKind
import typings.astDashTypes.genKindsMod.SourceLocationKind
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CommentsFlags extends js.Object {
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  var flags: String
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  var pattern: String
  var regex: js.UndefOr[Anon_Flags | Null] = js.undefined
  var value: js.UndefOr[RegExp] = js.undefined
}

object Anon_CommentsFlags {
  @scala.inline
  def apply(
    flags: String,
    pattern: String,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null,
    regex: Anon_Flags = null,
    value: RegExp = null
  ): Anon_CommentsFlags = {
    val __obj = js.Dynamic.literal(flags = flags, pattern = pattern)
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (regex != null) __obj.updateDynamic("regex")(regex)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Anon_CommentsFlags]
  }
}


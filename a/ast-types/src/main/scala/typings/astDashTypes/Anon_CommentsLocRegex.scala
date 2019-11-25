package typings.astDashTypes

import typings.astDashTypes.genKindsMod.CommentKind
import typings.astDashTypes.genKindsMod.SourceLocationKind
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CommentsLocRegex extends js.Object {
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  var regex: js.UndefOr[Anon_Flags | Null] = js.undefined
  var value: String | Boolean | Null | Double | RegExp
}

object Anon_CommentsLocRegex {
  @scala.inline
  def apply(
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null,
    regex: Anon_Flags = null,
    value: String | Boolean | Double | RegExp = null
  ): Anon_CommentsLocRegex = {
    val __obj = js.Dynamic.literal()
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (regex != null) __obj.updateDynamic("regex")(regex.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CommentsLocRegex]
  }
}


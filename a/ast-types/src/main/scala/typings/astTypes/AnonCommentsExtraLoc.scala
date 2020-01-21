package typings.astTypes

import typings.astTypes.kindsMod.CommentKind
import typings.astTypes.kindsMod.SourceLocationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCommentsExtraLoc extends js.Object {
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  var extra: js.UndefOr[AnonRawRawValue] = js.undefined
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  var regex: js.UndefOr[AnonFlags | Null] = js.undefined
  var value: String | Double
}

object AnonCommentsExtraLoc {
  @scala.inline
  def apply(
    value: String | Double,
    comments: js.Array[CommentKind] = null,
    extra: AnonRawRawValue = null,
    loc: SourceLocationKind = null,
    regex: AnonFlags = null
  ): AnonCommentsExtraLoc = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (extra != null) __obj.updateDynamic("extra")(extra.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (regex != null) __obj.updateDynamic("regex")(regex.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCommentsExtraLoc]
  }
}


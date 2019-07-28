package typings.astDashTypes

import typings.astDashTypes.genKindsMod.CommentKind
import typings.astDashTypes.genKindsMod.SourceLocationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CommentsExtra extends js.Object {
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  var extra: js.UndefOr[Anon_Raw] = js.undefined
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  var raw: js.UndefOr[String | Null] = js.undefined
  var regex: js.UndefOr[Anon_Flags | Null] = js.undefined
  var value: Double
}

object Anon_CommentsExtra {
  @scala.inline
  def apply(
    value: Double,
    comments: js.Array[CommentKind] = null,
    extra: Anon_Raw = null,
    loc: SourceLocationKind = null,
    raw: String = null,
    regex: Anon_Flags = null
  ): Anon_CommentsExtra = {
    val __obj = js.Dynamic.literal(value = value)
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (extra != null) __obj.updateDynamic("extra")(extra)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (raw != null) __obj.updateDynamic("raw")(raw)
    if (regex != null) __obj.updateDynamic("regex")(regex)
    __obj.asInstanceOf[Anon_CommentsExtra]
  }
}


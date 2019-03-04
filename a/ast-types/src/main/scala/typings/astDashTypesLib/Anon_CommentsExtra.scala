package typings
package astDashTypesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CommentsExtra extends js.Object {
  var comments: js.UndefOr[js.Array[astDashTypesLib.genKindsMod.CommentKind] | scala.Null] = js.undefined
  var extra: js.UndefOr[Anon_Raw] = js.undefined
  var loc: js.UndefOr[astDashTypesLib.genKindsMod.SourceLocationKind | scala.Null] = js.undefined
  var raw: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  var regex: js.UndefOr[Anon_Flags | scala.Null] = js.undefined
  var value: scala.Double
}

object Anon_CommentsExtra {
  @scala.inline
  def apply(
    value: scala.Double,
    comments: js.Array[astDashTypesLib.genKindsMod.CommentKind] = null,
    extra: Anon_Raw = null,
    loc: astDashTypesLib.genKindsMod.SourceLocationKind = null,
    raw: java.lang.String = null,
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


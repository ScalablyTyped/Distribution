package typings
package astDashTypesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CommentsExtraLoc extends js.Object {
  var comments: js.UndefOr[js.Array[astDashTypesLib.genKindsMod.CommentKind] | scala.Null] = js.undefined
  var extra: js.UndefOr[Anon_RawRawValue] = js.undefined
  var loc: js.UndefOr[astDashTypesLib.genKindsMod.SourceLocationKind | scala.Null] = js.undefined
  var regex: js.UndefOr[Anon_Flags | scala.Null] = js.undefined
  var value: java.lang.String | scala.Double
}

object Anon_CommentsExtraLoc {
  @scala.inline
  def apply(
    value: java.lang.String | scala.Double,
    comments: js.Array[astDashTypesLib.genKindsMod.CommentKind] = null,
    extra: Anon_RawRawValue = null,
    loc: astDashTypesLib.genKindsMod.SourceLocationKind = null,
    regex: Anon_Flags = null
  ): Anon_CommentsExtraLoc = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (extra != null) __obj.updateDynamic("extra")(extra)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (regex != null) __obj.updateDynamic("regex")(regex)
    __obj.asInstanceOf[Anon_CommentsExtraLoc]
  }
}


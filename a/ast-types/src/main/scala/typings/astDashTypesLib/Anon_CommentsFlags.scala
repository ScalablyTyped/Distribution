package typings
package astDashTypesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CommentsFlags extends js.Object {
  var comments: js.UndefOr[js.Array[astDashTypesLib.genKindsMod.CommentKind] | scala.Null] = js.undefined
  var flags: java.lang.String
  var loc: js.UndefOr[astDashTypesLib.genKindsMod.SourceLocationKind | scala.Null] = js.undefined
  var pattern: java.lang.String
  var regex: js.UndefOr[Anon_Flags | scala.Null] = js.undefined
  var value: js.UndefOr[stdLib.RegExp] = js.undefined
}

object Anon_CommentsFlags {
  @scala.inline
  def apply(
    flags: java.lang.String,
    pattern: java.lang.String,
    comments: js.Array[astDashTypesLib.genKindsMod.CommentKind] = null,
    loc: astDashTypesLib.genKindsMod.SourceLocationKind = null,
    regex: Anon_Flags = null,
    value: stdLib.RegExp = null
  ): Anon_CommentsFlags = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("flags")(flags)
    __obj.updateDynamic("pattern")(pattern)
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (regex != null) __obj.updateDynamic("regex")(regex)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Anon_CommentsFlags]
  }
}


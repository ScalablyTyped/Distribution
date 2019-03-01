package typings
package astDashTypesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CommentsLocRegex extends js.Object {
  var comments: js.UndefOr[js.Array[astDashTypesLib.genKindsMod.CommentKind] | scala.Null] = js.undefined
  var loc: js.UndefOr[astDashTypesLib.genKindsMod.SourceLocationKind | scala.Null] = js.undefined
  var regex: js.UndefOr[Anon_Flags | scala.Null] = js.undefined
  var value: java.lang.String | scala.Boolean | scala.Null | scala.Double | stdLib.RegExp
}

object Anon_CommentsLocRegex {
  @scala.inline
  def apply(
    comments: js.Array[astDashTypesLib.genKindsMod.CommentKind] = null,
    loc: astDashTypesLib.genKindsMod.SourceLocationKind = null,
    regex: Anon_Flags = null,
    value: java.lang.String | scala.Boolean | scala.Double | stdLib.RegExp = null
  ): Anon_CommentsLocRegex = {
    val __obj = js.Dynamic.literal()
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (regex != null) __obj.updateDynamic("regex")(regex)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CommentsLocRegex]
  }
}


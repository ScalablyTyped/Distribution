package typings
package astDashTypesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CommentsLocValueArrayCommentKind extends js.Object {
  var comments: js.UndefOr[js.Array[astDashTypesLib.genKindsMod.CommentKind] | scala.Null] = js.undefined
  var loc: js.UndefOr[astDashTypesLib.genKindsMod.SourceLocationKind | scala.Null] = js.undefined
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_CommentsLocValueArrayCommentKind {
  @scala.inline
  def apply(
    comments: js.Array[astDashTypesLib.genKindsMod.CommentKind] = null,
    loc: astDashTypesLib.genKindsMod.SourceLocationKind = null,
    value: java.lang.String = null
  ): Anon_CommentsLocValueArrayCommentKind = {
    val __obj = js.Dynamic.literal()
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Anon_CommentsLocValueArrayCommentKind]
  }
}


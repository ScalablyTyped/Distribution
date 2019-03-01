package typings
package astDashTypesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ArgumentCommentsLocArrayCommentKind extends js.Object {
  var argument: astDashTypesLib.genKindsMod.FlowTypeKind
  var comments: js.UndefOr[js.Array[astDashTypesLib.genKindsMod.CommentKind] | scala.Null] = js.undefined
  var loc: js.UndefOr[astDashTypesLib.genKindsMod.SourceLocationKind | scala.Null] = js.undefined
}

object Anon_ArgumentCommentsLocArrayCommentKind {
  @scala.inline
  def apply(
    argument: astDashTypesLib.genKindsMod.FlowTypeKind,
    comments: js.Array[astDashTypesLib.genKindsMod.CommentKind] = null,
    loc: astDashTypesLib.genKindsMod.SourceLocationKind = null
  ): Anon_ArgumentCommentsLocArrayCommentKind = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("argument")(argument)
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[Anon_ArgumentCommentsLocArrayCommentKind]
  }
}


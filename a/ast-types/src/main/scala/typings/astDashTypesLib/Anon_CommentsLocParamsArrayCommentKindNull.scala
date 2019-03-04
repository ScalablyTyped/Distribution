package typings
package astDashTypesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CommentsLocParamsArrayCommentKindNull extends js.Object {
  var comments: js.UndefOr[js.Array[astDashTypesLib.genKindsMod.CommentKind] | scala.Null] = js.undefined
  var loc: js.UndefOr[astDashTypesLib.genKindsMod.SourceLocationKind | scala.Null] = js.undefined
  var params: js.Array[astDashTypesLib.genKindsMod.TSTypeKind]
}

object Anon_CommentsLocParamsArrayCommentKindNull {
  @scala.inline
  def apply(
    params: js.Array[astDashTypesLib.genKindsMod.TSTypeKind],
    comments: js.Array[astDashTypesLib.genKindsMod.CommentKind] = null,
    loc: astDashTypesLib.genKindsMod.SourceLocationKind = null
  ): Anon_CommentsLocParamsArrayCommentKindNull = {
    val __obj = js.Dynamic.literal(params = params)
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[Anon_CommentsLocParamsArrayCommentKindNull]
  }
}


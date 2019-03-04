package typings
package astDashTypesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CommentsEach extends js.Object {
  var comments: js.UndefOr[js.Array[astDashTypesLib.genKindsMod.CommentKind] | scala.Null] = js.undefined
  var each: scala.Boolean
  var left: astDashTypesLib.genKindsMod.PatternKind
  var loc: js.UndefOr[astDashTypesLib.genKindsMod.SourceLocationKind | scala.Null] = js.undefined
  var right: astDashTypesLib.genKindsMod.ExpressionKind
}

object Anon_CommentsEach {
  @scala.inline
  def apply(
    each: scala.Boolean,
    left: astDashTypesLib.genKindsMod.PatternKind,
    right: astDashTypesLib.genKindsMod.ExpressionKind,
    comments: js.Array[astDashTypesLib.genKindsMod.CommentKind] = null,
    loc: astDashTypesLib.genKindsMod.SourceLocationKind = null
  ): Anon_CommentsEach = {
    val __obj = js.Dynamic.literal(each = each, left = left, right = right)
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[Anon_CommentsEach]
  }
}


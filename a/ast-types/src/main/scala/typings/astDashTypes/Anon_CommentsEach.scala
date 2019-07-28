package typings.astDashTypes

import typings.astDashTypes.genKindsMod.CommentKind
import typings.astDashTypes.genKindsMod.ExpressionKind
import typings.astDashTypes.genKindsMod.PatternKind
import typings.astDashTypes.genKindsMod.SourceLocationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CommentsEach extends js.Object {
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  var each: Boolean
  var left: PatternKind
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  var right: ExpressionKind
}

object Anon_CommentsEach {
  @scala.inline
  def apply(
    each: Boolean,
    left: PatternKind,
    right: ExpressionKind,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): Anon_CommentsEach = {
    val __obj = js.Dynamic.literal(each = each, left = left, right = right)
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[Anon_CommentsEach]
  }
}


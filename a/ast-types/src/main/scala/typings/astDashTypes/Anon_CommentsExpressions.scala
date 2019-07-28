package typings.astDashTypes

import typings.astDashTypes.genKindsMod.CommentKind
import typings.astDashTypes.genKindsMod.ExpressionKind
import typings.astDashTypes.genKindsMod.SourceLocationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CommentsExpressions extends js.Object {
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  var expressions: js.Array[ExpressionKind]
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
}

object Anon_CommentsExpressions {
  @scala.inline
  def apply(
    expressions: js.Array[ExpressionKind],
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): Anon_CommentsExpressions = {
    val __obj = js.Dynamic.literal(expressions = expressions)
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[Anon_CommentsExpressions]
  }
}


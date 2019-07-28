package typings.astDashTypes

import typings.astDashTypes.genKindsMod.CommentKind
import typings.astDashTypes.genKindsMod.SourceLocationKind
import typings.astDashTypes.genKindsMod.StringLiteralKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CommentsExpressionLocArray extends js.Object {
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  var expression: StringLiteralKind
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
}

object Anon_CommentsExpressionLocArray {
  @scala.inline
  def apply(
    expression: StringLiteralKind,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): Anon_CommentsExpressionLocArray = {
    val __obj = js.Dynamic.literal(expression = expression)
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[Anon_CommentsExpressionLocArray]
  }
}


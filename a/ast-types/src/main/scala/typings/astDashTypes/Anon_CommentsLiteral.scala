package typings.astDashTypes

import typings.astDashTypes.genKindsMod.BooleanLiteralKind
import typings.astDashTypes.genKindsMod.CommentKind
import typings.astDashTypes.genKindsMod.NumericLiteralKind
import typings.astDashTypes.genKindsMod.SourceLocationKind
import typings.astDashTypes.genKindsMod.StringLiteralKind
import typings.astDashTypes.genKindsMod.TemplateLiteralKind
import typings.astDashTypes.genKindsMod.UnaryExpressionKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CommentsLiteral extends js.Object {
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  var literal: NumericLiteralKind | StringLiteralKind | BooleanLiteralKind | TemplateLiteralKind | UnaryExpressionKind
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
}

object Anon_CommentsLiteral {
  @scala.inline
  def apply(
    literal: NumericLiteralKind | StringLiteralKind | BooleanLiteralKind | TemplateLiteralKind | UnaryExpressionKind,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): Anon_CommentsLiteral = {
    val __obj = js.Dynamic.literal(literal = literal.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[Anon_CommentsLiteral]
  }
}


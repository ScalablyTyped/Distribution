package typings.astDashTypes

import typings.astDashTypes.genKindsMod.CommentKind
import typings.astDashTypes.genKindsMod.ExpressionKind
import typings.astDashTypes.genKindsMod.SourceLocationKind
import typings.astDashTypes.genKindsMod.TypeAnnotationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CommentsExpressionLocTypeAnnotation extends js.Object {
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  var expression: ExpressionKind
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  var typeAnnotation: TypeAnnotationKind
}

object Anon_CommentsExpressionLocTypeAnnotation {
  @scala.inline
  def apply(
    expression: ExpressionKind,
    typeAnnotation: TypeAnnotationKind,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): Anon_CommentsExpressionLocTypeAnnotation = {
    val __obj = js.Dynamic.literal(expression = expression, typeAnnotation = typeAnnotation)
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[Anon_CommentsExpressionLocTypeAnnotation]
  }
}


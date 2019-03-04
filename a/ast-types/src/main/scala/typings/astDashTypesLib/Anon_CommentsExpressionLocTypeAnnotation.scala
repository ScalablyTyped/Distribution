package typings
package astDashTypesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CommentsExpressionLocTypeAnnotation extends js.Object {
  var comments: js.UndefOr[js.Array[astDashTypesLib.genKindsMod.CommentKind] | scala.Null] = js.undefined
  var expression: astDashTypesLib.genKindsMod.ExpressionKind
  var loc: js.UndefOr[astDashTypesLib.genKindsMod.SourceLocationKind | scala.Null] = js.undefined
  var typeAnnotation: astDashTypesLib.genKindsMod.TypeAnnotationKind
}

object Anon_CommentsExpressionLocTypeAnnotation {
  @scala.inline
  def apply(
    expression: astDashTypesLib.genKindsMod.ExpressionKind,
    typeAnnotation: astDashTypesLib.genKindsMod.TypeAnnotationKind,
    comments: js.Array[astDashTypesLib.genKindsMod.CommentKind] = null,
    loc: astDashTypesLib.genKindsMod.SourceLocationKind = null
  ): Anon_CommentsExpressionLocTypeAnnotation = {
    val __obj = js.Dynamic.literal(expression = expression, typeAnnotation = typeAnnotation)
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[Anon_CommentsExpressionLocTypeAnnotation]
  }
}


package typings
package astDashTypesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CommentsExpressionsLoc extends js.Object {
  var comments: js.UndefOr[js.Array[astDashTypesLib.genKindsMod.CommentKind] | scala.Null] = js.undefined
  var expressions: js.Array[astDashTypesLib.genKindsMod.ExpressionKind]
  var loc: js.UndefOr[astDashTypesLib.genKindsMod.SourceLocationKind | scala.Null] = js.undefined
  var quasis: js.Array[astDashTypesLib.genKindsMod.TemplateElementKind]
}

object Anon_CommentsExpressionsLoc {
  @scala.inline
  def apply(
    expressions: js.Array[astDashTypesLib.genKindsMod.ExpressionKind],
    quasis: js.Array[astDashTypesLib.genKindsMod.TemplateElementKind],
    comments: js.Array[astDashTypesLib.genKindsMod.CommentKind] = null,
    loc: astDashTypesLib.genKindsMod.SourceLocationKind = null
  ): Anon_CommentsExpressionsLoc = {
    val __obj = js.Dynamic.literal(expressions = expressions, quasis = quasis)
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[Anon_CommentsExpressionsLoc]
  }
}


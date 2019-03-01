package typings
package astDashTypesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CommentsExpressionExtra extends js.Object {
  var comments: js.UndefOr[js.Array[astDashTypesLib.genKindsMod.CommentKind] | scala.Null] = js.undefined
  var expression: astDashTypesLib.genKindsMod.ExpressionKind
  var extra: js.UndefOr[Anon_Parenthesized | scala.Null] = js.undefined
  var loc: js.UndefOr[astDashTypesLib.genKindsMod.SourceLocationKind | scala.Null] = js.undefined
  var typeAnnotation: astDashTypesLib.genKindsMod.TSTypeKind
}

object Anon_CommentsExpressionExtra {
  @scala.inline
  def apply(
    expression: astDashTypesLib.genKindsMod.ExpressionKind,
    typeAnnotation: astDashTypesLib.genKindsMod.TSTypeKind,
    comments: js.Array[astDashTypesLib.genKindsMod.CommentKind] = null,
    extra: Anon_Parenthesized = null,
    loc: astDashTypesLib.genKindsMod.SourceLocationKind = null
  ): Anon_CommentsExpressionExtra = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("expression")(expression)
    __obj.updateDynamic("typeAnnotation")(typeAnnotation)
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (extra != null) __obj.updateDynamic("extra")(extra)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[Anon_CommentsExpressionExtra]
  }
}


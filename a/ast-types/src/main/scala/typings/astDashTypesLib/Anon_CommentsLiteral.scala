package typings
package astDashTypesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CommentsLiteral extends js.Object {
  var comments: js.UndefOr[js.Array[astDashTypesLib.genKindsMod.CommentKind] | scala.Null] = js.undefined
  var literal: astDashTypesLib.genKindsMod.NumericLiteralKind | astDashTypesLib.genKindsMod.StringLiteralKind | astDashTypesLib.genKindsMod.BooleanLiteralKind
  var loc: js.UndefOr[astDashTypesLib.genKindsMod.SourceLocationKind | scala.Null] = js.undefined
}

object Anon_CommentsLiteral {
  @scala.inline
  def apply(
    literal: astDashTypesLib.genKindsMod.NumericLiteralKind | astDashTypesLib.genKindsMod.StringLiteralKind | astDashTypesLib.genKindsMod.BooleanLiteralKind,
    comments: js.Array[astDashTypesLib.genKindsMod.CommentKind] = null,
    loc: astDashTypesLib.genKindsMod.SourceLocationKind = null
  ): Anon_CommentsLiteral = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("literal")(literal.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[Anon_CommentsLiteral]
  }
}


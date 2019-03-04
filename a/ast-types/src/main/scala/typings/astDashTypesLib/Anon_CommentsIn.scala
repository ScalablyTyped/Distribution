package typings
package astDashTypesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CommentsIn extends js.Object {
  var comments: js.UndefOr[js.Array[astDashTypesLib.genKindsMod.CommentKind] | scala.Null] = js.undefined
  var left: astDashTypesLib.genKindsMod.ExpressionKind
  var loc: js.UndefOr[astDashTypesLib.genKindsMod.SourceLocationKind | scala.Null] = js.undefined
  var operator: astDashTypesLib.astDashTypesLibStrings.`==` | astDashTypesLib.astDashTypesLibStrings.`!=` | astDashTypesLib.astDashTypesLibStrings.`===` | astDashTypesLib.astDashTypesLibStrings.`!==` | astDashTypesLib.astDashTypesLibStrings.`<` | astDashTypesLib.astDashTypesLibStrings.`<=` | astDashTypesLib.astDashTypesLibStrings.`>` | astDashTypesLib.astDashTypesLibStrings.`>=` | astDashTypesLib.astDashTypesLibStrings.`<<` | astDashTypesLib.astDashTypesLibStrings.`>>` | astDashTypesLib.astDashTypesLibStrings.`>>>` | astDashTypesLib.astDashTypesLibStrings.`+` | astDashTypesLib.astDashTypesLibStrings.`-` | astDashTypesLib.astDashTypesLibStrings.`*` | astDashTypesLib.astDashTypesLibStrings.`/` | astDashTypesLib.astDashTypesLibStrings.`%` | astDashTypesLib.astDashTypesLibStrings.`**` | astDashTypesLib.astDashTypesLibStrings.`&` | astDashTypesLib.astDashTypesLibStrings.`|` | astDashTypesLib.astDashTypesLibStrings.`_backtick^_backtick` | astDashTypesLib.astDashTypesLibStrings.in | astDashTypesLib.astDashTypesLibStrings.instanceof
  var right: astDashTypesLib.genKindsMod.ExpressionKind
}

object Anon_CommentsIn {
  @scala.inline
  def apply(
    left: astDashTypesLib.genKindsMod.ExpressionKind,
    operator: astDashTypesLib.astDashTypesLibStrings.`==` | astDashTypesLib.astDashTypesLibStrings.`!=` | astDashTypesLib.astDashTypesLibStrings.`===` | astDashTypesLib.astDashTypesLibStrings.`!==` | astDashTypesLib.astDashTypesLibStrings.`<` | astDashTypesLib.astDashTypesLibStrings.`<=` | astDashTypesLib.astDashTypesLibStrings.`>` | astDashTypesLib.astDashTypesLibStrings.`>=` | astDashTypesLib.astDashTypesLibStrings.`<<` | astDashTypesLib.astDashTypesLibStrings.`>>` | astDashTypesLib.astDashTypesLibStrings.`>>>` | astDashTypesLib.astDashTypesLibStrings.`+` | astDashTypesLib.astDashTypesLibStrings.`-` | astDashTypesLib.astDashTypesLibStrings.`*` | astDashTypesLib.astDashTypesLibStrings.`/` | astDashTypesLib.astDashTypesLibStrings.`%` | astDashTypesLib.astDashTypesLibStrings.`**` | astDashTypesLib.astDashTypesLibStrings.`&` | astDashTypesLib.astDashTypesLibStrings.`|` | astDashTypesLib.astDashTypesLibStrings.`_backtick^_backtick` | astDashTypesLib.astDashTypesLibStrings.in | astDashTypesLib.astDashTypesLibStrings.instanceof,
    right: astDashTypesLib.genKindsMod.ExpressionKind,
    comments: js.Array[astDashTypesLib.genKindsMod.CommentKind] = null,
    loc: astDashTypesLib.genKindsMod.SourceLocationKind = null
  ): Anon_CommentsIn = {
    val __obj = js.Dynamic.literal(left = left, operator = operator.asInstanceOf[js.Any], right = right)
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[Anon_CommentsIn]
  }
}


package typings
package astDashTypesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `Anon_` extends js.Object {
  var argument: astDashTypesLib.genKindsMod.ExpressionKind
  var comments: js.UndefOr[js.Array[astDashTypesLib.genKindsMod.CommentKind] | scala.Null] = js.undefined
  var loc: js.UndefOr[astDashTypesLib.genKindsMod.SourceLocationKind | scala.Null] = js.undefined
  var operator: astDashTypesLib.astDashTypesLibStrings.`-` | astDashTypesLib.astDashTypesLibStrings.`+` | astDashTypesLib.astDashTypesLibStrings.`!` | astDashTypesLib.astDashTypesLibStrings.`~` | astDashTypesLib.astDashTypesLibStrings.typeof | astDashTypesLib.astDashTypesLibStrings.void | astDashTypesLib.astDashTypesLibStrings.delete
  var prefix: js.UndefOr[scala.Boolean] = js.undefined
}

object `Anon_` {
  @scala.inline
  def apply(
    argument: astDashTypesLib.genKindsMod.ExpressionKind,
    operator: astDashTypesLib.astDashTypesLibStrings.`-` | astDashTypesLib.astDashTypesLibStrings.`+` | astDashTypesLib.astDashTypesLibStrings.`!` | astDashTypesLib.astDashTypesLibStrings.`~` | astDashTypesLib.astDashTypesLibStrings.typeof | astDashTypesLib.astDashTypesLibStrings.void | astDashTypesLib.astDashTypesLibStrings.delete,
    comments: js.Array[astDashTypesLib.genKindsMod.CommentKind] = null,
    loc: astDashTypesLib.genKindsMod.SourceLocationKind = null,
    prefix: js.UndefOr[scala.Boolean] = js.undefined
  ): `Anon_` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("argument")(argument)
    __obj.updateDynamic("operator")(operator.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (!js.isUndefined(prefix)) __obj.updateDynamic("prefix")(prefix)
    __obj.asInstanceOf[`Anon_`]
  }
}


package typings
package astDashTypesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Accessibility extends js.Object {
  var accessibility: js.UndefOr[astDashTypesLib.genKindsMod.LiteralKind | scala.Null] = js.undefined
  var comments: js.UndefOr[js.Array[astDashTypesLib.genKindsMod.CommentKind] | scala.Null] = js.undefined
  var computed: js.UndefOr[scala.Boolean] = js.undefined
  var key: astDashTypesLib.genKindsMod.LiteralKind | astDashTypesLib.genKindsMod.IdentifierKind | astDashTypesLib.genKindsMod.ExpressionKind
  var loc: js.UndefOr[astDashTypesLib.genKindsMod.SourceLocationKind | scala.Null] = js.undefined
  var shorthand: js.UndefOr[scala.Boolean] = js.undefined
  var value: astDashTypesLib.genKindsMod.ExpressionKind | astDashTypesLib.genKindsMod.PatternKind
}

object Anon_Accessibility {
  @scala.inline
  def apply(
    key: astDashTypesLib.genKindsMod.LiteralKind | astDashTypesLib.genKindsMod.IdentifierKind | astDashTypesLib.genKindsMod.ExpressionKind,
    value: astDashTypesLib.genKindsMod.ExpressionKind | astDashTypesLib.genKindsMod.PatternKind,
    accessibility: astDashTypesLib.genKindsMod.LiteralKind = null,
    comments: js.Array[astDashTypesLib.genKindsMod.CommentKind] = null,
    computed: js.UndefOr[scala.Boolean] = js.undefined,
    loc: astDashTypesLib.genKindsMod.SourceLocationKind = null,
    shorthand: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_Accessibility = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (accessibility != null) __obj.updateDynamic("accessibility")(accessibility)
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (!js.isUndefined(computed)) __obj.updateDynamic("computed")(computed)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (!js.isUndefined(shorthand)) __obj.updateDynamic("shorthand")(shorthand)
    __obj.asInstanceOf[Anon_Accessibility]
  }
}


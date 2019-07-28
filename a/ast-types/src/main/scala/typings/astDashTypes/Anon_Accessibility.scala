package typings.astDashTypes

import typings.astDashTypes.genKindsMod.CommentKind
import typings.astDashTypes.genKindsMod.ExpressionKind
import typings.astDashTypes.genKindsMod.IdentifierKind
import typings.astDashTypes.genKindsMod.LiteralKind
import typings.astDashTypes.genKindsMod.PatternKind
import typings.astDashTypes.genKindsMod.SourceLocationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Accessibility extends js.Object {
  var accessibility: js.UndefOr[LiteralKind | Null] = js.undefined
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  var computed: js.UndefOr[Boolean] = js.undefined
  var key: LiteralKind | IdentifierKind | ExpressionKind
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  var shorthand: js.UndefOr[Boolean] = js.undefined
  var value: ExpressionKind | PatternKind
}

object Anon_Accessibility {
  @scala.inline
  def apply(
    key: LiteralKind | IdentifierKind | ExpressionKind,
    value: ExpressionKind | PatternKind,
    accessibility: LiteralKind = null,
    comments: js.Array[CommentKind] = null,
    computed: js.UndefOr[Boolean] = js.undefined,
    loc: SourceLocationKind = null,
    shorthand: js.UndefOr[Boolean] = js.undefined
  ): Anon_Accessibility = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (accessibility != null) __obj.updateDynamic("accessibility")(accessibility)
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (!js.isUndefined(computed)) __obj.updateDynamic("computed")(computed)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (!js.isUndefined(shorthand)) __obj.updateDynamic("shorthand")(shorthand)
    __obj.asInstanceOf[Anon_Accessibility]
  }
}


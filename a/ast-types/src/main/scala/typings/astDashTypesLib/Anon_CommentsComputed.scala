package typings
package astDashTypesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CommentsComputed extends js.Object {
  var comments: js.UndefOr[js.Array[astDashTypesLib.genKindsMod.CommentKind] | scala.Null] = js.undefined
  var computed: js.UndefOr[scala.Boolean] = js.undefined
  var decorators: js.UndefOr[js.Array[astDashTypesLib.genKindsMod.DecoratorKind] | scala.Null] = js.undefined
  var key: astDashTypesLib.genKindsMod.LiteralKind | astDashTypesLib.genKindsMod.IdentifierKind | astDashTypesLib.genKindsMod.ExpressionKind
  var kind: astDashTypesLib.astDashTypesLibStrings.init | astDashTypesLib.astDashTypesLibStrings.get | astDashTypesLib.astDashTypesLibStrings.set
  var loc: js.UndefOr[astDashTypesLib.genKindsMod.SourceLocationKind | scala.Null] = js.undefined
  var method: js.UndefOr[scala.Boolean] = js.undefined
  var shorthand: js.UndefOr[scala.Boolean] = js.undefined
  var value: astDashTypesLib.genKindsMod.ExpressionKind | astDashTypesLib.genKindsMod.PatternKind
}

object Anon_CommentsComputed {
  @scala.inline
  def apply(
    key: astDashTypesLib.genKindsMod.LiteralKind | astDashTypesLib.genKindsMod.IdentifierKind | astDashTypesLib.genKindsMod.ExpressionKind,
    kind: astDashTypesLib.astDashTypesLibStrings.init | astDashTypesLib.astDashTypesLibStrings.get | astDashTypesLib.astDashTypesLibStrings.set,
    value: astDashTypesLib.genKindsMod.ExpressionKind | astDashTypesLib.genKindsMod.PatternKind,
    comments: js.Array[astDashTypesLib.genKindsMod.CommentKind] = null,
    computed: js.UndefOr[scala.Boolean] = js.undefined,
    decorators: js.Array[astDashTypesLib.genKindsMod.DecoratorKind] = null,
    loc: astDashTypesLib.genKindsMod.SourceLocationKind = null,
    method: js.UndefOr[scala.Boolean] = js.undefined,
    shorthand: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_CommentsComputed = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (!js.isUndefined(computed)) __obj.updateDynamic("computed")(computed)
    if (decorators != null) __obj.updateDynamic("decorators")(decorators)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (!js.isUndefined(method)) __obj.updateDynamic("method")(method)
    if (!js.isUndefined(shorthand)) __obj.updateDynamic("shorthand")(shorthand)
    __obj.asInstanceOf[Anon_CommentsComputed]
  }
}


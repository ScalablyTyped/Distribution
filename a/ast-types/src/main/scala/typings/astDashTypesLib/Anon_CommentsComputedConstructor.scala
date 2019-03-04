package typings
package astDashTypesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CommentsComputedConstructor extends js.Object {
  var comments: js.UndefOr[js.Array[astDashTypesLib.genKindsMod.CommentKind] | scala.Null] = js.undefined
  var computed: js.UndefOr[scala.Boolean] = js.undefined
  var decorators: js.UndefOr[js.Array[astDashTypesLib.genKindsMod.DecoratorKind] | scala.Null] = js.undefined
  var key: astDashTypesLib.genKindsMod.ExpressionKind
  var kind: astDashTypesLib.astDashTypesLibStrings.constructor | astDashTypesLib.astDashTypesLibStrings.method | astDashTypesLib.astDashTypesLibStrings.get | astDashTypesLib.astDashTypesLibStrings.set
  var loc: js.UndefOr[astDashTypesLib.genKindsMod.SourceLocationKind | scala.Null] = js.undefined
  var static: js.UndefOr[scala.Boolean] = js.undefined
  var value: astDashTypesLib.genKindsMod.FunctionKind
}

object Anon_CommentsComputedConstructor {
  @scala.inline
  def apply(
    key: astDashTypesLib.genKindsMod.ExpressionKind,
    kind: astDashTypesLib.astDashTypesLibStrings.constructor | astDashTypesLib.astDashTypesLibStrings.method | astDashTypesLib.astDashTypesLibStrings.get | astDashTypesLib.astDashTypesLibStrings.set,
    value: astDashTypesLib.genKindsMod.FunctionKind,
    comments: js.Array[astDashTypesLib.genKindsMod.CommentKind] = null,
    computed: js.UndefOr[scala.Boolean] = js.undefined,
    decorators: js.Array[astDashTypesLib.genKindsMod.DecoratorKind] = null,
    loc: astDashTypesLib.genKindsMod.SourceLocationKind = null,
    static: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_CommentsComputedConstructor = {
    val __obj = js.Dynamic.literal(key = key, kind = kind.asInstanceOf[js.Any], value = value)
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (!js.isUndefined(computed)) __obj.updateDynamic("computed")(computed)
    if (decorators != null) __obj.updateDynamic("decorators")(decorators)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (!js.isUndefined(static)) __obj.updateDynamic("static")(static)
    __obj.asInstanceOf[Anon_CommentsComputedConstructor]
  }
}


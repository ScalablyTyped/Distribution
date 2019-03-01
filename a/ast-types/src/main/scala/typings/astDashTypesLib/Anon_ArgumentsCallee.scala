package typings
package astDashTypesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ArgumentsCallee extends js.Object {
  var arguments: js.Array[
    astDashTypesLib.genKindsMod.ExpressionKind | astDashTypesLib.genKindsMod.SpreadElementKind
  ]
  var callee: astDashTypesLib.genKindsMod.ExpressionKind
  var comments: js.UndefOr[js.Array[astDashTypesLib.genKindsMod.CommentKind] | scala.Null] = js.undefined
  var loc: js.UndefOr[astDashTypesLib.genKindsMod.SourceLocationKind | scala.Null] = js.undefined
  var optional: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_ArgumentsCallee {
  @scala.inline
  def apply(
    arguments: js.Array[
      astDashTypesLib.genKindsMod.ExpressionKind | astDashTypesLib.genKindsMod.SpreadElementKind
    ],
    callee: astDashTypesLib.genKindsMod.ExpressionKind,
    comments: js.Array[astDashTypesLib.genKindsMod.CommentKind] = null,
    loc: astDashTypesLib.genKindsMod.SourceLocationKind = null,
    optional: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_ArgumentsCallee = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("arguments")(arguments)
    __obj.updateDynamic("callee")(callee)
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (!js.isUndefined(optional)) __obj.updateDynamic("optional")(optional)
    __obj.asInstanceOf[Anon_ArgumentsCallee]
  }
}


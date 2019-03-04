package typings
package astDashTypesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Arguments extends js.Object {
  var arguments: js.Array[
    astDashTypesLib.genKindsMod.ExpressionKind | astDashTypesLib.genKindsMod.SpreadElementKind
  ]
  var callee: astDashTypesLib.genKindsMod.ExpressionKind
  var comments: js.UndefOr[js.Array[astDashTypesLib.genKindsMod.CommentKind] | scala.Null] = js.undefined
  var loc: js.UndefOr[astDashTypesLib.genKindsMod.SourceLocationKind | scala.Null] = js.undefined
}

object Anon_Arguments {
  @scala.inline
  def apply(
    arguments: js.Array[
      astDashTypesLib.genKindsMod.ExpressionKind | astDashTypesLib.genKindsMod.SpreadElementKind
    ],
    callee: astDashTypesLib.genKindsMod.ExpressionKind,
    comments: js.Array[astDashTypesLib.genKindsMod.CommentKind] = null,
    loc: astDashTypesLib.genKindsMod.SourceLocationKind = null
  ): Anon_Arguments = {
    val __obj = js.Dynamic.literal(arguments = arguments, callee = callee)
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[Anon_Arguments]
  }
}


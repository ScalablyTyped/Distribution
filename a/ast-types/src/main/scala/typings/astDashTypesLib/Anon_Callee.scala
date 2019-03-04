package typings
package astDashTypesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Callee extends js.Object {
  var callee: astDashTypesLib.genKindsMod.ExpressionKind
  var comments: js.UndefOr[js.Array[astDashTypesLib.genKindsMod.CommentKind] | scala.Null] = js.undefined
  var loc: js.UndefOr[astDashTypesLib.genKindsMod.SourceLocationKind | scala.Null] = js.undefined
  var `object`: astDashTypesLib.genKindsMod.ExpressionKind | scala.Null
}

object Anon_Callee {
  @scala.inline
  def apply(
    callee: astDashTypesLib.genKindsMod.ExpressionKind,
    comments: js.Array[astDashTypesLib.genKindsMod.CommentKind] = null,
    loc: astDashTypesLib.genKindsMod.SourceLocationKind = null,
    `object`: astDashTypesLib.genKindsMod.ExpressionKind = null
  ): Anon_Callee = {
    val __obj = js.Dynamic.literal(callee = callee)
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (`object` != null) __obj.updateDynamic("object")(`object`)
    __obj.asInstanceOf[Anon_Callee]
  }
}


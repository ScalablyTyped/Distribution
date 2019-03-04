package typings
package astDashTypesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cases extends js.Object {
  var cases: js.Array[astDashTypesLib.genKindsMod.SwitchCaseKind]
  var comments: js.UndefOr[js.Array[astDashTypesLib.genKindsMod.CommentKind] | scala.Null] = js.undefined
  var discriminant: astDashTypesLib.genKindsMod.ExpressionKind
  var lexical: js.UndefOr[scala.Boolean] = js.undefined
  var loc: js.UndefOr[astDashTypesLib.genKindsMod.SourceLocationKind | scala.Null] = js.undefined
}

object Anon_Cases {
  @scala.inline
  def apply(
    cases: js.Array[astDashTypesLib.genKindsMod.SwitchCaseKind],
    discriminant: astDashTypesLib.genKindsMod.ExpressionKind,
    comments: js.Array[astDashTypesLib.genKindsMod.CommentKind] = null,
    lexical: js.UndefOr[scala.Boolean] = js.undefined,
    loc: astDashTypesLib.genKindsMod.SourceLocationKind = null
  ): Anon_Cases = {
    val __obj = js.Dynamic.literal(cases = cases, discriminant = discriminant)
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (!js.isUndefined(lexical)) __obj.updateDynamic("lexical")(lexical)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[Anon_Cases]
  }
}


package typings
package astDashTypesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Alternate extends js.Object {
  var alternate: js.UndefOr[astDashTypesLib.genKindsMod.StatementKind | scala.Null] = js.undefined
  var comments: js.UndefOr[js.Array[astDashTypesLib.genKindsMod.CommentKind] | scala.Null] = js.undefined
  var consequent: astDashTypesLib.genKindsMod.StatementKind
  var loc: js.UndefOr[astDashTypesLib.genKindsMod.SourceLocationKind | scala.Null] = js.undefined
  var test: astDashTypesLib.genKindsMod.ExpressionKind
}

object Anon_Alternate {
  @scala.inline
  def apply(
    consequent: astDashTypesLib.genKindsMod.StatementKind,
    test: astDashTypesLib.genKindsMod.ExpressionKind,
    alternate: astDashTypesLib.genKindsMod.StatementKind = null,
    comments: js.Array[astDashTypesLib.genKindsMod.CommentKind] = null,
    loc: astDashTypesLib.genKindsMod.SourceLocationKind = null
  ): Anon_Alternate = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("consequent")(consequent)
    __obj.updateDynamic("test")(test)
    if (alternate != null) __obj.updateDynamic("alternate")(alternate)
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[Anon_Alternate]
  }
}


package typings
package astDashTypesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AlternateComments extends js.Object {
  var alternate: astDashTypesLib.genKindsMod.ExpressionKind
  var comments: js.UndefOr[js.Array[astDashTypesLib.genKindsMod.CommentKind] | scala.Null] = js.undefined
  var consequent: astDashTypesLib.genKindsMod.ExpressionKind
  var loc: js.UndefOr[astDashTypesLib.genKindsMod.SourceLocationKind | scala.Null] = js.undefined
  var test: astDashTypesLib.genKindsMod.ExpressionKind
}

object Anon_AlternateComments {
  @scala.inline
  def apply(
    alternate: astDashTypesLib.genKindsMod.ExpressionKind,
    consequent: astDashTypesLib.genKindsMod.ExpressionKind,
    test: astDashTypesLib.genKindsMod.ExpressionKind,
    comments: js.Array[astDashTypesLib.genKindsMod.CommentKind] = null,
    loc: astDashTypesLib.genKindsMod.SourceLocationKind = null
  ): Anon_AlternateComments = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("alternate")(alternate)
    __obj.updateDynamic("consequent")(consequent)
    __obj.updateDynamic("test")(test)
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[Anon_AlternateComments]
  }
}


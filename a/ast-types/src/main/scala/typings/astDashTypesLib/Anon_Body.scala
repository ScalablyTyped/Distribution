package typings
package astDashTypesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Body extends js.Object {
  var body: js.Array[astDashTypesLib.genKindsMod.StatementKind]
  var comments: js.UndefOr[js.Array[astDashTypesLib.genKindsMod.CommentKind] | scala.Null] = js.undefined
  var directives: js.UndefOr[js.Array[astDashTypesLib.genKindsMod.DirectiveKind]] = js.undefined
  var interpreter: js.UndefOr[astDashTypesLib.genKindsMod.InterpreterDirectiveKind | scala.Null] = js.undefined
  var loc: js.UndefOr[astDashTypesLib.genKindsMod.SourceLocationKind | scala.Null] = js.undefined
}

object Anon_Body {
  @scala.inline
  def apply(
    body: js.Array[astDashTypesLib.genKindsMod.StatementKind],
    comments: js.Array[astDashTypesLib.genKindsMod.CommentKind] = null,
    directives: js.Array[astDashTypesLib.genKindsMod.DirectiveKind] = null,
    interpreter: astDashTypesLib.genKindsMod.InterpreterDirectiveKind = null,
    loc: astDashTypesLib.genKindsMod.SourceLocationKind = null
  ): Anon_Body = {
    val __obj = js.Dynamic.literal(body = body)
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (directives != null) __obj.updateDynamic("directives")(directives)
    if (interpreter != null) __obj.updateDynamic("interpreter")(interpreter)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[Anon_Body]
  }
}


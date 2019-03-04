package typings
package astDashTypesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BodyComments extends js.Object {
  var body: js.Array[astDashTypesLib.genKindsMod.StatementKind]
  var comments: js.UndefOr[js.Array[astDashTypesLib.genKindsMod.CommentKind] | scala.Null] = js.undefined
  var directives: js.UndefOr[js.Array[astDashTypesLib.genKindsMod.DirectiveKind]] = js.undefined
  var loc: js.UndefOr[astDashTypesLib.genKindsMod.SourceLocationKind | scala.Null] = js.undefined
}

object Anon_BodyComments {
  @scala.inline
  def apply(
    body: js.Array[astDashTypesLib.genKindsMod.StatementKind],
    comments: js.Array[astDashTypesLib.genKindsMod.CommentKind] = null,
    directives: js.Array[astDashTypesLib.genKindsMod.DirectiveKind] = null,
    loc: astDashTypesLib.genKindsMod.SourceLocationKind = null
  ): Anon_BodyComments = {
    val __obj = js.Dynamic.literal(body = body)
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (directives != null) __obj.updateDynamic("directives")(directives)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[Anon_BodyComments]
  }
}


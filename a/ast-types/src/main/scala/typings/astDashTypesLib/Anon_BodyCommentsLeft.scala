package typings
package astDashTypesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BodyCommentsLeft extends js.Object {
  var body: astDashTypesLib.genKindsMod.StatementKind
  var comments: js.UndefOr[js.Array[astDashTypesLib.genKindsMod.CommentKind] | scala.Null] = js.undefined
  var left: astDashTypesLib.genKindsMod.VariableDeclarationKind | astDashTypesLib.genKindsMod.ExpressionKind
  var loc: js.UndefOr[astDashTypesLib.genKindsMod.SourceLocationKind | scala.Null] = js.undefined
  var right: astDashTypesLib.genKindsMod.ExpressionKind
}

object Anon_BodyCommentsLeft {
  @scala.inline
  def apply(
    body: astDashTypesLib.genKindsMod.StatementKind,
    left: astDashTypesLib.genKindsMod.VariableDeclarationKind | astDashTypesLib.genKindsMod.ExpressionKind,
    right: astDashTypesLib.genKindsMod.ExpressionKind,
    comments: js.Array[astDashTypesLib.genKindsMod.CommentKind] = null,
    loc: astDashTypesLib.genKindsMod.SourceLocationKind = null
  ): Anon_BodyCommentsLeft = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("body")(body)
    __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    __obj.updateDynamic("right")(right)
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[Anon_BodyCommentsLeft]
  }
}


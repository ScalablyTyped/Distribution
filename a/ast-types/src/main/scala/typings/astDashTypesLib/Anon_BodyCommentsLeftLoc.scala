package typings
package astDashTypesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BodyCommentsLeftLoc extends js.Object {
  var body: astDashTypesLib.genKindsMod.StatementKind
  var comments: js.UndefOr[js.Array[astDashTypesLib.genKindsMod.CommentKind] | scala.Null] = js.undefined
  var left: astDashTypesLib.genKindsMod.VariableDeclarationKind | astDashTypesLib.genKindsMod.PatternKind
  var loc: js.UndefOr[astDashTypesLib.genKindsMod.SourceLocationKind | scala.Null] = js.undefined
  var right: astDashTypesLib.genKindsMod.ExpressionKind
}

object Anon_BodyCommentsLeftLoc {
  @scala.inline
  def apply(
    body: astDashTypesLib.genKindsMod.StatementKind,
    left: astDashTypesLib.genKindsMod.VariableDeclarationKind | astDashTypesLib.genKindsMod.PatternKind,
    right: astDashTypesLib.genKindsMod.ExpressionKind,
    comments: js.Array[astDashTypesLib.genKindsMod.CommentKind] = null,
    loc: astDashTypesLib.genKindsMod.SourceLocationKind = null
  ): Anon_BodyCommentsLeftLoc = {
    val __obj = js.Dynamic.literal(body = body, left = left.asInstanceOf[js.Any], right = right)
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[Anon_BodyCommentsLeftLoc]
  }
}


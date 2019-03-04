package typings
package astDashTypesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BodyCommentsInit extends js.Object {
  var body: astDashTypesLib.genKindsMod.StatementKind
  var comments: js.UndefOr[js.Array[astDashTypesLib.genKindsMod.CommentKind] | scala.Null] = js.undefined
  var init: astDashTypesLib.genKindsMod.VariableDeclarationKind | astDashTypesLib.genKindsMod.ExpressionKind | scala.Null
  var loc: js.UndefOr[astDashTypesLib.genKindsMod.SourceLocationKind | scala.Null] = js.undefined
  var test: astDashTypesLib.genKindsMod.ExpressionKind | scala.Null
  var update: astDashTypesLib.genKindsMod.ExpressionKind | scala.Null
}

object Anon_BodyCommentsInit {
  @scala.inline
  def apply(
    body: astDashTypesLib.genKindsMod.StatementKind,
    comments: js.Array[astDashTypesLib.genKindsMod.CommentKind] = null,
    init: astDashTypesLib.genKindsMod.VariableDeclarationKind | astDashTypesLib.genKindsMod.ExpressionKind = null,
    loc: astDashTypesLib.genKindsMod.SourceLocationKind = null,
    test: astDashTypesLib.genKindsMod.ExpressionKind = null,
    update: astDashTypesLib.genKindsMod.ExpressionKind = null
  ): Anon_BodyCommentsInit = {
    val __obj = js.Dynamic.literal(body = body)
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (init != null) __obj.updateDynamic("init")(init.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (test != null) __obj.updateDynamic("test")(test)
    if (update != null) __obj.updateDynamic("update")(update)
    __obj.asInstanceOf[Anon_BodyCommentsInit]
  }
}


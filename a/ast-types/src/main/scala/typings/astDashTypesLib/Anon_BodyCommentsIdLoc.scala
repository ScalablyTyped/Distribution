package typings
package astDashTypesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BodyCommentsIdLoc extends js.Object {
  var body: astDashTypesLib.genKindsMod.BlockStatementKind
  var comments: js.UndefOr[js.Array[astDashTypesLib.genKindsMod.CommentKind] | scala.Null] = js.undefined
  var id: astDashTypesLib.genKindsMod.IdentifierKind | astDashTypesLib.genKindsMod.LiteralKind
  var loc: js.UndefOr[astDashTypesLib.genKindsMod.SourceLocationKind | scala.Null] = js.undefined
}

object Anon_BodyCommentsIdLoc {
  @scala.inline
  def apply(
    body: astDashTypesLib.genKindsMod.BlockStatementKind,
    id: astDashTypesLib.genKindsMod.IdentifierKind | astDashTypesLib.genKindsMod.LiteralKind,
    comments: js.Array[astDashTypesLib.genKindsMod.CommentKind] = null,
    loc: astDashTypesLib.genKindsMod.SourceLocationKind = null
  ): Anon_BodyCommentsIdLoc = {
    val __obj = js.Dynamic.literal(body = body, id = id.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[Anon_BodyCommentsIdLoc]
  }
}


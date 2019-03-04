package typings
package astDashTypesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CommentsIdInitializer extends js.Object {
  var comments: js.UndefOr[js.Array[astDashTypesLib.genKindsMod.CommentKind] | scala.Null] = js.undefined
  var id: astDashTypesLib.genKindsMod.IdentifierKind | astDashTypesLib.genKindsMod.StringLiteralKind
  var initializer: js.UndefOr[astDashTypesLib.genKindsMod.ExpressionKind | scala.Null] = js.undefined
  var loc: js.UndefOr[astDashTypesLib.genKindsMod.SourceLocationKind | scala.Null] = js.undefined
}

object Anon_CommentsIdInitializer {
  @scala.inline
  def apply(
    id: astDashTypesLib.genKindsMod.IdentifierKind | astDashTypesLib.genKindsMod.StringLiteralKind,
    comments: js.Array[astDashTypesLib.genKindsMod.CommentKind] = null,
    initializer: astDashTypesLib.genKindsMod.ExpressionKind = null,
    loc: astDashTypesLib.genKindsMod.SourceLocationKind = null
  ): Anon_CommentsIdInitializer = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (initializer != null) __obj.updateDynamic("initializer")(initializer)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[Anon_CommentsIdInitializer]
  }
}


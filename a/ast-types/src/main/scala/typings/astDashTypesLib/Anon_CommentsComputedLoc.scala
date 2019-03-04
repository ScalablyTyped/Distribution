package typings
package astDashTypesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CommentsComputedLoc extends js.Object {
  var comments: js.UndefOr[js.Array[astDashTypesLib.genKindsMod.CommentKind] | scala.Null] = js.undefined
  var computed: js.UndefOr[scala.Boolean] = js.undefined
  var loc: js.UndefOr[astDashTypesLib.genKindsMod.SourceLocationKind | scala.Null] = js.undefined
  var `object`: astDashTypesLib.genKindsMod.ExpressionKind
  var property: astDashTypesLib.genKindsMod.IdentifierKind | astDashTypesLib.genKindsMod.ExpressionKind
}

object Anon_CommentsComputedLoc {
  @scala.inline
  def apply(
    `object`: astDashTypesLib.genKindsMod.ExpressionKind,
    property: astDashTypesLib.genKindsMod.IdentifierKind | astDashTypesLib.genKindsMod.ExpressionKind,
    comments: js.Array[astDashTypesLib.genKindsMod.CommentKind] = null,
    computed: js.UndefOr[scala.Boolean] = js.undefined,
    loc: astDashTypesLib.genKindsMod.SourceLocationKind = null
  ): Anon_CommentsComputedLoc = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`)
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (!js.isUndefined(computed)) __obj.updateDynamic("computed")(computed)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[Anon_CommentsComputedLoc]
  }
}


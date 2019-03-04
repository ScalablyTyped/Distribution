package typings
package astDashTypesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CommentsComputedLocObject extends js.Object {
  var comments: js.UndefOr[js.Array[astDashTypesLib.genKindsMod.CommentKind] | scala.Null] = js.undefined
  var computed: js.UndefOr[scala.Boolean] = js.undefined
  var loc: js.UndefOr[astDashTypesLib.genKindsMod.SourceLocationKind | scala.Null] = js.undefined
  var `object`: astDashTypesLib.genKindsMod.JSXIdentifierKind | astDashTypesLib.genKindsMod.JSXMemberExpressionKind
  var property: astDashTypesLib.genKindsMod.JSXIdentifierKind
}

object Anon_CommentsComputedLocObject {
  @scala.inline
  def apply(
    `object`: astDashTypesLib.genKindsMod.JSXIdentifierKind | astDashTypesLib.genKindsMod.JSXMemberExpressionKind,
    property: astDashTypesLib.genKindsMod.JSXIdentifierKind,
    comments: js.Array[astDashTypesLib.genKindsMod.CommentKind] = null,
    computed: js.UndefOr[scala.Boolean] = js.undefined,
    loc: astDashTypesLib.genKindsMod.SourceLocationKind = null
  ): Anon_CommentsComputedLocObject = {
    val __obj = js.Dynamic.literal(property = property)
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (!js.isUndefined(computed)) __obj.updateDynamic("computed")(computed)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[Anon_CommentsComputedLocObject]
  }
}


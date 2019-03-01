package typings
package astDashTypesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CommentsKey extends js.Object {
  var comments: js.UndefOr[js.Array[astDashTypesLib.genKindsMod.CommentKind] | scala.Null] = js.undefined
  var key: astDashTypesLib.genKindsMod.LiteralKind | astDashTypesLib.genKindsMod.IdentifierKind
  var loc: js.UndefOr[astDashTypesLib.genKindsMod.SourceLocationKind | scala.Null] = js.undefined
  var optional: scala.Boolean
  var value: astDashTypesLib.genKindsMod.FlowTypeKind
  var variance: js.UndefOr[
    astDashTypesLib.genKindsMod.VarianceKind | astDashTypesLib.astDashTypesLibStrings.plus | astDashTypesLib.astDashTypesLibStrings.minus | scala.Null
  ] = js.undefined
}

object Anon_CommentsKey {
  @scala.inline
  def apply(
    key: astDashTypesLib.genKindsMod.LiteralKind | astDashTypesLib.genKindsMod.IdentifierKind,
    optional: scala.Boolean,
    value: astDashTypesLib.genKindsMod.FlowTypeKind,
    comments: js.Array[astDashTypesLib.genKindsMod.CommentKind] = null,
    loc: astDashTypesLib.genKindsMod.SourceLocationKind = null,
    variance: astDashTypesLib.genKindsMod.VarianceKind | astDashTypesLib.astDashTypesLibStrings.plus | astDashTypesLib.astDashTypesLibStrings.minus = null
  ): Anon_CommentsKey = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    __obj.updateDynamic("optional")(optional)
    __obj.updateDynamic("value")(value)
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (variance != null) __obj.updateDynamic("variance")(variance.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CommentsKey]
  }
}


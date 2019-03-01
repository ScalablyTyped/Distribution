package typings
package astDashTypesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CommentsLocQuasi extends js.Object {
  var comments: js.UndefOr[js.Array[astDashTypesLib.genKindsMod.CommentKind] | scala.Null] = js.undefined
  var loc: js.UndefOr[astDashTypesLib.genKindsMod.SourceLocationKind | scala.Null] = js.undefined
  var quasi: astDashTypesLib.genKindsMod.TemplateLiteralKind
  var tag: astDashTypesLib.genKindsMod.ExpressionKind
}

object Anon_CommentsLocQuasi {
  @scala.inline
  def apply(
    quasi: astDashTypesLib.genKindsMod.TemplateLiteralKind,
    tag: astDashTypesLib.genKindsMod.ExpressionKind,
    comments: js.Array[astDashTypesLib.genKindsMod.CommentKind] = null,
    loc: astDashTypesLib.genKindsMod.SourceLocationKind = null
  ): Anon_CommentsLocQuasi = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("quasi")(quasi)
    __obj.updateDynamic("tag")(tag)
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[Anon_CommentsLocQuasi]
  }
}


package typings
package astDashTypesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CommentsId extends js.Object {
  var comments: js.UndefOr[js.Array[astDashTypesLib.genKindsMod.CommentKind] | scala.Null] = js.undefined
  var id: astDashTypesLib.genKindsMod.PatternKind
  var init: js.UndefOr[astDashTypesLib.genKindsMod.ExpressionKind | scala.Null] = js.undefined
  var loc: js.UndefOr[astDashTypesLib.genKindsMod.SourceLocationKind | scala.Null] = js.undefined
}

object Anon_CommentsId {
  @scala.inline
  def apply(
    id: astDashTypesLib.genKindsMod.PatternKind,
    comments: js.Array[astDashTypesLib.genKindsMod.CommentKind] = null,
    init: astDashTypesLib.genKindsMod.ExpressionKind = null,
    loc: astDashTypesLib.genKindsMod.SourceLocationKind = null
  ): Anon_CommentsId = {
    val __obj = js.Dynamic.literal(id = id)
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (init != null) __obj.updateDynamic("init")(init)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[Anon_CommentsId]
  }
}


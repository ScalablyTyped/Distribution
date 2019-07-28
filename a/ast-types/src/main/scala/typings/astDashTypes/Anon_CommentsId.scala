package typings.astDashTypes

import typings.astDashTypes.genKindsMod.CommentKind
import typings.astDashTypes.genKindsMod.ExpressionKind
import typings.astDashTypes.genKindsMod.PatternKind
import typings.astDashTypes.genKindsMod.SourceLocationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CommentsId extends js.Object {
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  var id: PatternKind
  var init: js.UndefOr[ExpressionKind | Null] = js.undefined
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
}

object Anon_CommentsId {
  @scala.inline
  def apply(
    id: PatternKind,
    comments: js.Array[CommentKind] = null,
    init: ExpressionKind = null,
    loc: SourceLocationKind = null
  ): Anon_CommentsId = {
    val __obj = js.Dynamic.literal(id = id)
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (init != null) __obj.updateDynamic("init")(init)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[Anon_CommentsId]
  }
}


package typings.astDashTypes

import typings.astDashTypes.genKindsMod.CommentKind
import typings.astDashTypes.genKindsMod.ComprehensionBlockKind
import typings.astDashTypes.genKindsMod.ExpressionKind
import typings.astDashTypes.genKindsMod.SourceLocationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Blocks extends js.Object {
  var blocks: js.Array[ComprehensionBlockKind]
  var body: ExpressionKind
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  var filter: ExpressionKind | Null
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
}

object Anon_Blocks {
  @scala.inline
  def apply(
    blocks: js.Array[ComprehensionBlockKind],
    body: ExpressionKind,
    comments: js.Array[CommentKind] = null,
    filter: ExpressionKind = null,
    loc: SourceLocationKind = null
  ): Anon_Blocks = {
    val __obj = js.Dynamic.literal(blocks = blocks, body = body)
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[Anon_Blocks]
  }
}


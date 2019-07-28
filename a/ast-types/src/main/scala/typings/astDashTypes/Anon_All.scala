package typings.astDashTypes

import typings.astDashTypes.genKindsMod.CommentKind
import typings.astDashTypes.genKindsMod.ExpressionKind
import typings.astDashTypes.genKindsMod.SourceLocationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_All extends js.Object {
  var all: js.UndefOr[Boolean] = js.undefined
  var argument: ExpressionKind | Null
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
}

object Anon_All {
  @scala.inline
  def apply(
    all: js.UndefOr[Boolean] = js.undefined,
    argument: ExpressionKind = null,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): Anon_All = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(all)) __obj.updateDynamic("all")(all)
    if (argument != null) __obj.updateDynamic("argument")(argument)
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[Anon_All]
  }
}


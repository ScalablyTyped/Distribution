package typings.astDashTypes

import typings.astDashTypes.genKindsMod.CommentKind
import typings.astDashTypes.genKindsMod.ExpressionKind
import typings.astDashTypes.genKindsMod.IdentifierKind
import typings.astDashTypes.genKindsMod.LiteralKind
import typings.astDashTypes.genKindsMod.PatternKind
import typings.astDashTypes.genKindsMod.SourceLocationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CommentsComputedKey extends js.Object {
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  var computed: js.UndefOr[Boolean] = js.undefined
  var key: LiteralKind | IdentifierKind | ExpressionKind
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  var pattern: PatternKind
}

object Anon_CommentsComputedKey {
  @scala.inline
  def apply(
    key: LiteralKind | IdentifierKind | ExpressionKind,
    pattern: PatternKind,
    comments: js.Array[CommentKind] = null,
    computed: js.UndefOr[Boolean] = js.undefined,
    loc: SourceLocationKind = null
  ): Anon_CommentsComputedKey = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], pattern = pattern)
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (!js.isUndefined(computed)) __obj.updateDynamic("computed")(computed)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[Anon_CommentsComputedKey]
  }
}


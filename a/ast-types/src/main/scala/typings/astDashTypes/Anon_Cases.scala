package typings.astDashTypes

import typings.astDashTypes.genKindsMod.CommentKind
import typings.astDashTypes.genKindsMod.ExpressionKind
import typings.astDashTypes.genKindsMod.SourceLocationKind
import typings.astDashTypes.genKindsMod.SwitchCaseKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cases extends js.Object {
  var cases: js.Array[SwitchCaseKind]
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  var discriminant: ExpressionKind
  var lexical: js.UndefOr[Boolean] = js.undefined
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
}

object Anon_Cases {
  @scala.inline
  def apply(
    cases: js.Array[SwitchCaseKind],
    discriminant: ExpressionKind,
    comments: js.Array[CommentKind] = null,
    lexical: js.UndefOr[Boolean] = js.undefined,
    loc: SourceLocationKind = null
  ): Anon_Cases = {
    val __obj = js.Dynamic.literal(cases = cases.asInstanceOf[js.Any], discriminant = discriminant.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (!js.isUndefined(lexical)) __obj.updateDynamic("lexical")(lexical.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Cases]
  }
}


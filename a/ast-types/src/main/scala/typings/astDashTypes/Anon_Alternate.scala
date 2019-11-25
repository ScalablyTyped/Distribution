package typings.astDashTypes

import typings.astDashTypes.genKindsMod.CommentKind
import typings.astDashTypes.genKindsMod.ExpressionKind
import typings.astDashTypes.genKindsMod.SourceLocationKind
import typings.astDashTypes.genKindsMod.StatementKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Alternate extends js.Object {
  var alternate: js.UndefOr[StatementKind | Null] = js.undefined
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  var consequent: StatementKind
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  var test: ExpressionKind
}

object Anon_Alternate {
  @scala.inline
  def apply(
    consequent: StatementKind,
    test: ExpressionKind,
    alternate: StatementKind = null,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): Anon_Alternate = {
    val __obj = js.Dynamic.literal(consequent = consequent.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    if (alternate != null) __obj.updateDynamic("alternate")(alternate.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Alternate]
  }
}


package typings.astDashTypes

import typings.astDashTypes.genKindsMod.CommentKind
import typings.astDashTypes.genKindsMod.ExpressionKind
import typings.astDashTypes.genKindsMod.SourceLocationKind
import typings.astDashTypes.genKindsMod.StatementKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CommentsConsequent extends js.Object {
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  var consequent: js.Array[StatementKind]
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  var test: ExpressionKind | Null
}

object Anon_CommentsConsequent {
  @scala.inline
  def apply(
    consequent: js.Array[StatementKind],
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null,
    test: ExpressionKind = null
  ): Anon_CommentsConsequent = {
    val __obj = js.Dynamic.literal(consequent = consequent)
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    if (test != null) __obj.updateDynamic("test")(test)
    __obj.asInstanceOf[Anon_CommentsConsequent]
  }
}


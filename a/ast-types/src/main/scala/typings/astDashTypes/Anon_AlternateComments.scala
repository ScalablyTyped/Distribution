package typings.astDashTypes

import typings.astDashTypes.genKindsMod.CommentKind
import typings.astDashTypes.genKindsMod.ExpressionKind
import typings.astDashTypes.genKindsMod.SourceLocationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AlternateComments extends js.Object {
  var alternate: ExpressionKind
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  var consequent: ExpressionKind
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
  var test: ExpressionKind
}

object Anon_AlternateComments {
  @scala.inline
  def apply(
    alternate: ExpressionKind,
    consequent: ExpressionKind,
    test: ExpressionKind,
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): Anon_AlternateComments = {
    val __obj = js.Dynamic.literal(alternate = alternate, consequent = consequent, test = test)
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[Anon_AlternateComments]
  }
}


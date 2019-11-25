package typings.astDashTypes

import typings.astDashTypes.genKindsMod.CommentKind
import typings.astDashTypes.genKindsMod.PatternKind
import typings.astDashTypes.genKindsMod.SourceLocationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ArgumentCommentsLocArray extends js.Object {
  var argument: PatternKind
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
}

object Anon_ArgumentCommentsLocArray {
  @scala.inline
  def apply(argument: PatternKind, comments: js.Array[CommentKind] = null, loc: SourceLocationKind = null): Anon_ArgumentCommentsLocArray = {
    val __obj = js.Dynamic.literal(argument = argument.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ArgumentCommentsLocArray]
  }
}


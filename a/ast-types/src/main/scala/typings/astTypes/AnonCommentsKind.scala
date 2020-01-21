package typings.astTypes

import typings.astTypes.astTypesStrings.minus
import typings.astTypes.astTypesStrings.plus
import typings.astTypes.kindsMod.CommentKind
import typings.astTypes.kindsMod.SourceLocationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCommentsKind extends js.Object {
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  var kind: plus | minus
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
}

object AnonCommentsKind {
  @scala.inline
  def apply(kind: plus | minus, comments: js.Array[CommentKind] = null, loc: SourceLocationKind = null): AnonCommentsKind = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCommentsKind]
  }
}


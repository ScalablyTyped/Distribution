package typings.astDashTypes

import typings.astDashTypes.astDashTypesStrings.minus
import typings.astDashTypes.astDashTypesStrings.plus
import typings.astDashTypes.genKindsMod.CommentKind
import typings.astDashTypes.genKindsMod.SourceLocationKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CommentsKind extends js.Object {
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  var kind: plus | minus
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
}

object Anon_CommentsKind {
  @scala.inline
  def apply(kind: plus | minus, comments: js.Array[CommentKind] = null, loc: SourceLocationKind = null): Anon_CommentsKind = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (loc != null) __obj.updateDynamic("loc")(loc)
    __obj.asInstanceOf[Anon_CommentsKind]
  }
}


package typings.astDashTypes

import typings.astDashTypes.genKindsMod.CommentKind
import typings.astDashTypes.genKindsMod.PatternKind
import typings.astDashTypes.genKindsMod.SourceLocationKind
import typings.astDashTypes.genKindsMod.SpreadElementKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CommentsElementsLoc extends js.Object {
  var comments: js.UndefOr[js.Array[CommentKind] | Null] = js.undefined
  var elements: js.Array[PatternKind | SpreadElementKind | Null]
  var loc: js.UndefOr[SourceLocationKind | Null] = js.undefined
}

object Anon_CommentsElementsLoc {
  @scala.inline
  def apply(
    elements: js.Array[PatternKind | SpreadElementKind | Null],
    comments: js.Array[CommentKind] = null,
    loc: SourceLocationKind = null
  ): Anon_CommentsElementsLoc = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any])
    if (comments != null) __obj.updateDynamic("comments")(comments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CommentsElementsLoc]
  }
}


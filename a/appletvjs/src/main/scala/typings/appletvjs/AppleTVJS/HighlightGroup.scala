package typings.appletvjs.AppleTVJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HighlightGroup extends js.Object {
  /** The hightlights in the highlight group. */
  var hightlights: js.Array[Highlight]
  /** The name of the highlight group. */
  var name: String
}

object HighlightGroup {
  @scala.inline
  def apply(hightlights: js.Array[Highlight], name: String): HighlightGroup = {
    val __obj = js.Dynamic.literal(hightlights = hightlights.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighlightGroup]
  }
}


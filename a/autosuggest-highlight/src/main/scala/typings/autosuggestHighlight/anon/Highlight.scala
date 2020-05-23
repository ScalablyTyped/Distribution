package typings.autosuggestHighlight.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Highlight extends js.Object {
  var highlight: Boolean
  var text: String
}

object Highlight {
  @scala.inline
  def apply(highlight: Boolean, text: String): Highlight = {
    val __obj = js.Dynamic.literal(highlight = highlight.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Highlight]
  }
}


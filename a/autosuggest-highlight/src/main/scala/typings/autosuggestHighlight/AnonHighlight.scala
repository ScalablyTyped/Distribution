package typings.autosuggestHighlight

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHighlight extends js.Object {
  var highlight: Boolean
  var text: String
}

object AnonHighlight {
  @scala.inline
  def apply(highlight: Boolean, text: String): AnonHighlight = {
    val __obj = js.Dynamic.literal(highlight = highlight.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonHighlight]
  }
}


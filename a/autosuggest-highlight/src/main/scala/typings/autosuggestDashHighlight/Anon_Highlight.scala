package typings.autosuggestDashHighlight

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Highlight extends js.Object {
  var highlight: Boolean
  var text: String
}

object Anon_Highlight {
  @scala.inline
  def apply(highlight: Boolean, text: String): Anon_Highlight = {
    val __obj = js.Dynamic.literal(highlight = highlight, text = text)
  
    __obj.asInstanceOf[Anon_Highlight]
  }
}


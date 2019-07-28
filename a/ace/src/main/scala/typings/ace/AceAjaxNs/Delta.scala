package typings.ace.AceAjaxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Delta extends js.Object {
  var action: String
  var lines: js.Array[String]
  var range: Range
  var text: String
}

object Delta {
  @scala.inline
  def apply(action: String, lines: js.Array[String], range: Range, text: String): Delta = {
    val __obj = js.Dynamic.literal(action = action, lines = lines, range = range, text = text)
  
    __obj.asInstanceOf[Delta]
  }
}


package typings
package aceLib.AceAjaxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Delta extends js.Object {
  var action: java.lang.String
  var lines: js.Array[java.lang.String]
  var range: Range
  var text: java.lang.String
}

object Delta {
  @scala.inline
  def apply(action: java.lang.String, lines: js.Array[java.lang.String], range: Range, text: java.lang.String): Delta = {
    val __obj = js.Dynamic.literal(action = action, lines = lines, range = range, text = text)
  
    __obj.asInstanceOf[Delta]
  }
}


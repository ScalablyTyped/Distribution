package typings.apostrophe.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectChoice extends js.Object {
  var label: String
  var value: String
}

object SelectChoice {
  @scala.inline
  def apply(label: String, value: String): SelectChoice = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SelectChoice]
  }
}


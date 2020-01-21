package typings.alexaSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextField extends js.Object {
  var text: String
  var `type`: String
}

object TextField {
  @scala.inline
  def apply(text: String, `type`: String): TextField = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextField]
  }
}


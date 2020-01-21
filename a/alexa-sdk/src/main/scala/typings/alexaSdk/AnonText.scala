package typings.alexaSdk

import typings.alexaSdk.mod.TextContentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonText extends js.Object {
  var text: String
  var `type`: TextContentType
}

object AnonText {
  @scala.inline
  def apply(text: String, `type`: TextContentType): AnonText = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonText]
  }
}


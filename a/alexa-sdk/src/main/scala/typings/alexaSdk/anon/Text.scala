package typings.alexaSdk.anon

import typings.alexaSdk.mod.TextContentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Text extends js.Object {
  var text: String
  var `type`: TextContentType
}

object Text {
  @scala.inline
  def apply(text: String, `type`: TextContentType): Text = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Text]
  }
}


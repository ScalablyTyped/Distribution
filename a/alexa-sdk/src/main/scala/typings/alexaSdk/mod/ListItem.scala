package typings.alexaSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListItem extends js.Object {
  var image: js.UndefOr[Image] = js.undefined
  var textContent: js.UndefOr[TextContent] = js.undefined
  var token: String
}

object ListItem {
  @scala.inline
  def apply(token: String, image: Image = null, textContent: TextContent = null): ListItem = {
    val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (textContent != null) __obj.updateDynamic("textContent")(textContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListItem]
  }
}


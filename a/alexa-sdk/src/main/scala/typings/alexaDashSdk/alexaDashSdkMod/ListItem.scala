package typings.alexaDashSdk.alexaDashSdkMod

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
    val __obj = js.Dynamic.literal(token = token)
    if (image != null) __obj.updateDynamic("image")(image)
    if (textContent != null) __obj.updateDynamic("textContent")(textContent)
    __obj.asInstanceOf[ListItem]
  }
}


package typings.amapJsApi.AMap.Marker

import typings.amapJsApi.AMap.Pixel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Label extends js.Object {
  var content: js.UndefOr[String] = js.undefined
  var direction: js.UndefOr[LabelDirection] = js.undefined
  var offset: js.UndefOr[Pixel] = js.undefined
}

object Label {
  @scala.inline
  def apply(content: String = null, direction: LabelDirection = null, offset: Pixel = null): Label = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[Label]
  }
}


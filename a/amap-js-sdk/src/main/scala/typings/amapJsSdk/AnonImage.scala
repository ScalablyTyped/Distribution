package typings.amapJsSdk

import typings.amapJsSdk.AMap.Pixel
import typings.amapJsSdk.AMap.Size
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonImage extends js.Object {
  var image: js.UndefOr[String] = js.undefined
  var imageOffset: js.UndefOr[Pixel] = js.undefined
  var imageSize: js.UndefOr[Size] = js.undefined
  var size: js.UndefOr[Size] = js.undefined
}

object AnonImage {
  @scala.inline
  def apply(image: String = null, imageOffset: Pixel = null, imageSize: Size = null, size: Size = null): AnonImage = {
    val __obj = js.Dynamic.literal()
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (imageOffset != null) __obj.updateDynamic("imageOffset")(imageOffset.asInstanceOf[js.Any])
    if (imageSize != null) __obj.updateDynamic("imageSize")(imageSize.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonImage]
  }
}


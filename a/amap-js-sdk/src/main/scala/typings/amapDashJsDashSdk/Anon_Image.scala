package typings.amapDashJsDashSdk

import typings.amapDashJsDashSdk.AMapNs.Pixel
import typings.amapDashJsDashSdk.AMapNs.Size
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Image extends js.Object {
  var image: js.UndefOr[String] = js.undefined
  var imageOffset: js.UndefOr[Pixel] = js.undefined
  var imageSize: js.UndefOr[Size] = js.undefined
  var size: js.UndefOr[Size] = js.undefined
}

object Anon_Image {
  @scala.inline
  def apply(image: String = null, imageOffset: Pixel = null, imageSize: Size = null, size: Size = null): Anon_Image = {
    val __obj = js.Dynamic.literal()
    if (image != null) __obj.updateDynamic("image")(image)
    if (imageOffset != null) __obj.updateDynamic("imageOffset")(imageOffset)
    if (imageSize != null) __obj.updateDynamic("imageSize")(imageSize)
    if (size != null) __obj.updateDynamic("size")(size)
    __obj.asInstanceOf[Anon_Image]
  }
}


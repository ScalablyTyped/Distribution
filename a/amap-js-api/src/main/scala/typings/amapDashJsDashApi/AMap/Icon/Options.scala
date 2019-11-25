package typings.amapDashJsDashApi.AMap.Icon

import typings.amapDashJsDashApi.AMap.Pixel
import typings.amapDashJsDashApi.AMap.SizeValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * 图标的取图地址
    */
  var image: js.UndefOr[String] = js.undefined
  /**
    * 图标取图偏移量
    */
  var imageOffset: js.UndefOr[Pixel] = js.undefined
  /**
    * 图标所用图片大小
    */
  var imageSize: js.UndefOr[SizeValue] = js.undefined
  /**
    * 图标尺寸
    */
  var size: js.UndefOr[SizeValue] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    image: String = null,
    imageOffset: Pixel = null,
    imageSize: SizeValue = null,
    size: SizeValue = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (imageOffset != null) __obj.updateDynamic("imageOffset")(imageOffset.asInstanceOf[js.Any])
    if (imageSize != null) __obj.updateDynamic("imageSize")(imageSize.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}


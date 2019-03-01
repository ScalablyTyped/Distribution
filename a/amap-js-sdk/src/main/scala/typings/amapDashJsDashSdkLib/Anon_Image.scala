package typings
package amapDashJsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Image extends js.Object {
  var image: js.UndefOr[java.lang.String] = js.undefined
  var imageOffset: js.UndefOr[amapDashJsDashSdkLib.AMapNs.Pixel] = js.undefined
  var imageSize: js.UndefOr[amapDashJsDashSdkLib.AMapNs.Size] = js.undefined
  var size: js.UndefOr[amapDashJsDashSdkLib.AMapNs.Size] = js.undefined
}

object Anon_Image {
  @scala.inline
  def apply(
    image: java.lang.String = null,
    imageOffset: amapDashJsDashSdkLib.AMapNs.Pixel = null,
    imageSize: amapDashJsDashSdkLib.AMapNs.Size = null,
    size: amapDashJsDashSdkLib.AMapNs.Size = null
  ): Anon_Image = {
    val __obj = js.Dynamic.literal()
    if (image != null) __obj.updateDynamic("image")(image)
    if (imageOffset != null) __obj.updateDynamic("imageOffset")(imageOffset)
    if (imageSize != null) __obj.updateDynamic("imageSize")(imageSize)
    if (size != null) __obj.updateDynamic("size")(size)
    __obj.asInstanceOf[Anon_Image]
  }
}


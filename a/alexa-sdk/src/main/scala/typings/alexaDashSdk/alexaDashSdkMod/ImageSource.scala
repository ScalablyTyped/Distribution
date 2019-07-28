package typings.alexaDashSdk.alexaDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageSource extends js.Object {
  var heightPixels: js.UndefOr[Double] = js.undefined
  /**
    * Recommended sizes for the following dimensions (in px):
    * 480 x 320 for X_SMALL,
    * 720 x 480 for SMALL,
    * 960 x 640 for MEDIUM,
    * 1200 x 800 for LARGE,
    * 1920 x 1280 for X_LARGE
    */
  var size: js.UndefOr[ImageSourceSize] = js.undefined
  var url: String
  var widthPixels: js.UndefOr[Double] = js.undefined
}

object ImageSource {
  @scala.inline
  def apply(
    url: String,
    heightPixels: Int | Double = null,
    size: ImageSourceSize = null,
    widthPixels: Int | Double = null
  ): ImageSource = {
    val __obj = js.Dynamic.literal(url = url)
    if (heightPixels != null) __obj.updateDynamic("heightPixels")(heightPixels.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size)
    if (widthPixels != null) __obj.updateDynamic("widthPixels")(widthPixels.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageSource]
  }
}


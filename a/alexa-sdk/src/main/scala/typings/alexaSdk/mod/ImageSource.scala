package typings.alexaSdk.mod

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
    heightPixels: js.UndefOr[Double] = js.undefined,
    size: ImageSourceSize = null,
    widthPixels: js.UndefOr[Double] = js.undefined
  ): ImageSource = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (!js.isUndefined(heightPixels)) __obj.updateDynamic("heightPixels")(heightPixels.get.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (!js.isUndefined(widthPixels)) __obj.updateDynamic("widthPixels")(widthPixels.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageSource]
  }
}


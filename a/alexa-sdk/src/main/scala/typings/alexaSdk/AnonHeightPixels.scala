package typings.alexaSdk

import typings.alexaSdk.mod.ImageSourceSize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHeightPixels extends js.Object {
  var heightPixels: js.UndefOr[Double] = js.undefined
  var size: ImageSourceSize
  var url: String
  var widthPixels: js.UndefOr[Double] = js.undefined
}

object AnonHeightPixels {
  @scala.inline
  def apply(
    size: ImageSourceSize,
    url: String,
    heightPixels: Int | Double = null,
    widthPixels: Int | Double = null
  ): AnonHeightPixels = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    if (heightPixels != null) __obj.updateDynamic("heightPixels")(heightPixels.asInstanceOf[js.Any])
    if (widthPixels != null) __obj.updateDynamic("widthPixels")(widthPixels.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHeightPixels]
  }
}


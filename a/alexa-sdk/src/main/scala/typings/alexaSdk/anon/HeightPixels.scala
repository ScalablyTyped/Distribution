package typings.alexaSdk.anon

import typings.alexaSdk.mod.ImageSourceSize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeightPixels extends js.Object {
  var heightPixels: js.UndefOr[Double] = js.undefined
  var size: ImageSourceSize
  var url: String
  var widthPixels: js.UndefOr[Double] = js.undefined
}

object HeightPixels {
  @scala.inline
  def apply(
    size: ImageSourceSize,
    url: String,
    heightPixels: js.UndefOr[Double] = js.undefined,
    widthPixels: js.UndefOr[Double] = js.undefined
  ): HeightPixels = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    if (!js.isUndefined(heightPixels)) __obj.updateDynamic("heightPixels")(heightPixels.get.asInstanceOf[js.Any])
    if (!js.isUndefined(widthPixels)) __obj.updateDynamic("widthPixels")(widthPixels.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeightPixels]
  }
}


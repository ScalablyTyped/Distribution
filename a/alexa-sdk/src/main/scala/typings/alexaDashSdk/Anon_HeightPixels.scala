package typings.alexaDashSdk

import typings.alexaDashSdk.alexaDashSdkMod.ImageSourceSize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HeightPixels extends js.Object {
  var heightPixels: js.UndefOr[Double] = js.undefined
  var size: ImageSourceSize
  var url: String
  var widthPixels: js.UndefOr[Double] = js.undefined
}

object Anon_HeightPixels {
  @scala.inline
  def apply(
    size: ImageSourceSize,
    url: String,
    heightPixels: Int | Double = null,
    widthPixels: Int | Double = null
  ): Anon_HeightPixels = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    if (heightPixels != null) __obj.updateDynamic("heightPixels")(heightPixels.asInstanceOf[js.Any])
    if (widthPixels != null) __obj.updateDynamic("widthPixels")(widthPixels.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_HeightPixels]
  }
}


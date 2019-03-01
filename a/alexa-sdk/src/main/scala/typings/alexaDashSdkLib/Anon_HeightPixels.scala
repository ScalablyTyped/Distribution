package typings
package alexaDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HeightPixels extends js.Object {
  var heightPixels: js.UndefOr[scala.Double] = js.undefined
  var size: alexaDashSdkLib.alexaDashSdkMod.ImageSourceSize
  var url: java.lang.String
  var widthPixels: js.UndefOr[scala.Double] = js.undefined
}

object Anon_HeightPixels {
  @scala.inline
  def apply(
    size: alexaDashSdkLib.alexaDashSdkMod.ImageSourceSize,
    url: java.lang.String,
    heightPixels: scala.Int | scala.Double = null,
    widthPixels: scala.Int | scala.Double = null
  ): Anon_HeightPixels = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("size")(size)
    __obj.updateDynamic("url")(url)
    if (heightPixels != null) __obj.updateDynamic("heightPixels")(heightPixels.asInstanceOf[js.Any])
    if (widthPixels != null) __obj.updateDynamic("widthPixels")(widthPixels.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_HeightPixels]
  }
}


package typings.appleDashMapkitDashJs.mapkitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TileOverlayConstructorOptions extends js.Object {
  var data: js.UndefOr[js.Object] = js.undefined
  var maximumZ: js.UndefOr[Double] = js.undefined
  var minimumZ: js.UndefOr[Double] = js.undefined
  var opacity: js.UndefOr[Double] = js.undefined
}

object TileOverlayConstructorOptions {
  @scala.inline
  def apply(
    data: js.Object = null,
    maximumZ: Int | Double = null,
    minimumZ: Int | Double = null,
    opacity: Int | Double = null
  ): TileOverlayConstructorOptions = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data)
    if (maximumZ != null) __obj.updateDynamic("maximumZ")(maximumZ.asInstanceOf[js.Any])
    if (minimumZ != null) __obj.updateDynamic("minimumZ")(minimumZ.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[TileOverlayConstructorOptions]
  }
}


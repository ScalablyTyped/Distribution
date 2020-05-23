package typings.appleMapkitJs.mapkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Attributes used when initializing a tile overlay, including minimum and
  * maximum zoom, opacity, and custom data.
  */
trait TileOverlayConstructorOptions extends js.Object {
  /**
    * Custom data used to populate the URL template.
    */
  var data: js.UndefOr[js.Object] = js.undefined
  /**
    * Maximum zoom level of the overlay.
    */
  var maximumZ: js.UndefOr[Double] = js.undefined
  /**
    * Minimum zoom level of the overlay.
    */
  var minimumZ: js.UndefOr[Double] = js.undefined
  /**
    * Opacity level of the overlay.
    */
  var opacity: js.UndefOr[Double] = js.undefined
}

object TileOverlayConstructorOptions {
  @scala.inline
  def apply(
    data: js.Object = null,
    maximumZ: js.UndefOr[Double] = js.undefined,
    minimumZ: js.UndefOr[Double] = js.undefined,
    opacity: js.UndefOr[Double] = js.undefined
  ): TileOverlayConstructorOptions = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(maximumZ)) __obj.updateDynamic("maximumZ")(maximumZ.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minimumZ)) __obj.updateDynamic("minimumZ")(minimumZ.get.asInstanceOf[js.Any])
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TileOverlayConstructorOptions]
  }
}


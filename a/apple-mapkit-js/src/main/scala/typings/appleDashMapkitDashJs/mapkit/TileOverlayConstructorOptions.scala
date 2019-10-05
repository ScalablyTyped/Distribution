package typings.appleDashMapkitDashJs.mapkit

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


package typings.appleMapkitJs.mapkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OverlayOptions extends js.Object {
  /**
    * Custom data to associate with this overlay.
    */
  var data: js.UndefOr[js.Object] = js.undefined
  /**
    * A Boolean value that determines whether the overlay responds to user
    * interaction.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /**
    * A Boolean value that indicates whether the overlay is selected.
    */
  var selected: js.UndefOr[Boolean] = js.undefined
  /**
    * A Boolean value that determines if an overlay is visible.
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}

object OverlayOptions {
  @scala.inline
  def apply(
    data: js.Object = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    selected: js.UndefOr[Boolean] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined
  ): OverlayOptions = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (!js.isUndefined(selected)) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[OverlayOptions]
  }
}


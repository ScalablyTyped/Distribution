package typings.appleDashMapkitDashJs.mapkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options that determine map parameters used when showing items.
  */
trait MapShowItemsOptions extends js.Object {
  /**
    * A Boolean value that determines whether the map is animated as the map
    * region changes to show the items.
    */
  var animate: js.UndefOr[Boolean] = js.undefined
  /**
    * Spacing that is added around the computed map region when showing items.
    */
  var minimumSpan: js.UndefOr[CoordinateSpan] = js.undefined
  /**
    * The minimum longitudinal and latitudinal span the map should display.
    */
  var padding: js.UndefOr[Padding] = js.undefined
}

object MapShowItemsOptions {
  @scala.inline
  def apply(
    animate: js.UndefOr[Boolean] = js.undefined,
    minimumSpan: CoordinateSpan = null,
    padding: Padding = null
  ): MapShowItemsOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate.asInstanceOf[js.Any])
    if (minimumSpan != null) __obj.updateDynamic("minimumSpan")(minimumSpan.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapShowItemsOptions]
  }
}


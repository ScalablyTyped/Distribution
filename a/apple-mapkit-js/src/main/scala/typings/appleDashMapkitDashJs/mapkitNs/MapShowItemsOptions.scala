package typings.appleDashMapkitDashJs.mapkitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapShowItemsOptions extends js.Object {
  var animate: js.UndefOr[Boolean] = js.undefined
  var minimumSpan: js.UndefOr[CoordinateSpan] = js.undefined
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
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate)
    if (minimumSpan != null) __obj.updateDynamic("minimumSpan")(minimumSpan)
    if (padding != null) __obj.updateDynamic("padding")(padding)
    __obj.asInstanceOf[MapShowItemsOptions]
  }
}


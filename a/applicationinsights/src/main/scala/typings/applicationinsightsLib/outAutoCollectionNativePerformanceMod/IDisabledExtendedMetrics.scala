package typings
package applicationinsightsLib.outAutoCollectionNativePerformanceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDisabledExtendedMetrics extends js.Object {
  var gc: js.UndefOr[scala.Boolean] = js.undefined
  var heap: js.UndefOr[scala.Boolean] = js.undefined
  var loop: js.UndefOr[scala.Boolean] = js.undefined
}

object IDisabledExtendedMetrics {
  @scala.inline
  def apply(
    gc: js.UndefOr[scala.Boolean] = js.undefined,
    heap: js.UndefOr[scala.Boolean] = js.undefined,
    loop: js.UndefOr[scala.Boolean] = js.undefined
  ): IDisabledExtendedMetrics = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(gc)) __obj.updateDynamic("gc")(gc)
    if (!js.isUndefined(heap)) __obj.updateDynamic("heap")(heap)
    if (!js.isUndefined(loop)) __obj.updateDynamic("loop")(loop)
    __obj.asInstanceOf[IDisabledExtendedMetrics]
  }
}


package typings.asciichart.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotConfig extends js.Object {
  var format: js.UndefOr[js.Function2[/* x */ Double, /* i */ Double, String]] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var max: js.UndefOr[Double] = js.undefined
  var min: js.UndefOr[Double] = js.undefined
  var offset: js.UndefOr[Double] = js.undefined
  var padding: js.UndefOr[String] = js.undefined
}

object PlotConfig {
  @scala.inline
  def apply(
    format: (/* x */ Double, /* i */ Double) => String = null,
    height: js.UndefOr[Double] = js.undefined,
    max: js.UndefOr[Double] = js.undefined,
    min: js.UndefOr[Double] = js.undefined,
    offset: js.UndefOr[Double] = js.undefined,
    padding: String = null
  ): PlotConfig = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(js.Any.fromFunction2(format))
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(max)) __obj.updateDynamic("max")(max.get.asInstanceOf[js.Any])
    if (!js.isUndefined(min)) __obj.updateDynamic("min")(min.get.asInstanceOf[js.Any])
    if (!js.isUndefined(offset)) __obj.updateDynamic("offset")(offset.get.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotConfig]
  }
}


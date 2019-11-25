package typings.asciichart.asciichartMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotConfig extends js.Object {
  var format: js.UndefOr[js.Function2[/* x */ Double, /* i */ Double, String]] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var offset: js.UndefOr[Double] = js.undefined
  var padding: js.UndefOr[String] = js.undefined
}

object PlotConfig {
  @scala.inline
  def apply(
    format: (/* x */ Double, /* i */ Double) => String = null,
    height: Int | Double = null,
    offset: Int | Double = null,
    padding: String = null
  ): PlotConfig = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(js.Any.fromFunction2(format))
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotConfig]
  }
}


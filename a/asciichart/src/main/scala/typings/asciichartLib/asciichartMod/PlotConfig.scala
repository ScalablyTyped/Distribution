package typings
package asciichartLib.asciichartMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotConfig extends js.Object {
  var format: js.UndefOr[js.Function2[/* x */ scala.Double, /* i */ scala.Double, java.lang.String]] = js.undefined
  var height: js.UndefOr[scala.Double] = js.undefined
  var offset: js.UndefOr[scala.Double] = js.undefined
  var padding: js.UndefOr[java.lang.String] = js.undefined
}

object PlotConfig {
  @scala.inline
  def apply(
    format: (/* x */ scala.Double, /* i */ scala.Double) => java.lang.String = null,
    height: scala.Int | scala.Double = null,
    offset: scala.Int | scala.Double = null,
    padding: java.lang.String = null
  ): PlotConfig = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(js.Any.fromFunction2(format))
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding)
    __obj.asInstanceOf[PlotConfig]
  }
}


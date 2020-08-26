package typings.asciichart.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlotConfig extends js.Object {
  var colors: js.UndefOr[js.Array[Color]] = js.native
  var format: js.UndefOr[js.Function2[/* x */ Double, /* i */ Double, String]] = js.native
  var height: js.UndefOr[Double] = js.native
  var max: js.UndefOr[Double] = js.native
  var min: js.UndefOr[Double] = js.native
  var offset: js.UndefOr[Double] = js.native
  var padding: js.UndefOr[String] = js.native
  var symbols: js.UndefOr[
    js.Tuple10[String, String, String, String, String, String, String, String, String, String]
  ] = js.native
}

object PlotConfig {
  @scala.inline
  def apply(): PlotConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlotConfig]
  }
  @scala.inline
  implicit class PlotConfigOps[Self <: PlotConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setColorsVarargs(value: Color*): Self = this.set("colors", js.Array(value :_*))
    @scala.inline
    def setColors(value: js.Array[Color]): Self = this.set("colors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColors: Self = this.set("colors", js.undefined)
    @scala.inline
    def setFormat(value: (/* x */ Double, /* i */ Double) => String): Self = this.set("format", js.Any.fromFunction2(value))
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    @scala.inline
    def setPadding(value: String): Self = this.set("padding", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    @scala.inline
    def setSymbols(value: js.Tuple10[String, String, String, String, String, String, String, String, String, String]): Self = this.set("symbols", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSymbols: Self = this.set("symbols", js.undefined)
  }
  
}


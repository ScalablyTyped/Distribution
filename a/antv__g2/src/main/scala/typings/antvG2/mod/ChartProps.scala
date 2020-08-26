package typings.antvG2.mod

import typings.antvG2.anon.Bottom
import typings.antvG2.mod.Styles.background
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 图表接收的参数
  */
@js.native
trait ChartProps extends js.Object {
  var animate: js.UndefOr[Boolean] = js.native
  var background: js.UndefOr[typings.antvG2.mod.Styles.background] = js.native
  var container: String | HTMLDivElement = js.native
  var data: js.UndefOr[js.Object | js.Any] = js.native
  var forceFit: js.UndefOr[Boolean] = js.native
  var height: Double = js.native
  var padding: js.UndefOr[
    Bottom | Double | String | (js.Tuple4[Double | String, Double | String, Double | String, Double | String]) | (js.Tuple2[String, String])
  ] = js.native
  var pixelRatio: js.UndefOr[Double] = js.native
  var plotBackground: js.UndefOr[background] = js.native
  /**
    * 主题
    */
  var theme: js.UndefOr[js.Object | String] = js.native
  var width: js.UndefOr[Double] = js.native
}

object ChartProps {
  @scala.inline
  def apply(container: String | HTMLDivElement, height: Double): ChartProps = {
    val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartProps]
  }
  @scala.inline
  implicit class ChartPropsOps[Self <: ChartProps] (val x: Self) extends AnyVal {
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
    def setContainer(value: String | HTMLDivElement): Self = this.set("container", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setAnimate(value: Boolean): Self = this.set("animate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimate: Self = this.set("animate", js.undefined)
    @scala.inline
    def setBackground(value: background): Self = this.set("background", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackground: Self = this.set("background", js.undefined)
    @scala.inline
    def setData(value: js.Object | js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setForceFit(value: Boolean): Self = this.set("forceFit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForceFit: Self = this.set("forceFit", js.undefined)
    @scala.inline
    def setPadding(
      value: Bottom | Double | String | (js.Tuple4[Double | String, Double | String, Double | String, Double | String]) | (js.Tuple2[String, String])
    ): Self = this.set("padding", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    @scala.inline
    def setPixelRatio(value: Double): Self = this.set("pixelRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePixelRatio: Self = this.set("pixelRatio", js.undefined)
    @scala.inline
    def setPlotBackground(value: background): Self = this.set("plotBackground", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlotBackground: Self = this.set("plotBackground", js.undefined)
    @scala.inline
    def setTheme(value: js.Object | String): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}


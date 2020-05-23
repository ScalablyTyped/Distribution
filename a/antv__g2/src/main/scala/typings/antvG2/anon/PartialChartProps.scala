package typings.antvG2.anon

import typings.antvG2.mod.Styles.background
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@antv/g2.@antv/g2.ChartProps> */
trait PartialChartProps extends js.Object {
  var animate: js.UndefOr[Boolean] = js.undefined
  var background: js.UndefOr[typings.antvG2.mod.Styles.background] = js.undefined
  var container: js.UndefOr[String | HTMLDivElement] = js.undefined
  var data: js.UndefOr[js.Object | js.Any] = js.undefined
  var forceFit: js.UndefOr[Boolean] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var padding: js.UndefOr[
    Bottom | Double | String | (js.Tuple4[Double | String, Double | String, Double | String, Double | String]) | (js.Tuple2[String, String])
  ] = js.undefined
  var pixelRatio: js.UndefOr[Double] = js.undefined
  var plotBackground: js.UndefOr[background] = js.undefined
  var theme: js.UndefOr[js.Object | String] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object PartialChartProps {
  @scala.inline
  def apply(
    animate: js.UndefOr[Boolean] = js.undefined,
    background: background = null,
    container: String | HTMLDivElement = null,
    data: js.Object | js.Any = null,
    forceFit: js.UndefOr[Boolean] = js.undefined,
    height: js.UndefOr[Double] = js.undefined,
    padding: Bottom | Double | String | (js.Tuple4[Double | String, Double | String, Double | String, Double | String]) | (js.Tuple2[String, String]) = null,
    pixelRatio: js.UndefOr[Double] = js.undefined,
    plotBackground: background = null,
    theme: js.Object | String = null,
    width: js.UndefOr[Double] = js.undefined
  ): PartialChartProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate.get.asInstanceOf[js.Any])
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(forceFit)) __obj.updateDynamic("forceFit")(forceFit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (!js.isUndefined(pixelRatio)) __obj.updateDynamic("pixelRatio")(pixelRatio.get.asInstanceOf[js.Any])
    if (plotBackground != null) __obj.updateDynamic("plotBackground")(plotBackground.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialChartProps]
  }
}


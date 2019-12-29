package typings.antDashDesignDashPro.libChartsBarMod

import typings.antDashDesignDashPro.Anon_X
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBarProps extends js.Object {
  var autoLabel: js.UndefOr[Boolean] = js.undefined
  var color: js.UndefOr[String] = js.undefined
  var data: js.Array[Anon_X]
  var height: Double
  var padding: js.UndefOr[js.Tuple4[Double, Double, Double, Double]] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var title: ReactNode
}

object IBarProps {
  @scala.inline
  def apply(
    data: js.Array[Anon_X],
    height: Double,
    autoLabel: js.UndefOr[Boolean] = js.undefined,
    color: String = null,
    padding: js.Tuple4[Double, Double, Double, Double] = null,
    style: CSSProperties = null,
    title: ReactNode = null
  ): IBarProps = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any])
    if (!js.isUndefined(autoLabel)) __obj.updateDynamic("autoLabel")(autoLabel.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBarProps]
  }
}


package typings.antd.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typings.antd.esSpinMod.SpinIndicator
import typings.antd.esSpinMod.SpinProps
import typings.antd.esSpinMod.SpinSize
import typings.antd.esSpinMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: style, className */
object Spin
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typings.antd.esSpinMod.default].asInstanceOf[String | js.Object]
  def apply(
    delay: Int | Double = null,
    indicator: SpinIndicator = null,
    prefixCls: String = null,
    size: SpinSize = null,
    spinning: js.UndefOr[Boolean] = js.undefined,
    tip: String = null,
    wrapperClassName: String = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (indicator != null) __obj.updateDynamic("indicator")(indicator)
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (size != null) __obj.updateDynamic("size")(size)
    if (!js.isUndefined(spinning)) __obj.updateDynamic("spinning")(spinning)
    if (tip != null) __obj.updateDynamic("tip")(tip)
    if (wrapperClassName != null) __obj.updateDynamic("wrapperClassName")(wrapperClassName)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = SpinProps
}


package typings.antd.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.core.TagMod
import slinky.web.html.`*`.tag
import typings.antd.esRateMod.RateProps
import typings.antd.esRateMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: style, className, disabled */
object Rate
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typings.antd.esRateMod.default].asInstanceOf[String | js.Object]
  def apply(
    allowClear: js.UndefOr[Boolean] = js.undefined,
    allowHalf: js.UndefOr[Boolean] = js.undefined,
    character: TagMod[Any] = null,
    count: Int | Double = null,
    defaultValue: Int | Double = null,
    onChange: /* value */ Double => Unit = null,
    onHoverChange: /* value */ Double => Unit = null,
    prefixCls: String = null,
    tooltips: js.Array[String] = null,
    value: Int | Double = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowClear)) __obj.updateDynamic("allowClear")(allowClear)
    if (!js.isUndefined(allowHalf)) __obj.updateDynamic("allowHalf")(allowHalf)
    if (character != null) __obj.updateDynamic("character")(character)
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onHoverChange != null) __obj.updateDynamic("onHoverChange")(js.Any.fromFunction1(onHoverChange))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (tooltips != null) __obj.updateDynamic("tooltips")(tooltips)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = RateProps
}


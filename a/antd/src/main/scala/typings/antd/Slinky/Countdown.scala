package typings.antd.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typings.antd.esStatisticCountdownMod.CountdownProps
import typings.antd.esStatisticCountdownMod.default
import typings.antd.esStatisticUtilsMod.Formatter
import typings.antd.esStatisticUtilsMod.countdownValueType
import typings.antd.esStatisticUtilsMod.valueType
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: style, className */
object Countdown
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typings.antd.esStatisticCountdownMod.default].asInstanceOf[String | js.Object]
  def apply(
    decimalSeparator: String = null,
    format: String = null,
    formatter: Formatter = null,
    groupSeparator: String = null,
    onFinish: () => Unit = null,
    precision: Int | Double = null,
    prefix: ReactNode = null,
    prefixCls: String = null,
    suffix: ReactNode = null,
    title: ReactNode = null,
    value: valueType = null,
    valueRender: /* node */ ReactNode => ReactNode = null,
    valueStyle: CSSProperties = null,
    value_CountdownProps: countdownValueType = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal()
    if (decimalSeparator != null) __obj.updateDynamic("decimalSeparator")(decimalSeparator)
    if (format != null) __obj.updateDynamic("format")(format)
    if (formatter != null) __obj.updateDynamic("formatter")(formatter.asInstanceOf[js.Any])
    if (groupSeparator != null) __obj.updateDynamic("groupSeparator")(groupSeparator)
    if (onFinish != null) __obj.updateDynamic("onFinish")(js.Any.fromFunction0(onFinish))
    if (precision != null) __obj.updateDynamic("precision")(precision.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (suffix != null) __obj.updateDynamic("suffix")(suffix.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (valueRender != null) __obj.updateDynamic("valueRender")(js.Any.fromFunction1(valueRender))
    if (valueStyle != null) __obj.updateDynamic("valueStyle")(valueStyle)
    if (value_CountdownProps != null) __obj.updateDynamic("value")(value_CountdownProps.asInstanceOf[js.Any])
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = CountdownProps
}


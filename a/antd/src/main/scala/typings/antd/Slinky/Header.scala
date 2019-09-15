package typings.antd.Slinky

import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typings.antd.esCalendarHeaderMod.HeaderProps
import typings.antd.esCalendarHeaderMod.RenderHeader
import typings.antd.esCalendarHeaderMod.default
import typings.moment.momentMod.Moment
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* The following DOM/SVG props were specified: type */
object Header
  extends ExternalComponentWithAttributesWithRefType[tag.type, default] {
  override val component: String | js.Object = js.constructorOf[typings.antd.esCalendarHeaderMod.default].asInstanceOf[String | js.Object]
  def apply(
    value: Moment,
    fullscreen: js.UndefOr[Boolean] = js.undefined,
    headerRender: /* headerRender */ RenderHeader => ReactNode = null,
    locale: js.Any = null,
    onTypeChange: /* type */ String => Unit = null,
    onValueChange: /* value */ Moment => Unit = null,
    prefixCls: String = null,
    validRange: js.Tuple2[Moment, Moment] = null,
    yearSelectOffset: Int | Double = null,
    yearSelectTotal: Int | Double = null
  ): BuildingComponent[tag.type, default] = {
    val __obj = js.Dynamic.literal(value = value)
    if (!js.isUndefined(fullscreen)) __obj.updateDynamic("fullscreen")(fullscreen)
    if (headerRender != null) __obj.updateDynamic("headerRender")(js.Any.fromFunction1(headerRender))
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (onTypeChange != null) __obj.updateDynamic("onTypeChange")(js.Any.fromFunction1(onTypeChange))
    if (onValueChange != null) __obj.updateDynamic("onValueChange")(js.Any.fromFunction1(onValueChange))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (validRange != null) __obj.updateDynamic("validRange")(validRange)
    if (yearSelectOffset != null) __obj.updateDynamic("yearSelectOffset")(yearSelectOffset.asInstanceOf[js.Any])
    if (yearSelectTotal != null) __obj.updateDynamic("yearSelectTotal")(yearSelectTotal.asInstanceOf[js.Any])
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = HeaderProps
}


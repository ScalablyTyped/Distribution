package typings.antd.libCalendarHeaderMod

import typings.moment.momentMod.Moment
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeaderProps extends js.Object {
  var fullscreen: js.UndefOr[Boolean] = js.undefined
  var headerRender: js.UndefOr[HeaderRender] = js.undefined
  var locale: js.UndefOr[js.Any] = js.undefined
  var onTypeChange: js.UndefOr[js.Function1[/* type */ String, Unit]] = js.undefined
  var onValueChange: js.UndefOr[js.Function1[/* value */ Moment, Unit]] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var validRange: js.UndefOr[js.Tuple2[Moment, Moment]] = js.undefined
  var value: Moment
  var yearSelectOffset: js.UndefOr[Double] = js.undefined
  var yearSelectTotal: js.UndefOr[Double] = js.undefined
}

object HeaderProps {
  @scala.inline
  def apply(
    value: Moment,
    fullscreen: js.UndefOr[Boolean] = js.undefined,
    headerRender: /* headerRender */ RenderHeader => ReactNode = null,
    locale: js.Any = null,
    onTypeChange: /* type */ String => Unit = null,
    onValueChange: /* value */ Moment => Unit = null,
    prefixCls: String = null,
    `type`: String = null,
    validRange: js.Tuple2[Moment, Moment] = null,
    yearSelectOffset: Int | Double = null,
    yearSelectTotal: Int | Double = null
  ): HeaderProps = {
    val __obj = js.Dynamic.literal(value = value)
    if (!js.isUndefined(fullscreen)) __obj.updateDynamic("fullscreen")(fullscreen)
    if (headerRender != null) __obj.updateDynamic("headerRender")(js.Any.fromFunction1(headerRender))
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (onTypeChange != null) __obj.updateDynamic("onTypeChange")(js.Any.fromFunction1(onTypeChange))
    if (onValueChange != null) __obj.updateDynamic("onValueChange")(js.Any.fromFunction1(onValueChange))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (validRange != null) __obj.updateDynamic("validRange")(validRange)
    if (yearSelectOffset != null) __obj.updateDynamic("yearSelectOffset")(yearSelectOffset.asInstanceOf[js.Any])
    if (yearSelectTotal != null) __obj.updateDynamic("yearSelectTotal")(yearSelectTotal.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeaderProps]
  }
}


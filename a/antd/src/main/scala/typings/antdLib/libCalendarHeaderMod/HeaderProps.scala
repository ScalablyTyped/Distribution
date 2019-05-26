package typings
package antdLib.libCalendarHeaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeaderProps extends js.Object {
  var fullscreen: js.UndefOr[scala.Boolean] = js.undefined
  var locale: js.UndefOr[js.Any] = js.undefined
  var onTypeChange: js.UndefOr[js.Function1[/* type */ java.lang.String, scala.Unit]] = js.undefined
  var onValueChange: js.UndefOr[js.Function1[/* value */ momentLib.momentMod.Moment, scala.Unit]] = js.undefined
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  var validRange: js.UndefOr[js.Tuple2[momentLib.momentMod.Moment, momentLib.momentMod.Moment]] = js.undefined
  var value: momentLib.momentMod.Moment
  var yearSelectOffset: js.UndefOr[scala.Double] = js.undefined
  var yearSelectTotal: js.UndefOr[scala.Double] = js.undefined
  def headerRender(header: RenderHeader): reactLib.reactMod.ReactNode
}

object HeaderProps {
  @scala.inline
  def apply(
    headerRender: RenderHeader => reactLib.reactMod.ReactNode,
    value: momentLib.momentMod.Moment,
    fullscreen: js.UndefOr[scala.Boolean] = js.undefined,
    locale: js.Any = null,
    onTypeChange: /* type */ java.lang.String => scala.Unit = null,
    onValueChange: /* value */ momentLib.momentMod.Moment => scala.Unit = null,
    prefixCls: java.lang.String = null,
    `type`: java.lang.String = null,
    validRange: js.Tuple2[momentLib.momentMod.Moment, momentLib.momentMod.Moment] = null,
    yearSelectOffset: scala.Int | scala.Double = null,
    yearSelectTotal: scala.Int | scala.Double = null
  ): HeaderProps = {
    val __obj = js.Dynamic.literal(headerRender = js.Any.fromFunction1(headerRender), value = value)
    if (!js.isUndefined(fullscreen)) __obj.updateDynamic("fullscreen")(fullscreen)
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


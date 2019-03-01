package typings
package antdLib.libDateDashPickerInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PickerProps extends js.Object {
  var allowClear: js.UndefOr[scala.Boolean] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var dateRender: js.UndefOr[
    js.Function2[
      /* current */ momentLib.momentMod.momentNs.Moment, 
      /* today */ momentLib.momentMod.momentNs.Moment, 
      reactLib.reactMod.ReactNs.ReactNode
    ]
  ] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var disabledDate: js.UndefOr[
    js.Function1[/* current */ js.UndefOr[momentLib.momentMod.momentNs.Moment], scala.Boolean]
  ] = js.undefined
  var dropdownClassName: js.UndefOr[java.lang.String] = js.undefined
  var format: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var getCalendarContainer: js.UndefOr[js.Function1[/* triggerNode */ reactLib.Element, reactLib.HTMLElement]] = js.undefined
  var id: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var inputPrefixCls: js.UndefOr[java.lang.String] = js.undefined
  var locale: js.UndefOr[js.Any] = js.undefined
  var onOpenChange: js.UndefOr[js.Function1[/* status */ scala.Boolean, scala.Unit]] = js.undefined
  var open: js.UndefOr[scala.Boolean] = js.undefined
  var popupStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
  var renderExtraFooter: js.UndefOr[js.Function0[reactLib.reactMod.ReactNs.ReactNode]] = js.undefined
  var size: js.UndefOr[
    antdLib.antdLibStrings.large | antdLib.antdLibStrings.small | antdLib.antdLibStrings.default
  ] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var suffixIcon: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
}

object PickerProps {
  @scala.inline
  def apply(
    allowClear: js.UndefOr[scala.Boolean] = js.undefined,
    className: java.lang.String = null,
    dateRender: js.Function2[
      /* current */ momentLib.momentMod.momentNs.Moment, 
      /* today */ momentLib.momentMod.momentNs.Moment, 
      reactLib.reactMod.ReactNs.ReactNode
    ] = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    disabledDate: js.Function1[/* current */ js.UndefOr[momentLib.momentMod.momentNs.Moment], scala.Boolean] = null,
    dropdownClassName: java.lang.String = null,
    format: java.lang.String | js.Array[java.lang.String] = null,
    getCalendarContainer: js.Function1[/* triggerNode */ reactLib.Element, reactLib.HTMLElement] = null,
    id: scala.Double | java.lang.String = null,
    inputPrefixCls: java.lang.String = null,
    locale: js.Any = null,
    onOpenChange: js.Function1[/* status */ scala.Boolean, scala.Unit] = null,
    open: js.UndefOr[scala.Boolean] = js.undefined,
    popupStyle: reactLib.reactMod.ReactNs.CSSProperties = null,
    prefixCls: java.lang.String = null,
    renderExtraFooter: js.Function0[reactLib.reactMod.ReactNs.ReactNode] = null,
    size: antdLib.antdLibStrings.large | antdLib.antdLibStrings.small | antdLib.antdLibStrings.default = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null,
    suffixIcon: reactLib.reactMod.ReactNs.ReactNode = null
  ): PickerProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowClear)) __obj.updateDynamic("allowClear")(allowClear)
    if (className != null) __obj.updateDynamic("className")(className)
    if (dateRender != null) __obj.updateDynamic("dateRender")(dateRender)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (disabledDate != null) __obj.updateDynamic("disabledDate")(disabledDate)
    if (dropdownClassName != null) __obj.updateDynamic("dropdownClassName")(dropdownClassName)
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (getCalendarContainer != null) __obj.updateDynamic("getCalendarContainer")(getCalendarContainer)
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (inputPrefixCls != null) __obj.updateDynamic("inputPrefixCls")(inputPrefixCls)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (onOpenChange != null) __obj.updateDynamic("onOpenChange")(onOpenChange)
    if (!js.isUndefined(open)) __obj.updateDynamic("open")(open)
    if (popupStyle != null) __obj.updateDynamic("popupStyle")(popupStyle)
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (renderExtraFooter != null) __obj.updateDynamic("renderExtraFooter")(renderExtraFooter)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (suffixIcon != null) __obj.updateDynamic("suffixIcon")(suffixIcon.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickerProps]
  }
}


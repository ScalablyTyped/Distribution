package typings
package antdLib.libTimeDashPickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimePickerProps extends js.Object {
  var addon: js.UndefOr[js.Function] = js.undefined
  var allowEmpty: js.UndefOr[scala.Boolean] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var clearText: js.UndefOr[java.lang.String] = js.undefined
  var defaultOpenValue: js.UndefOr[momentLib.momentMod.momentNs.Moment] = js.undefined
  var defaultValue: js.UndefOr[
    momentLib.momentMod.momentNs.Moment | js.Array[momentLib.momentMod.momentNs.Moment]
  ] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var disabledHours: js.UndefOr[js.Function0[js.Array[scala.Double]]] = js.undefined
  var disabledMinutes: js.UndefOr[js.Function1[/* selectedHour */ scala.Double, js.Array[scala.Double]]] = js.undefined
  var disabledSeconds: js.UndefOr[
    js.Function2[
      /* selectedHour */ scala.Double, 
      /* selectedMinute */ scala.Double, 
      js.Array[scala.Double]
    ]
  ] = js.undefined
  var focusOnOpen: js.UndefOr[scala.Boolean] = js.undefined
  var format: js.UndefOr[java.lang.String] = js.undefined
  var getPopupContainer: js.UndefOr[js.Function1[/* triggerNode */ reactLib.Element, reactLib.HTMLElement]] = js.undefined
  var hideDisabledOptions: js.UndefOr[scala.Boolean] = js.undefined
  var hourStep: js.UndefOr[scala.Double] = js.undefined
  var inputReadOnly: js.UndefOr[scala.Boolean] = js.undefined
  var minuteStep: js.UndefOr[scala.Double] = js.undefined
  var onChange: js.UndefOr[
    js.Function2[
      /* time */ momentLib.momentMod.momentNs.Moment, 
      /* timeString */ java.lang.String, 
      scala.Unit
    ]
  ] = js.undefined
  var onOpenChange: js.UndefOr[js.Function1[/* open */ scala.Boolean, scala.Unit]] = js.undefined
  var open: js.UndefOr[scala.Boolean] = js.undefined
  var placeholder: js.UndefOr[java.lang.String] = js.undefined
  var popupClassName: js.UndefOr[java.lang.String] = js.undefined
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
  var secondStep: js.UndefOr[scala.Double] = js.undefined
  var size: js.UndefOr[
    antdLib.antdLibStrings.large | antdLib.antdLibStrings.default | antdLib.antdLibStrings.small
  ] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var suffixIcon: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var use12Hours: js.UndefOr[scala.Boolean] = js.undefined
  var value: js.UndefOr[momentLib.momentMod.momentNs.Moment] = js.undefined
}


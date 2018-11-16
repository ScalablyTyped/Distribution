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
  var disabledDate: js.UndefOr[js.Function1[/* current */ momentLib.momentMod.momentNs.Moment, scala.Boolean]] = js.undefined
  var dropdownClassName: js.UndefOr[java.lang.String] = js.undefined
  var format: js.UndefOr[java.lang.String] = js.undefined
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


package typings
package antdLib.libSelectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SelectProps extends AbstractSelectProps {
  var autoFocus: js.UndefOr[scala.Boolean] = js.undefined
  var defaultValue: js.UndefOr[SelectValue] = js.undefined
  var firstActiveValue: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var getInputElement: js.UndefOr[js.Function0[reactLib.reactMod.ReactNs.ReactElement[_]]] = js.undefined
  var labelInValue: js.UndefOr[scala.Boolean] = js.undefined
  var maxTagCount: js.UndefOr[scala.Double] = js.undefined
  var maxTagPlaceholder: js.UndefOr[
    reactLib.reactMod.ReactNs.ReactNode | (js.Function1[/* omittedValues */ js.Array[SelectValue], reactLib.reactMod.ReactNs.ReactNode])
  ] = js.undefined
  var mode: js.UndefOr[
    antdLib.antdLibStrings.default | antdLib.antdLibStrings.multiple | antdLib.antdLibStrings.tags | antdLib.antdLibStrings.combobox | java.lang.String
  ] = js.undefined
  var onBlur: js.UndefOr[js.Function0[_]] = js.undefined
  var onChange: js.UndefOr[
    js.Function2[
      /* value */ SelectValue, 
      /* option */ reactLib.reactMod.ReactNs.ReactElement[_] | js.Array[reactLib.reactMod.ReactNs.ReactElement[_]], 
      scala.Unit
    ]
  ] = js.undefined
  var onDeselect: js.UndefOr[js.Function1[/* value */ SelectValue, _]] = js.undefined
  var onFocus: js.UndefOr[js.Function0[_]] = js.undefined
  var onInputKeyDown: js.UndefOr[
    js.Function1[
      /* e */ reactLib.reactMod.ReactNs.KeyboardEvent[reactLib.HTMLInputElement], 
      scala.Unit
    ]
  ] = js.undefined
  var onMouseEnter: js.UndefOr[
    js.Function1[/* e */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLInputElement], _]
  ] = js.undefined
  var onMouseLeave: js.UndefOr[
    js.Function1[/* e */ reactLib.reactMod.ReactNs.MouseEvent[reactLib.HTMLInputElement], _]
  ] = js.undefined
  var onPopupScroll: js.UndefOr[js.Function0[_]] = js.undefined
  var onSelect: js.UndefOr[
    js.Function2[/* value */ SelectValue, /* option */ reactLib.reactMod.ReactNs.ReactElement[_], _]
  ] = js.undefined
  var optionFilterProp: js.UndefOr[java.lang.String] = js.undefined
  var optionLabelProp: js.UndefOr[java.lang.String] = js.undefined
  var suffixIcon: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var tokenSeparators: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var value: js.UndefOr[SelectValue] = js.undefined
}


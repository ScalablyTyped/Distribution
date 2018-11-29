package typings
package antdLib.libAutoDashCompleteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait AutoCompleteProps
  extends antdLib.libSelectMod.AbstractSelectProps {
  var autoFocus: js.UndefOr[scala.Boolean] = js.undefined
  var backfill: js.UndefOr[scala.Boolean] = js.undefined
  var children: js.UndefOr[
    ValidInputElement | reactLib.reactMod.ReactNs.ReactElement[antdLib.libSelectMod.OptionProps] | js.Array[reactLib.reactMod.ReactNs.ReactElement[antdLib.libSelectMod.OptionProps]]
  ] = js.undefined
  var dataSource: js.UndefOr[js.Array[DataSourceItemType]] = js.undefined
  var defaultValue: js.UndefOr[antdLib.libSelectMod.SelectValue] = js.undefined
  var onBlur: js.UndefOr[js.Function1[/* value */ antdLib.libSelectMod.SelectValue, scala.Unit]] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* value */ antdLib.libSelectMod.SelectValue, scala.Unit]] = js.undefined
  var onFocus: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var onSelect: js.UndefOr[
    js.Function2[/* value */ antdLib.libSelectMod.SelectValue, /* option */ js.Object, _]
  ] = js.undefined
  var optionLabelProp: js.UndefOr[java.lang.String] = js.undefined
  var value: js.UndefOr[antdLib.libSelectMod.SelectValue] = js.undefined
}


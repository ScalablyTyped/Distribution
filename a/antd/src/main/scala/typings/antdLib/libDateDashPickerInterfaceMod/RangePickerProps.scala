package typings
package antdLib.libDateDashPickerInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait RangePickerProps extends PickerProps {
  var defaultPickerValue: js.UndefOr[RangePickerValue] = js.undefined
  var defaultValue: js.UndefOr[RangePickerValue] = js.undefined
  var disabledTime: js.UndefOr[
    js.Function2[
      /* current */ momentLib.momentMod.momentNs.Moment, 
      /* type */ java.lang.String, 
      antdLib.Anon_DisabledHours
    ]
  ] = js.undefined
  var mode: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var onCalendarChange: js.UndefOr[
    js.Function2[
      /* dates */ RangePickerValue, 
      /* dateStrings */ js.Tuple2[java.lang.String, java.lang.String], 
      scala.Unit
    ]
  ] = js.undefined
  var onChange: js.UndefOr[
    js.Function2[
      /* dates */ RangePickerValue, 
      /* dateStrings */ js.Tuple2[java.lang.String, java.lang.String], 
      scala.Unit
    ]
  ] = js.undefined
  var onOk: js.UndefOr[js.Function1[/* selectedTime */ momentLib.momentMod.momentNs.Moment, scala.Unit]] = js.undefined
  var onPanelChange: js.UndefOr[
    js.Function2[
      /* value */ js.UndefOr[RangePickerValue], 
      /* mode */ js.UndefOr[java.lang.String | js.Array[java.lang.String]], 
      scala.Unit
    ]
  ] = js.undefined
  var placeholder: js.UndefOr[js.Tuple2[java.lang.String, java.lang.String]] = js.undefined
  var ranges: js.UndefOr[org.scalablytyped.runtime.StringDictionary[RangePickerPresetRange]] = js.undefined
  var showTime: js.UndefOr[antdLib.libTimeDashPickerMod.TimePickerProps | scala.Boolean] = js.undefined
  var value: js.UndefOr[RangePickerValue] = js.undefined
}


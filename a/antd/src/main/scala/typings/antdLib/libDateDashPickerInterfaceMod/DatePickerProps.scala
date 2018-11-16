package typings
package antdLib.libDateDashPickerInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait DatePickerProps
  extends PickerProps
     with SinglePickerProps {
  var disabledTime: js.UndefOr[
    js.Function1[/* current */ momentLib.momentMod.momentNs.Moment, antdLib.Anon_DisabledHours]
  ] = js.undefined
  var onOk: js.UndefOr[js.Function1[/* selectedTime */ momentLib.momentMod.momentNs.Moment, scala.Unit]] = js.undefined
  var placeholder: js.UndefOr[java.lang.String] = js.undefined
  var showTime: js.UndefOr[antdLib.libTimeDashPickerMod.TimePickerProps | scala.Boolean] = js.undefined
  var showToday: js.UndefOr[scala.Boolean] = js.undefined
}


package typings.antd

import typings.moment.momentMod.Moment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libDateDashPickerInterfaceMod {
  type RangePickerPresetRange = RangePickerValue | js.Function0[RangePickerValue]
  type RangePickerValue = js.Array[js.UndefOr[Moment]] | (js.Tuple2[js.UndefOr[Moment], Moment])
}

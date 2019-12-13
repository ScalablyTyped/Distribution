package typings.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libDateDashPickerInterfaceMod {
  import typings.moment.momentMod.Moment

  type RangePickerPresetRange = RangePickerValue | js.Function0[RangePickerValue]
  type RangePickerValue = (js.Array[js.UndefOr[Moment | Null]]) | (js.Tuple2[js.UndefOr[Moment | Null], js.UndefOr[Moment | Null]])
}

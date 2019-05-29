package typings
package antdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libDateDashPickerInterfaceMod {
  type RangePickerPresetRange = RangePickerValue | js.Function0[RangePickerValue]
  type RangePickerValue = js.Array[js.UndefOr[momentLib.momentMod.Moment]] | (js.Tuple2[js.UndefOr[momentLib.momentMod.Moment], momentLib.momentMod.Moment])
}

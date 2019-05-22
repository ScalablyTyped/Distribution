package typings
package antdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libDateDashPickerInterfaceMod {
  type RangePickerPresetRange = RangePickerValue | js.Function0[RangePickerValue]
  type RangePickerValue = js.Array[js.UndefOr[scala.Nothing]] | js.Array[momentLib.momentMod.Moment] | (js.Tuple2[js.UndefOr[scala.Nothing], momentLib.momentMod.Moment]) | (js.Tuple2[momentLib.momentMod.Moment, momentLib.momentMod.Moment])
}

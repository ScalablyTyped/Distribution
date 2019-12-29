package typings.atAntvG2.atAntvG2Mod

import typings.atAntvG2.atAntvG2Mod.Styles.tickLine
import typings.atAntvG2.atAntvG2Strings.bottom
import typings.atAntvG2.atAntvG2Strings.left
import typings.atAntvG2.atAntvG2Strings.right
import typings.atAntvG2.atAntvG2Strings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@antv/g2", "ChartAxisConfig")
@js.native
class ChartAxisConfig () extends js.Object {
  var grid: js.UndefOr[AxisGrid | Null] = js.native
  var label: js.UndefOr[AxisLabel] = js.native
  var line: js.UndefOr[typings.atAntvG2.atAntvG2Mod.Styles.line] = js.native
  var position: js.UndefOr[top | bottom | left | right] = js.native
  var subTickCount: js.UndefOr[Double] = js.native
  var subTickLine: js.UndefOr[tickLine | Null] = js.native
  var tickLine: js.UndefOr[typings.atAntvG2.atAntvG2Mod.Styles.tickLine | Null] = js.native
  var title: js.UndefOr[AxisTitle] = js.native
}


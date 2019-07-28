package typings.agDashGrid

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distLibFilterDateFilterMod {
  type IDateComparatorFunc = js.Function2[/* filterLocalDateAtMidnight */ Date, /* cellValue */ js.Any, Double]
}

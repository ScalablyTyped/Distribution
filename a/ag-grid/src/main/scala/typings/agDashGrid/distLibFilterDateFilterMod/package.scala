package typings.agDashGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distLibFilterDateFilterMod {
  import typings.std.Date

  type IDateComparatorFunc = js.Function2[/* filterLocalDateAtMidnight */ Date, /* cellValue */ js.Any, Double]
}

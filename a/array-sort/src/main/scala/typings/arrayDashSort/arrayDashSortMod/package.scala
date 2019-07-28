package typings.arrayDashSort

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object arrayDashSortMod {
  type Comparator[T] = js.Function2[/* a */ T, /* b */ T, Double]
  type ComparisonArg[T] = String | Comparator[T]
  type ComparisonArgs[T] = ComparisonArg[T] | js.Array[ComparisonArg[T]]
}

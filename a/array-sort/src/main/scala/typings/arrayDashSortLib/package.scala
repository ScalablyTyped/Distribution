package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object arrayDashSortLib {
  type Comparator[T] = js.Function2[/* a */ T, /* b */ T, scala.Double]
  type ComparisonArg[T] = java.lang.String | Comparator[T]
  type ComparisonArgs[T] = ComparisonArg[T] | js.Array[ComparisonArg[T]]
}

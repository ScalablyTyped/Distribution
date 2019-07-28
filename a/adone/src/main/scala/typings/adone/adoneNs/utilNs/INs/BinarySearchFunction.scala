package typings.adone.adoneNs.utilNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BinarySearchFunction extends js.Object {
  var GREATEST_LOWER_BOUND: Double = js.native
  var LEAST_UPPER_BOUND: Double = js.native
  def apply[T](aHaystack: js.Array[T], aNeedle: Double): T = js.native
  def apply[T](aHaystack: js.Array[T], aNeedle: Double, aLow: Double): T = js.native
  def apply[T](aHaystack: js.Array[T], aNeedle: Double, aLow: Double, aHigh: Double): T = js.native
  def apply[T](
    aHaystack: js.Array[T],
    aNeedle: Double,
    aLow: Double,
    aHigh: Double,
    aCompare: js.Function2[/* a */ T, /* b */ T, Double]
  ): T = js.native
  def apply[T](
    aHaystack: js.Array[T],
    aNeedle: Double,
    aLow: Double,
    aHigh: Double,
    aCompare: js.Function2[/* a */ T, /* b */ T, Double],
    aBias: Double
  ): T = js.native
}


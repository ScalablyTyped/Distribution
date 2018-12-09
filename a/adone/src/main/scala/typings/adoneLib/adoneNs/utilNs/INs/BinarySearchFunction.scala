package typings
package adoneLib.adoneNs.utilNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BinarySearchFunction extends js.Object {
  var GREATEST_LOWER_BOUND: scala.Double = js.native
  var LEAST_UPPER_BOUND: scala.Double = js.native
  def apply[T](aHaystack: js.Array[T], aNeedle: scala.Double): T = js.native
  def apply[T](aHaystack: js.Array[T], aNeedle: scala.Double, aLow: scala.Double): T = js.native
  def apply[T](aHaystack: js.Array[T], aNeedle: scala.Double, aLow: scala.Double, aHigh: scala.Double): T = js.native
  def apply[T](
    aHaystack: js.Array[T],
    aNeedle: scala.Double,
    aLow: scala.Double,
    aHigh: scala.Double,
    aCompare: js.Function2[/* a */ T, /* b */ T, scala.Double]
  ): T = js.native
  def apply[T](
    aHaystack: js.Array[T],
    aNeedle: scala.Double,
    aLow: scala.Double,
    aHigh: scala.Double,
    aCompare: js.Function2[/* a */ T, /* b */ T, scala.Double],
    aBias: scala.Double
  ): T = js.native
}


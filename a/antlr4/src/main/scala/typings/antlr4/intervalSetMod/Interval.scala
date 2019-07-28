package typings.antlr4.intervalSetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antlr4/IntervalSet", "Interval")
@js.native
class Interval protected () extends js.Object {
  def this(start: Double, stop: Double) = this()
  val length: Double = js.native
  val start: Double = js.native
  val stop: Double = js.native
  def contains(item: Double): Boolean = js.native
}


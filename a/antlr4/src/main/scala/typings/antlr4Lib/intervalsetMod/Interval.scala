package typings
package antlr4Lib.intervalsetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antlr4/IntervalSet", "Interval")
@js.native
class Interval protected () extends js.Object {
  def this(start: scala.Double, stop: scala.Double) = this()
  val length: scala.Double = js.native
  val start: scala.Double = js.native
  val stop: scala.Double = js.native
  def contains(item: scala.Double): scala.Boolean = js.native
}


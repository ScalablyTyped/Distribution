package typings.androiduix.android.graphics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.graphics.Point")
@js.native
class Point () extends js.Object {
  def this(src: Point) = this()
  def this(x: Double, y: Double) = this()
  var x: Double = js.native
  var y: Double = js.native
  def equals(o: js.Any): Boolean = js.native
  def equals(x: Double, y: Double): Boolean = js.native
  def negate(): Unit = js.native
  def offset(dx: Double, dy: Double): Unit = js.native
  def set(x: Double, y: Double): Unit = js.native
}


package typings.androiduix.android.graphics

import typings.androiduix.java.lang.StringBuilder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.graphics.Rect")
@js.native
class Rect () extends js.Object {
  def this(r: Rect) = this()
  def this(left: Double, top: Double, right: Double, bottom: Double) = this()
  var bottom: Double = js.native
  var left: Double = js.native
  var right: Double = js.native
  var top: Double = js.native
  def centerX(): Double = js.native
  def centerY(): Double = js.native
  def contains(left: Double, top: Double, right: Double, bottom: Double): Boolean = js.native
  def contains(r: Rect): Boolean = js.native
  def contains(x: Double, y: Double): Boolean = js.native
  def equals(r: Rect): Boolean = js.native
  def exactCenterX(): Double = js.native
  def exactCenterY(): Double = js.native
  def flattenToString(): String = js.native
  def height(): Double = js.native
  def inset(dx: js.Any, dy: js.Any): Unit = js.native
  def intersect(left: Double, top: Double, right: Double, bottom: Double): Boolean = js.native
  def intersect(r: Rect): Boolean = js.native
  def intersects(left: Double, top: Double, right: Double, bottom: Double): Boolean = js.native
  def intersects(rect: Rect): Boolean = js.native
  def isEmpty(): Boolean = js.native
  def offset(dx: js.Any, dy: js.Any): Unit = js.native
  def offsetTo(newLeft: js.Any, newTop: js.Any): Unit = js.native
  def scale(scale: Double): Unit = js.native
  def set(left: js.Any, top: js.Any, right: js.Any, bottom: js.Any): js.Any = js.native
  def set(src: Rect): js.Any = js.native
  def setEmpty(): Unit = js.native
  def setIntersect(a: Rect, b: Rect): Boolean = js.native
  def sort(): Unit = js.native
  def toShortString(): String = js.native
  def toShortString(sb: StringBuilder): String = js.native
  def union(left: Double, top: Double, right: Double, bottom: Double): js.Any = js.native
  def union(r: Rect): js.Any = js.native
  def union(x: Double, y: Double): js.Any = js.native
  def width(): Double = js.native
}

/* static members */
@JSGlobal("android.graphics.Rect")
@js.native
object Rect extends js.Object {
  def intersects(a: Rect, b: Rect): Boolean = js.native
  def unflattenFromString(str: String): Rect = js.native
}


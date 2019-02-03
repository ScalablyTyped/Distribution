package typings
package androiduixLib.androidNs.graphicsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.graphics.Rect")
@js.native
class Rect () extends js.Object {
  def this(r: Rect) = this()
  def this(left: scala.Double, top: scala.Double, right: scala.Double, bottom: scala.Double) = this()
  var bottom: scala.Double = js.native
  var left: scala.Double = js.native
  var right: scala.Double = js.native
  var top: scala.Double = js.native
  def centerX(): scala.Double = js.native
  def centerY(): scala.Double = js.native
  def contains(left: scala.Double, top: scala.Double, right: scala.Double, bottom: scala.Double): scala.Boolean = js.native
  def contains(r: Rect): scala.Boolean = js.native
  def contains(x: scala.Double, y: scala.Double): scala.Boolean = js.native
  def equals(r: Rect): scala.Boolean = js.native
  def exactCenterX(): scala.Double = js.native
  def exactCenterY(): scala.Double = js.native
  def flattenToString(): java.lang.String = js.native
  def height(): scala.Double = js.native
  def inset(dx: js.Any, dy: js.Any): scala.Unit = js.native
  def intersect(left: scala.Double, top: scala.Double, right: scala.Double, bottom: scala.Double): scala.Boolean = js.native
  def intersect(r: Rect): scala.Boolean = js.native
  def intersects(left: scala.Double, top: scala.Double, right: scala.Double, bottom: scala.Double): scala.Boolean = js.native
  def intersects(rect: Rect): scala.Boolean = js.native
  def isEmpty(): scala.Boolean = js.native
  def offset(dx: js.Any, dy: js.Any): scala.Unit = js.native
  def offsetTo(newLeft: js.Any, newTop: js.Any): scala.Unit = js.native
  def scale(scale: scala.Double): scala.Unit = js.native
  def set(left: js.Any, top: js.Any, right: js.Any, bottom: js.Any): js.Any = js.native
  def set(src: Rect): js.Any = js.native
  def setEmpty(): scala.Unit = js.native
  def setIntersect(a: Rect, b: Rect): scala.Boolean = js.native
  def sort(): scala.Unit = js.native
  def toShortString(): java.lang.String = js.native
  def toShortString(sb: androiduixLib.javaNs.langNs.StringBuilder): java.lang.String = js.native
  def union(left: scala.Double, top: scala.Double, right: scala.Double, bottom: scala.Double): js.Any = js.native
  def union(r: Rect): js.Any = js.native
  def union(x: scala.Double, y: scala.Double): js.Any = js.native
  def width(): scala.Double = js.native
}

/* static members */
@JSGlobal("android.graphics.Rect")
@js.native
object Rect extends js.Object {
  def intersects(a: androiduixLib.androidNs.graphicsNs.Rect, b: androiduixLib.androidNs.graphicsNs.Rect): scala.Boolean = js.native
  def unflattenFromString(str: java.lang.String): androiduixLib.androidNs.graphicsNs.Rect = js.native
}


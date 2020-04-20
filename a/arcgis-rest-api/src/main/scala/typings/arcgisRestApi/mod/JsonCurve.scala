package typings.arcgisRestApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.arcgisRestApi.mod.CircularArc
  - typings.arcgisRestApi.mod.Arc
  - typings.arcgisRestApi.mod.OldCircularArc
  - typings.arcgisRestApi.mod.BezierCurve
*/
trait JsonCurve extends js.Object

object JsonCurve {
  @scala.inline
  def CircularArc(c: js.Tuple2[Position, Position2D]): JsonCurve = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsonCurve]
  }
  @scala.inline
  def Arc(a: js.Tuple7[Position, Position2D, Double, Double, Double, Double, Double]): JsonCurve = {
    val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsonCurve]
  }
  @scala.inline
  def OldCircularArc(a: js.Tuple4[Position, Position2D, Double, Double]): JsonCurve = {
    val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsonCurve]
  }
  @scala.inline
  def BezierCurve(b: js.Tuple3[Position, Position2D, Position2D]): JsonCurve = {
    val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsonCurve]
  }
}


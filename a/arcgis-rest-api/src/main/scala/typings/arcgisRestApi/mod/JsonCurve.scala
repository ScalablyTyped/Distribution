package typings.arcgisRestApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.arcgisRestApi.mod.CircularArc
  - typings.arcgisRestApi.mod.Arc
  - typings.arcgisRestApi.mod.OldCircularArc
  - typings.arcgisRestApi.mod.BezierCurve
*/
trait JsonCurve extends StObject
object JsonCurve {
  
  @scala.inline
  def Arc(
    a: js.Tuple7[
      Position, 
      // End point: x, y, <z>, <m>
  Position2D, 
      // Center point: center_x, center_y
  Double, 
      // minor
  Double, 
      // clockwise
  Double, 
      // rotation
  Double, 
      // axis
  Double
    ]
  ): typings.arcgisRestApi.mod.Arc = {
    val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.arcgisRestApi.mod.Arc]
  }
  
  @scala.inline
  def BezierCurve(b: js.Tuple3[Position, Position2D, Position2D]): typings.arcgisRestApi.mod.BezierCurve = {
    val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.arcgisRestApi.mod.BezierCurve]
  }
  
  @scala.inline
  def CircularArc(c: js.Tuple2[Position, Position2D]): typings.arcgisRestApi.mod.CircularArc = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.arcgisRestApi.mod.CircularArc]
  }
  
  @scala.inline
  def OldCircularArc(
    a: js.Tuple4[
      Position, 
      // End point: x, y, <z>, <m>
  Position2D, 
      // Center point: center_x, center_y
  Double, 
      // minor
  Double
    ]
  ): typings.arcgisRestApi.mod.OldCircularArc = {
    val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.arcgisRestApi.mod.OldCircularArc]
  }
}

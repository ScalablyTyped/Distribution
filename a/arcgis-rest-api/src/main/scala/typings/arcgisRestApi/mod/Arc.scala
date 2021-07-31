package typings.arcgisRestApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Arc
  extends StObject
     with JsonCurve {
  
  var a: js.Tuple7[
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
}
object Arc {
  
  @scala.inline
  def apply(
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
  ): Arc = {
    val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any])
    __obj.asInstanceOf[Arc]
  }
  
  @scala.inline
  implicit class ArcMutableBuilder[Self <: Arc] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setA(
      value: js.Tuple7[
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
    ): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
  }
}

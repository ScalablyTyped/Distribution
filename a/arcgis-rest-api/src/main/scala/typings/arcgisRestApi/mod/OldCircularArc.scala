package typings.arcgisRestApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OldCircularArc
  extends StObject
     with JsonCurve {
  
  var a: js.Tuple4[
    Position, 
    // End point: x, y, <z>, <m>
  Position2D, 
    // Center point: center_x, center_y
  Double, 
    // minor
  Double
  ]
}
object OldCircularArc {
  
  inline def apply(
    a: js.Tuple4[
      Position, 
      // End point: x, y, <z>, <m>
  Position2D, 
      // Center point: center_x, center_y
  Double, 
      // minor
  Double
    ]
  ): OldCircularArc = {
    val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any])
    __obj.asInstanceOf[OldCircularArc]
  }
  
  extension [Self <: OldCircularArc](x: Self) {
    
    inline def setA(
      value: js.Tuple4[
          Position, 
          // End point: x, y, <z>, <m>
    Position2D, 
          // Center point: center_x, center_y
    Double, 
          // minor
    Double
        ]
    ): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
  }
}

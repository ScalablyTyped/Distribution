package typings.arcgisRestApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PolylineWithCurves
  extends StObject
     with HasZM
     with Geometry {
  
  var curvePaths: js.Array[js.Array[Position | JsonCurve]]
}
object PolylineWithCurves {
  
  inline def apply(curvePaths: js.Array[js.Array[Position | JsonCurve]]): PolylineWithCurves = {
    val __obj = js.Dynamic.literal(curvePaths = curvePaths.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolylineWithCurves]
  }
  
  extension [Self <: PolylineWithCurves](x: Self) {
    
    inline def setCurvePaths(value: js.Array[js.Array[Position | JsonCurve]]): Self = StObject.set(x, "curvePaths", value.asInstanceOf[js.Any])
    
    inline def setCurvePathsVarargs(value: (js.Array[Position | JsonCurve])*): Self = StObject.set(x, "curvePaths", js.Array(value*))
  }
}

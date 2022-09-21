package typings.arcgisRestApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PolygonWithCurves
  extends StObject
     with HasZM
     with Geometry {
  
  var curveRings: js.Array[js.Array[Position | JsonCurve]]
}
object PolygonWithCurves {
  
  inline def apply(curveRings: js.Array[js.Array[Position | JsonCurve]]): PolygonWithCurves = {
    val __obj = js.Dynamic.literal(curveRings = curveRings.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolygonWithCurves]
  }
  
  extension [Self <: PolygonWithCurves](x: Self) {
    
    inline def setCurveRings(value: js.Array[js.Array[Position | JsonCurve]]): Self = StObject.set(x, "curveRings", value.asInstanceOf[js.Any])
    
    inline def setCurveRingsVarargs(value: (js.Array[Position | JsonCurve])*): Self = StObject.set(x, "curveRings", js.Array(value*))
  }
}

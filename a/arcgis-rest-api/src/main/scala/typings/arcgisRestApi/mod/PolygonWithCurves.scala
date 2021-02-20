package typings.arcgisRestApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PolygonWithCurves
  extends HasZM
     with Geometry {
  
  var curveRings: js.Array[js.Array[Position | JsonCurve]] = js.native
}
object PolygonWithCurves {
  
  @scala.inline
  def apply(curveRings: js.Array[js.Array[Position | JsonCurve]]): PolygonWithCurves = {
    val __obj = js.Dynamic.literal(curveRings = curveRings.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolygonWithCurves]
  }
  
  @scala.inline
  implicit class PolygonWithCurvesMutableBuilder[Self <: PolygonWithCurves] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurveRings(value: js.Array[js.Array[Position | JsonCurve]]): Self = StObject.set(x, "curveRings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurveRingsVarargs(value: (js.Array[Position | JsonCurve])*): Self = StObject.set(x, "curveRings", js.Array(value :_*))
  }
}

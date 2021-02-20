package typings.arcgisRestApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PolylineWithCurves
  extends HasZM
     with Geometry {
  
  var curvePaths: js.Array[js.Array[Position | JsonCurve]] = js.native
}
object PolylineWithCurves {
  
  @scala.inline
  def apply(curvePaths: js.Array[js.Array[Position | JsonCurve]]): PolylineWithCurves = {
    val __obj = js.Dynamic.literal(curvePaths = curvePaths.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolylineWithCurves]
  }
  
  @scala.inline
  implicit class PolylineWithCurvesMutableBuilder[Self <: PolylineWithCurves] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurvePaths(value: js.Array[js.Array[Position | JsonCurve]]): Self = StObject.set(x, "curvePaths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurvePathsVarargs(value: (js.Array[Position | JsonCurve])*): Self = StObject.set(x, "curvePaths", js.Array(value :_*))
  }
}

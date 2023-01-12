package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FromScreenPointResult extends StObject {
  
  /**
    * The map point of the point associated with the given screen point.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-DrawAction.html#FromScreenPointResult)
    */
  var mapPoint: Point
  
  /**
    * Array of x, y, and z component (if hasZ is enabled).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-DrawAction.html#FromScreenPointResult)
    */
  var vertex: js.Array[Double]
}
object FromScreenPointResult {
  
  inline def apply(mapPoint: Point, vertex: js.Array[Double]): FromScreenPointResult = {
    val __obj = js.Dynamic.literal(mapPoint = mapPoint.asInstanceOf[js.Any], vertex = vertex.asInstanceOf[js.Any])
    __obj.asInstanceOf[FromScreenPointResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FromScreenPointResult] (val x: Self) extends AnyVal {
    
    inline def setMapPoint(value: Point): Self = StObject.set(x, "mapPoint", value.asInstanceOf[js.Any])
    
    inline def setVertex(value: js.Array[Double]): Self = StObject.set(x, "vertex", value.asInstanceOf[js.Any])
    
    inline def setVertexVarargs(value: Double*): Self = StObject.set(x, "vertex", js.Array(value*))
  }
}

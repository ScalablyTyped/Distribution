package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FromScreenPointResult
  extends StObject
     with Object {
  
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
  
  inline def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    mapPoint: Point,
    propertyIsEnumerable: PropertyKey => Boolean,
    vertex: js.Array[Double]
  ): FromScreenPointResult = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), mapPoint = mapPoint.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), vertex = vertex.asInstanceOf[js.Any])
    __obj.asInstanceOf[FromScreenPointResult]
  }
  
  extension [Self <: FromScreenPointResult](x: Self) {
    
    inline def setMapPoint(value: Point): Self = StObject.set(x, "mapPoint", value.asInstanceOf[js.Any])
    
    inline def setVertex(value: js.Array[Double]): Self = StObject.set(x, "vertex", value.asInstanceOf[js.Any])
    
    inline def setVertexVarargs(value: Double*): Self = StObject.set(x, "vertex", js.Array(value*))
  }
}

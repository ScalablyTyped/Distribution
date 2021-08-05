package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NearestPointResult
  extends StObject
     with Object {
  
  /**
    * A vertex within the specified distance of the search.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-geometryEngine.html#NearestPointResult)
    */
  var coordinate: Point
  
  /**
    * The distance from the `inputPoint` in the units of the view's spatial reference.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-geometryEngine.html#NearestPointResult)
    */
  var distance: Double
  
  /**
    * Indicates if it is an empty geometry.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-geometryEngine.html#NearestPointResult)
    */
  var isEmpty: Boolean
  
  /**
    * The index of the vertex within the geometry's rings or paths.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-geometryEngine.html#NearestPointResult)
    */
  var vertexIndex: Double
}
object NearestPointResult {
  
  inline def apply(
    constructor: js.Function,
    coordinate: Point,
    distance: Double,
    hasOwnProperty: PropertyKey => Boolean,
    isEmpty: Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    vertexIndex: Double
  ): NearestPointResult = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], coordinate = coordinate.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), isEmpty = isEmpty.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), vertexIndex = vertexIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[NearestPointResult]
  }
  
  extension [Self <: NearestPointResult](x: Self) {
    
    inline def setCoordinate(value: Point): Self = StObject.set(x, "coordinate", value.asInstanceOf[js.Any])
    
    inline def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
    
    inline def setIsEmpty(value: Boolean): Self = StObject.set(x, "isEmpty", value.asInstanceOf[js.Any])
    
    inline def setVertexIndex(value: Double): Self = StObject.set(x, "vertexIndex", value.asInstanceOf[js.Any])
  }
}

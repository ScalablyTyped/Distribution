package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NearestPointResult
  extends stdLib.Object {
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
  var distance: scala.Double
  /**
    * Indicates if it is an empty geometry.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-geometryEngine.html#NearestPointResult)
    */
  var isEmpty: scala.Boolean
  /**
    * Indicates if the vertex is on the right side of the `geometry`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-geometryEngine.html#NearestPointResult)
    */
  var isRightSide: scala.Boolean
  /**
    * The index of the vertex within the geometry's rings or paths.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-geometryEngine.html#NearestPointResult)
    */
  var vertexIndex: scala.Double
}

object NearestPointResult {
  @scala.inline
  def apply(
    constructor: js.Function,
    coordinate: Point,
    distance: scala.Double,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    isEmpty: scala.Boolean,
    isRightSide: scala.Boolean,
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    vertexIndex: scala.Double
  ): NearestPointResult = {
    val __obj = js.Dynamic.literal(constructor = constructor, coordinate = coordinate, distance = distance, hasOwnProperty = hasOwnProperty, isEmpty = isEmpty, isRightSide = isRightSide, propertyIsEnumerable = propertyIsEnumerable, vertexIndex = vertexIndex)
  
    __obj.asInstanceOf[NearestPointResult]
  }
}


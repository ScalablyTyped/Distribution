package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Circle extends Polygon {
  /**
    * The center point of the circle. The center must be specified either as a [Point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html) or an array of longitude/latitude coordinates.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Circle.html#center)
    */
  var center: Point = js.native
  /**
    * Applicable when the spatial reference of the center point is either set to Web Mercator (wkid: 3857) or geographic/geodesic (wkid: 4326). When  either of those spatial references is used, set geodesic to `true` to minimize distortion. Other coordinate systems will not create geodesic circles.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Circle.html#geodesic)
    *
    * @default false
    */
  var geodesic: Boolean = js.native
  /**
    * This value defines the number of points along the curve of the circle.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Circle.html#numberOfPoints)
    *
    * @default 60
    */
  var numberOfPoints: Double = js.native
  /**
    * The radius of the circle.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Circle.html#radius)
    *
    * @default 1000
    */
  var radius: Double = js.native
  /**
    * Unit of the radius.  **Possible Values:** feet | kilometers | meters | miles | nautical-miles | yards
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Circle.html#radiusUnit)
    *
    * @default meters
    */
  var radiusUnit: String = js.native
}

@JSGlobal("__esri.Circle")
@js.native
class CircleCls () extends Circle {
  def this(properties: CircleProperties) = this()
  /**
    * Converts an instance of  [this class]() to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation. See the [Using fromJSON()](https://developers.arcgis.com/javascript/latest/guide/using-fromjson/index.html) topic in the Guide for more information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    *
    *
    */
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
}


package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Point
  extends Geometry
     with arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs.geometryNs.Geometry
     with geometryGeometry {
  /**
    * The latitude of the point if the spatial reference is Web Mercator (wkid: 3857) or WGS84 (wkid: 4326).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html#latitude)
    */
  var latitude: scala.Double = js.native
  /**
    * The longitude of the point if the spatial reference is Web Mercator (wkid: 3857) or WGS84 (wkid: 4326).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html#longitude)
    */
  var longitude: scala.Double = js.native
  /**
    * The m-coordinate of the point in map units.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html#m)
    *
    * @default undefined
    */
  var m: scala.Double = js.native
  /**
    * For Point, the type is always `point`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html#type)
    */
  @JSName("type")
  val type_Point: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.point = js.native
  /**
    * The x-coordinate (easting) of the point in map units.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html#x)
    *
    * @default 0
    */
  var x: scala.Double = js.native
  /**
    * The y-coordinate (northing) of the point in map units.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html#y)
    *
    * @default 0
    */
  var y: scala.Double = js.native
  /**
    * The z-coordinate (or elevation) of the point in map units.
    * > **Z-values** defined in a geographic or metric coordinate system are expressed in meters. However, in local scenes that use a projected coordinate system, vertical units are assumed to be the same as the horizontal units specified by the service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html#z)
    *
    * @default undefined
    */
  var z: scala.Double = js.native
  /**
    * Copies all values from another Point instance.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html#copy)
    *
    * @param other The point to copy from.
    *
    */
  def copy(other: Point): scala.Unit = js.native
  /**
    * Computes the Euclidean distance between this Point and a given Point. Points must have the same spatial reference.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html#distance)
    *
    * @param other The point to compute the distance to.
    *
    */
  def distance(other: Point): scala.Double = js.native
  /**
    * Determines if the input point is equal to the point calling the function.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html#equals)
    *
    * @param point The input point to test.
    *
    */
  def equals(point: Point): scala.Boolean = js.native
  /**
    * Modifies the point geometry in-place by shifting the X-coordinate to within +/- 180 span in map units. You should [clone](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html#clone) the point object before calling this method where appropriate.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html#normalize)
    *
    *
    */
  def normalize(): Point = js.native
}


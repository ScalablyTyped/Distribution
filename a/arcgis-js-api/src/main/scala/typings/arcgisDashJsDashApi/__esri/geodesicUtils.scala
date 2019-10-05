package typings.arcgisDashJsDashApi.__esri

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait geodesicUtils extends js.Object {
  /**
    * Geodetically computes the area for one or more polygons.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-geodesicUtils.html#geodesicAreas)
    *
    * @param polygons The polygons to compute the area for.
    * @param unit Output area units.  **Possible Values:** square-millimeters | square-centimeters | square-decimeters | square-meters | square-kilometers | square-inches | square-feet | square-yards | square-miles | square-us-feet | acres | ares | hectares
    *
    */
  def geodesicAreas(polygons: js.Array[Polygon]): js.Array[Double] = js.native
  def geodesicAreas(polygons: js.Array[Polygon], unit: String): js.Array[Double] = js.native
  def geodesicDensify(geometry: Polygon, maxSegmentLength: Double): Polyline | Polygon = js.native
  /**
    * Computes and returns a densified polyline or polygon.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-geodesicUtils.html#geodesicDensify)
    *
    * @param geometry The input polyline or polygon.
    * @param maxSegmentLength The maximum length (in meters) between vertices.
    *
    */
  def geodesicDensify(geometry: Polyline, maxSegmentLength: Double): Polyline | Polygon = js.native
  /**
    * Geodetically computes the direction and distance between two known locations. Both input points must have the same geographic coordinate system.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-geodesicUtils.html#geodesicDistance)
    *
    * @param from The origin location.
    * @param to The destination location.
    * @param unit Output linear units.  **Possible Values:** millimeters | centimeters | decimeters | meters | kilometers | inches | feet | yards | miles | nautical-miles | us-feet
    *
    */
  def geodesicDistance(from: Point, to: Point): GeodesicDistanceResult = js.native
  def geodesicDistance(from: Point, to: Point, unit: String): GeodesicDistanceResult = js.native
  /**
    * Geodetically computes polygon perimeter or polyline length for one or more geometries.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-geodesicUtils.html#geodesicLengths)
    *
    * @param geometries The input polylines or polygons.
    * @param unit Output linear units.  **Possible Values:** millimeters | centimeters | decimeters | meters | kilometers | inches | feet | yards | miles | nautical-miles | us-feet
    *
    */
  def geodesicLengths(geometries: js.Array[Polygon | Polyline]): js.Array[Double] = js.native
  def geodesicLengths(geometries: js.Array[Polygon | Polyline], unit: String): js.Array[Double] = js.native
  /**
    * Geodetically computes the location at a defined distance and direction from a known location.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-geodesicUtils.html#pointFromDistance)
    *
    * @param point Origin location.
    * @param distance Distance from the origin in meters.
    * @param azimuth Direction from the origin in degrees.
    *
    */
  def pointFromDistance(point: Point, distance: Double, azimuth: Double): Point = js.native
}

@JSGlobal("__esri.geodesicUtils")
@js.native
object geodesicUtils extends TopLevel[geodesicUtils]


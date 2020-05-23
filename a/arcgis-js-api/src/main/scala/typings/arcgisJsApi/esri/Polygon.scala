package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.polygon
import typings.arcgisJsApi.esri.geometry.Geometry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Polygon
  extends Geometry_
     with Geometry
     with geometryGeometry {
  /**
    * The centroid of the polygon. For a polygon with multiple rings, it represents the centroid of the largest ring.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html#centroid)
    */
  var centroid: Point = js.native
  /**
    * Checks to see if polygon rings cross each other and indicates if the polygon is self-intersecting, which means the ring of the polygon crosses itself.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html#isSelfIntersecting)
    */
  var isSelfIntersecting: Boolean = js.native
  /**
    * An array of rings. Each ring is a two-dimensional array of numbers representing the coordinates of each vertex in the ring in the spatial reference of the view. The first vertex of each ring should always be the same as the last vertex. Each vertex is an array of two, three, or four numbers. The table below shows the various structures of a vertex array.
    *
    * Case | Vertex array
    * --- | ---
    * [without z](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html#hasZ) and [without m](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html#hasM)| [x, y]
    * [without z](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html#hasZ) and [with m](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html#hasM) | [x, y, m]
    * [with z](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html#hasZ) and [without m](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html#hasM) | [x, y, z]
    * [with z](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html#hasZ) and [with m](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html#hasM) | [x, y, z, m]
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html#rings)
    */
  var rings: js.Array[js.Array[js.Array[Double]]] = js.native
  /**
    * The string value representing the type of geometry.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html#type)
    */
  @JSName("type")
  val type_Polygon: polygon = js.native
  /**
    * Adds a ring to the Polygon. The ring can be one of the following: an array of numbers or an array of points. When added the index of the ring is incremented by one.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html#addRing)
    *
    * @param points A polygon ring. The first and last coordinates/points in the ring must be the same. This can either be defined as an array of Point geometries or an array of XY coordinates.
    *
    */
  def addRing(points: js.Array[js.Array[Double] | Point]): Polygon = js.native
  /**
    * Checks on the client if the input point is inside the polygon. A point on the polygon line is considered inside.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html#contains)
    *
    * @param point The point to test whether it is contained within the testing polygon.
    *
    */
  def contains(point: Point): Boolean = js.native
  /**
    * Returns a point specified by a ring and point in the path.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html#getPoint)
    *
    * @param ringIndex The index of the ring containing the desired point.
    * @param pointIndex The index of the desired point within the ring.
    *
    */
  def getPoint(ringIndex: Double, pointIndex: Double): Point = js.native
  def insertPoint(ringIndex: Double, pointIndex: Double, point: js.Array[Double]): Polygon = js.native
  /**
    * Inserts a new point into the polygon.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html#insertPoint)
    *
    * @param ringIndex The index of the ring in which to insert the point.
    * @param pointIndex The index of the point to insert within the ring.
    * @param point The point to insert.
    *
    */
  def insertPoint(ringIndex: Double, pointIndex: Double, point: Point): Polygon = js.native
  /**
    * Checks if a Polygon ring is clockwise.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html#isClockwise)
    *
    * @param ring A polygon ring. The first and last coordinates/points in the ring must be the same. This can either be defined as an array of Point geometries or an array of XY coordinates.
    *
    */
  def isClockwise(ring: js.Array[js.Array[Double] | Point]): Boolean = js.native
  /**
    * Removes a point from the polygon at the given `pointIndex` within the ring identified by `ringIndex`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html#removePoint)
    *
    * @param ringIndex The index of the ring containing the point to remove.
    * @param pointIndex The index of the point to remove within the ring.
    *
    */
  def removePoint(ringIndex: Double, pointIndex: Double): js.Array[Point] = js.native
  /**
    * Removes a ring from the Polygon. The index specifies which ring to remove.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html#removeRing)
    *
    * @param index The index of the ring to remove.
    *
    */
  def removeRing(index: Double): js.Array[Point] = js.native
  def setPoint(ringIndex: Double, pointIndex: Double, point: js.Array[Double]): Polygon = js.native
  /**
    * Updates a point in the polygon.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html#setPoint)
    *
    * @param ringIndex The index of the ring containing the point to update.
    * @param pointIndex The index of the point to update within the ring.
    * @param point The new point geometry.
    *
    */
  def setPoint(ringIndex: Double, pointIndex: Double, point: Point): Polygon = js.native
}


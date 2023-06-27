package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.polygon
import typings.arcgisJsApi.esri.geometry.Geometry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Polygon
  extends StObject
     with Geometry_
     with Geometry
     with geometryGeometry {
  
  /**
  		 * Adds a ring to the Polygon.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html#addRing)
  		 */
  def addRing(points: js.Array[js.Array[Double] | Point]): Polygon = js.native
  
  /**
  		 * The centroid of the polygon.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html#centroid)
  		 */
  var centroid: Point = js.native
  
  /**
  		 * Checks on the client if the input point is inside the polygon.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html#contains)
  		 */
  def contains(point: Point): Boolean = js.native
  
  /**
  		 * Returns a point specified by a ring and point in the path.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html#getPoint)
  		 */
  def getPoint(ringIndex: Double, pointIndex: Double): Point = js.native
  
  def insertPoint(ringIndex: Double, pointIndex: Double, point: js.Array[Double]): Polygon = js.native
  /**
  		 * Inserts a new point into the polygon.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html#insertPoint)
  		 */
  def insertPoint(ringIndex: Double, pointIndex: Double, point: Point): Polygon = js.native
  
  /**
  		 * Checks if a Polygon ring is clockwise.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html#isClockwise)
  		 */
  def isClockwise(ring: js.Array[js.Array[Double] | Point]): Boolean = js.native
  
  /**
  		 * Checks to see if polygon rings cross each other and indicates if the polygon is self-intersecting, which means the ring of the polygon crosses itself.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html#isSelfIntersecting)
  		 */
  var isSelfIntersecting: Boolean = js.native
  
  /**
  		 * Removes a point from the polygon at the given `pointIndex` within the ring identified by `ringIndex`.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html#removePoint)
  		 */
  def removePoint(ringIndex: Double, pointIndex: Double): js.Array[Point] = js.native
  
  /**
  		 * Removes a ring from the Polygon.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html#removeRing)
  		 */
  def removeRing(index: Double): js.Array[Point] = js.native
  
  /**
  		 * An array of rings.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html#rings)
  		 */
  var rings: js.Array[js.Array[js.Array[Double]]] = js.native
  
  def setPoint(ringIndex: Double, pointIndex: Double, point: js.Array[Double]): Polygon = js.native
  /**
  		 * Updates a point in the polygon.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html#setPoint)
  		 */
  def setPoint(ringIndex: Double, pointIndex: Double, point: Point): Polygon = js.native
  
  /**
  		 * The string value representing the type of geometry.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html#type)
  		 */
  @JSName("type")
  val type_Polygon: polygon = js.native
}

package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.polyline
import typings.arcgisJsApi.esri.geometry.Geometry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Polyline
  extends Geometry_
     with Geometry
     with geometryGeometry {
  
  /**
    * Adds a path, or line segment, to the polyline.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polyline.html#addPath)
    */
  def addPath(points: js.Array[js.Array[Double] | Point]): Polyline = js.native
  
  /**
    * Returns a point specified by a path and point in the path.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polyline.html#getPoint)
    */
  def getPoint(pathIndex: Double, pointIndex: Double): Point = js.native
  
  def insertPoint(pathIndex: Double, pointIndex: Double, point: js.Array[Double]): Polyline = js.native
  /**
    * Inserts a new point into a polyline.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polyline.html#insertPoint)
    */
  def insertPoint(pathIndex: Double, pointIndex: Double, point: Point): Polyline = js.native
  
  /**
    * An array of paths, or line segments, that make up the polyline.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polyline.html#paths)
    */
  var paths: js.Array[js.Array[js.Array[Double]]] = js.native
  
  /**
    * Removes a path from the Polyline.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polyline.html#removePath)
    */
  def removePath(index: Double): js.Array[Point] = js.native
  
  /**
    * Removes a point from the polyline at the given `pointIndex` within the path identified by the given `pathIndex`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polyline.html#removePoint)
    */
  def removePoint(pathIndex: Double, pointIndex: Double): Point = js.native
  
  def setPoint(pathIndex: Double, pointIndex: Double, point: js.Array[Double]): Polyline = js.native
  /**
    * Updates a point in a polyline.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polyline.html#setPoint)
    */
  def setPoint(pathIndex: Double, pointIndex: Double, point: Point): Polyline = js.native
  
  @JSName("type")
  val type_Polyline: polyline = js.native
}

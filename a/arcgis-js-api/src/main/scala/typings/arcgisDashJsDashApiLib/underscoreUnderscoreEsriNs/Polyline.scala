package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Polyline
  extends Geometry
     with arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs.geometryNs.Geometry
     with geometryGeometry {
  /**
    * An array of paths, or line segments, that make up the polyline. Each path is a two-dimensional array of numbers representing the coordinates of each vertex in the path in the spatial reference of the view. Each vertex is represented as an array of two, three, or four numbers. The table below shows the various structures of a vertex array.
    *
    * Case | Vertex array
    * --- | ---
    * [without z](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polyline.html#hasZ) and [without m](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polyline.html#hasM) | [x, y]
    * [without z](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polyline.html#hasZ) and [with m](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polyline.html#hasM) | [x, y, m]
    * [with z](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polyline.html#hasZ) and [without m](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polyline.html#hasM) | [x, y, z]
    * [with z](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polyline.html#hasZ) and [with m](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polyline.html#hasM) | [x, y, z, m]
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polyline.html#paths)
    */
  var paths: js.Array[js.Array[js.Array[scala.Double]]] = js.native
  /**
    * For Polyline, the type is always `polyline`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polyline.html#type)
    */
  @JSName("type")
  val type_Polyline: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.polyline = js.native
  /**
    * Adds a path, or line segment, to the polyline. When added, the index of the path is incremented by one.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polyline.html#addPath)
    *
    * @param points A polyline path. This can either be defined as an array of Point geometries or an array of XY coordinates.
    *
    */
  def addPath(points: js.Array[js.Array[scala.Double] | Point]): Polyline = js.native
  /**
    * Returns a point specified by a path and point in the path.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polyline.html#getPoint)
    *
    * @param pathIndex The index of a path in the polyline.
    * @param pointIndex The index of a point in a path.
    *
    */
  def getPoint(pathIndex: scala.Double, pointIndex: scala.Double): Point = js.native
  /**
    * Inserts a new point into a polyline.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polyline.html#insertPoint)
    *
    * @param pathIndex The index of the path in which to insert a point.
    * @param pointIndex The index of the inserted point in the path.
    * @param point The point to insert.
    *
    */
  def insertPoint(pathIndex: scala.Double, pointIndex: scala.Double, point: Point): Polyline = js.native
  def insertPoint(pathIndex: scala.Double, pointIndex: scala.Double, point: js.Array[scala.Double]): Polyline = js.native
  /**
    * Removes a path from the Polyline. The index specifies which path to remove.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polyline.html#removePath)
    *
    * @param index The index of the path to remove from the polyline.
    *
    */
  def removePath(index: scala.Double): js.Array[Point] = js.native
  /**
    * Removes a point from the polyline at the given `pointIndex` within the path identified by the given `pathIndex`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polyline.html#removePoint)
    *
    * @param pathIndex The index of the path containing the point to be removed.
    * @param pointIndex The index of the point to be removed within the path.
    *
    */
  def removePoint(pathIndex: scala.Double, pointIndex: scala.Double): Point = js.native
  /**
    * Updates a point in a polyline.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polyline.html#setPoint)
    *
    * @param pathIndex The index of the path that contains the point to be updated.
    * @param pointIndex The index of the point to be updated in the path.
    * @param point Point geometry to update in the path.
    *
    */
  def setPoint(pathIndex: scala.Double, pointIndex: scala.Double, point: Point): Polyline = js.native
  def setPoint(pathIndex: scala.Double, pointIndex: scala.Double, point: js.Array[scala.Double]): Polyline = js.native
}

@JSGlobal("__esri.Polyline")
@js.native
class PolylineCls () extends Polyline {
  def this(properties: PolylineProperties) = this()
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


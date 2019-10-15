package typings.arcgisDashJsDashApi.__esri

import org.scalablytyped.runtime.TopLevel
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.multipoint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Multipoint
  extends Geometry
     with typings.arcgisDashJsDashApi.__esri.geometry.Geometry
     with geometryGeometry {
  /**
    * An array of points.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Multipoint.html#points)
    */
  var points: js.Array[js.Array[Double]] = js.native
  /**
    * The string value representing the type of geometry.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Multipoint.html#type)
    */
  @JSName("type")
  val type_Multipoint: multipoint = js.native
  def addPoint(point: js.Array[Double]): Multipoint = js.native
  /**
    * Adds a point to the Multipoint.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Multipoint.html#addPoint)
    *
    * @param point The point to add to the multipoint. The point can either be a [Point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html) or an array of numbers representing XY coordinates.
    *
    */
  def addPoint(point: Point): Multipoint = js.native
  /**
    * Returns the point at the specified index.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Multipoint.html#getPoint)
    *
    * @param index The index of the point in the [points](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Multipoint.html#points) property.
    *
    */
  def getPoint(index: Double): Point = js.native
  /**
    * Removes a point from the Multipoint. The index specifies which point to remove.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Multipoint.html#removePoint)
    *
    * @param index The index of the point to remove.
    *
    */
  def removePoint(index: Double): Point = js.native
  /**
    * Updates the point at the specified index.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Multipoint.html#setPoint)
    *
    * @param index The index of the point in the [points](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Multipoint.html#points) property.
    * @param point Point geometry that specifies the new location.
    *
    */
  def setPoint(index: Double, point: Point): Multipoint = js.native
}

@JSGlobal("__esri.Multipoint")
@js.native
object Multipoint extends TopLevel[MultipointConstructor]


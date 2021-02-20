package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.multipoint
import typings.arcgisJsApi.esri.geometry.Geometry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Multipoint
  extends Geometry_
     with Geometry
     with geometryGeometry {
  
  def addPoint(point: js.Array[Double]): Multipoint = js.native
  /**
    * Adds a point to the Multipoint.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Multipoint.html#addPoint)
    */
  def addPoint(point: Point): Multipoint = js.native
  
  /**
    * Returns the point at the specified index.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Multipoint.html#getPoint)
    */
  def getPoint(index: Double): Point = js.native
  
  /**
    * An array of points.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Multipoint.html#points)
    */
  var points: js.Array[js.Array[Double]] = js.native
  
  /**
    * Removes a point from the Multipoint.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Multipoint.html#removePoint)
    */
  def removePoint(index: Double): Point = js.native
  
  def setPoint(index: Double, point: js.Array[Double]): Multipoint = js.native
  /**
    * Updates the point at the specified index.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Multipoint.html#setPoint)
    */
  def setPoint(index: Double, point: Point): Multipoint = js.native
  
  /**
    * The string value representing the type of geometry.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Multipoint.html#type)
    */
  @JSName("type")
  val type_Multipoint: multipoint = js.native
}

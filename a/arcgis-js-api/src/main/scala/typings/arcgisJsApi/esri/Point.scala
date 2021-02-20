package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.point
import typings.arcgisJsApi.esri.geometry.Geometry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Point
  extends Geometry_
     with Geometry
     with geometryGeometry {
  
  /**
    * Copies all values from another Point instance.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html#copy)
    */
  def copy(other: Point): Unit = js.native
  
  /**
    * Computes the Euclidean distance between this Point and a given Point.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html#distance)
    */
  def distance(other: Point): Double = js.native
  
  /**
    * Determines if the input point is equal to the point calling the function.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html#equals)
    */
  def equals(point: Point): Boolean = js.native
  
  /**
    * The latitude of the point.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html#latitude)
    */
  var latitude: Double = js.native
  
  /**
    * The longitude of the point.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html#longitude)
    */
  var longitude: Double = js.native
  
  /**
    * The m-coordinate of the point in map units.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html#m)
    */
  var m: Double = js.native
  
  /**
    * Modifies the point geometry in-place by shifting the X-coordinate to within +/- 180 span in map units.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html#normalize)
    */
  def normalize(): Point = js.native
  
  /**
    * The string value representing the type of geometry.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html#type)
    */
  @JSName("type")
  val type_Point: point = js.native
  
  /**
    * The x-coordinate (easting) of the point in map units.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html#x)
    */
  var x: Double = js.native
  
  /**
    * The y-coordinate (northing) of the point in map units.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html#y)
    */
  var y: Double = js.native
  
  /**
    * The z-coordinate (or elevation) of the point in map units.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html#z)
    */
  var z: Double = js.native
}

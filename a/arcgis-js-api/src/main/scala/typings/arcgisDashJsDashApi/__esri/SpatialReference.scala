package typings.arcgisDashJsDashApi.__esri

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpatialReference
  extends Accessor
     with JSONSupport {
  /**
    * Indicates if the spatial reference refers to a geographic coordinate system.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-SpatialReference.html#isGeographic)
    */
  val isGeographic: Boolean = js.native
  /**
    * Indicates if the [wkid](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-SpatialReference.html#wkid) of the spatial reference object is `4326`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-SpatialReference.html#isWGS84)
    */
  val isWGS84: Boolean = js.native
  /**
    * Indicates if the [wkid](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-SpatialReference.html#wkid) of the spatial reference object is one of the following values: `102113`, `102100`, `3857`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-SpatialReference.html#isWebMercator)
    */
  val isWebMercator: Boolean = js.native
  /**
    * Indicates if the spatial reference of the map supports wrapping around the International Date Line. Value is `true` if the spatial reference is Web Mercator or WGS84.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-SpatialReference.html#isWrappable)
    */
  val isWrappable: Boolean = js.native
  /**
    * The well-known ID of a spatial reference. See [Projected Coordinate Systems](https://developers.arcgis.com/rest/services-reference/projected-coordinate-systems.htm) and [Geographic Coordinate Systems](https://developers.arcgis.com/rest/services-reference/geographic-coordinate-systems.htm) for the list of supported spatial references.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-SpatialReference.html#wkid)
    */
  var wkid: Double = js.native
  /**
    * The well-known text that defines a spatial reference.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-SpatialReference.html#wkt)
    */
  var wkt: String = js.native
  /**
    * Checks if the specified spatial reference object has the same [wkid](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-SpatialReference.html#wkid) or [wkt](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-SpatialReference.html#wkt) as this spatial reference object.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-SpatialReference.html#equals)
    *
    * @param spatialReference The spatial reference to compare to.
    *
    */
  def equals(spatialReference: SpatialReference): Boolean = js.native
}

@JSGlobal("__esri.SpatialReference")
@js.native
object SpatialReference extends TopLevel[SpatialReferenceConstructor]


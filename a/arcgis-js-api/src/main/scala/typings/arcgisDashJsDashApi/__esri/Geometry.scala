package typings.arcgisDashJsDashApi.__esri

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Geometry
  extends Accessor
     with JSONSupport {
  /**
    * The cache is used to store values computed from geometries that need to cleared or recomputed upon mutation. An example is the extent of a polygon.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Geometry.html#cache)
    */
  val cache: js.Any = js.native
  /**
    * The extent of the geometry. For a point, the extent is null.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Geometry.html#extent)
    */
  val extent: Extent = js.native
  /**
    * Indicates if the geometry has M values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Geometry.html#hasM)
    */
  var hasM: Boolean = js.native
  /**
    * Indicates if the geometry has Z (elevation) values.
    * > **Z-values** defined in a geographic or metric coordinate system are expressed in meters. However, in local scenes that use a projected coordinate system, vertical units are assumed to be the same as the horizontal units specified by the service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Geometry.html#hasZ)
    */
  var hasZ: Boolean = js.native
  /**
    * The spatial reference of the geometry.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Geometry.html#spatialReference)
    *
    * @default WGS84 (wkid: 4326)
    */
  var spatialReference: SpatialReference = js.native
  /**
    * The geometry type.  **Possible Values:** point | multipoint | polyline | polygon | extent | mesh
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Geometry.html#type)
    */
  val `type`: String = js.native
}

@JSGlobal("__esri.Geometry")
@js.native
object Geometry extends TopLevel[GeometryConstructor]


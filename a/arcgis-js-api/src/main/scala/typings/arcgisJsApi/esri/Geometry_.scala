package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.mesh
import typings.arcgisJsApi.arcgisJsApiStrings.multipoint
import typings.arcgisJsApi.arcgisJsApiStrings.point
import typings.arcgisJsApi.arcgisJsApiStrings.polygon
import typings.arcgisJsApi.arcgisJsApiStrings.polyline
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Geometry_
  extends StObject
     with Accessor
     with JSONSupport
     with _GoToTarget2D
     with _GoToTarget3D
     with _ProfileVariableInstanceType
     with _ResultType {
  
  /**
    * The cache is used to store values computed from geometries that need to be cleared or recomputed upon mutation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Geometry.html#cache)
    */
  val cache: Any = js.native
  
  /**
    * The extent of the geometry.
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
    * Indicates if the geometry has z-values (elevation).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Geometry.html#hasZ)
    */
  var hasZ: Boolean = js.native
  
  /**
    * The spatial reference of the geometry.
    *
    * @default WGS84 (wkid: 4326)
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Geometry.html#spatialReference)
    */
  var spatialReference: SpatialReference = js.native
  
  /**
    * The geometry type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Geometry.html#type)
    */
  val `type`: point | multipoint | polyline | polygon | typings.arcgisJsApi.arcgisJsApiStrings.extent | mesh = js.native
}

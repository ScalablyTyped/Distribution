package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`150-kilometers`
import typings.arcgisJsApi.arcgisJsApiStrings.`50-kilometers`
import typings.arcgisJsApi.arcgisJsApiStrings.`benoit-1895-b-chains`
import typings.arcgisJsApi.arcgisJsApiStrings.`clarke-feet`
import typings.arcgisJsApi.arcgisJsApiStrings.`clarke-links`
import typings.arcgisJsApi.arcgisJsApiStrings.`clarke-yards`
import typings.arcgisJsApi.arcgisJsApiStrings.`gold-coast-feet`
import typings.arcgisJsApi.arcgisJsApiStrings.`indian-1937-yards`
import typings.arcgisJsApi.arcgisJsApiStrings.`indian-yards`
import typings.arcgisJsApi.arcgisJsApiStrings.`sears-1922-truncated-chains`
import typings.arcgisJsApi.arcgisJsApiStrings.`sears-chains`
import typings.arcgisJsApi.arcgisJsApiStrings.`sears-feet`
import typings.arcgisJsApi.arcgisJsApiStrings.`sears-yards`
import typings.arcgisJsApi.arcgisJsApiStrings.`us-feet`
import typings.arcgisJsApi.arcgisJsApiStrings.degrees
import typings.arcgisJsApi.arcgisJsApiStrings.feet_
import typings.arcgisJsApi.arcgisJsApiStrings.meters_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpatialReference
  extends StObject
     with Accessor
     with JSONSupport {
  
  /**
  		 * Checks if the specified spatial reference object has the same [wkid](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-SpatialReference.html#wkid) or [wkt](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-SpatialReference.html#wkt) as this spatial reference object.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-SpatialReference.html#equals)
  		 */
  def equals(spatialReference: SpatialReference): Boolean = js.native
  
  /**
  		 * An [image coordinate system](https://developers.arcgis.com/rest/services-reference/raster-ics.htm) defines the spatial reference used to display the image in its original coordinates without distortion, map transformations or ortho-rectification.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-SpatialReference.html#imageCoordinateSystem)
  		 */
  var imageCoordinateSystem: Any = js.native
  
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
  		 * Indicates if the spatial reference of the map supports wrapping around the International Date Line.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-SpatialReference.html#isWrappable)
  		 */
  val isWrappable: Boolean = js.native
  
  /**
  		 * The factor to convert one unit value in the spatial reference's [unit](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-SpatialReference.html#unit) to meters.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-SpatialReference.html#metersPerUnit)
  		 */
  val metersPerUnit: Double = js.native
  
  /**
  		 * The unit of the spatial reference.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-SpatialReference.html#unit)
  		 */
  val unit: Null | degrees | meters_ | feet_ | `us-feet` | `clarke-feet` | `clarke-yards` | `clarke-links` | `sears-yards` | `sears-feet` | `sears-chains` | `benoit-1895-b-chains` | `indian-yards` | `indian-1937-yards` | `gold-coast-feet` | `sears-1922-truncated-chains` | `50-kilometers` | `150-kilometers` = js.native
  
  /**
  		 * The well-known ID of a spatial reference.
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
}

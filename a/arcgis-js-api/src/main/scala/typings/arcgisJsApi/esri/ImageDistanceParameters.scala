package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`distance-angle`
import typings.arcgisJsApi.arcgisJsApiStrings.`nautical-miles`
import typings.arcgisJsApi.arcgisJsApiStrings.`us-feet`
import typings.arcgisJsApi.arcgisJsApiStrings.centimeters
import typings.arcgisJsApi.arcgisJsApiStrings.decimeters
import typings.arcgisJsApi.arcgisJsApiStrings.degrees
import typings.arcgisJsApi.arcgisJsApiStrings.feet_
import typings.arcgisJsApi.arcgisJsApiStrings.inches
import typings.arcgisJsApi.arcgisJsApiStrings.kilometers_
import typings.arcgisJsApi.arcgisJsApiStrings.meters_
import typings.arcgisJsApi.arcgisJsApiStrings.miles_
import typings.arcgisJsApi.arcgisJsApiStrings.millimeters
import typings.arcgisJsApi.arcgisJsApiStrings.radians
import typings.arcgisJsApi.arcgisJsApiStrings.yards
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageDistanceParameters
  extends StObject
     with Accessor
     with JSONSupport
     with BaseImageMeasureParameters {
  
  /**
  		 * The angular unit used for angle calculation.
  		 *
  		 * @default "degrees"
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageDistanceParameters.html#angularUnit)
  		 */
  var angularUnit: degrees | radians = js.native
  
  /**
  		 * A point that defines the from location of the distance and angle measurement.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageDistanceParameters.html#fromGeometry)
  		 */
  var fromGeometry: Point = js.native
  
  /**
  		 * When `true`, this method calculates the 3D measurements for the distance and angle between two points on an image service.
  		 *
  		 * @default false
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageDistanceParameters.html#is3D)
  		 */
  var is3D: Boolean = js.native
  
  /**
  		 * The linear unit used for distance calculation.
  		 *
  		 * @default "meters"
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageDistanceParameters.html#linearUnit)
  		 */
  var linearUnit: millimeters | centimeters | decimeters | meters_ | kilometers_ | inches | feet_ | yards | miles_ | `nautical-miles` | `us-feet` = js.native
  
  /**
  		 * A point that defines the to location of the distance and angle measurement.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageDistanceParameters.html#toGeometry)
  		 */
  var toGeometry: Point = js.native
  
  /**
  		 * The string value representing the type of imagery mensuration.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageDistanceParameters.html#type)
  		 */
  val `type`: `distance-angle` = js.native
}

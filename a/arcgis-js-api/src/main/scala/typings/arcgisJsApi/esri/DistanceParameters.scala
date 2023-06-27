package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`nautical-miles`
import typings.arcgisJsApi.arcgisJsApiStrings.feet_
import typings.arcgisJsApi.arcgisJsApiStrings.kilometers_
import typings.arcgisJsApi.arcgisJsApiStrings.meters_
import typings.arcgisJsApi.arcgisJsApiStrings.miles_
import typings.arcgisJsApi.arcgisJsApiStrings.yards
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DistanceParameters
  extends StObject
     with Accessor {
  
  /**
  		 * Specifies the units for measuring distance between [geometry1](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-DistanceParameters.html#geometry1) and [geometry2](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-DistanceParameters.html#geometry2).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-DistanceParameters.html#distanceUnit)
  		 */
  var distanceUnit: feet_ | kilometers_ | meters_ | miles_ | `nautical-miles` | yards = js.native
  
  /**
  		 * When `true`, the geodesic distance between [geometry1](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-DistanceParameters.html#geometry1) and [geometry2](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-DistanceParameters.html#geometry2) is measured.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-DistanceParameters.html#geodesic)
  		 */
  var geodesic: Boolean = js.native
  
  /**
  		 * The geometry from which the distance is to be measured.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-DistanceParameters.html#geometry1)
  		 */
  var geometry1: Geometry_ = js.native
  
  /**
  		 * The geometry to which the distance is to be measured.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-DistanceParameters.html#geometry2)
  		 */
  var geometry2: Geometry_ = js.native
  
  /**
  		 * Converts an instance of	this class to its ArcGIS portal JSON representation.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-DistanceParameters.html#toJSON)
  		 */
  def toJSON(): Any = js.native
}

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
trait LinearUnit
  extends StObject
     with Accessor
     with JSONSupport {
  
  /**
  		 * Specifies the value of the linear distance.
  		 *
  		 * @default 0
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-LinearUnit.html#distance)
  		 */
  var distance: Double = js.native
  
  /**
  		 * Specifies the unit type of the linear distance.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-LinearUnit.html#units)
  		 */
  var units: feet_ | kilometers_ | meters_ | miles_ | `nautical-miles` | yards = js.native
}

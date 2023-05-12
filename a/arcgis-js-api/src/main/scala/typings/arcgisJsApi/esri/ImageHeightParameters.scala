package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`base-and-top-shadow`
import typings.arcgisJsApi.arcgisJsApiStrings.`base-and-top`
import typings.arcgisJsApi.arcgisJsApiStrings.`nautical-miles`
import typings.arcgisJsApi.arcgisJsApiStrings.`top-and-top-shadow`
import typings.arcgisJsApi.arcgisJsApiStrings.`us-feet`
import typings.arcgisJsApi.arcgisJsApiStrings.centimeters
import typings.arcgisJsApi.arcgisJsApiStrings.decimeters
import typings.arcgisJsApi.arcgisJsApiStrings.feet_
import typings.arcgisJsApi.arcgisJsApiStrings.height
import typings.arcgisJsApi.arcgisJsApiStrings.inches
import typings.arcgisJsApi.arcgisJsApiStrings.kilometers_
import typings.arcgisJsApi.arcgisJsApiStrings.meters_
import typings.arcgisJsApi.arcgisJsApiStrings.miles_
import typings.arcgisJsApi.arcgisJsApiStrings.millimeters
import typings.arcgisJsApi.arcgisJsApiStrings.yards
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageHeightParameters
  extends StObject
     with Accessor
     with JSONSupport {
  
  /**
    * A point that defines the from location of the height measurement.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageHeightParameters.html#fromGeometry)
    */
  var fromGeometry: Point = js.native
  
  /**
    * Linear unit used for height calculation.
    *
    * @default "meters"
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageHeightParameters.html#linearUnit)
    */
  var linearUnit: millimeters | centimeters | decimeters | meters_ | kilometers_ | inches | feet_ | yards | miles_ | `nautical-miles` | `us-feet` = js.native
  
  /**
    * Determines how the height will be measured when the sensor info is available.
    *
    * @default "base-and-top"
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageHeightParameters.html#operationType)
    */
  var operationType: `base-and-top` | `base-and-top-shadow` | `top-and-top-shadow` = js.native
  
  /**
    * A point that defines the to location of the height measurement.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageHeightParameters.html#toGeometry)
    */
  var toGeometry: Point = js.native
  
  /**
    * The string value representing the type of imagery mensuration.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageHeightParameters.html#type)
    */
  val `type`: height = js.native
}

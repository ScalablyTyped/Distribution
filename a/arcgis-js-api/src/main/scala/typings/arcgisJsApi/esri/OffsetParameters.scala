package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`nautical-miles`
import typings.arcgisJsApi.arcgisJsApiStrings.bevelled_
import typings.arcgisJsApi.arcgisJsApiStrings.feet_
import typings.arcgisJsApi.arcgisJsApiStrings.kilometers_
import typings.arcgisJsApi.arcgisJsApiStrings.meters_
import typings.arcgisJsApi.arcgisJsApiStrings.miles_
import typings.arcgisJsApi.arcgisJsApiStrings.mitered_
import typings.arcgisJsApi.arcgisJsApiStrings.rounded_
import typings.arcgisJsApi.arcgisJsApiStrings.yards
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OffsetParameters
  extends StObject
     with Accessor
     with JSONSupport {
  
  /**
    * The `bevelRatio` is multiplied by the offset distance and the result determines how far a mitered offset intersection can be located before it is beveled.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-OffsetParameters.html#bevelRatio)
    */
  var bevelRatio: Double = js.native
  
  /**
    * The array of geometries to be offset.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-OffsetParameters.html#geometries)
    */
  var geometries: js.Array[Geometry_] = js.native
  
  /**
    * Specifies the planar distance for constructing an offset based on the input geometries.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-OffsetParameters.html#offsetDistance)
    */
  var offsetDistance: Double = js.native
  
  /**
    * Options that determine how the ends intersect.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-OffsetParameters.html#offsetHow)
    */
  var offsetHow: bevelled_ | mitered_ | rounded_ = js.native
  
  /**
    * The offset distance unit.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-OffsetParameters.html#offsetUnit)
    */
  var offsetUnit: feet_ | kilometers_ | meters_ | miles_ | `nautical-miles` | yards = js.native
}

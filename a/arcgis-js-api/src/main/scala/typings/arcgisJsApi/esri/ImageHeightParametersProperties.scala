package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`base-and-top-shadow`
import typings.arcgisJsApi.arcgisJsApiStrings.`base-and-top`
import typings.arcgisJsApi.arcgisJsApiStrings.`nautical-miles`
import typings.arcgisJsApi.arcgisJsApiStrings.`top-and-top-shadow`
import typings.arcgisJsApi.arcgisJsApiStrings.`us-feet`
import typings.arcgisJsApi.arcgisJsApiStrings.centimeters
import typings.arcgisJsApi.arcgisJsApiStrings.decimeters
import typings.arcgisJsApi.arcgisJsApiStrings.feet_
import typings.arcgisJsApi.arcgisJsApiStrings.inches
import typings.arcgisJsApi.arcgisJsApiStrings.kilometers_
import typings.arcgisJsApi.arcgisJsApiStrings.meters_
import typings.arcgisJsApi.arcgisJsApiStrings.miles_
import typings.arcgisJsApi.arcgisJsApiStrings.millimeters
import typings.arcgisJsApi.arcgisJsApiStrings.yards
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageHeightParametersProperties extends StObject {
  
  /**
    * A point that defines the from location of the height measurement.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageHeightParameters.html#fromGeometry)
    */
  var fromGeometry: js.UndefOr[PointProperties] = js.undefined
  
  /**
    * Linear unit used for height calculation.
    *
    * @default "meters"
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageHeightParameters.html#linearUnit)
    */
  var linearUnit: js.UndefOr[
    millimeters | centimeters | decimeters | meters_ | kilometers_ | inches | feet_ | yards | miles_ | `nautical-miles` | `us-feet`
  ] = js.undefined
  
  /**
    * Determines how the height will be measured when the sensor info is available.
    *
    * @default "base-and-top"
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageHeightParameters.html#operationType)
    */
  var operationType: js.UndefOr[`base-and-top` | `base-and-top-shadow` | `top-and-top-shadow`] = js.undefined
  
  /**
    * A point that defines the to location of the height measurement.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageHeightParameters.html#toGeometry)
    */
  var toGeometry: js.UndefOr[PointProperties] = js.undefined
}
object ImageHeightParametersProperties {
  
  inline def apply(): ImageHeightParametersProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageHeightParametersProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImageHeightParametersProperties] (val x: Self) extends AnyVal {
    
    inline def setFromGeometry(value: PointProperties): Self = StObject.set(x, "fromGeometry", value.asInstanceOf[js.Any])
    
    inline def setFromGeometryUndefined: Self = StObject.set(x, "fromGeometry", js.undefined)
    
    inline def setLinearUnit(
      value: millimeters | centimeters | decimeters | meters_ | kilometers_ | inches | feet_ | yards | miles_ | `nautical-miles` | `us-feet`
    ): Self = StObject.set(x, "linearUnit", value.asInstanceOf[js.Any])
    
    inline def setLinearUnitUndefined: Self = StObject.set(x, "linearUnit", js.undefined)
    
    inline def setOperationType(value: `base-and-top` | `base-and-top-shadow` | `top-and-top-shadow`): Self = StObject.set(x, "operationType", value.asInstanceOf[js.Any])
    
    inline def setOperationTypeUndefined: Self = StObject.set(x, "operationType", js.undefined)
    
    inline def setToGeometry(value: PointProperties): Self = StObject.set(x, "toGeometry", value.asInstanceOf[js.Any])
    
    inline def setToGeometryUndefined: Self = StObject.set(x, "toGeometry", js.undefined)
  }
}

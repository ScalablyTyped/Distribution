package typings.arcgisJsApi.esri

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

trait ImageDistanceParametersProperties
  extends StObject
     with BaseImageMeasureParametersProperties {
  
  /**
  		 * The angular unit used for angle calculation.
  		 *
  		 * @default "degrees"
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageDistanceParameters.html#angularUnit)
  		 */
  var angularUnit: js.UndefOr[degrees | radians] = js.undefined
  
  /**
  		 * A point that defines the from location of the distance and angle measurement.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageDistanceParameters.html#fromGeometry)
  		 */
  var fromGeometry: js.UndefOr[PointProperties] = js.undefined
  
  /**
  		 * When `true`, this method calculates the 3D measurements for the distance and angle between two points on an image service.
  		 *
  		 * @default false
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageDistanceParameters.html#is3D)
  		 */
  var is3D: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * The linear unit used for distance calculation.
  		 *
  		 * @default "meters"
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageDistanceParameters.html#linearUnit)
  		 */
  var linearUnit: js.UndefOr[
    millimeters | centimeters | decimeters | meters_ | kilometers_ | inches | feet_ | yards | miles_ | `nautical-miles` | `us-feet`
  ] = js.undefined
  
  /**
  		 * A point that defines the to location of the distance and angle measurement.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageDistanceParameters.html#toGeometry)
  		 */
  var toGeometry: js.UndefOr[PointProperties] = js.undefined
}
object ImageDistanceParametersProperties {
  
  inline def apply(): ImageDistanceParametersProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageDistanceParametersProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImageDistanceParametersProperties] (val x: Self) extends AnyVal {
    
    inline def setAngularUnit(value: degrees | radians): Self = StObject.set(x, "angularUnit", value.asInstanceOf[js.Any])
    
    inline def setAngularUnitUndefined: Self = StObject.set(x, "angularUnit", js.undefined)
    
    inline def setFromGeometry(value: PointProperties): Self = StObject.set(x, "fromGeometry", value.asInstanceOf[js.Any])
    
    inline def setFromGeometryUndefined: Self = StObject.set(x, "fromGeometry", js.undefined)
    
    inline def setIs3D(value: Boolean): Self = StObject.set(x, "is3D", value.asInstanceOf[js.Any])
    
    inline def setIs3DUndefined: Self = StObject.set(x, "is3D", js.undefined)
    
    inline def setLinearUnit(
      value: millimeters | centimeters | decimeters | meters_ | kilometers_ | inches | feet_ | yards | miles_ | `nautical-miles` | `us-feet`
    ): Self = StObject.set(x, "linearUnit", value.asInstanceOf[js.Any])
    
    inline def setLinearUnitUndefined: Self = StObject.set(x, "linearUnit", js.undefined)
    
    inline def setToGeometry(value: PointProperties): Self = StObject.set(x, "toGeometry", value.asInstanceOf[js.Any])
    
    inline def setToGeometryUndefined: Self = StObject.set(x, "toGeometry", js.undefined)
  }
}

package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageDistanceResultProperties
  extends StObject
     with BaseImageMeasureResultProperties {
  
  /**
  		 * An object containing the azimuth angle measurement values.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageDistanceResult.html#azimuthAngle)
  		 */
  var azimuthAngle: js.UndefOr[MeasurementValue] = js.undefined
  
  /**
  		 * An object containing results of the distance measurement between two points.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageDistanceResult.html#distance)
  		 */
  var distance: js.UndefOr[MeasurementValue] = js.undefined
  
  /**
  		 * An object containing elevation angle measurement values.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageDistanceResult.html#elevationAngle)
  		 */
  var elevationAngle: js.UndefOr[MeasurementValue] = js.undefined
}
object ImageDistanceResultProperties {
  
  inline def apply(): ImageDistanceResultProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageDistanceResultProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImageDistanceResultProperties] (val x: Self) extends AnyVal {
    
    inline def setAzimuthAngle(value: MeasurementValue): Self = StObject.set(x, "azimuthAngle", value.asInstanceOf[js.Any])
    
    inline def setAzimuthAngleUndefined: Self = StObject.set(x, "azimuthAngle", js.undefined)
    
    inline def setDistance(value: MeasurementValue): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
    
    inline def setDistanceUndefined: Self = StObject.set(x, "distance", js.undefined)
    
    inline def setElevationAngle(value: MeasurementValue): Self = StObject.set(x, "elevationAngle", value.asInstanceOf[js.Any])
    
    inline def setElevationAngleUndefined: Self = StObject.set(x, "elevationAngle", js.undefined)
  }
}

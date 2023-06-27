package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RasterSensorInfoProperties extends StObject {
  
  /**
  		 * The acquisition date.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterSensorInfo.html#acquisitionDate)
  		 */
  var acquisitionDate: js.UndefOr[DateProperties] = js.undefined
  
  /**
  		 * The cloud coverage (0-1).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterSensorInfo.html#cloudCover)
  		 */
  var cloudCover: js.UndefOr[Double] = js.undefined
  
  /**
  		 * The satellite product name.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterSensorInfo.html#productName)
  		 */
  var productName: js.UndefOr[String] = js.undefined
  
  /**
  		 * The sensor azimuth.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterSensorInfo.html#sensorAzimuth)
  		 */
  var sensorAzimuth: js.UndefOr[Double] = js.undefined
  
  /**
  		 * The sensor elevation.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterSensorInfo.html#sensorElevation)
  		 */
  var sensorElevation: js.UndefOr[Double] = js.undefined
  
  /**
  		 * The sensor name.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterSensorInfo.html#sensorName)
  		 */
  var sensorName: js.UndefOr[String] = js.undefined
  
  /**
  		 * The sun azimuth.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterSensorInfo.html#sunAzimuth)
  		 */
  var sunAzimuth: js.UndefOr[Double] = js.undefined
  
  /**
  		 * The sun elevation.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterSensorInfo.html#sunElevation)
  		 */
  var sunElevation: js.UndefOr[Double] = js.undefined
}
object RasterSensorInfoProperties {
  
  inline def apply(): RasterSensorInfoProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RasterSensorInfoProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RasterSensorInfoProperties] (val x: Self) extends AnyVal {
    
    inline def setAcquisitionDate(value: DateProperties): Self = StObject.set(x, "acquisitionDate", value.asInstanceOf[js.Any])
    
    inline def setAcquisitionDateUndefined: Self = StObject.set(x, "acquisitionDate", js.undefined)
    
    inline def setCloudCover(value: Double): Self = StObject.set(x, "cloudCover", value.asInstanceOf[js.Any])
    
    inline def setCloudCoverUndefined: Self = StObject.set(x, "cloudCover", js.undefined)
    
    inline def setProductName(value: String): Self = StObject.set(x, "productName", value.asInstanceOf[js.Any])
    
    inline def setProductNameUndefined: Self = StObject.set(x, "productName", js.undefined)
    
    inline def setSensorAzimuth(value: Double): Self = StObject.set(x, "sensorAzimuth", value.asInstanceOf[js.Any])
    
    inline def setSensorAzimuthUndefined: Self = StObject.set(x, "sensorAzimuth", js.undefined)
    
    inline def setSensorElevation(value: Double): Self = StObject.set(x, "sensorElevation", value.asInstanceOf[js.Any])
    
    inline def setSensorElevationUndefined: Self = StObject.set(x, "sensorElevation", js.undefined)
    
    inline def setSensorName(value: String): Self = StObject.set(x, "sensorName", value.asInstanceOf[js.Any])
    
    inline def setSensorNameUndefined: Self = StObject.set(x, "sensorName", js.undefined)
    
    inline def setSunAzimuth(value: Double): Self = StObject.set(x, "sunAzimuth", value.asInstanceOf[js.Any])
    
    inline def setSunAzimuthUndefined: Self = StObject.set(x, "sunAzimuth", js.undefined)
    
    inline def setSunElevation(value: Double): Self = StObject.set(x, "sunElevation", value.asInstanceOf[js.Any])
    
    inline def setSunElevationUndefined: Self = StObject.set(x, "sunElevation", js.undefined)
  }
}

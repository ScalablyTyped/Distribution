package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RasterSensorInfo
  extends StObject
     with Accessor
     with JSONSupport {
  
  /**
  		 * The acquisition date.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterSensorInfo.html#acquisitionDate)
  		 */
  var acquisitionDate: js.Date = js.native
  
  /**
  		 * The cloud coverage (0-1).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterSensorInfo.html#cloudCover)
  		 */
  var cloudCover: Double = js.native
  
  /**
  		 * The satellite product name.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterSensorInfo.html#productName)
  		 */
  var productName: String = js.native
  
  /**
  		 * The sensor azimuth.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterSensorInfo.html#sensorAzimuth)
  		 */
  var sensorAzimuth: Double = js.native
  
  /**
  		 * The sensor elevation.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterSensorInfo.html#sensorElevation)
  		 */
  var sensorElevation: Double = js.native
  
  /**
  		 * The sensor name.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterSensorInfo.html#sensorName)
  		 */
  var sensorName: String = js.native
  
  /**
  		 * The sun azimuth.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterSensorInfo.html#sunAzimuth)
  		 */
  var sunAzimuth: Double = js.native
  
  /**
  		 * The sun elevation.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterSensorInfo.html#sunElevation)
  		 */
  var sunElevation: Double = js.native
}

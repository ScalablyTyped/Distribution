package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseImageMeasureResult extends StObject {
  
  /**
  		 * Name of the raster dataset used in the area and height measurement.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-BaseImageMeasureResult.html#name)
  		 */
  var name: String
  
  /**
  		 * Sensor name of the raster dataset used in the area and height measurement.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-BaseImageMeasureResult.html#sensorName)
  		 */
  var sensorName: String
}
object BaseImageMeasureResult {
  
  inline def apply(name: String, sensorName: String): BaseImageMeasureResult = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], sensorName = sensorName.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseImageMeasureResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BaseImageMeasureResult] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSensorName(value: String): Self = StObject.set(x, "sensorName", value.asInstanceOf[js.Any])
  }
}

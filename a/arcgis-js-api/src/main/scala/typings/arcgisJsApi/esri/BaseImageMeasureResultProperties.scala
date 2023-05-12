package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseImageMeasureResultProperties extends StObject {
  
  /**
    * Name of the raster dataset used in the area and height measurement.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-BaseImageMeasureResult.html#name)
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Sensor name of the raster dataset used in the area and height measurement.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-BaseImageMeasureResult.html#sensorName)
    */
  var sensorName: js.UndefOr[String] = js.undefined
}
object BaseImageMeasureResultProperties {
  
  inline def apply(): BaseImageMeasureResultProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseImageMeasureResultProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BaseImageMeasureResultProperties] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSensorName(value: String): Self = StObject.set(x, "sensorName", value.asInstanceOf[js.Any])
    
    inline def setSensorNameUndefined: Self = StObject.set(x, "sensorName", js.undefined)
  }
}

package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimeInfoProperties extends StObject {
  
  /**
    * The name of the field containing the end time information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TimeInfo.html#endField)
    */
  var endField: js.UndefOr[String] = js.undefined
  
  /**
    * The time extent defines the start time and end time for all data in the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TimeInfo.html#fullTimeExtent)
    */
  var fullTimeExtent: js.UndefOr[TimeExtentProperties] = js.undefined
  
  /**
    * The time interval defines the granularity of the temporal data and allows you to visualize the data at specified intervals using the [time slider widget](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TimeInfo.html#interval)
    */
  var interval: js.UndefOr[TimeIntervalProperties] = js.undefined
  
  /**
    * The name of the field containing the start time information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TimeInfo.html#startField)
    */
  var startField: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the field used to join or group discrete locations.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TimeInfo.html#trackIdField)
    */
  var trackIdField: js.UndefOr[String] = js.undefined
}
object TimeInfoProperties {
  
  inline def apply(): TimeInfoProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeInfoProperties]
  }
  
  extension [Self <: TimeInfoProperties](x: Self) {
    
    inline def setEndField(value: String): Self = StObject.set(x, "endField", value.asInstanceOf[js.Any])
    
    inline def setEndFieldUndefined: Self = StObject.set(x, "endField", js.undefined)
    
    inline def setFullTimeExtent(value: TimeExtentProperties): Self = StObject.set(x, "fullTimeExtent", value.asInstanceOf[js.Any])
    
    inline def setFullTimeExtentUndefined: Self = StObject.set(x, "fullTimeExtent", js.undefined)
    
    inline def setInterval(value: TimeIntervalProperties): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    inline def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
    
    inline def setStartField(value: String): Self = StObject.set(x, "startField", value.asInstanceOf[js.Any])
    
    inline def setStartFieldUndefined: Self = StObject.set(x, "startField", js.undefined)
    
    inline def setTrackIdField(value: String): Self = StObject.set(x, "trackIdField", value.asInstanceOf[js.Any])
    
    inline def setTrackIdFieldUndefined: Self = StObject.set(x, "trackIdField", js.undefined)
  }
}

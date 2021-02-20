package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimeInfoProperties extends StObject {
  
  /**
    * The name of the field containing the end time information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TimeInfo.html#endField)
    */
  var endField: js.UndefOr[String] = js.native
  
  /**
    * The time extent defines the start time and end time for all data in the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TimeInfo.html#fullTimeExtent)
    */
  var fullTimeExtent: js.UndefOr[TimeExtentProperties] = js.native
  
  /**
    * The time interval defines the granularity of the temporal data and allows you to visualize the data at specified intervals using the [time slider widget](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TimeInfo.html#interval)
    */
  var interval: js.UndefOr[TimeIntervalProperties] = js.native
  
  /**
    * The name of the field containing the start time information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TimeInfo.html#startField)
    */
  var startField: js.UndefOr[String] = js.native
  
  /**
    * The name of the field used to join or group discrete locations.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TimeInfo.html#trackIdField)
    */
  var trackIdField: js.UndefOr[String] = js.native
}
object TimeInfoProperties {
  
  @scala.inline
  def apply(): TimeInfoProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeInfoProperties]
  }
  
  @scala.inline
  implicit class TimeInfoPropertiesMutableBuilder[Self <: TimeInfoProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndField(value: String): Self = StObject.set(x, "endField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndFieldUndefined: Self = StObject.set(x, "endField", js.undefined)
    
    @scala.inline
    def setFullTimeExtent(value: TimeExtentProperties): Self = StObject.set(x, "fullTimeExtent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullTimeExtentUndefined: Self = StObject.set(x, "fullTimeExtent", js.undefined)
    
    @scala.inline
    def setInterval(value: TimeIntervalProperties): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
    
    @scala.inline
    def setStartField(value: String): Self = StObject.set(x, "startField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartFieldUndefined: Self = StObject.set(x, "startField", js.undefined)
    
    @scala.inline
    def setTrackIdField(value: String): Self = StObject.set(x, "trackIdField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrackIdFieldUndefined: Self = StObject.set(x, "trackIdField", js.undefined)
  }
}

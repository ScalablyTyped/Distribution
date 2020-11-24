package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimeInfoProperties extends js.Object {
  
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
  implicit class TimeInfoPropertiesOps[Self <: TimeInfoProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEndField(value: String): Self = this.set("endField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndField: Self = this.set("endField", js.undefined)
    
    @scala.inline
    def setFullTimeExtent(value: TimeExtentProperties): Self = this.set("fullTimeExtent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFullTimeExtent: Self = this.set("fullTimeExtent", js.undefined)
    
    @scala.inline
    def setInterval(value: TimeIntervalProperties): Self = this.set("interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInterval: Self = this.set("interval", js.undefined)
    
    @scala.inline
    def setStartField(value: String): Self = this.set("startField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartField: Self = this.set("startField", js.undefined)
    
    @scala.inline
    def setTrackIdField(value: String): Self = this.set("trackIdField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrackIdField: Self = this.set("trackIdField", js.undefined)
  }
}

package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TemporalLayerProperties extends js.Object {
  
  /**
    * The layer's time extent.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-TemporalLayer.html#timeExtent)
    */
  var timeExtent: js.UndefOr[TimeExtentProperties] = js.native
  
  /**
    * TimeInfo provides information such as date fields that store [start](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TimeInfo.html#startField) and [end](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TimeInfo.html#endField) time for each feature and the [fullTimeExtent](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TimeInfo.html#fullTimeExtent) for the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-TemporalLayer.html#timeInfo)
    */
  var timeInfo: js.UndefOr[TimeInfoProperties] = js.native
  
  /**
    * A temporary offset of the time data based on a certain [TimeInterval](https://developers.arcgis.com/javascript/latest/api-reference/esri-TimeInterval.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-TemporalLayer.html#timeOffset)
    */
  var timeOffset: js.UndefOr[TimeIntervalProperties] = js.native
  
  /**
    * Determines if the layer will update its temporal data based on the view's [timeExtent](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#timeExtent).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-TemporalLayer.html#useViewTime)
    */
  var useViewTime: js.UndefOr[Boolean] = js.native
}
object TemporalLayerProperties {
  
  @scala.inline
  def apply(): TemporalLayerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TemporalLayerProperties]
  }
  
  @scala.inline
  implicit class TemporalLayerPropertiesOps[Self <: TemporalLayerProperties] (val x: Self) extends AnyVal {
    
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
    def setTimeExtent(value: TimeExtentProperties): Self = this.set("timeExtent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeExtent: Self = this.set("timeExtent", js.undefined)
    
    @scala.inline
    def setTimeInfo(value: TimeInfoProperties): Self = this.set("timeInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeInfo: Self = this.set("timeInfo", js.undefined)
    
    @scala.inline
    def setTimeOffset(value: TimeIntervalProperties): Self = this.set("timeOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeOffset: Self = this.set("timeOffset", js.undefined)
    
    @scala.inline
    def setUseViewTime(value: Boolean): Self = this.set("useViewTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseViewTime: Self = this.set("useViewTime", js.undefined)
  }
}

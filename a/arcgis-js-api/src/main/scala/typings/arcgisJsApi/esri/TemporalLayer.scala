package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TemporalLayer extends js.Object {
  
  /**
    * The layer's time extent.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-TemporalLayer.html#timeExtent)
    */
  var timeExtent: TimeExtent = js.native
  
  /**
    * TimeInfo provides information such as date fields that store [start](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TimeInfo.html#startField) and [end](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TimeInfo.html#endField) time for each feature and the [fullTimeExtent](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TimeInfo.html#fullTimeExtent) for the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-TemporalLayer.html#timeInfo)
    */
  var timeInfo: TimeInfo = js.native
  
  /**
    * A temporary offset of the time data based on a certain [TimeInterval](https://developers.arcgis.com/javascript/latest/api-reference/esri-TimeInterval.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-TemporalLayer.html#timeOffset)
    */
  var timeOffset: TimeInterval = js.native
  
  /**
    * Determines if the layer will update its temporal data based on the view's [timeExtent](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#timeExtent).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-TemporalLayer.html#useViewTime)
    */
  var useViewTime: Boolean = js.native
}
object TemporalLayer {
  
  @scala.inline
  def apply(timeExtent: TimeExtent, timeInfo: TimeInfo, timeOffset: TimeInterval, useViewTime: Boolean): TemporalLayer = {
    val __obj = js.Dynamic.literal(timeExtent = timeExtent.asInstanceOf[js.Any], timeInfo = timeInfo.asInstanceOf[js.Any], timeOffset = timeOffset.asInstanceOf[js.Any], useViewTime = useViewTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemporalLayer]
  }
  
  @scala.inline
  implicit class TemporalLayerOps[Self <: TemporalLayer] (val x: Self) extends AnyVal {
    
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
    def setTimeExtent(value: TimeExtent): Self = this.set("timeExtent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeInfo(value: TimeInfo): Self = this.set("timeInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeOffset(value: TimeInterval): Self = this.set("timeOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseViewTime(value: Boolean): Self = this.set("useViewTime", value.asInstanceOf[js.Any])
  }
}

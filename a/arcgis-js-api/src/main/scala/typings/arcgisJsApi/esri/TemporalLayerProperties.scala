package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TemporalLayerProperties extends StObject {
  
  /**
    * The layer's time extent.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-TemporalLayer.html#timeExtent)
    */
  var timeExtent: js.UndefOr[TimeExtentProperties] = js.undefined
  
  /**
    * TimeInfo provides information such as date fields that store [start](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TimeInfo.html#startField) and [end](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TimeInfo.html#endField) time for each feature and the [fullTimeExtent](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TimeInfo.html#fullTimeExtent) for the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-TemporalLayer.html#timeInfo)
    */
  var timeInfo: js.UndefOr[TimeInfoProperties] = js.undefined
  
  /**
    * A temporary offset of the time data based on a certain [TimeInterval](https://developers.arcgis.com/javascript/latest/api-reference/esri-TimeInterval.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-TemporalLayer.html#timeOffset)
    */
  var timeOffset: js.UndefOr[TimeIntervalProperties] = js.undefined
  
  /**
    * Determines if the layer will update its temporal data based on the view's [timeExtent](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#timeExtent).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-TemporalLayer.html#useViewTime)
    */
  var useViewTime: js.UndefOr[Boolean] = js.undefined
}
object TemporalLayerProperties {
  
  @scala.inline
  def apply(): TemporalLayerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TemporalLayerProperties]
  }
  
  @scala.inline
  implicit class TemporalLayerPropertiesMutableBuilder[Self <: TemporalLayerProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTimeExtent(value: TimeExtentProperties): Self = StObject.set(x, "timeExtent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeExtentUndefined: Self = StObject.set(x, "timeExtent", js.undefined)
    
    @scala.inline
    def setTimeInfo(value: TimeInfoProperties): Self = StObject.set(x, "timeInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeInfoUndefined: Self = StObject.set(x, "timeInfo", js.undefined)
    
    @scala.inline
    def setTimeOffset(value: TimeIntervalProperties): Self = StObject.set(x, "timeOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeOffsetUndefined: Self = StObject.set(x, "timeOffset", js.undefined)
    
    @scala.inline
    def setUseViewTime(value: Boolean): Self = StObject.set(x, "useViewTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseViewTimeUndefined: Self = StObject.set(x, "useViewTime", js.undefined)
  }
}

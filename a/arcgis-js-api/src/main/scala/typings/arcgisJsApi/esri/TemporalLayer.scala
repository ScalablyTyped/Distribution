package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TemporalLayer extends StObject {
  
  /**
    * The layer's time extent.
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-TemporalLayer.html#timeExtent)
    */
  var timeExtent: TimeExtent
  
  /**
    * TimeInfo provides information such as date fields that store [start](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TimeInfo.html#startField) and [end](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TimeInfo.html#endField) time for each feature and the [fullTimeExtent](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TimeInfo.html#fullTimeExtent) for the layer.
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-TemporalLayer.html#timeInfo)
    */
  var timeInfo: TimeInfo
  
  /**
    * A temporary offset of the time data based on a certain [TimeInterval](https://developers.arcgis.com/javascript/latest/api-reference/esri-TimeInterval.html).
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-TemporalLayer.html#timeOffset)
    */
  var timeOffset: TimeInterval
  
  /**
    * Determines if the layer will update its temporal data based on the view's [timeExtent](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#timeExtent).
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-TemporalLayer.html#useViewTime)
    */
  var useViewTime: Boolean
}
object TemporalLayer {
  
  inline def apply(timeExtent: TimeExtent, timeInfo: TimeInfo, timeOffset: TimeInterval, useViewTime: Boolean): TemporalLayer = {
    val __obj = js.Dynamic.literal(timeExtent = timeExtent.asInstanceOf[js.Any], timeInfo = timeInfo.asInstanceOf[js.Any], timeOffset = timeOffset.asInstanceOf[js.Any], useViewTime = useViewTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemporalLayer]
  }
  
  extension [Self <: TemporalLayer](x: Self) {
    
    inline def setTimeExtent(value: TimeExtent): Self = StObject.set(x, "timeExtent", value.asInstanceOf[js.Any])
    
    inline def setTimeInfo(value: TimeInfo): Self = StObject.set(x, "timeInfo", value.asInstanceOf[js.Any])
    
    inline def setTimeOffset(value: TimeInterval): Self = StObject.set(x, "timeOffset", value.asInstanceOf[js.Any])
    
    inline def setUseViewTime(value: Boolean): Self = StObject.set(x, "useViewTime", value.asInstanceOf[js.Any])
  }
}

package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TemporalLayer extends js.Object {
  /**
    * The layer's time extent. When the layer's [useViewTime](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-TemporalLayer.html#useViewTime) is `false`, the layer instructs the view to show data from the layer based on this time extent. If the `useViewTime` is `true`, then this property has no effect on the layer, because the layer will show the data within the view's [timeExtent](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#timeExtent) property.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-TemporalLayer.html#timeExtent)
    *
    * @default null
    */
  var timeExtent: TimeExtent
  /**
    * TimeInfo provides information such as date fields that store [start](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TimeInfo.html#startField) and [end](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TimeInfo.html#endField) time for each feature and the [fullTimeExtent](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TimeInfo.html#fullTimeExtent) for the layer. The `timeInfo` property, along with its `startField` and `endField` properties, must be set at the time of layer initialization if it is being set for a [GeoJSONLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html), [CSVLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html) or [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html) initialized from [client-side features](esri-layers-FeatureLayer.html#creating-a-featurelayer). The [fullTimeExtent](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TimeInfo.html#fullTimeExtent) for `timeInfo` is automatically calculated based on its `startField` and `endField` properties. The timeInfo parameters cannot be changed after the layer is [loaded](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#load).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-TemporalLayer.html#timeInfo)
    *
    * @default null
    */
  var timeInfo: TimeInfo
  /**
    * A temporary offset of the time data based on a certain [TimeInterval](https://developers.arcgis.com/javascript/latest/api-reference/esri-TimeInterval.html). This allows users to overlay features from two or more time-aware layers with different time extents. For example, if a layer has data recorded for the year 1970, an offset value of 2 years would temporarily shift the data to 1972. You can then overlay this data with data recorded in 1972. A time offset can be used for display purposes only. The query and selection are not affected by the offset.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-TemporalLayer.html#timeOffset)
    *
    * @default null
    */
  var timeOffset: TimeInterval
  /**
    * Determines if the layer will update its temporal data based on the view's current [timeExtent](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#timeExtent). When `false`, the layer will display its temporal data based on the layer's [timeExtent](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-TemporalLayer.html#timeExtent), regardless of changes to the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-TemporalLayer.html#useViewTime)
    *
    * @default true
    */
  var useViewTime: Boolean
}

object TemporalLayer {
  @scala.inline
  def apply(timeExtent: TimeExtent, timeInfo: TimeInfo, timeOffset: TimeInterval, useViewTime: Boolean): TemporalLayer = {
    val __obj = js.Dynamic.literal(timeExtent = timeExtent.asInstanceOf[js.Any], timeInfo = timeInfo.asInstanceOf[js.Any], timeOffset = timeOffset.asInstanceOf[js.Any], useViewTime = useViewTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemporalLayer]
  }
}


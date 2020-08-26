package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TemporalLayerProperties extends js.Object {
  /**
    * The layer's time extent. When the layer's [useViewTime](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-TemporalLayer.html#useViewTime) is `false`, the layer instructs the view to show data from the layer based on this time extent. If the `useViewTime` is `true`, and both layer and view time extents are set, then features that fall within the intersection of the view and layer time extents will be displayed. For example, if the layer's time extent is set to display features between 1970 and 1975 and the view has a time extent set to 1972-1980, the effective time on the feature layer will be 1972-1975.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-TemporalLayer.html#timeExtent)
    *
    * @default null
    */
  var timeExtent: js.UndefOr[TimeExtentProperties] = js.native
  /**
    * TimeInfo provides information such as date fields that store [start](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TimeInfo.html#startField) and [end](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TimeInfo.html#endField) time for each feature and the [fullTimeExtent](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TimeInfo.html#fullTimeExtent) for the layer. The `timeInfo` property, along with its `startField` and `endField` properties, must be set at the time of layer initialization if it is being set for a [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html), [CSVLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html) or [GeoJSONLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html) initialized from [client-side features](esri-layers-FeatureLayer.html#creating-a-featurelayer). The [fullTimeExtent](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TimeInfo.html#fullTimeExtent) for `timeInfo` is automatically calculated based on its `startField` and `endField` properties. The timeInfo parameters cannot be changed after the layer is [loaded](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#load).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-TemporalLayer.html#timeInfo)
    *
    * @default null
    */
  var timeInfo: js.UndefOr[TimeInfoProperties] = js.native
  /**
    * A temporary offset of the time data based on a certain [TimeInterval](https://developers.arcgis.com/javascript/latest/api-reference/esri-TimeInterval.html). This allows users to overlay features from two or more time-aware layers with different time extents. For example, if a layer has data recorded for the year 1970, an offset value of 2 years would temporarily shift the data to 1972. You can then overlay this data with data recorded in 1972. A time offset can be used for display purposes only. The query and selection are not affected by the offset.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-TemporalLayer.html#timeOffset)
    *
    * @default null
    */
  var timeOffset: js.UndefOr[TimeIntervalProperties] = js.native
  /**
    * Determines if the layer will update its temporal data based on the view's [timeExtent](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#timeExtent). When `false`, the layer will display its temporal data based on the layer's [timeExtent](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-TemporalLayer.html#timeExtent), regardless of changes to the view. If both view and layer time extents are set while this property is `true`, then the features that fall within the intersection of the view and layer time extents will be displayed. For example, if a layer's time extent is set to display features between 1970 and 1975 and the view has a time extent set to 1972-1980, the effective time on the feature layer will be 1972-1975.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-TemporalLayer.html#useViewTime)
    *
    * @default true
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


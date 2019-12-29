package typings.arcgisDashJsDashApi.esriLayersGeoJSONLayerMod

import typings.arcgisDashJsDashApi.__esri.GeoJSONLayer
import typings.arcgisDashJsDashApi.__esri.GeoJSONLayerProperties
import typings.arcgisDashJsDashApi.__esri.TimeExtent
import typings.arcgisDashJsDashApi.__esri.TimeInfo
import typings.arcgisDashJsDashApi.__esri.TimeInterval
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esri/layers/GeoJSONLayer", JSImport.Namespace)
@js.native
/**
  * The GeoJSONLayer class is used to create a layer based on [GeoJSON](http://geojson.org/). GeoJSON is a format for encoding a variety of geographic data structures. The GeoJSON data must comply with the [RFC 7946 specification](https://tools.ietf.org/html/rfc7946) which states that the coordinates are in SpatialReference.WGS84.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html)
  */
class Class () extends GeoJSONLayer {
  def this(properties: GeoJSONLayerProperties) = this()
  /**
    * The maximum scale (most zoomed in) at which the layer is visible in the view. If the map is zoomed in beyond this scale, the layer will not be visible. A value of `0` means the layer does not have a maximum scale. The maxScale value should always be smaller than the [minScale](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ScaleRangeLayer.html#minScale) value, and greater than or equal to the service specification.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ScaleRangeLayer.html#maxScale)
    *
    * @default 0
    */
  /* CompleteClass */
  override var maxScale: Double = js.native
  /**
    * The minimum scale (most zoomed out) at which the layer is visible in the view. If the map is zoomed out beyond this scale, the layer will not be visible. A value of `0` means the layer does not have a minimum scale. The minScale value should always be larger than the [maxScale](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ScaleRangeLayer.html#maxScale) value, and lesser than or equal to the service specification.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ScaleRangeLayer.html#minScale)
    *
    * @default 0
    */
  /* CompleteClass */
  override var minScale: Double = js.native
  /**
    * The layer's time extent. When the layer's [useViewTime](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-TemporalLayer.html#useViewTime) is `false`, the layer instructs the view to show data from the layer based on this time extent. If the `useViewTime` is `true`, then this property has no effect on the layer, because the layer will show the data within the view's [timeExtent](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#timeExtent) property.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-TemporalLayer.html#timeExtent)
    *
    * @default null
    */
  /* CompleteClass */
  override var timeExtent: TimeExtent = js.native
  /**
    * TimeInfo provides information such as date fields that store [start](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TimeInfo.html#startField) and [end](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TimeInfo.html#endField) time for each feature and the [fullTimeExtent](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TimeInfo.html#fullTimeExtent) for the layer. The `timeInfo` property, along with its `startField` and `endField` properties, must be set at the time of layer initialization if it is being set for a [GeoJSONLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html), [CSVLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html) or [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html) initialized from [client-side features](esri-layers-FeatureLayer.html#creating-a-featurelayer). The [fullTimeExtent](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TimeInfo.html#fullTimeExtent) for `timeInfo` is automatically calculated based on its `startField` and `endField` properties. The timeInfo parameters cannot be changed after the layer is [loaded](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#load).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-TemporalLayer.html#timeInfo)
    *
    * @default null
    */
  /* CompleteClass */
  override var timeInfo: TimeInfo = js.native
  /**
    * A temporary offset of the time data based on a certain [TimeInterval](https://developers.arcgis.com/javascript/latest/api-reference/esri-TimeInterval.html). This allows users to overlay features from two or more time-aware layers with different time extents. For example, if a layer has data recorded for the year 1970, an offset value of 2 years would temporarily shift the data to 1972. You can then overlay this data with data recorded in 1972. A time offset can be used for display purposes only. The query and selection are not affected by the offset.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-TemporalLayer.html#timeOffset)
    *
    * @default null
    */
  /* CompleteClass */
  override var timeOffset: TimeInterval = js.native
  /**
    * Determines if the layer will update its temporal data based on the view's current [timeExtent](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#timeExtent). When `false`, the layer will display its temporal data based on the layer's [timeExtent](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-TemporalLayer.html#timeExtent), regardless of changes to the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-TemporalLayer.html#useViewTime)
    *
    * @default true
    */
  /* CompleteClass */
  override var useViewTime: Boolean = js.native
}


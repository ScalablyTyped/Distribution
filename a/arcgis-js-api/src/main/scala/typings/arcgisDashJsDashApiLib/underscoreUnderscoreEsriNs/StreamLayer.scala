package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StreamLayer extends FeatureLayer {
  /**
    * Contains the attribute and spatial filters used to filter messages sent to the client by a Stream Service. This property can be set in the constructor but is `read-only` after the layer is created. To change the filter after the layer is created, use the [updateFilter()](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html#updateFilter) method.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html#filter)
    */
  val filter: StreamLayerFilter = js.native
  /**
    * An extent object used to filter features. Only features intersecting the extent are displayed in the view. Instead of using this property, use [StreamLayer.filter.geometry](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html#filter) when creating the service or [StreamLayer.updateFilter()](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html#updateFilter) when changing the spatial filter.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html#geometryDefinition)
    */
  var geometryDefinition: Extent = js.native
  /**
    * Maximum number of features to show per [trackId](https://enterprise.arcgis.com/en/geoevent/latest/get-started/essential-geoevent-server-vocabulary.htm#ESRI_SECTION1_F45BBCE9ADFA4E57AF38DD225921EFCD).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html#maximumTrackPoints)
    */
  var maximumTrackPoints: scala.Double = js.native
  /**
    * Options for purging stale features. Use these options to avoid overloading the browser with graphics.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html#purgeOptions)
    */
  var purgeOptions: StreamLayerPurgeOptions = js.native
  /**
    * Updates the [filter](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html#filter) on the layer. The filter is updated on all views that contain the layer. If the input `filterChanges` object is `undefined` or `null`, the spatial and attribute filters are removed. To update the filter on a single layer view associated with the layer, use the [StreamLayerView.updateFilter()](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-StreamLayerView.html#updateFilter) method after getting the layer view object.  Filter changes only apply to incoming features. Features already displayed in the view will be removed automatically.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html#updateFilter)
    *
    * @param filterChanges Updates the spatial and attribute [filters](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html#filter) on the layer and all of its associated views. If `null`, all filters are cleared.
    * @param filterChanges.geometry A spatial filter for filtering features. Only features that intersect the given geometry are displayed in the view(s). If `null`, the spatial filter is cleared.
    * @param filterChanges.where A SQL where clause used to filter features by attributes. If `null`, the attribute filter is cleared.
    *
    */
  def updateFilter(filterChanges: StreamLayerUpdateFilterFilterChanges): arcgisDashJsDashApiLib.IPromise[_] = js.native
}

@JSGlobal("__esri.StreamLayer")
@js.native
/**
  * The stream layer extends the feature layer to add the ability to connect to a stream of data using HTML5 WebSockets. It connects to a server that emits geographic features continuously. While the feature layer is used to map relatively static data, the stream layer is suitable when you would like to map dynamic streams of data that are unbounded and continuous. When a stream layer is added to a map, users are able to see real-time updates pushed out by the server.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html)
  */
class StreamLayerCls () extends StreamLayer {
  def this(properties: StreamLayerProperties) = this()
  /**
    * The maximum scale (most zoomed in) at which the layer is visible in the view. If the map is zoomed in beyond this scale, the layer will not be visible. A value of `0` means the layer does not have a maximum scale. The maxScale value should always be smaller than the [minScale](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ScaleRangeLayer.html#minScale) value, and greater than or equal to the service specification.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ScaleRangeLayer.html#maxScale)
    *
    * @default 0
    */
  /* CompleteClass */
  override var maxScale: scala.Double = js.native
  /**
    * The minimum scale (most zoomed out) at which the layer is visible in the view. If the map is zoomed out beyond this scale, the layer will not be visible. A value of `0` means the layer does not have a minimum scale. The minScale value should always be larger than the [maxScale](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ScaleRangeLayer.html#maxScale) value, and lesser than or equal to the service specification.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ScaleRangeLayer.html#minScale)
    *
    * @default 0
    */
  /* CompleteClass */
  override var minScale: scala.Double = js.native
  /**
    * The portal item from which the layer is loaded. If the portal item references a Feature Service or Scene Service, then you can specify a single layer to load with the [layerId](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-PortalLayer.html#layerId) property.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-PortalLayer.html#portalItem)
    */
  /* CompleteClass */
  override var portalItem: PortalItem = js.native
  /**
    * Refresh interval of the layer in minutes. Minimum refresh interval is 0.1 minute (6 seconds). Value of `0` indicates no refresh.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-RefreshableLayer.html#refreshInterval)
    *
    * @default 0
    */
  /* CompleteClass */
  override var refreshInterval: scala.Double = js.native
  /**
    * Fetches all the data for the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-RefreshableLayer.html#refresh)
    *
    *
    */
  /* CompleteClass */
  override def refresh(): scala.Unit = js.native
}


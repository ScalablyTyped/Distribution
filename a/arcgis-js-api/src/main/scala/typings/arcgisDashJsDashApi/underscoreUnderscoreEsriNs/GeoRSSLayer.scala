package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import typings.arcgisDashJsDashApi.IHandle
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`layerview-create-error`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`layerview-create`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`layerview-destroy`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeoRSSLayer
  extends Layer
     with ScaleRangeLayer {
  /**
    * Symbol used to represent line features from the GeoRSS feed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoRSSLayer.html#lineSymbol)
    */
  var lineSymbol: SimpleLineSymbol = js.native
  /**
    * Symbol used to represent point features from the GeoRSS feed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoRSSLayer.html#pointSymbol)
    */
  var pointSymbol: PictureMarkerSymbol = js.native
  /**
    * Symbol used to represent polygon features from the GeoRSS feed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoRSSLayer.html#polygonSymbol)
    */
  var polygonSymbol: SimpleFillSymbol = js.native
  /**
    * The URL pointing to a GeoRSS file. This must be publicly available.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoRSSLayer.html#url)
    */
  var url: String = js.native
  @JSName("on")
  def on_layerviewcreate(name: `layerview-create`, eventHandler: GeoRSSLayerLayerviewCreateEventHandler): IHandle = js.native
  @JSName("on")
  def on_layerviewcreateerror(name: `layerview-create-error`, eventHandler: GeoRSSLayerLayerviewCreateErrorEventHandler): IHandle = js.native
  @JSName("on")
  def on_layerviewdestroy(name: `layerview-destroy`, eventHandler: GeoRSSLayerLayerviewDestroyEventHandler): IHandle = js.native
}

@JSGlobal("__esri.GeoRSSLayer")
@js.native
/**
  * The GeoRSSLayer class is used to create a layer based on [GeoRSS](http://www.georss.org/). GeoRSS is a way to add geographic information to an RSS feed. The GeoRSSLayer supports both `GeoRSS-Simple` and `GeoRSS GML` encodings, and multiple geometry types.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoRSSLayer.html)
  */
class GeoRSSLayerCls () extends GeoRSSLayer {
  def this(properties: GeoRSSLayerProperties) = this()
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
}


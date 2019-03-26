package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WMTSLayer
  extends Layer
     with PortalLayer
     with ScaleRangeLayer
     with RefreshableLayer {
  /**
    * Currently active sublayer. Defaults to the first sublayer in [sublayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMTSLayer.html#sublayers).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMTSLayer.html#activeLayer)
    */
  var activeLayer: WMTSSublayer = js.native
  /**
    * Copyright information for the WMTS service. This defaults to the value of the AccessConstraints property from the GetCapabilities request.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMTSLayer.html#copyright)
    */
  var copyright: java.lang.String = js.native
  /**
    * Use this to append different custom parameters to the WMTS tile requests. The custom layer parameters are applied to GetTile.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMTSLayer.html#customLayerParameters)
    */
  var customLayerParameters: js.Any = js.native
  /**
    * Use this to append custom parameters to all WMTS requests. The custom parameters are applied to GetCapabilities and GetTile. For example, if an access key is required, the key can be configured as a custom parameter.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMTSLayer.html#customParameters)
    */
  var customParameters: js.Any = js.native
  /**
    * The service mode for the WMTS layer. If not specified, the API will first make a getCapabilities request using `RESTful`. If that fails, it will try using `KVP`.  **Possible Values:** RESTful | KVP
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMTSLayer.html#serviceMode)
    *
    * @default RESTful
    */
  var serviceMode: java.lang.String = js.native
  /**
    * A collection of [WMTSSublayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMTSSublayer.html) objects.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMTSLayer.html#sublayers)
    */
  var sublayers: Collection[WMTSSublayer] = js.native
  /**
    * The URL of the WMTS service. The URL for the GetCapabilities is created based on the url and serviceMode properties. For example https://gibs.earthdata.nasa.gov/wmts/epsg4326/best.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMTSLayer.html#url)
    */
  var url: java.lang.String = js.native
  /**
    * Version of the [WMTS specification](http://www.opengeospatial.org/standards/wmts) to use. Probably `1.0.0`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMTSLayer.html#version)
    */
  var version: java.lang.String = js.native
  /**
    * Returns a [WMTSSublayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMTSSublayer.html) based on the given sublayer id.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMTSLayer.html#findSublayerById)
    *
    * @param id The [id](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMTSSublayer.html#id) of the WMTS sublayer.
    *
    */
  def findSublayerById(id: java.lang.String): WMTSSublayer = js.native
  @JSName("on")
  def `on_layerview-create`(
    name: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`layerview-create`,
    eventHandler: WMTSLayerLayerviewCreateEventHandler
  ): arcgisDashJsDashApiLib.IHandle = js.native
  @JSName("on")
  def `on_layerview-destroy`(
    name: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`layerview-destroy`,
    eventHandler: WMTSLayerLayerviewDestroyEventHandler
  ): arcgisDashJsDashApiLib.IHandle = js.native
}

@JSGlobal("__esri.WMTSLayer")
@js.native
class WMTSLayerCls () extends WMTSLayer {
  def this(properties: WMTSLayerProperties) = this()
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


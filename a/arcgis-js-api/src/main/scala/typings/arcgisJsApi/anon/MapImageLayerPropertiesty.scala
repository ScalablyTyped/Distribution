package typings.arcgisJsApi.anon

import typings.arcgisJsApi.arcgisJsApiStrings.`color-burn`
import typings.arcgisJsApi.arcgisJsApiStrings.`color-dodge`
import typings.arcgisJsApi.arcgisJsApiStrings.`destination-atop`
import typings.arcgisJsApi.arcgisJsApiStrings.`destination-in`
import typings.arcgisJsApi.arcgisJsApiStrings.`destination-out`
import typings.arcgisJsApi.arcgisJsApiStrings.`destination-over`
import typings.arcgisJsApi.arcgisJsApiStrings.`hard-light`
import typings.arcgisJsApi.arcgisJsApiStrings.`hide-children`
import typings.arcgisJsApi.arcgisJsApiStrings.`map-image`
import typings.arcgisJsApi.arcgisJsApiStrings.`soft-light`
import typings.arcgisJsApi.arcgisJsApiStrings.`source-atop`
import typings.arcgisJsApi.arcgisJsApiStrings.`source-in`
import typings.arcgisJsApi.arcgisJsApiStrings.`source-out`
import typings.arcgisJsApi.arcgisJsApiStrings.`vivid-light`
import typings.arcgisJsApi.arcgisJsApiStrings.average
import typings.arcgisJsApi.arcgisJsApiStrings.bmp
import typings.arcgisJsApi.arcgisJsApiStrings.color
import typings.arcgisJsApi.arcgisJsApiStrings.darken
import typings.arcgisJsApi.arcgisJsApiStrings.difference
import typings.arcgisJsApi.arcgisJsApiStrings.exclusion
import typings.arcgisJsApi.arcgisJsApiStrings.gif
import typings.arcgisJsApi.arcgisJsApiStrings.hide
import typings.arcgisJsApi.arcgisJsApiStrings.hue
import typings.arcgisJsApi.arcgisJsApiStrings.invert
import typings.arcgisJsApi.arcgisJsApiStrings.jpg
import typings.arcgisJsApi.arcgisJsApiStrings.lighten
import typings.arcgisJsApi.arcgisJsApiStrings.lighter
import typings.arcgisJsApi.arcgisJsApiStrings.luminosity
import typings.arcgisJsApi.arcgisJsApiStrings.minus
import typings.arcgisJsApi.arcgisJsApiStrings.multiply
import typings.arcgisJsApi.arcgisJsApiStrings.normal
import typings.arcgisJsApi.arcgisJsApiStrings.overlay
import typings.arcgisJsApi.arcgisJsApiStrings.pdf
import typings.arcgisJsApi.arcgisJsApiStrings.plus
import typings.arcgisJsApi.arcgisJsApiStrings.png
import typings.arcgisJsApi.arcgisJsApiStrings.png24
import typings.arcgisJsApi.arcgisJsApiStrings.png32
import typings.arcgisJsApi.arcgisJsApiStrings.png8
import typings.arcgisJsApi.arcgisJsApiStrings.pngjpg
import typings.arcgisJsApi.arcgisJsApiStrings.reflect
import typings.arcgisJsApi.arcgisJsApiStrings.saturation
import typings.arcgisJsApi.arcgisJsApiStrings.screen
import typings.arcgisJsApi.arcgisJsApiStrings.show
import typings.arcgisJsApi.arcgisJsApiStrings.svg
import typings.arcgisJsApi.arcgisJsApiStrings.xor
import typings.arcgisJsApi.esri.BasemapProperties
import typings.arcgisJsApi.esri.CollectionProperties
import typings.arcgisJsApi.esri.ExtentProperties
import typings.arcgisJsApi.esri.GroundProperties
import typings.arcgisJsApi.esri.MapProperties
import typings.arcgisJsApi.esri.PortalItemProperties
import typings.arcgisJsApi.esri.SublayerProperties
import typings.arcgisJsApi.esri.TimeExtentProperties
import typings.arcgisJsApi.esri.TimeInfoProperties
import typings.arcgisJsApi.esri.TimeIntervalProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined arcgis-js-api.__esri.MapImageLayerProperties & {  type :'map-image'} */
trait MapImageLayerPropertiesty extends StObject {
  
  /**
  		 * Blend modes are used to blend layers together to create an interesting effect in a layer, or even to produce what seems like a new layer.
  		 *
  		 * @default normal
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-BlendLayer.html#blendMode)
  		 */
  var blendMode: js.UndefOr[
    average | `color-burn` | `color-dodge` | color | darken | `destination-atop` | `destination-in` | `destination-out` | `destination-over` | difference | exclusion | `hard-light` | hue | invert | lighten | lighter | luminosity | minus | multiply | normal | overlay | plus | reflect | saturation | screen | `soft-light` | `source-atop` | `source-in` | `source-out` | `vivid-light` | xor
  ] = js.undefined
  
  /**
  		 * The copyright text as defined by the service.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISMapService.html#copyright)
  		 */
  var copyright: js.UndefOr[String] = js.undefined
  
  /**
  		 * A list of custom parameters appended to the URL of all resources fetched by the layer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-CustomParametersMixin.html#customParameters)
  		 */
  var customParameters: js.UndefOr[Any] = js.undefined
  
  /**
  		 * The output dots per inch (DPI) of the MapImageLayer.
  		 *
  		 * @default 96
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MapImageLayer.html#dpi)
  		 */
  var dpi: js.UndefOr[Double] = js.undefined
  
  /**
  		 * Effect provides various filter functions that can be performed on the layer to achieve different visual effects similar to how image filters work.
  		 *
  		 * @default null
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-BlendLayer.html#effect)
  		 */
  var effect: js.UndefOr[js.Array[Any] | String] = js.undefined
  
  /**
  		 * The full extent of the layer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html#fullExtent)
  		 */
  /**
  		 * The full extent of the layer as defined by the map service.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISMapService.html#fullExtent)
  		 */
  var fullExtent: js.UndefOr[ExtentProperties] = js.undefined
  
  /**
  		 * The version of the geodatabase of the map service data.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MapImageLayer.html#gdbVersion)
  		 */
  var gdbVersion: js.UndefOr[String] = js.undefined
  
  /**
  		 * The unique ID assigned to the layer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html#id)
  		 */
  var id: js.UndefOr[String] = js.undefined
  
  /**
  		 * The output image type.
  		 *
  		 * @default png24
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MapImageLayer.html#imageFormat)
  		 */
  var imageFormat: js.UndefOr[png | png8 | png24 | png32 | jpg | pdf | bmp | gif | svg | pngjpg] = js.undefined
  
  /**
  		 * Indicates the maximum height of the image exported by the service.
  		 *
  		 * @default 2048
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MapImageLayer.html#imageMaxHeight)
  		 */
  var imageMaxHeight: js.UndefOr[Double] = js.undefined
  
  /**
  		 * Indicates the maximum width of the image exported by the service.
  		 *
  		 * @default 2048
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MapImageLayer.html#imageMaxWidth)
  		 */
  var imageMaxWidth: js.UndefOr[Double] = js.undefined
  
  /**
  		 * Indicates whether the background of the image exported by the service is transparent.
  		 *
  		 * @default true
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MapImageLayer.html#imageTransparency)
  		 */
  var imageTransparency: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * Indicates whether the layer will be included in the legend.
  		 *
  		 * @default true
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISMapService.html#legendEnabled)
  		 */
  var legendEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * Indicates how the layer should display in the [LayerList](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList.html) widget.
  		 *
  		 * @default "show"
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html#listMode)
  		 */
  var listMode: js.UndefOr[show | hide | `hide-children`] = js.undefined
  
  /**
  		 * The maximum scale (most zoomed in) at which the layer is visible in the view.
  		 *
  		 * @default 0
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ScaleRangeLayer.html#maxScale)
  		 */
  var maxScale: js.UndefOr[Double] = js.undefined
  
  /**
  		 * The minimum scale (most zoomed out) at which the layer is visible in the view.
  		 *
  		 * @default 0
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ScaleRangeLayer.html#minScale)
  		 */
  var minScale: js.UndefOr[Double] = js.undefined
  
  /**
  		 * The opacity of the layer.
  		 *
  		 * @default 1
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html#opacity)
  		 */
  var opacity: js.UndefOr[Double] = js.undefined
  
  /**
  		 * The parent to which the layer belongs.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html#parent)
  		 */
  var parent: js.UndefOr[MapProperties | BasemapProperties | GroundProperties | GroupLayerPropertiestypeg] = js.undefined
  
  /**
  		 * The portal item from which the layer is loaded.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MapImageLayer.html#portalItem)
  		 */
  var portalItem: js.UndefOr[PortalItemProperties] = js.undefined
  
  /**
  		 * Refresh interval of the layer in minutes.
  		 *
  		 * @default 0
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-RefreshableLayer.html#refreshInterval)
  		 */
  var refreshInterval: js.UndefOr[Double] = js.undefined
  
  /**
  		 * The [map service's metadata JSON](https://developers.arcgis.com/rest/services-reference/map-service.htm) exposed by the ArcGIS REST API.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MapImageLayer.html#sourceJSON)
  		 */
  var sourceJSON: js.UndefOr[Any] = js.undefined
  
  /**
  		 * A [Collection](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Collection.html) of [Sublayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html) objects that allow you to alter the properties of one or more sublayers of the MapImageLayer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MapImageLayer.html#sublayers)
  		 */
  var sublayers: js.UndefOr[CollectionProperties[SublayerProperties]] = js.undefined
  
  /**
  		 * The layer's time extent.
  		 *
  		 * @default null
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-TemporalLayer.html#timeExtent)
  		 */
  var timeExtent: js.UndefOr[TimeExtentProperties] = js.undefined
  
  /**
  		 * TimeInfo provides information such as date fields that store [start](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TimeInfo.html#startField) and [end](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TimeInfo.html#endField) time for each feature and the [fullTimeExtent](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TimeInfo.html#fullTimeExtent) for the layer.
  		 *
  		 * @default null
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-TemporalLayer.html#timeInfo)
  		 */
  var timeInfo: js.UndefOr[TimeInfoProperties] = js.undefined
  
  /**
  		 * A temporary offset of the time data based on a certain [TimeInterval](https://developers.arcgis.com/javascript/latest/api-reference/esri-TimeInterval.html).
  		 *
  		 * @default null
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-TemporalLayer.html#timeOffset)
  		 */
  var timeOffset: js.UndefOr[TimeIntervalProperties] = js.undefined
  
  /**
  		 * The title of the layer used to identify it in places such as the [LayerList](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList.html) widget.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html#title)
  		 */
  var title: js.UndefOr[String] = js.undefined
  
  var `type`: `map-image`
  
  /**
  		 * The URL to the REST endpoint of the map service.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MapImageLayer.html#url)
  		 */
  var url: js.UndefOr[String] = js.undefined
  
  /**
  		 * Determines if the layer will update its temporal data based on the view's [timeExtent](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#timeExtent).
  		 *
  		 * @default true
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-TemporalLayer.html#useViewTime)
  		 */
  var useViewTime: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * Indicates if the layer is visible in the [View](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html).
  		 *
  		 * @default true
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html#visible)
  		 */
  var visible: js.UndefOr[Boolean] = js.undefined
}
object MapImageLayerPropertiesty {
  
  inline def apply(): MapImageLayerPropertiesty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("map-image")
    __obj.asInstanceOf[MapImageLayerPropertiesty]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MapImageLayerPropertiesty] (val x: Self) extends AnyVal {
    
    inline def setBlendMode(
      value: average | `color-burn` | `color-dodge` | color | darken | `destination-atop` | `destination-in` | `destination-out` | `destination-over` | difference | exclusion | `hard-light` | hue | invert | lighten | lighter | luminosity | minus | multiply | normal | overlay | plus | reflect | saturation | screen | `soft-light` | `source-atop` | `source-in` | `source-out` | `vivid-light` | xor
    ): Self = StObject.set(x, "blendMode", value.asInstanceOf[js.Any])
    
    inline def setBlendModeUndefined: Self = StObject.set(x, "blendMode", js.undefined)
    
    inline def setCopyright(value: String): Self = StObject.set(x, "copyright", value.asInstanceOf[js.Any])
    
    inline def setCopyrightUndefined: Self = StObject.set(x, "copyright", js.undefined)
    
    inline def setCustomParameters(value: Any): Self = StObject.set(x, "customParameters", value.asInstanceOf[js.Any])
    
    inline def setCustomParametersUndefined: Self = StObject.set(x, "customParameters", js.undefined)
    
    inline def setDpi(value: Double): Self = StObject.set(x, "dpi", value.asInstanceOf[js.Any])
    
    inline def setDpiUndefined: Self = StObject.set(x, "dpi", js.undefined)
    
    inline def setEffect(value: js.Array[Any] | String): Self = StObject.set(x, "effect", value.asInstanceOf[js.Any])
    
    inline def setEffectUndefined: Self = StObject.set(x, "effect", js.undefined)
    
    inline def setEffectVarargs(value: Any*): Self = StObject.set(x, "effect", js.Array(value*))
    
    inline def setFullExtent(value: ExtentProperties): Self = StObject.set(x, "fullExtent", value.asInstanceOf[js.Any])
    
    inline def setFullExtentUndefined: Self = StObject.set(x, "fullExtent", js.undefined)
    
    inline def setGdbVersion(value: String): Self = StObject.set(x, "gdbVersion", value.asInstanceOf[js.Any])
    
    inline def setGdbVersionUndefined: Self = StObject.set(x, "gdbVersion", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setImageFormat(value: png | png8 | png24 | png32 | jpg | pdf | bmp | gif | svg | pngjpg): Self = StObject.set(x, "imageFormat", value.asInstanceOf[js.Any])
    
    inline def setImageFormatUndefined: Self = StObject.set(x, "imageFormat", js.undefined)
    
    inline def setImageMaxHeight(value: Double): Self = StObject.set(x, "imageMaxHeight", value.asInstanceOf[js.Any])
    
    inline def setImageMaxHeightUndefined: Self = StObject.set(x, "imageMaxHeight", js.undefined)
    
    inline def setImageMaxWidth(value: Double): Self = StObject.set(x, "imageMaxWidth", value.asInstanceOf[js.Any])
    
    inline def setImageMaxWidthUndefined: Self = StObject.set(x, "imageMaxWidth", js.undefined)
    
    inline def setImageTransparency(value: Boolean): Self = StObject.set(x, "imageTransparency", value.asInstanceOf[js.Any])
    
    inline def setImageTransparencyUndefined: Self = StObject.set(x, "imageTransparency", js.undefined)
    
    inline def setLegendEnabled(value: Boolean): Self = StObject.set(x, "legendEnabled", value.asInstanceOf[js.Any])
    
    inline def setLegendEnabledUndefined: Self = StObject.set(x, "legendEnabled", js.undefined)
    
    inline def setListMode(value: show | hide | `hide-children`): Self = StObject.set(x, "listMode", value.asInstanceOf[js.Any])
    
    inline def setListModeUndefined: Self = StObject.set(x, "listMode", js.undefined)
    
    inline def setMaxScale(value: Double): Self = StObject.set(x, "maxScale", value.asInstanceOf[js.Any])
    
    inline def setMaxScaleUndefined: Self = StObject.set(x, "maxScale", js.undefined)
    
    inline def setMinScale(value: Double): Self = StObject.set(x, "minScale", value.asInstanceOf[js.Any])
    
    inline def setMinScaleUndefined: Self = StObject.set(x, "minScale", js.undefined)
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setParent(value: MapProperties | BasemapProperties | GroundProperties | GroupLayerPropertiestypeg): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    inline def setPortalItem(value: PortalItemProperties): Self = StObject.set(x, "portalItem", value.asInstanceOf[js.Any])
    
    inline def setPortalItemUndefined: Self = StObject.set(x, "portalItem", js.undefined)
    
    inline def setRefreshInterval(value: Double): Self = StObject.set(x, "refreshInterval", value.asInstanceOf[js.Any])
    
    inline def setRefreshIntervalUndefined: Self = StObject.set(x, "refreshInterval", js.undefined)
    
    inline def setSourceJSON(value: Any): Self = StObject.set(x, "sourceJSON", value.asInstanceOf[js.Any])
    
    inline def setSourceJSONUndefined: Self = StObject.set(x, "sourceJSON", js.undefined)
    
    inline def setSublayers(value: CollectionProperties[SublayerProperties]): Self = StObject.set(x, "sublayers", value.asInstanceOf[js.Any])
    
    inline def setSublayersUndefined: Self = StObject.set(x, "sublayers", js.undefined)
    
    inline def setSublayersVarargs(value: SublayerProperties*): Self = StObject.set(x, "sublayers", js.Array(value*))
    
    inline def setTimeExtent(value: TimeExtentProperties): Self = StObject.set(x, "timeExtent", value.asInstanceOf[js.Any])
    
    inline def setTimeExtentUndefined: Self = StObject.set(x, "timeExtent", js.undefined)
    
    inline def setTimeInfo(value: TimeInfoProperties): Self = StObject.set(x, "timeInfo", value.asInstanceOf[js.Any])
    
    inline def setTimeInfoUndefined: Self = StObject.set(x, "timeInfo", js.undefined)
    
    inline def setTimeOffset(value: TimeIntervalProperties): Self = StObject.set(x, "timeOffset", value.asInstanceOf[js.Any])
    
    inline def setTimeOffsetUndefined: Self = StObject.set(x, "timeOffset", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setType(value: `map-image`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setUseViewTime(value: Boolean): Self = StObject.set(x, "useViewTime", value.asInstanceOf[js.Any])
    
    inline def setUseViewTimeUndefined: Self = StObject.set(x, "useViewTime", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}

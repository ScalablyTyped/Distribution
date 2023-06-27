package typings.arcgisJsApi.anon

import typings.arcgisJsApi.arcgisJsApiStrings.`color-burn`
import typings.arcgisJsApi.arcgisJsApiStrings.`color-dodge`
import typings.arcgisJsApi.arcgisJsApiStrings.`destination-atop`
import typings.arcgisJsApi.arcgisJsApiStrings.`destination-in`
import typings.arcgisJsApi.arcgisJsApiStrings.`destination-out`
import typings.arcgisJsApi.arcgisJsApiStrings.`destination-over`
import typings.arcgisJsApi.arcgisJsApiStrings.`hard-light`
import typings.arcgisJsApi.arcgisJsApiStrings.`hide-children`
import typings.arcgisJsApi.arcgisJsApiStrings.`soft-light`
import typings.arcgisJsApi.arcgisJsApiStrings.`source-atop`
import typings.arcgisJsApi.arcgisJsApiStrings.`source-in`
import typings.arcgisJsApi.arcgisJsApiStrings.`source-out`
import typings.arcgisJsApi.arcgisJsApiStrings.`vivid-light`
import typings.arcgisJsApi.arcgisJsApiStrings.average
import typings.arcgisJsApi.arcgisJsApiStrings.color
import typings.arcgisJsApi.arcgisJsApiStrings.darken
import typings.arcgisJsApi.arcgisJsApiStrings.difference
import typings.arcgisJsApi.arcgisJsApiStrings.exclusion
import typings.arcgisJsApi.arcgisJsApiStrings.hide
import typings.arcgisJsApi.arcgisJsApiStrings.hue
import typings.arcgisJsApi.arcgisJsApiStrings.invert
import typings.arcgisJsApi.arcgisJsApiStrings.lighten
import typings.arcgisJsApi.arcgisJsApiStrings.lighter
import typings.arcgisJsApi.arcgisJsApiStrings.luminosity
import typings.arcgisJsApi.arcgisJsApiStrings.minus
import typings.arcgisJsApi.arcgisJsApiStrings.multiply
import typings.arcgisJsApi.arcgisJsApiStrings.normal
import typings.arcgisJsApi.arcgisJsApiStrings.overlay
import typings.arcgisJsApi.arcgisJsApiStrings.plus
import typings.arcgisJsApi.arcgisJsApiStrings.reflect
import typings.arcgisJsApi.arcgisJsApiStrings.saturation
import typings.arcgisJsApi.arcgisJsApiStrings.screen
import typings.arcgisJsApi.arcgisJsApiStrings.show
import typings.arcgisJsApi.arcgisJsApiStrings.textSlashhtml
import typings.arcgisJsApi.arcgisJsApiStrings.textSlashplain
import typings.arcgisJsApi.arcgisJsApiStrings.wms
import typings.arcgisJsApi.arcgisJsApiStrings.xor
import typings.arcgisJsApi.esri.BasemapProperties
import typings.arcgisJsApi.esri.CollectionProperties
import typings.arcgisJsApi.esri.ExtentProperties
import typings.arcgisJsApi.esri.FetchFeatureInfoFunction
import typings.arcgisJsApi.esri.Graphic
import typings.arcgisJsApi.esri.GroundProperties
import typings.arcgisJsApi.esri.MapProperties
import typings.arcgisJsApi.esri.PortalItemProperties
import typings.arcgisJsApi.esri.SpatialReferenceProperties
import typings.arcgisJsApi.esri.TimeExtentProperties
import typings.arcgisJsApi.esri.TimeInfoProperties
import typings.arcgisJsApi.esri.TimeIntervalProperties
import typings.arcgisJsApi.esri.WMSSublayerProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined arcgis-js-api.__esri.WMSLayerProperties & {  type :'wms'} */
trait WMSLayerPropertiestypewms extends StObject {
  
  /**
  		 * A flattened collection of all [WMSSublayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMSSublayer.html)s based on the [`sublayers`](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMSLayer.html#sublayers) property.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMSLayer.html#allSublayers)
  		 */
  var allSublayers: js.UndefOr[CollectionProperties[WMSSublayerProperties]] = js.undefined
  
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
  		 * Copyright information for the WMS service.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMSLayer.html#copyright)
  		 */
  var copyright: js.UndefOr[String] = js.undefined
  
  /**
  		 * Use this to append different custom parameters to the WMS map requests.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMSLayer.html#customLayerParameters)
  		 */
  var customLayerParameters: js.UndefOr[Any] = js.undefined
  
  /**
  		 * Use this to append custom parameters to all WMS requests.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMSLayer.html#customParameters)
  		 */
  var customParameters: js.UndefOr[Any] = js.undefined
  
  /**
  		 * Description for the WMS layer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMSLayer.html#description)
  		 */
  var description: js.UndefOr[String] = js.undefined
  
  /**
  		 * Effect provides various filter functions that can be performed on the layer to achieve different visual effects similar to how image filters work.
  		 *
  		 * @default null
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-BlendLayer.html#effect)
  		 */
  var effect: js.UndefOr[js.Array[Any] | String] = js.undefined
  
  /**
  		 * The MIME type that will be requested by popups.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMSLayer.html#featureInfoFormat)
  		 */
  var featureInfoFormat: js.UndefOr[textSlashhtml | textSlashplain | Null] = js.undefined
  
  /**
  		 * The URL for the WMS GetFeatureInfo call.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMSLayer.html#featureInfoUrl)
  		 */
  var featureInfoUrl: js.UndefOr[String] = js.undefined
  
  /**
  		 * Function to override the default popup behavior of `WMSLayer`.
  		 *
  		 * @default null
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMSLayer.html#fetchFeatureInfoFunction)
  		 */
  var fetchFeatureInfoFunction: js.UndefOr[FetchFeatureInfoFunction] = js.undefined
  
  /**
  		 * The full extent of the layer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html#fullExtent)
  		 */
  var fullExtent: js.UndefOr[ExtentProperties] = js.undefined
  
  /**
  		 * All bounding boxes defined for the layer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMSLayer.html#fullExtents)
  		 */
  var fullExtents: js.UndefOr[js.Array[ExtentProperties]] = js.undefined
  
  /**
  		 * The unique ID assigned to the layer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html#id)
  		 */
  var id: js.UndefOr[String] = js.undefined
  
  /**
  		 * The map image format (MIME type) to request.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMSLayer.html#imageFormat)
  		 */
  var imageFormat: js.UndefOr[String] = js.undefined
  
  /**
  		 * Indicates the maximum height of the image exported by the service.
  		 *
  		 * @default 2048
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMSLayer.html#imageMaxHeight)
  		 */
  var imageMaxHeight: js.UndefOr[Double] = js.undefined
  
  /**
  		 * Indicates the maximum width of the image exported by the service.
  		 *
  		 * @default 2048
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMSLayer.html#imageMaxWidth)
  		 */
  var imageMaxWidth: js.UndefOr[Double] = js.undefined
  
  /**
  		 * Indicates whether the background of the image exported by the service is transparent.
  		 *
  		 * @default true
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMSLayer.html#imageTransparency)
  		 */
  var imageTransparency: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * Indicates whether the layer will be included in the legend.
  		 *
  		 * @default true
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMSLayer.html#legendEnabled)
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
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-PortalLayer.html#portalItem)
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
  		 * The spatial reference of the layer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMSLayer.html#spatialReference)
  		 */
  var spatialReference: js.UndefOr[SpatialReferenceProperties] = js.undefined
  
  /**
  		 * List of spatialReference well known ids derived from the CRS elements of the first layer in the GetCapabilities request.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMSLayer.html#spatialReferences)
  		 */
  var spatialReferences: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
  		 * A subset of the layer's [WMSSublayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMSSublayer.html)s that will be displayed.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMSLayer.html#sublayers)
  		 */
  var sublayers: js.UndefOr[CollectionProperties[WMSSublayerProperties]] = js.undefined
  
  /**
  		 * The layer's time extent.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMSLayer.html#timeExtent)
  		 */
  var timeExtent: js.UndefOr[TimeExtentProperties] = js.undefined
  
  /**
  		 * TimeInfo provides information such as date fields that store [start](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TimeInfo.html#startField) and [end](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TimeInfo.html#endField) time for each feature and the [fullTimeExtent](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TimeInfo.html#fullTimeExtent) for the layer.
  		 *
  		 * @default null
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMSLayer.html#timeInfo)
  		 */
  var timeInfo: js.UndefOr[TimeInfoProperties] = js.undefined
  
  /**
  		 * A temporary offset of the time data based on a certain [TimeInterval](https://developers.arcgis.com/javascript/latest/api-reference/esri-TimeInterval.html).
  		 *
  		 * @default null
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMSLayer.html#timeOffset)
  		 */
  var timeOffset: js.UndefOr[TimeIntervalProperties] = js.undefined
  
  /**
  		 * The title of the layer used to identify it in places such as the [LayerList](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList.html) widget.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html#title)
  		 */
  var title: js.UndefOr[String] = js.undefined
  
  var `type`: wms
  
  /**
  		 * The URL of the WMS service.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMSLayer.html#url)
  		 */
  var url: js.UndefOr[String] = js.undefined
  
  /**
  		 * Determines if the layer will update its temporal data based on the view's [timeExtent](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#timeExtent).
  		 *
  		 * @default true
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMSLayer.html#useViewTime)
  		 */
  var useViewTime: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * Version of the [WMS specification](http://www.opengeospatial.org/standards/wms) to use.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMSLayer.html#version)
  		 */
  var version: js.UndefOr[String] = js.undefined
  
  /**
  		 * Indicates if the layer is visible in the [View](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html).
  		 *
  		 * @default true
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html#visible)
  		 */
  var visible: js.UndefOr[Boolean] = js.undefined
}
object WMSLayerPropertiestypewms {
  
  inline def apply(): WMSLayerPropertiestypewms = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("wms")
    __obj.asInstanceOf[WMSLayerPropertiestypewms]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WMSLayerPropertiestypewms] (val x: Self) extends AnyVal {
    
    inline def setAllSublayers(value: CollectionProperties[WMSSublayerProperties]): Self = StObject.set(x, "allSublayers", value.asInstanceOf[js.Any])
    
    inline def setAllSublayersUndefined: Self = StObject.set(x, "allSublayers", js.undefined)
    
    inline def setAllSublayersVarargs(value: WMSSublayerProperties*): Self = StObject.set(x, "allSublayers", js.Array(value*))
    
    inline def setBlendMode(
      value: average | `color-burn` | `color-dodge` | color | darken | `destination-atop` | `destination-in` | `destination-out` | `destination-over` | difference | exclusion | `hard-light` | hue | invert | lighten | lighter | luminosity | minus | multiply | normal | overlay | plus | reflect | saturation | screen | `soft-light` | `source-atop` | `source-in` | `source-out` | `vivid-light` | xor
    ): Self = StObject.set(x, "blendMode", value.asInstanceOf[js.Any])
    
    inline def setBlendModeUndefined: Self = StObject.set(x, "blendMode", js.undefined)
    
    inline def setCopyright(value: String): Self = StObject.set(x, "copyright", value.asInstanceOf[js.Any])
    
    inline def setCopyrightUndefined: Self = StObject.set(x, "copyright", js.undefined)
    
    inline def setCustomLayerParameters(value: Any): Self = StObject.set(x, "customLayerParameters", value.asInstanceOf[js.Any])
    
    inline def setCustomLayerParametersUndefined: Self = StObject.set(x, "customLayerParameters", js.undefined)
    
    inline def setCustomParameters(value: Any): Self = StObject.set(x, "customParameters", value.asInstanceOf[js.Any])
    
    inline def setCustomParametersUndefined: Self = StObject.set(x, "customParameters", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEffect(value: js.Array[Any] | String): Self = StObject.set(x, "effect", value.asInstanceOf[js.Any])
    
    inline def setEffectUndefined: Self = StObject.set(x, "effect", js.undefined)
    
    inline def setEffectVarargs(value: Any*): Self = StObject.set(x, "effect", js.Array(value*))
    
    inline def setFeatureInfoFormat(value: textSlashhtml | textSlashplain): Self = StObject.set(x, "featureInfoFormat", value.asInstanceOf[js.Any])
    
    inline def setFeatureInfoFormatNull: Self = StObject.set(x, "featureInfoFormat", null)
    
    inline def setFeatureInfoFormatUndefined: Self = StObject.set(x, "featureInfoFormat", js.undefined)
    
    inline def setFeatureInfoUrl(value: String): Self = StObject.set(x, "featureInfoUrl", value.asInstanceOf[js.Any])
    
    inline def setFeatureInfoUrlUndefined: Self = StObject.set(x, "featureInfoUrl", js.undefined)
    
    inline def setFetchFeatureInfoFunction(value: /* query */ Any => js.Promise[js.Array[Graphic]]): Self = StObject.set(x, "fetchFeatureInfoFunction", js.Any.fromFunction1(value))
    
    inline def setFetchFeatureInfoFunctionUndefined: Self = StObject.set(x, "fetchFeatureInfoFunction", js.undefined)
    
    inline def setFullExtent(value: ExtentProperties): Self = StObject.set(x, "fullExtent", value.asInstanceOf[js.Any])
    
    inline def setFullExtentUndefined: Self = StObject.set(x, "fullExtent", js.undefined)
    
    inline def setFullExtents(value: js.Array[ExtentProperties]): Self = StObject.set(x, "fullExtents", value.asInstanceOf[js.Any])
    
    inline def setFullExtentsUndefined: Self = StObject.set(x, "fullExtents", js.undefined)
    
    inline def setFullExtentsVarargs(value: ExtentProperties*): Self = StObject.set(x, "fullExtents", js.Array(value*))
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setImageFormat(value: String): Self = StObject.set(x, "imageFormat", value.asInstanceOf[js.Any])
    
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
    
    inline def setSpatialReference(value: SpatialReferenceProperties): Self = StObject.set(x, "spatialReference", value.asInstanceOf[js.Any])
    
    inline def setSpatialReferenceUndefined: Self = StObject.set(x, "spatialReference", js.undefined)
    
    inline def setSpatialReferences(value: js.Array[Double]): Self = StObject.set(x, "spatialReferences", value.asInstanceOf[js.Any])
    
    inline def setSpatialReferencesUndefined: Self = StObject.set(x, "spatialReferences", js.undefined)
    
    inline def setSpatialReferencesVarargs(value: Double*): Self = StObject.set(x, "spatialReferences", js.Array(value*))
    
    inline def setSublayers(value: CollectionProperties[WMSSublayerProperties]): Self = StObject.set(x, "sublayers", value.asInstanceOf[js.Any])
    
    inline def setSublayersUndefined: Self = StObject.set(x, "sublayers", js.undefined)
    
    inline def setSublayersVarargs(value: WMSSublayerProperties*): Self = StObject.set(x, "sublayers", js.Array(value*))
    
    inline def setTimeExtent(value: TimeExtentProperties): Self = StObject.set(x, "timeExtent", value.asInstanceOf[js.Any])
    
    inline def setTimeExtentUndefined: Self = StObject.set(x, "timeExtent", js.undefined)
    
    inline def setTimeInfo(value: TimeInfoProperties): Self = StObject.set(x, "timeInfo", value.asInstanceOf[js.Any])
    
    inline def setTimeInfoUndefined: Self = StObject.set(x, "timeInfo", js.undefined)
    
    inline def setTimeOffset(value: TimeIntervalProperties): Self = StObject.set(x, "timeOffset", value.asInstanceOf[js.Any])
    
    inline def setTimeOffsetUndefined: Self = StObject.set(x, "timeOffset", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setType(value: wms): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setUseViewTime(value: Boolean): Self = StObject.set(x, "useViewTime", value.asInstanceOf[js.Any])
    
    inline def setUseViewTimeUndefined: Self = StObject.set(x, "useViewTime", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}

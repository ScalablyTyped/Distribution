package typings.arcgisJsApi.esri

import typings.arcgisJsApi.IHandle
import typings.arcgisJsApi.arcgisJsApiStrings.refresh
import typings.arcgisJsApi.arcgisJsApiStrings.textSlashhtml
import typings.arcgisJsApi.arcgisJsApiStrings.textSlashplain
import typings.arcgisJsApi.arcgisJsApiStrings.wms
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WMSLayer
  extends StObject
     with Layer
     with BlendLayer
     with PortalLayer
     with ScaleRangeLayer
     with RefreshableLayer {
  
  /**
    * A flattened collection of all [WMSSublayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMSSublayer.html)s based on the [`sublayers`](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMSLayer.html#sublayers) property.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMSLayer.html#allSublayers)
    */
  var allSublayers: Collection[WMSSublayer] = js.native
  
  /**
    * Copyright information for the WMS service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMSLayer.html#copyright)
    */
  var copyright: String = js.native
  
  /**
    * Use this to append different custom parameters to the WMS map requests.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMSLayer.html#customLayerParameters)
    */
  var customLayerParameters: Any = js.native
  
  /**
    * Use this to append custom parameters to all WMS requests.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMSLayer.html#customParameters)
    */
  var customParameters: Any = js.native
  
  /**
    * Description for the WMS layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMSLayer.html#description)
    */
  var description: String = js.native
  
  /**
    * An array of time, elevation and other dimensions for the root layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMSLayer.html#dimensions)
    */
  val dimensions: js.Array[TimeDimension | ElevationDimension | GenericDimension] = js.native
  
  /**
    * The MIME type that will be requested by popups.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMSLayer.html#featureInfoFormat)
    */
  var featureInfoFormat: textSlashhtml | textSlashplain | Null = js.native
  
  /**
    * This property lists all available MIME-types that can be used with the WMS service's _GetFeatureInfo_ request.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMSLayer.html#featureInfoFormats)
    */
  val featureInfoFormats: js.Array[String] = js.native
  
  /**
    * The URL for the WMS GetFeatureInfo call.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMSLayer.html#featureInfoUrl)
    */
  var featureInfoUrl: String = js.native
  
  /**
    * Function to override the default popup behavior of `WMSLayer`.
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMSLayer.html#fetchFeatureInfoFunction)
    */
  def fetchFeatureInfoFunction(query: Any): js.Promise[js.Array[Graphic]] = js.native
  /**
    * Function to override the default popup behavior of `WMSLayer`.
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMSLayer.html#fetchFeatureInfoFunction)
    */
  @JSName("fetchFeatureInfoFunction")
  var fetchFeatureInfoFunction_Original: FetchFeatureInfoFunction = js.native
  
  /**
    * Fetching the WMS image.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMSLayer.html#fetchImage)
    */
  def fetchImage(extent: Extent, width: Double, height: Double): js.Promise[Any] = js.native
  def fetchImage(extent: Extent, width: Double, height: Double, options: WMSLayerFetchImageOptions): js.Promise[Any] = js.native
  
  /**
    * Returns a [WMSSublayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMSSublayer.html) based on the given sublayer id.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMSLayer.html#findSublayerById)
    */
  def findSublayerById(id: Double): WMSSublayer = js.native
  
  /**
    * Returns a [WMSSublayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMSSublayer.html) based on the given sublayer name.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMSLayer.html#findSublayerByName)
    */
  def findSublayerByName(name: String): WMSSublayer = js.native
  
  /**
    * All bounding boxes defined for the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMSLayer.html#fullExtents)
    */
  var fullExtents: js.Array[Extent] = js.native
  
  /**
    * The map image format (MIME type) to request.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMSLayer.html#imageFormat)
    */
  var imageFormat: String = js.native
  
  /**
    * Indicates the maximum height of the image exported by the service.
    *
    * @default 2048
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMSLayer.html#imageMaxHeight)
    */
  var imageMaxHeight: Double = js.native
  
  /**
    * Indicates the maximum width of the image exported by the service.
    *
    * @default 2048
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMSLayer.html#imageMaxWidth)
    */
  var imageMaxWidth: Double = js.native
  
  /**
    * Indicates whether the background of the image exported by the service is transparent.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMSLayer.html#imageTransparency)
    */
  var imageTransparency: Boolean = js.native
  
  /**
    * Indicates whether the layer will be included in the legend.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMSLayer.html#legendEnabled)
    */
  var legendEnabled: Boolean = js.native
  
  @JSName("on")
  def on_refresh(name: refresh, eventHandler: WMSLayerRefreshEventHandler): IHandle = js.native
  
  /**
    * The spatial reference of the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMSLayer.html#spatialReference)
    */
  var spatialReference: SpatialReference = js.native
  
  /**
    * List of spatialReference well known ids derived from the CRS elements of the first layer in the GetCapabilities request.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMSLayer.html#spatialReferences)
    */
  var spatialReferences: js.Array[Double] = js.native
  
  /**
    * A subset of the layer's [WMSSublayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMSSublayer.html)s that will be displayed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMSLayer.html#sublayers)
    */
  var sublayers: Collection[WMSSublayer] = js.native
  
  /**
    * The layer's time extent.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMSLayer.html#timeExtent)
    */
  var timeExtent: TimeExtent = js.native
  
  /**
    * TimeInfo provides information such as date fields that store [start](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TimeInfo.html#startField) and [end](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TimeInfo.html#endField) time for each feature and the [fullTimeExtent](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TimeInfo.html#fullTimeExtent) for the layer.
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMSLayer.html#timeInfo)
    */
  var timeInfo: TimeInfo = js.native
  
  /**
    * A temporary offset of the time data based on a certain [TimeInterval](https://developers.arcgis.com/javascript/latest/api-reference/esri-TimeInterval.html).
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMSLayer.html#timeOffset)
    */
  var timeOffset: TimeInterval = js.native
  
  @JSName("type")
  val type_WMSLayer: wms = js.native
  
  /**
    * The URL of the WMS service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMSLayer.html#url)
    */
  var url: String = js.native
  
  /**
    * Determines if the layer will update its temporal data based on the view's [timeExtent](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#timeExtent).
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMSLayer.html#useViewTime)
    */
  var useViewTime: Boolean = js.native
  
  /**
    * Version of the [WMS specification](http://www.opengeospatial.org/standards/wms) to use.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMSLayer.html#version)
    */
  var version: String = js.native
}

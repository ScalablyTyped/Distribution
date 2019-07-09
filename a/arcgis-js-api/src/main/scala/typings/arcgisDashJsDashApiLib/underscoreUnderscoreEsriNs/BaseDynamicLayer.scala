package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseDynamicLayer
  extends Layer
     with ScaleRangeLayer
     with RefreshableLayer {
  /**
    * Adds a promise to the layer's [loadable](https://developers.arcgis.com/javascript/latest/guide/loadable/index.html) chain. This is typically used in the [load()](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BaseDynamicLayer.html#load) method to ensure that all [loadable](https://developers.arcgis.com/javascript/latest/guide/loadable/index.html) resources required for the layer to function are loaded prior to this layer resolving and becoming [loaded](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BaseDynamicLayer.html#loaded).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BaseDynamicLayer.html#addResolvingPromise)
    *
    * @param promiseToLoad A promise that must resolve for the layer to resolve and move from the `loading` [status](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BaseDynamicLayer.html#loadStatus) to being [loaded](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BaseDynamicLayer.html#loaded).
    *
    */
  def addResolvingPromise(promiseToLoad: arcgisDashJsDashApiLib.IPromise[_]): arcgisDashJsDashApiLib.IPromise[_] = js.native
  /**
    * This method fetches the image for the specified extent and size. Override this method if the data returned from the server needs to be processed before it can be displayed. For example, if the server returns binary data, override this method to convert the binary data to an image.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BaseDynamicLayer.html#fetchImage)
    *
    * @param extent The extent of the view. This value is provided by the [LayerView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-LayerView.html).
    * @param width The width of the view in pixels. This value is provided by the [LayerView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-LayerView.html).
    * @param height The height of the view in pixels. This value is provided by the [LayerView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-LayerView.html).
    * @param options The parameter options is an object with the following properties.
    * @param options.signal An [AbortSignal](https://developer.mozilla.org/en-US/docs/Web/API/AbortSignal) to abort the request. If canceled, the promise will be rejected with an error named `AbortError`. See also [AbortController](https://developer.mozilla.org/en-US/docs/Web/API/AbortController).
    *
    */
  def fetchImage(extent: Extent, width: scala.Double, height: scala.Double): arcgisDashJsDashApiLib.IPromise[stdLib.HTMLImageElement | stdLib.HTMLCanvasElement] = js.native
  def fetchImage(
    extent: Extent,
    width: scala.Double,
    height: scala.Double,
    options: BaseDynamicLayerFetchImageOptions
  ): arcgisDashJsDashApiLib.IPromise[stdLib.HTMLImageElement | stdLib.HTMLCanvasElement] = js.native
  /**
    * This method returns a URL to an image for a given extent, width, and height. Override this method to construct the URL for the image based on user interaction.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BaseDynamicLayer.html#getImageUrl)
    *
    * @param extent Extent of the view. This value is populated by the [LayerView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-LayerView.html).
    * @param width Width of the view in pixels. This value is populated by the [LayerView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-LayerView.html).
    * @param height Height of the view in pixels. This value is populated by the [LayerView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-LayerView.html).
    *
    */
  def getImageUrl(extent: Extent, width: scala.Double, height: scala.Double): arcgisDashJsDashApiLib.IPromise[java.lang.String] | java.lang.String = js.native
  @JSName("on")
  def on_layerviewcreate(
    name: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`layerview-create`,
    eventHandler: BaseDynamicLayerLayerviewCreateEventHandler
  ): arcgisDashJsDashApiLib.IHandle = js.native
  @JSName("on")
  def on_layerviewcreateerror(
    name: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`layerview-create-error`,
    eventHandler: BaseDynamicLayerLayerviewCreateErrorEventHandler
  ): arcgisDashJsDashApiLib.IHandle = js.native
  @JSName("on")
  def on_layerviewdestroy(
    name: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`layerview-destroy`,
    eventHandler: BaseDynamicLayerLayerviewDestroyEventHandler
  ): arcgisDashJsDashApiLib.IHandle = js.native
}

@JSGlobal("__esri.BaseDynamicLayer")
@js.native
/**
  * This class may be extended to create dynamic map layers. Dynamic layers display an image dynamically generated on the server based on a request, including the extent and size of the image. The exported image covers the entire view extent. Each interaction on the view (e.g. panning, zooming) will result in an export of a new image on the server. Each export is unique so it cannot be cached in the browser.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BaseDynamicLayer.html)
  */
class BaseDynamicLayerCls () extends BaseDynamicLayer {
  def this(properties: BaseDynamicLayerProperties) = this()
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
    * Refresh interval of the layer in minutes. Value of `0` indicates no refresh.
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


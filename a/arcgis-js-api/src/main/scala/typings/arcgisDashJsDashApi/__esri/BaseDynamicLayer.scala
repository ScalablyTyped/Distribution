package typings.arcgisDashJsDashApi.__esri

import org.scalablytyped.runtime.TopLevel
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`base-dynamic`
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseDynamicLayer
  extends Layer
     with ScaleRangeLayer
     with RefreshableLayer {
  @JSName("type")
  val type_BaseDynamicLayer: `base-dynamic` = js.native
  /**
    * Adds a promise to the layer's [loadable](https://developers.arcgis.com/javascript/latest/guide/programming-patterns/#loadable) chain. This is typically used in the [load()](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BaseDynamicLayer.html#load) method to ensure that all [loadable](https://developers.arcgis.com/javascript/latest/guide/programming-patterns/#loadable) resources required for the layer to function are loaded prior to this layer resolving and becoming [loaded](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BaseDynamicLayer.html#loaded).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BaseDynamicLayer.html#addResolvingPromise)
    *
    * @param promiseToLoad A promise that must resolve for the layer to resolve and move from the `loading` [status](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BaseDynamicLayer.html#loadStatus) to being [loaded](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BaseDynamicLayer.html#loaded).
    *
    */
  def addResolvingPromise(promiseToLoad: js.Promise[_]): js.Promise[_] = js.native
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
  def fetchImage(extent: Extent, width: Double, height: Double): js.Promise[HTMLImageElement | HTMLCanvasElement] = js.native
  def fetchImage(extent: Extent, width: Double, height: Double, options: BaseDynamicLayerFetchImageOptions): js.Promise[HTMLImageElement | HTMLCanvasElement] = js.native
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
  def getImageUrl(extent: Extent, width: Double, height: Double): js.Promise[String] | String = js.native
}

@JSGlobal("__esri.BaseDynamicLayer")
@js.native
object BaseDynamicLayer extends TopLevel[BaseDynamicLayerConstructor]


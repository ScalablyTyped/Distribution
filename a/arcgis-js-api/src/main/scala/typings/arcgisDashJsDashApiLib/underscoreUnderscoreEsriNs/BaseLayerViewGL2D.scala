package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseLayerViewGL2D extends LayerView {
  /**
    * The WebGL rendering context associated to this layer view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerViewGL2D.html#context)
    */
  var context: stdLib.WebGLRenderingContext | js.Any = js.native
  /**
    * The array of [Tile](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerViewGL2D.html#Tile) objects computed to cover the MapView's visible area. This array is updated when the view is animating or the user is interacting with it. Then if tiles have been added or removed, [tilesChanged()](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerViewGL2D.html#tilesChanged) is called.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerViewGL2D.html#tiles)
    */
  var tiles: js.Array[BaseLayerViewGL2DTile] = js.native
  /**
    * References the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) this [LayerView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-LayerView.html) belongs to.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerViewGL2D.html#view)
    */
  var view: MapView = js.native
  /**
    * Method called after the [LayerView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-LayerView.html) is created and right before it starts drawing the layer's content. Typically this method is implemented to start watching property changes on the layer and to initialize WebGL objects such as shaders.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerViewGL2D.html#attach)
    *
    *
    */
  def attach(): scala.Unit = js.native
  /**
    * Method called after the layer is removed and the [LayerView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-LayerView.html) is about to be removed. Typically, this method is implemented to free resources like watchers and destroy WebGL objects such as shader programs.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerViewGL2D.html#detach)
    *
    *
    */
  def detach(): scala.Unit = js.native
  /**
    * Method to implement that is responsible for providing objects hit at the specified screen coordinates. This method is called internally by the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) each time its [hitTest()](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#hitTest) method is called.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerViewGL2D.html#hitTest)
    *
    * @param x The x-coordinate in screen space of the desired hit.
    * @param y The y-coordinate in screen space of the desired hit.
    *
    */
  def hitTest(x: scala.Double, y: scala.Double): arcgisDashJsDashApiLib.IPromise[Graphic] = js.native
  /**
    * The method to implement that is responsible of drawing the content of the layer. This method is called every time the MapView's state changes, or if [requestRender()](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerViewGL2D.html#requestRender) has been called.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerViewGL2D.html#render)
    *
    * @param renderParameters
    * @param renderParameters.context The WebGL or WebGL 2 context. Its concrete type depends on system configuration. Every time that `render()` is called, the API automatically resets WebGL to a conventional state which is _almost_ the default one; the only two things that may be non-default are the bound framebuffer and the viewport, which is set to match the entire framebuffer. _The body of `render()` **must not** change these settings_.
    * @param renderParameters.stationary The stationary state of the `MapView`.
    * @param renderParameters.state The object that describes view state.
    *
    */
  def render(renderParameters: BaseLayerViewGL2DRenderRenderParameters): scala.Unit = js.native
  /**
    * The [LayerView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-LayerView.html) can call this method to ask the MapView to schedule a new rendering frame.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerViewGL2D.html#requestRender)
    *
    *
    */
  def requestRender(): scala.Unit = js.native
  /**
    * Method to implement, which notifies of tiles being added or removed for the current view state. This function can be implemented to start and stop fetching new data, or allocate and dispose resources.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerViewGL2D.html#tilesChanged)
    *
    * @param added The tile objects added for the current view viewport.
    * @param removed The tile objects removed from the view viewport.
    *
    */
  def tilesChanged(added: js.Array[BaseLayerViewGL2DTile], removed: js.Array[BaseLayerViewGL2DTile]): scala.Unit = js.native
}

@JSGlobal("__esri.BaseLayerViewGL2D")
@js.native
/**
  * Represents the [LayerView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-LayerView.html) of a [Layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html) after it has been added to a [Map](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html) with a [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html). In contrast to the related class [BaseLayerView2D](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerView2D.html), this one exposes [WebGL](https://developer.mozilla.org/en-US/docs/Web/API/WebGLRenderingContext) rendering capabilities.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerViewGL2D.html)
  */
class BaseLayerViewGL2DCls () extends BaseLayerViewGL2D {
  def this(properties: BaseLayerViewGL2DProperties) = this()
}


package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the [LayerView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-LayerView.html) of a [Layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html) after it has been added to a [Map](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html) with a [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerView2D.html)
  */
trait BaseLayerView2D extends js.Object {
  /**
    * References the layer this [LayerView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-LayerView.html) represents.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerView2D.html#layer)
    */
  var layer: Layer
  /**
    * The array of [Tile](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerView2D.html#Tile) objects computed to cover the MapView's visible area. This array is updated when the view is animating or the user is interacting with it. Then if tiles have been added or removed, [tilesChanged()](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerView2D.html#tilesChanged) is called.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerView2D.html#tiles)
    */
  var tiles: js.Array[Tile]
  /**
    * References the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) this [LayerView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-LayerView.html) belongs to.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerView2D.html#view)
    */
  var view: MapView
  /**
    * Method called when after the [LayerView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-LayerView.html) is created and right before it's asked to draw the layer's content. Typically this method is implemented to start watching property changes on the layer for example.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerView2D.html#attach)
    *
    *
    */
  def attach(): scala.Unit
  /**
    * Method called after the layer is removed and the [LayerView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-LayerView.html) is about to be removed. Typically, this method is implemented to free resources like watchers.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerView2D.html#detach)
    *
    *
    */
  def detach(): scala.Unit
  /**
    * Method to implement that is responsible for providing objects hit at the specified screen coordinates. This method is called internally by the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) each time its [hitTest()](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#hitTest) method is called.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerView2D.html#hitTest)
    *
    * @param x The x-coordinate in screen space of the desired hit.
    * @param y The y-coordinate in screen space of the desired hit.
    *
    */
  def hitTest(x: scala.Double, y: scala.Double): arcgisDashJsDashApiLib.IPromise[Graphic]
  /**
    * The method to implement that is responsible of drawing the content of the layer. This method is called every time the MapView's state changes, or if [requestRender()](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerView2D.html#requestRender) has been called.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerView2D.html#render)
    *
    * @param renderParameters
    * @param renderParameters.context The [canvas 2D context](https://developer.mozilla.org/en-US/docs/Web/API/CanvasRenderingContext2D) in which to draw content.
    * @param renderParameters.stationary The stationary state of the `MapView`.
    * @param renderParameters.state The object that describes view state.
    *
    */
  def render(renderParameters: BaseLayerView2DRenderRenderParameters): scala.Unit
  /**
    * The [LayerView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-LayerView.html) can call this method to ask the MapView to schedule a new rendering frame.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerView2D.html#requestRender)
    *
    *
    */
  def requestRender(): scala.Unit
  /**
    * Method to implement, which notifies of tiles being added or removed for the current view state. This function can be implemented to start and stop fetching new data, or allocate and dispose resources.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerView2D.html#tilesChanged)
    *
    * @param added The tile objects added for the current view viewport.
    * @param removed The tile objects removed from the view viewport.
    *
    */
  def tilesChanged(added: js.Array[Tile], removed: js.Array[Tile]): scala.Unit
}

object BaseLayerView2D {
  @scala.inline
  def apply(
    attach: () => scala.Unit,
    detach: () => scala.Unit,
    hitTest: (scala.Double, scala.Double) => arcgisDashJsDashApiLib.IPromise[Graphic],
    layer: Layer,
    render: BaseLayerView2DRenderRenderParameters => scala.Unit,
    requestRender: () => scala.Unit,
    tiles: js.Array[Tile],
    tilesChanged: (js.Array[Tile], js.Array[Tile]) => scala.Unit,
    view: MapView
  ): BaseLayerView2D = {
    val __obj = js.Dynamic.literal(attach = js.Any.fromFunction0(attach), detach = js.Any.fromFunction0(detach), hitTest = js.Any.fromFunction2(hitTest), layer = layer, render = js.Any.fromFunction1(render), requestRender = js.Any.fromFunction0(requestRender), tiles = tiles, tilesChanged = js.Any.fromFunction2(tilesChanged), view = view)
  
    __obj.asInstanceOf[BaseLayerView2D]
  }
}


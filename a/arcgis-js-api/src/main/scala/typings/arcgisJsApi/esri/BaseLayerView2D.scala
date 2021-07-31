package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseLayerView2D
  extends StObject
     with LayerView {
  
  /**
    * Method called when after the [LayerView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-LayerView.html) is created and right before it's asked to draw the layer's content.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerView2D.html#attach)
    */
  def attach(): Unit = js.native
  
  /**
    * Method called after the layer is removed and the [LayerView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-LayerView.html) is about to be removed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerView2D.html#detach)
    */
  def detach(): Unit = js.native
  
  /**
    * Method to implement that is responsible for providing objects hit at the specified screen coordinates.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerView2D.html#hitTest)
    */
  def hitTest(x: Double, y: Double): js.Promise[Graphic] = js.native
  
  /**
    * The method to implement that is responsible of drawing the content of the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerView2D.html#render)
    */
  def render(renderParameters: BaseLayerView2DRenderRenderParameters): Unit = js.native
  
  /**
    * The [LayerView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-LayerView.html) can call this method to ask the MapView to schedule a new rendering frame.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerView2D.html#requestRender)
    */
  def requestRender(): Unit = js.native
  
  /**
    * The array of [Tile](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerView2D.html#Tile) objects computed to cover the MapView's visible area.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerView2D.html#tiles)
    */
  var tiles: js.Array[Tile] = js.native
  
  /**
    * Method to implement, which notifies of tiles being added or removed for the current view state.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerView2D.html#tilesChanged)
    */
  def tilesChanged(added: js.Array[Tile], removed: js.Array[Tile]): Unit = js.native
  
  /**
    * References the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) this [LayerView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-LayerView.html) belongs to.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerView2D.html#view)
    */
  var view: MapView = js.native
}

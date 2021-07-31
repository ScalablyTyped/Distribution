package typings.arcgisJsApi.esri

import typings.std.WebGLRenderingContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseLayerViewGL2D
  extends StObject
     with LayerView {
  
  /**
    * Method called after the [LayerView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-LayerView.html) is created and right before it starts drawing the layer's content.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerViewGL2D.html#attach)
    */
  def attach(): Unit = js.native
  
  /**
    * Bind the designated rendering output surface and restore the correct viewport.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerViewGL2D.html#bindRenderTarget)
    */
  def bindRenderTarget(): Unit = js.native
  
  /**
    * The WebGL rendering context associated to this layer view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerViewGL2D.html#context)
    */
  var context: WebGLRenderingContext | js.Any = js.native
  
  /**
    * Method called after the layer is removed and the [LayerView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-LayerView.html) is about to be removed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerViewGL2D.html#detach)
    */
  def detach(): Unit = js.native
  
  /**
    * Get the designated rendering output surface and corresponding viewport configuration.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerViewGL2D.html#getRenderTarget)
    */
  def getRenderTarget(): RenderTarget = js.native
  
  /**
    * Method to implement that is responsible for providing objects hit at the specified screen coordinates.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerViewGL2D.html#hitTest)
    */
  def hitTest(x: Double, y: Double): js.Promise[Graphic] = js.native
  
  /**
    * The method to implement that is responsible of drawing the content of the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerViewGL2D.html#render)
    */
  def render(renderParameters: BaseLayerViewGL2DRenderRenderParameters): Unit = js.native
  
  /**
    * The [LayerView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-LayerView.html) can call this method to ask the MapView to schedule a new rendering frame.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerViewGL2D.html#requestRender)
    */
  def requestRender(): Unit = js.native
  
  /**
    * Tessellate an [Extent](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html) into a rectangle.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerViewGL2D.html#tessellateExtent)
    */
  def tessellateExtent(extent: Extent): js.Promise[TessellatedMesh] = js.native
  
  /**
    * Tessellate a [Multipoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Multipoint.html) into quads (markers).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerViewGL2D.html#tessellateMultipoint)
    */
  def tessellateMultipoint(multipoint: Multipoint, footprint: Rect): js.Promise[TessellatedMesh] = js.native
  
  /**
    * Tessellate a [Point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html) into a quad (marker).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerViewGL2D.html#tessellatePoint)
    */
  def tessellatePoint(point: Point, footprint: Rect): js.Promise[TessellatedMesh] = js.native
  
  /**
    * Tessellate a [Polygon](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html) into triangles.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerViewGL2D.html#tessellatePolygon)
    */
  def tessellatePolygon(polygon: Polygon): js.Promise[TessellatedMesh] = js.native
  
  /**
    * Tessellate a [Polyline](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polyline.html) into triangles.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerViewGL2D.html#tessellatePolyline)
    */
  def tessellatePolyline(polyline: Polyline, width: Double): js.Promise[TessellatedMesh] = js.native
  
  /**
    * The array of module:esri/views/2d/layers/BaseLayerViewGL2D#Tile objects computed to cover the MapView's visible area.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerViewGL2D.html#tiles)
    */
  var tiles: js.Array[BaseLayerViewGL2DTile] = js.native
  
  /**
    * Method to implement, which notifies of tiles being added or removed for the current view state.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerViewGL2D.html#tilesChanged)
    */
  def tilesChanged(added: js.Array[BaseLayerViewGL2DTile], removed: js.Array[BaseLayerViewGL2DTile]): Unit = js.native
  
  /**
    * References the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) this [LayerView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-LayerView.html) belongs to.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerViewGL2D.html#view)
    */
  var view: MapView = js.native
}

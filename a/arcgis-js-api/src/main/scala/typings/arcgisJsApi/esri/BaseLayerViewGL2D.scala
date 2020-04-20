package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.TopLevel
import typings.std.WebGLRenderingContext
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
  var context: WebGLRenderingContext | js.Any = js.native
  /**
    * The array of module:esri/views/2d/layers/BaseLayerViewGL2D#Tile objects computed to cover the MapView's visible area. This array is updated when the view is animating or the user is interacting with it. Then if tiles have been added or removed, [tilesChanged()](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerViewGL2D.html#tilesChanged) is called.
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
  def attach(): Unit = js.native
  /**
    * Bind the designated rendering output surface and restore the correct viewport.  This method can be used after the WebGL state has been altered by a call to `gl.bindFramebuffer()` to restore the framebuffer that contains the final, composited frame, i.e. the one that is guaranteed to be bound right before control is handed over to [render()](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerViewGL2D.html#render). Note that this *may or may not be the default framebuffer*; [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) can use various surfaces for frame compositing and there is no guarantee that when [render()](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerViewGL2D.html#render) is called, the bound framebuffer is the default one.  Together with the framebuffer, also a matching full-size viewport is restored.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerViewGL2D.html#bindRenderTarget)
    *
    *
    */
  def bindRenderTarget(): Unit = js.native
  /**
    * Method called after the layer is removed and the [LayerView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-LayerView.html) is about to be removed. Typically, this method is implemented to free resources like watchers and destroy WebGL objects such as shader programs.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerViewGL2D.html#detach)
    *
    *
    */
  def detach(): Unit = js.native
  /**
    * Get the designated rendering output surface and corresponding viewport configuration.  The returned object is the same render target that is restored by a call to [bindRenderTarget()](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerViewGL2D.html#bindRenderTarget).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerViewGL2D.html#getRenderTarget)
    *
    *
    */
  def getRenderTarget(): RenderTarget = js.native
  /**
    * Method to implement that is responsible for providing objects hit at the specified screen coordinates. This method is called internally by the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) each time its [hitTest()](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#hitTest) method is called.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerViewGL2D.html#hitTest)
    *
    * @param x The `x`-coordinate in screen space of the desired hit.
    * @param y The `y`-coordinate in screen space of the desired hit.
    *
    */
  def hitTest(x: Double, y: Double): js.Promise[Graphic] = js.native
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
  def render(renderParameters: BaseLayerViewGL2DRenderRenderParameters): Unit = js.native
  /**
    * The [LayerView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-LayerView.html) can call this method to ask the MapView to schedule a new rendering frame.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerViewGL2D.html#requestRender)
    *
    *
    */
  def requestRender(): Unit = js.native
  /**
    * Tessellate an [Extent](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html) into a rectangle.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerViewGL2D.html#tessellateExtent)
    *
    * @param extent The input geometry.
    *
    */
  def tessellateExtent(extent: Extent): js.Promise[TessellatedMesh] = js.native
  /**
    * Tessellate a [Multipoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Multipoint.html) into quads (markers).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerViewGL2D.html#tessellateMultipoint)
    *
    * @param multipoint The input geometry. These are the geographic points where each marker will me anchored.
    * @param footprint The rectangle that describes the geometry of each marker. Coordinates x and y can be thought as being in screen-space, relative to the screen-space projection of the geographic point.
    *
    */
  def tessellateMultipoint(multipoint: Multipoint, footprint: Rect): js.Promise[TessellatedMesh] = js.native
  /**
    * Tessellate a [Point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html) into a quad (marker).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerViewGL2D.html#tessellatePoint)
    *
    * @param point The input geometry. This is the geographic point where the marker will me anchored.
    * @param footprint The rectangle that describes the geometry of the marker. Coordinates `x` and `y` are the position of the upper-left corner of the marker, and can be thought as being in screen-space, relative to the screen-space projection of the geographic point; `width` and `height` are in pixels. See [Rect](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerViewGL2D.html#Rect) for a visual explanation of marker geometry.
    *
    */
  def tessellatePoint(point: Point, footprint: Rect): js.Promise[TessellatedMesh] = js.native
  /**
    * Tessellate a [Polygon](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html) into triangles.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerViewGL2D.html#tessellatePolygon)
    *
    * @param polygon The input geometry. *The geometry must be simple*; if the input geometry is not simple, you must first create a simplified version of it using [geometryEngine](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-geometryEngine.html#simplify), and pass the simplified geometry to `tessellatePolygon`.
    *
    */
  def tessellatePolygon(polygon: Polygon): js.Promise[TessellatedMesh] = js.native
  /**
    * Tessellate a [Polyline](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polyline.html) into triangles.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerViewGL2D.html#tessellatePolyline)
    *
    * @param polyline The input geometry. *The geometry must be simple*; if the input geometry is not simple, you must first create a simplified version of it using [geometryEngine](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-geometryEngine.html#simplify), and pass the simplified geometry to `tessellatePolyline`.
    * @param width The width of the line; this will be used to scale xOffset and yOffset.
    *
    */
  def tessellatePolyline(polyline: Polyline, width: Double): js.Promise[TessellatedMesh] = js.native
  /**
    * Method to implement, which notifies of tiles being added or removed for the current view state. This function can be implemented to start and stop fetching new data, or allocate and dispose resources.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-2d-layers-BaseLayerViewGL2D.html#tilesChanged)
    *
    * @param added The tile objects added for the current view viewport.
    * @param removed The tile objects removed from the view viewport.
    *
    */
  def tilesChanged(added: js.Array[BaseLayerViewGL2DTile], removed: js.Array[BaseLayerViewGL2DTile]): Unit = js.native
}

@JSGlobal("__esri.BaseLayerViewGL2D")
@js.native
object BaseLayerViewGL2D extends TopLevel[BaseLayerViewGL2DConstructor]


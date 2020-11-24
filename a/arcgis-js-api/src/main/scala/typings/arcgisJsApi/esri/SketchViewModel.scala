package typings.arcgisJsApi.esri

import typings.arcgisJsApi.IHandle
import typings.arcgisJsApi.arcgisJsApiStrings.active
import typings.arcgisJsApi.arcgisJsApiStrings.circle
import typings.arcgisJsApi.arcgisJsApiStrings.create
import typings.arcgisJsApi.arcgisJsApiStrings.delete
import typings.arcgisJsApi.arcgisJsApiStrings.disabled
import typings.arcgisJsApi.arcgisJsApiStrings.move
import typings.arcgisJsApi.arcgisJsApiStrings.multipoint
import typings.arcgisJsApi.arcgisJsApiStrings.point
import typings.arcgisJsApi.arcgisJsApiStrings.polygon
import typings.arcgisJsApi.arcgisJsApiStrings.polyline
import typings.arcgisJsApi.arcgisJsApiStrings.ready
import typings.arcgisJsApi.arcgisJsApiStrings.rectangle
import typings.arcgisJsApi.arcgisJsApiStrings.redo
import typings.arcgisJsApi.arcgisJsApiStrings.reshape
import typings.arcgisJsApi.arcgisJsApiStrings.transform
import typings.arcgisJsApi.arcgisJsApiStrings.undo
import typings.arcgisJsApi.arcgisJsApiStrings.update
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SketchViewModel
  extends Accessor
     with Evented {
  
  /**
    * When creating new graphics (for example after [create()](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#create) has been called), this property reflects the create tool being used.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#activeTool)
    */
  val activeTool: point | multipoint | polyline | polygon | circle | rectangle | move | transform | reshape = js.native
  
  /**
    * Cancels the active operation and fires the [create](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#event-create) or [update](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#event-update) event If called in the middle of a create operation, `cancel()` discards the partially created graphic.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#cancel)
    */
  def cancel(): Unit = js.native
  
  /**
    * Completes the active operation and fires the [create](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#event-create) or [update](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#event-update) event and changes the event's state to `complete`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#complete)
    */
  def complete(): Unit = js.native
  
  /**
    * The graphic that is being created.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#createGraphic)
    */
  val createGraphic: Graphic = js.native
  
  @JSName("create")
  def create_circle(tool: circle): Unit = js.native
  @JSName("create")
  def create_circle(tool: circle, createOptions: SketchViewModelCreateCreateOptions): Unit = js.native
  @JSName("create")
  def create_multipoint(tool: multipoint): Unit = js.native
  @JSName("create")
  def create_multipoint(tool: multipoint, createOptions: SketchViewModelCreateCreateOptions): Unit = js.native
  /**
    * Create a graphic with the geometry specified in the `tool` parameter.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#create)
    */
  @JSName("create")
  def create_point(tool: point): Unit = js.native
  @JSName("create")
  def create_point(tool: point, createOptions: SketchViewModelCreateCreateOptions): Unit = js.native
  @JSName("create")
  def create_polygon(tool: polygon): Unit = js.native
  @JSName("create")
  def create_polygon(tool: polygon, createOptions: SketchViewModelCreateCreateOptions): Unit = js.native
  @JSName("create")
  def create_polyline(tool: polyline): Unit = js.native
  @JSName("create")
  def create_polyline(tool: polyline, createOptions: SketchViewModelCreateCreateOptions): Unit = js.native
  @JSName("create")
  def create_rectangle(tool: rectangle): Unit = js.native
  @JSName("create")
  def create_rectangle(tool: rectangle, createOptions: SketchViewModelCreateCreateOptions): Unit = js.native
  
  /**
    * Default create options set for the Sketch widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#defaultCreateOptions)
    */
  var defaultCreateOptions: SketchViewModelDefaultCreateOptions = js.native
  
  /**
    * Default update options set for the SketchViewModel.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#defaultUpdateOptions)
    */
  var defaultUpdateOptions: SketchViewModelDefaultUpdateOptions = js.native
  
  /**
    * Deletes the selected graphics used in the update workflow.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#delete)
    */
  def delete(): Unit = js.native
  
  /**
    * The [GraphicsLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GraphicsLayer.html) associated with the SketchViewModel.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#layer)
    */
  var layer: GraphicsLayer = js.native
  
  @JSName("on")
  def on_create(name: create, eventHandler: SketchViewModelCreateEventHandler): IHandle = js.native
  @JSName("on")
  def on_delete(name: delete, eventHandler: SketchViewModelDeleteEventHandler): IHandle = js.native
  @JSName("on")
  def on_redo(name: redo, eventHandler: SketchViewModelRedoEventHandler): IHandle = js.native
  @JSName("on")
  def on_undo(name: undo, eventHandler: SketchViewModelUndoEventHandler): IHandle = js.native
  @JSName("on")
  def on_update(name: update, eventHandler: SketchViewModelUpdateEventHandler): IHandle = js.native
  
  /**
    * A  [SimpleMarkerSymbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleMarkerSymbol.html) or [PointSymbol3D](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PointSymbol3D.html) used for representing the point geometry that is being drawn.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#pointSymbol)
    */
  var pointSymbol: SimpleMarkerSymbol | PointSymbol3D = js.native
  
  /**
    * A  [SimpleFillSymbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleFillSymbol.html) or [PolygonSymbol3D](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PolygonSymbol3D.html) used for representing the polygon geometry that is being drawn.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#polygonSymbol)
    */
  var polygonSymbol: SimpleFillSymbol | PolygonSymbol3D = js.native
  
  /**
    * A  [SimpleLineSymbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleLineSymbol.html) or [LineSymbol3D](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LineSymbol3D.html) used for representing the polyline geometry that is being drawn.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#polylineSymbol)
    */
  var polylineSymbol: SimpleLineSymbol | LineSymbol3D = js.native
  
  /**
    * Incrementally redo actions recorded in the stack.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#redo)
    */
  def redo(): Unit = js.native
  
  /**
    * The sketch view model's state.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#state)
    */
  val state: ready | disabled | active = js.native
  
  /**
    * Incrementally undo actions recorded in the stack.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#undo)
    */
  def undo(): Unit = js.native
  
  def update(graphics: js.Array[Graphic]): js.Promise[Unit] = js.native
  def update(graphics: js.Array[Graphic], updateOptions: SketchViewModelUpdateUpdateOptions): js.Promise[Unit] = js.native
  /**
    * Initializes an update operation for the specified graphic(s) and fires [update](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#event-update) event.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#update)
    */
  def update(graphics: Graphic): js.Promise[Unit] = js.native
  def update(graphics: Graphic, updateOptions: SketchViewModelUpdateUpdateOptions): js.Promise[Unit] = js.native
  
  /**
    * An array of graphics that are being updated by the SketchViewModel.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#updateGraphics)
    */
  val updateGraphics: Collection[Graphic] = js.native
  
  /**
    * Indicates if a graphic can be selected to be updated.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#updateOnGraphicClick)
    */
  var updateOnGraphicClick: Boolean = js.native
  
  /**
    * The view in which geometries will be sketched by the user.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#view)
    */
  var view: MapView | SceneView = js.native
}

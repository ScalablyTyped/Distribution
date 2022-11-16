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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SketchViewModel
  extends StObject
     with Accessor
     with Evented {
  
  /**
    * The [SimpleFillSymbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleFillSymbol.html) displayed when actively creating a new `polygon` graphic using the [`polygon`](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#activeTool) tool.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#activeFillSymbol)
    */
  var activeFillSymbol: SimpleFillSymbol = js.native
  
  /**
    * When creating new graphics (for example after [create()](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#create) has been called), this property reflects the create tool being used.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#activeTool)
    */
  val activeTool: point | multipoint | polyline | polygon | circle | rectangle | move | transform | reshape = js.native
  
  /**
    * Indicates if it is possible to perform a [redo()](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#redo) action in the current update session.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#canRedo)
    */
  def canRedo(): Boolean = js.native
  
  /**
    * Indicates if it is possible to perform an [undo()](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#undo) action in the current update session.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#canUndo)
    */
  def canUndo(): Boolean = js.native
  
  /**
    * Cancels the active operation and fires the [create](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#event-create) or [update](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#event-update) event If called in the middle of a create operation, `cancel()` discards the partially created graphic.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#cancel)
    */
  def cancel(): scala.Unit = js.native
  
  /**
    * Completes the active operation and fires the [create](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#event-create) or [update](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#event-update) event and changes the event's state to `complete`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#complete)
    */
  def complete(): scala.Unit = js.native
  
  /**
    * Create a graphic with the geometry specified in the `tool` parameter.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#create)
    */
  def create(tool: point | multipoint | polyline | polygon | rectangle | circle): scala.Unit = js.native
  def create(
    tool: point | multipoint | polyline | polygon | rectangle | circle,
    createOptions: SketchViewModelCreateCreateOptions
  ): scala.Unit = js.native
  
  /**
    * The graphic that is being created.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#createGraphic)
    */
  val createGraphic: Graphic = js.native
  
  /**
    * Default create options set for the SketchViewModel.
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
  def delete(): scala.Unit = js.native
  
  /**
    * Options to configure the labels shown next to each segment of the geometry being created or updated.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#labelOptions)
    */
  var labelOptions: SketchLabelOptions = js.native
  
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
    * A [SimpleMarkerSymbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleMarkerSymbol.html), [PointSymbol3D](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PointSymbol3D.html), [TextSymbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol.html), [CIMSymbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html), or [WebStyleSymbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-WebStyleSymbol.html) used for representing the point geometry that is being drawn.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#pointSymbol)
    */
  var pointSymbol: SimpleMarkerSymbol | PointSymbol3D | TextSymbol | CIMSymbol | WebStyleSymbol = js.native
  
  /**
    * A [SimpleFillSymbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleFillSymbol.html), [PolygonSymbol3D](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PolygonSymbol3D.html), or [CIMSymbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html) used for representing the polygon geometry that is being drawn.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#polygonSymbol)
    */
  var polygonSymbol: SimpleFillSymbol | PolygonSymbol3D | CIMSymbol = js.native
  
  /**
    * A [SimpleLineSymbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleLineSymbol.html), [LineSymbol3D](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LineSymbol3D.html), or [CIMSymbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-CIMSymbol.html) used for representing the polyline geometry that is being drawn.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#polylineSymbol)
    */
  var polylineSymbol: SimpleLineSymbol | LineSymbol3D | CIMSymbol = js.native
  
  /**
    * Incrementally redo actions recorded in the stack.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#redo)
    */
  def redo(): scala.Unit = js.native
  
  /**
    * The [SnappingOptions](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-interactive-snapping-SnappingOptions.html) for sketching.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#snappingOptions)
    */
  var snappingOptions: SnappingOptions = js.native
  
  /**
    * The sketch view model's state.
    *
    * @default disabled
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#state)
    */
  val state: ready | disabled | active = js.native
  
  /**
    * Options to configure the tooltip shown next to the cursor when creating or updating graphics.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#tooltipOptions)
    */
  var tooltipOptions: SketchTooltipOptions = js.native
  
  /**
    * Incrementally undo actions recorded in the stack.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#undo)
    */
  def undo(): scala.Unit = js.native
  
  def update(graphics: js.Array[Graphic]): js.Promise[scala.Unit] = js.native
  def update(graphics: js.Array[Graphic], updateOptions: SketchViewModelUpdateUpdateOptions): js.Promise[scala.Unit] = js.native
  /**
    * Initializes an update operation for the specified graphic(s) and fires [update](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#event-update) event.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#update)
    */
  def update(graphics: Graphic): js.Promise[scala.Unit] = js.native
  def update(graphics: Graphic, updateOptions: SketchViewModelUpdateUpdateOptions): js.Promise[scala.Unit] = js.native
  
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

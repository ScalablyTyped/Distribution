package typings.arcgisJsApi.esri

import typings.arcgisJsApi.IHandle
import typings.arcgisJsApi.arcgisJsApiStrings.active
import typings.arcgisJsApi.arcgisJsApiStrings.circle
import typings.arcgisJsApi.arcgisJsApiStrings.continuous
import typings.arcgisJsApi.arcgisJsApiStrings.create
import typings.arcgisJsApi.arcgisJsApiStrings.delete
import typings.arcgisJsApi.arcgisJsApiStrings.disabled
import typings.arcgisJsApi.arcgisJsApiStrings.horizontal
import typings.arcgisJsApi.arcgisJsApiStrings.move
import typings.arcgisJsApi.arcgisJsApiStrings.point
import typings.arcgisJsApi.arcgisJsApiStrings.polygon
import typings.arcgisJsApi.arcgisJsApiStrings.polyline
import typings.arcgisJsApi.arcgisJsApiStrings.ready
import typings.arcgisJsApi.arcgisJsApiStrings.rectangle
import typings.arcgisJsApi.arcgisJsApiStrings.redo
import typings.arcgisJsApi.arcgisJsApiStrings.reshape
import typings.arcgisJsApi.arcgisJsApiStrings.single
import typings.arcgisJsApi.arcgisJsApiStrings.transform
import typings.arcgisJsApi.arcgisJsApiStrings.undo
import typings.arcgisJsApi.arcgisJsApiStrings.update
import typings.arcgisJsApi.arcgisJsApiStrings.vertical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Sketch
  extends StObject
     with Widget_ {
  
  /**
    * When creating new graphics (for example after [create()](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#create) has been called), this property reflects the create tool being used.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#activeTool)
    */
  val activeTool: point | polyline | polygon | circle | rectangle | move | transform | reshape = js.native
  
  /**
    * Property controlling the visibility and order of create tool buttons.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#availableCreateTools)
    */
  var availableCreateTools: js.Array[String] = js.native
  
  /**
    * Cancels the active operation and fires the [create](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#event-create) or [update](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#event-update) event.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#cancel)
    */
  def cancel(): Unit = js.native
  
  /**
    * Completes the active operation and fires the [create](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#event-create) or [update](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#event-update) event and changes the event's state to `complete`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#complete)
    */
  def complete(): Unit = js.native
  
  /**
    * The graphic that is being created.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#createGraphic)
    */
  val createGraphic: Graphic = js.native
  
  @JSName("create")
  def create_circle(tool: circle): Unit = js.native
  @JSName("create")
  def create_circle(tool: circle, createOptions: SketchCreateCreateOptions): Unit = js.native
  /**
    * Create a graphic with the geometry specified in the `tool` parameter.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#create)
    */
  @JSName("create")
  def create_point(tool: point): Unit = js.native
  @JSName("create")
  def create_point(tool: point, createOptions: SketchCreateCreateOptions): Unit = js.native
  @JSName("create")
  def create_polygon(tool: polygon): Unit = js.native
  @JSName("create")
  def create_polygon(tool: polygon, createOptions: SketchCreateCreateOptions): Unit = js.native
  @JSName("create")
  def create_polyline(tool: polyline): Unit = js.native
  @JSName("create")
  def create_polyline(tool: polyline, createOptions: SketchCreateCreateOptions): Unit = js.native
  @JSName("create")
  def create_rectangle(tool: rectangle): Unit = js.native
  @JSName("create")
  def create_rectangle(tool: rectangle, createOptions: SketchCreateCreateOptions): Unit = js.native
  
  /**
    * Defines the default behavior once the [create](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#create) operation is completed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#creationMode)
    */
  var creationMode: single | continuous | update = js.native
  
  /**
    * Default create options set for the Sketch widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#defaultCreateOptions)
    */
  var defaultCreateOptions: SketchDefaultCreateOptions = js.native
  
  /**
    * Default update options set for the Sketch widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#defaultUpdateOptions)
    */
  var defaultUpdateOptions: SketchDefaultUpdateOptions = js.native
  
  /**
    * Deletes the selected graphics used in the update workflow.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#delete)
    */
  def delete(): Unit = js.native
  
  /**
    * The Sketch widget's default CSS icon class.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#iconClass)
    */
  var iconClass: String = js.native
  
  /**
    * The [GraphicsLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GraphicsLayer.html) associated with the Sketch widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#layer)
    */
  var layer: GraphicsLayer = js.native
  
  /**
    * Determines the layout/orientation of the Sketch widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#layout)
    */
  var layout: vertical | horizontal = js.native
  
  @JSName("on")
  def on_create(name: create, eventHandler: SketchCreateEventHandler): IHandle = js.native
  @JSName("on")
  def on_delete(name: delete, eventHandler: SketchDeleteEventHandler): IHandle = js.native
  @JSName("on")
  def on_redo(name: redo, eventHandler: SketchRedoEventHandler): IHandle = js.native
  @JSName("on")
  def on_undo(name: undo, eventHandler: SketchUndoEventHandler): IHandle = js.native
  @JSName("on")
  def on_update(name: update, eventHandler: SketchUpdateEventHandler): IHandle = js.native
  
  /**
    * Incrementally redo actions recorded in the stack.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#redo)
    */
  def redo(): Unit = js.native
  
  /**
    * The Sketch widget's state.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#state)
    */
  val state: ready | disabled | active = js.native
  
  /**
    * Incrementally undo actions recorded in the stack.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#undo)
    */
  def undo(): Unit = js.native
  
  def update(graphics: js.Array[Graphic]): js.Promise[Unit] = js.native
  def update(graphics: js.Array[Graphic], updateOptions: SketchUpdateUpdateOptions): js.Promise[Unit] = js.native
  /**
    * Initializes an update operation for the specified graphic(s) and fires [update](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#event-update) event.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#update)
    */
  def update(graphics: Graphic): js.Promise[Unit] = js.native
  def update(graphics: Graphic, updateOptions: SketchUpdateUpdateOptions): js.Promise[Unit] = js.native
  
  /**
    * An array of [graphics](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html) that are being updated by the Sketch widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#updateGraphics)
    */
  val updateGraphics: Collection[Graphic] = js.native
  
  /**
    * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#view)
    */
  var view: MapView | SceneView = js.native
  
  /**
    * The view model for the Sketch widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#viewModel)
    */
  var viewModel: SketchViewModel = js.native
}

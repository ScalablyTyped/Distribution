package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.TopLevel
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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Sketch extends Widget_ {
  /**
    * When creating new graphics (for example after [create()](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#create) has been called), this property reflects the create tool being used. When updating graphics (for example after [update()](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#update) has been called), this property reflects the update tool being used. If no create or update operation is in progress, this is `null`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#activeTool)
    */
  val activeTool: point | polyline | polygon | circle | rectangle | move | transform | reshape = js.native
  /**
    * Property controlling the visibility and order of create tool buttons.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#availableCreateTools)
    *
    * @default ["point", "polyline", "polygon", "rectangle", "circle"]
    */
  var availableCreateTools: js.Array[String] = js.native
  /**
    * The graphic that is being created.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#createGraphic)
    */
  val createGraphic: Graphic = js.native
  /**
    * Defines the default behavior once the [create](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#create) operation is completed. By default, the user will be able to continuously create graphics with same geometry types.  **Possible Values:**
    *
    * Value | Description |
    * ----- | ----------- |
    * continuous | This is the default. Users can continue creating graphics with same geometry types.
    * single | User can create a single graphic with the specified geometry type. User must choose an operation once the graphic is created.
    * update | The graphic will be selected for an [update](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#update) operation once the `create` operation is completed.
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#creationMode)
    *
    * @default continuous
    */
  var creationMode: single | continuous | update = js.native
  /**
    * Default create options set for the Sketch widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#defaultCreateOptions)
    */
  var defaultCreateOptions: SketchDefaultCreateOptions = js.native
  /**
    * Default update options set for the Sketch widget. Update options set on this property will be overwritten if the update options are changed when [update()](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#update) method is called.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#defaultUpdateOptions)
    */
  var defaultUpdateOptions: SketchDefaultUpdateOptions = js.native
  /**
    * The Sketch widget's default CSS icon class.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#iconClass)
    */
  var iconClass: String = js.native
  /**
    * The [GraphicsLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GraphicsLayer.html) associated with the Sketch widget. The Sketch widget adds new [graphics](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html) to this layer or can only update graphics stored in this layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#layer)
    */
  var layer: GraphicsLayer = js.native
  /**
    * Determines the layout/orientation of the Sketch widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#layout)
    *
    * @default horizontal
    */
  var layout: vertical | horizontal = js.native
  /**
    * The Sketch widget's state.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#state)
    */
  val state: ready | disabled | active = js.native
  /**
    * An array of [graphics](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html) that are being updated by the Sketch widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#updateGraphics)
    */
  val updateGraphics: Collection[Graphic] = js.native
  /**
    * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). Set this to link the Sketch widget to a specific view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#view)
    */
  var view: MapView | SceneView = js.native
  /**
    * The view model for the Sketch widget. This is a class that contains all the logic (properties and methods) that controls this widget's behavior. See the [SketchViewModel](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html) class to access all properties and methods on the Sketch widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#viewModel)
    */
  var viewModel: SketchViewModel = js.native
  /**
    * Cancels the active operation and fires the [create](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#event-create) or [update](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#event-update) event and changes the event's state to `cancel`. If called in the middle of a create operation, `cancel()` discards the partially created graphic.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#cancel)
    *
    *
    */
  def cancel(): Unit = js.native
  /**
    * Completes the active operation and fires the [create](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#event-create) or [update](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#event-update) event and changes the event's state to `complete`. If called in the middle of a create operation, `complete()` finishes the active create operation and keeps the valid geometry.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#complete)
    *
    *
    */
  def complete(): Unit = js.native
  @JSName("create")
  def create_circle(tool: circle): Unit = js.native
  @JSName("create")
  def create_circle(tool: circle, createOptions: SketchCreateCreateOptions): Unit = js.native
  /**
    * Create a graphic with the geometry specified in the `tool` parameter. When the first vertex of the graphic is added, the [create](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#event-create) event will start firing. The provided `tool` will become the [activeTool](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#activeTool).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#create)
    *
    * @param tool Name of the create tool. Specifies the geometry for the graphic to be created.
    * @param createOptions Options for the graphic to be created.
    * @param createOptions.mode
    * Specifies how the graphic can be created. The create mode applies only when creating `polygon`, `polyline`, `rectangle` and `circle` geometries.  **Possible Values:**
    *
    * Value | Description |
    * ----- | ----------- |
    * hybrid | Vertices are added while the pointer is clicked or dragged. Applies to and is the default for `polygon` and `polyline`.
    * freehand | Vertices are added while the pointer is dragged. Applies to `polygon`, `polyline` `rectangle` and `circle`. Default for `rectangle` and `circle`.
    * click | Vertices are added when the pointer is clicked.
    *
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
    * Deletes the selected graphics used in the update workflow. Calling this method will fire the [delete](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#event-delete) event.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#delete)
    *
    *
    */
  def delete(): Unit = js.native
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
    * Incrementally redo actions recorded in the stack. Calling this method will fire the [redo](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#event-redo) event.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#redo)
    *
    *
    */
  def redo(): Unit = js.native
  /**
    * Incrementally undo actions recorded in the stack. Calling this method will fire the [undo](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#event-undo) event.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#undo)
    *
    *
    */
  def undo(): Unit = js.native
  def update(graphics: js.Array[Graphic]): js.Promise[Unit] = js.native
  def update(graphics: js.Array[Graphic], updateOptions: SketchUpdateUpdateOptions): js.Promise[Unit] = js.native
  /**
    * Initializes an update operation for the specified graphic(s) and fires [update](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#event-update) event.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#update)
    *
    * @param graphics A graphic or an array of graphics to be updated. Only graphics added to SketchViewModel's [layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#layer) property can be updated.
    * @param updateOptions Update options for the graphics to be updated.
    * @param updateOptions.tool
    * Name of the update tool. Specifies the update operation for the selected graphics. The provided tool will become the [activeTool](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#activeTool).  **Possible Values:**
    *
    * Value | Description |
    * ----- | ----------- |
    * transform | This is the *default* tool for graphics with a [polygon](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html) geometry, [polyline](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polyline.html) geometry or graphics that use a [3D object symbol layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html) with a [point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html) geometry. It allows one or multiple graphics to be scaled, rotated and moved by default. Its default behavior can be changed by setting the `enableRotation`, `enableScaling` or `preserveAspectRatio` arguments when calling the `update` method or setting them on the [defaultUpdateOptions](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html#defaultUpdateOptions) property when the Sketch widget initializes.
    * reshape | This tool allows the entire graphic or individual vertices of the graphic to be moved. Vertices can be added or removed. This tool can only be used with a single graphic that has a [polygon](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html) or [polyline](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polyline.html) geometry.
    * move | This is the *default* tool for graphics with a [point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html) geometry that do not use a [3D object symbol layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html). It should be used for specific cases where you just want to move selected `polygon` and `polyline` graphics without additional options. Additionally, the `move` tool does not support toggling to different modes, since the `move` operation is built into both the `transform` and `reshape` tools by default.
    * @param updateOptions.enableRotation Indicates if the `rotation` operation will be enabled when updating graphics. Only applies if `tool` is `transform`.
    * @param updateOptions.enableScaling Indicates if the `scale` operation will be enabled when updating graphics. Only applies if `tool` is `transform`.
    * @param updateOptions.preserveAspectRatio Indicates if the uniform scale operation will be enabled when updating graphics. `enableScaling` must be set `true` when setting this property to `true`. Only applies if `tool` is `transform` and is always `true` when transforming points that use a [3D object symbol layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html).
    * @param updateOptions.toggleToolOnClick Indicates if the graphic being updated can be toggled between `transform` and `reshape` update options.
    *
    */
  def update(graphics: Graphic): js.Promise[Unit] = js.native
  def update(graphics: Graphic, updateOptions: SketchUpdateUpdateOptions): js.Promise[Unit] = js.native
}

@JSGlobal("__esri.Sketch")
@js.native
object Sketch extends TopLevel[SketchConstructor]


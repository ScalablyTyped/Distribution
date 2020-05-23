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
import scala.scalajs.js.annotation._

@js.native
trait SketchViewModel
  extends Accessor
     with Evented {
  /**
    * When creating new graphics (for example after [create()](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#create) has been called), this property reflects the create tool being used. When updating graphics (for example after [update()](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#update) has been called), this property reflects the update tool being used. If no create or update operation is in progress, this is `null`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#activeTool)
    */
  val activeTool: point | multipoint | polyline | polygon | circle | rectangle | move | transform | reshape = js.native
  /**
    * The graphic that is being created.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#createGraphic)
    */
  val createGraphic: Graphic = js.native
  /**
    * Default create options set for the Sketch widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#defaultCreateOptions)
    */
  var defaultCreateOptions: SketchViewModelDefaultCreateOptions = js.native
  /**
    * Default update options set for the SketchViewModel. Update options set on this property will be overridden by options passed to the [update()](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#update) method.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#defaultUpdateOptions)
    */
  var defaultUpdateOptions: SketchViewModelDefaultUpdateOptions = js.native
  /**
    * The [GraphicsLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GraphicsLayer.html) associated with the SketchViewModel. The SketchViewModel adds new [graphics](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html) to this layer or can only update graphics stored in this layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#layer)
    */
  var layer: GraphicsLayer = js.native
  /**
    * A  [SimpleMarkerSymbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleMarkerSymbol.html) or [PointSymbol3D](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PointSymbol3D.html) used for representing the point geometry that is being drawn. [SimpleMarkerSymbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleMarkerSymbol.html) may also be used to symbolize point features in a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). However, it is recommended you use [PointSymbol3D](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PointSymbol3D.html) instead.  The default value is the following:
    * ```js
    * {
    *   type: "simple-marker",
    *   style: "circle",
    *   size: 6,
    *   color: [255, 255, 255],
    *   outline: {
    *    color: [50, 50, 50],
    *     width: 1
    *   }
    * }
    * ```
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#pointSymbol)
    */
  var pointSymbol: SimpleMarkerSymbol | PointSymbol3D = js.native
  /**
    * A  [SimpleFillSymbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleFillSymbol.html) or [PolygonSymbol3D](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PolygonSymbol3D.html) used for representing the polygon geometry that is being drawn. [SimpleFillSymbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleFillSymbol.html) may also be used to symbolize point features in a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). However, it is recommended you use [PolygonSymbol3D](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PolygonSymbol3D.html) instead.  The default value is the following:
    * ```js
    * {
    *   type: "simple-fill",
    *   color: [150, 150, 150, 0.2],
    *   outline: {
    *    color: [50, 50, 50],
    *     width: 2
    *   }
    * }
    * ```
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#polygonSymbol)
    */
  var polygonSymbol: SimpleFillSymbol | PolygonSymbol3D = js.native
  /**
    * A  [SimpleLineSymbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleLineSymbol.html) or [LineSymbol3D](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LineSymbol3D.html) used for representing the polyline geometry that is being drawn. [SimpleLineSymbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleLineSymbol.html) may also be used to symbolize polyline features in a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). However, it is recommended you use [LineSymbol3D](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LineSymbol3D.html) instead.  The default value is the following:
    * ```js
    * {
    *   type: "simple-line",
    *   color: [130, 130, 130],
    *   width: 2
    * }
    * ```
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#polylineSymbol)
    */
  var polylineSymbol: SimpleLineSymbol | LineSymbol3D = js.native
  /**
    * The sketch view model's state.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#state)
    */
  val state: ready | disabled | active = js.native
  /**
    * An array of graphics that are being updated by the SketchViewModel.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#updateGraphics)
    */
  val updateGraphics: Collection[Graphic] = js.native
  /**
    * Indicates if a graphic can be selected to be updated. If `false`, graphics cannot selected to be updated. Set this property to `false` to add a custom [hitTest](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#hitTest) logic for [updating](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#update) graphics.
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
  /**
    * Cancels the active operation and fires the [create](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#event-create) or [update](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#event-update) event If called in the middle of a create operation, `cancel()` discards the partially created graphic.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#cancel)
    *
    *
    */
  def cancel(): Unit = js.native
  /**
    * Completes the active operation and fires the [create](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#event-create) or [update](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#event-update) event and changes the event's state to `complete`. If called in the middle of a create operation, `complete()` finishes the active create operation and keeps the valid geometry.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#complete)
    *
    *
    */
  def complete(): Unit = js.native
  /**
    * Create a graphic with the geometry specified in the `tool` parameter. When the first vertex of the graphic is added, the [create](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#event-create) event will start firing. The provided `tool` will become the [activeTool](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#activeTool).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#create)
    *
    * @param tool Name of the create tool. Specifies the geometry for the graphic to be created.  **Possible Values:** point | multipoint | polyline | polygon | rectangle | circle
    * @param createOptions Options for the graphic to be created.
    * @param createOptions.mode
    * Specifies how the graphic can be created. The create mode applies only when creating `polygon`, `polyline`, `rectangle` and `circle` geometries.  **Possible Values:**
    *
    * Value | Description |
    * ----- | ----------- |
    * hybrid | Vertices are added while the pointer is clicked or dragged. Applies to and is the default for `polygon` and `polyline`.
    * freehand | Vertices are added while the pointer is dragged. Applies to `polygon`, `polyline` `rectangle` and `circle`. Default for `rectangle` and `circle`.
    * click | Vertices are added when the pointer is clicked.
    * @param createOptions.hasZ Controls whether the created geometry has z-values or not.
    * @param createOptions.defaultZ The default z-value of the newly created geometry. Ignored when `hasZ` is `false` or the layer's elevation mode is set to `absolute-height`.
    *
    */
  def create(tool: String): Unit = js.native
  def create(tool: String, createOptions: SketchViewModelCreateCreateOptions): Unit = js.native
  /**
    * Deletes the selected graphics used in the update workflow. Calling this method will fire the [delete](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#event-delete) event.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#delete)
    *
    *
    */
  def delete(): Unit = js.native
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
    * Incrementally redo actions recorded in the stack. Calling this method will fire the [redo](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#event-redo) event.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#redo)
    *
    *
    */
  def redo(): Unit = js.native
  /**
    * Incrementally undo actions recorded in the stack. Calling this method will fire the [undo](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#event-undo) event.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#undo)
    *
    *
    */
  def undo(): Unit = js.native
  def update(graphics: js.Array[Graphic]): js.Promise[Unit] = js.native
  def update(graphics: js.Array[Graphic], updateOptions: SketchViewModelUpdateUpdateOptions): js.Promise[Unit] = js.native
  /**
    * Initializes an update operation for the specified graphic(s) and fires [update](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#event-update) event.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#update)
    *
    * @param graphics A graphic or an array of graphics to be updated. Only graphics added to SketchViewModel's [layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#layer) property can be updated.
    * @param updateOptions Update options for the graphics to be updated.
    * @param updateOptions.tool
    * Name of the update tool. Specifies the update operation for the selected graphics. The provided tool will become the [activeTool](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#activeTool).  **Possible Values:**
    *
    * Value | Description |
    * ----- | ----------- |
    * transform | This is the *default* tool for graphics with a [polygon](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html) geometry, [polyline](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polyline.html) geometry or graphics that use a [3D object symbol layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html) with a [point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html) geometry. It allows one or multiple graphics to be scaled, rotated and moved by default. Its default behavior can be changed by setting the `enableRotation`, `enableScaling` or `preserveAspectRatio` arguments when calling the `update` method or setting them on the [defaultUpdateOptions](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#defaultUpdateOptions) property when the Sketch widget initializes.
    * reshape | This tool allows the entire graphic or individual vertices of the graphic to be moved. Vertices can be added or removed. This tool can only be used with a single graphic that has a [polygon](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html) or [polyline](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polyline.html) geometry.
    * move | This is the *default* tool for graphics with a [point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html) geometry that do not use a [3D object symbol layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html). It should be used for specific cases where you just want to move selected `polygon` and `polyline` graphics without additional options. Additionally, the `move` tool does not support toggling to different modes, since the `move` operation is built into both the `transform` and `reshape` tools by default.
    * @param updateOptions.enableRotation Indicates if the `rotation` operation will be enabled when updating graphics. Only applies if `tool` is `transform`.
    * @param updateOptions.enableScaling Indicates if the `scale` operation will be enabled when updating graphics. Only applies if `tool` is `transform`.
    * @param updateOptions.enableZ Indicates if z-values can be modified when updating the graphic. When enabled, the height handle manipulator is displayed.
    * @param updateOptions.multipleSelectionEnabled Indicates whether more than one selection can be made at once. This applies to the shift+click interaction with the `transform` tool.
    * @param updateOptions.preserveAspectRatio Indicates if the uniform scale operation will be enabled when updating graphics. `enableScaling` must be set `true` when setting this property to `true`. Only applies if `tool` is `transform` and is always `true` when transforming points that use a [3D object symbol layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html).
    * @param updateOptions.toggleToolOnClick Indicates if the graphic being updated can be toggled between `transform` and `reshape` update options.
    *
    */
  def update(graphics: Graphic): js.Promise[Unit] = js.native
  def update(graphics: Graphic, updateOptions: SketchViewModelUpdateUpdateOptions): js.Promise[Unit] = js.native
}


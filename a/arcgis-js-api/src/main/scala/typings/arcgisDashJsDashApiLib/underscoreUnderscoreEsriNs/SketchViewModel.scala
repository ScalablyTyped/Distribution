package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SketchViewModel
  extends Accessor
     with Evented {
  /**
    * Returns the name of the active tool associated with the SketchViewModel instance.  **Possible Values:** point | multipoint | polyline | polygon | circle | rectangle | move | transform | reshape
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#activeTool)
    */
  val activeTool: java.lang.String = js.native
  /**
    * The graphic that is being created.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#createGraphic)
    */
  val createGraphic: Graphic = js.native
  /**
    * Default update options set for the SketchViewModel. Update options set on this property will be overwritten if the update options are changed when [update()](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#update) method is called.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#defaultUpdateOptions)
    */
  val defaultUpdateOptions: SketchViewModelDefaultUpdateOptions = js.native
  /**
    * The [GraphicsLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GraphicsLayer.html) associated with the SketchViewModel. The SketchViewModel adds new [graphics](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html) to this layer or can only update graphics stored in this layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#layer)
    */
  var layer: GraphicsLayer = js.native
  /**
    * A simple marker symbol used for representing the point geometry that is being drawn.  The default value is the following:
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
  var pointSymbol: SimpleMarkerSymbol = js.native
  /**
    * A simple fill symbol used for representing the polygon geometry that is being drawn.  The default value is the following:
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
  var polygonSymbol: SimpleFillSymbol = js.native
  /**
    * A simple line symbol used for representing the polyline geometry that is being drawn.  The default value is the following:
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
  var polylineSymbol: SimpleLineSymbol = js.native
  /**
    * The sketch view model's state.  **Possible Values:** ready | disabled | active
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#state)
    */
  val state: java.lang.String = js.native
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
  var updateOnGraphicClick: scala.Boolean = js.native
  /**
    * The view in which geometries will be sketched by the user.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#view)
    */
  var view: MapView = js.native
  /**
    * Cancels the active operation and fires the [create](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#event:create) or [update](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#event:update) event and changes the event's state to `cancel`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#cancel)
    *
    *
    */
  def cancel(): scala.Unit = js.native
  /**
    * Completes the active operation and fires the [create](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#event:create) or [update](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#event:update) event and changes the event's state to `complete`. If called in midst of create operation, `complete()` finishes the active create operation and keeps the valid geometry.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#complete)
    *
    *
    */
  def complete(): scala.Unit = js.native
  /**
    * Create a graphic with a geometry specified in `tool` parameter. When first vertex of the graphic is added, [create](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#event:create) event will start firing.  **Note:** Creating a circle geometry does not work in all spatial references.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#create)
    *
    * @param tool Name of the create tool. Specifies the geometry type for the graphic to be created.  **Possible Values:** point | multipoint | polyline | polygon | rectangle | circle
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
  def create(tool: java.lang.String): scala.Unit = js.native
  def create(tool: java.lang.String, createOptions: SketchViewModelCreateCreateOptions): scala.Unit = js.native
  /**
    * Incrementally redo actions recorded in the stack. Calling this method will fire the [redo](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#event:redo) event.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#redo)
    *
    *
    */
  def redo(): scala.Unit = js.native
  /**
    * Resets SketchViewModel to prepare for another create operation. Reset discards the current sketch, if called in middle of create operation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#reset)
    *
    *
    */
  def reset(): scala.Unit = js.native
  /**
    * Incrementally undo actions recorded in the stack. Calling this method will fire the [undo](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#event:undo) event.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#undo)
    *
    *
    */
  def undo(): scala.Unit = js.native
  /**
    * Initializes an update operation for the specified graphic(s) and fires [update](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#event:update) event.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#update)
    *
    * @param graphics An array of graphics to be updated. Only graphics added to SketchViewModel's [layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#layer) property can be updated.
    * @param updateOptions Update options for the graphics to be updated.
    * @param updateOptions.tool
    * Name of the update tool. Specifies the update operation for the selected graphics.  **Possible Values:**
    *
    * Value | Description |
    * ----- | ----------- |
    * transform | The *default* tool for graphics with [polygon](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html) and [polyline](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polyline.html) geometries. It allows one or multiple graphics to be scaled, rotated and moved by default. Its default behavior can be changed by setting `enableRotation`, `enableScaling` or `preserveAspectRatio` properties when calling `update` method or setting them on [defaultUpdateOptions](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#defaultUpdateOptions) property when the widget initializes. This tool does not apply if selected graphics have only [point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html) or [multipoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Multipoint.html) geometries.
    * reshape | It allows the entire graphic or individual vertices of the graphic to be moved. Vertices can be added or removed. This tool can only be used with one graphic and the graphic's geometry has to be [polygon](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html) or [polyline](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polyline.html).
    * move | The *default* tool for graphics with [point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html) and [multipoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Multipoint.html) geometries. It should be used for specific cases where you just want to move selected `polygon` and `polyline` graphics without additional options. Additionally, the `move` tool does not support toggling to different modes, since `move` operation is already built into both `transform` and `reshape` tools by default.
    * @param updateOptions.enableRotation Indicates if the `rotation` operation will be enabled when updating graphics. Only applies if `tool` is `transform`.
    * @param updateOptions.enableScaling Indicates if the `scale` operation will be enabled when updating graphics. Only applies if `tool` is `transform`.
    * @param updateOptions.preserveAspectRatio Indicates if the uniform scale operation will be enabled when updating graphics. `enableScaling` must be set `true` when setting this property to `true`. Only applies if `tool` is `transform`.
    * @param updateOptions.toggleToolOnClick Indicates if the graphic being updated can be toggled between `transform` and `reshape` update options.
    *
    */
  def update(graphics: js.Array[Graphic]): scala.Unit = js.native
  def update(graphics: js.Array[Graphic], updateOptions: SketchViewModelUpdateUpdateOptions): scala.Unit = js.native
}


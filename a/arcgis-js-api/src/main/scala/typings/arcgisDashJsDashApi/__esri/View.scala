package typings.arcgisDashJsDashApi.__esri

import org.scalablytyped.runtime.TopLevel
import typings.arcgisDashJsDashApi.IHandle
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`double-click`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`immediate-click`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`key-down`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`key-up`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`layerview-create-error`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`layerview-create`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`layerview-destroy`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`mouse-wheel`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`pointer-down`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`pointer-enter`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`pointer-leave`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`pointer-move`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`pointer-up`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.blur
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.click
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.drag
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.focus
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.hold
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.resize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait View
  extends Accessor
     with corePromise
     with Evented
     with DOMContainer {
  /**
    * Collection containing a flat list of all the created [LayerViews](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-LayerView.html) related to the basemap, operational layers, and group layers in this view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#allLayerViews)
    */
  var allLayerViews: Collection[LayerView] = js.native
  /**
    * Represents an ongoing view animation initialized by [goTo()](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#goTo). You may [watch](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Accessor.html#watch) this property to be notified when the view's extent changes .
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#animation)
    */
  var animation: ViewAnimation = js.native
  /**
    * Represents the view for a single basemap after it has been added to the map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#basemapView)
    */
  var basemapView: BasemapView = js.native
  /**
    * A fatal [error](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Error.html) returned when the view loses its WebGL context. Watch this property to properly handle the error and attempt to recover the WebGL context.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#fatalError)
    */
  var fatalError: Error = js.native
  /**
    * Allows for adding [graphics](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html) directly to the default graphics in the View.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#graphics)
    */
  var graphics: Collection[Graphic] = js.native
  /**
    * Options to configure input handling of the View.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#input)
    */
  val input: Input = js.native
  /**
    * Indication whether the view is being interacted with (for example when panning).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#interacting)
    *
    * @default false
    */
  val interacting: Boolean = js.native
  /**
    * A collection containing a hierarchical list of all the created [LayerViews](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-LayerView.html) of the [operational layers](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html#layers) in the map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#layerViews)
    */
  var layerViews: Collection[LayerView] = js.native
  /**
    * An instance of a [Map](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html) object to display in the view. A view may only display one map at a time. On the other hand, one [Map](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html) may be viewed by multiple [MapViews](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) and/or [SceneViews](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html) simultaneously.  This property is typically set in the constructor of the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). See the [class description](#) for examples demonstrating the relationship between the map and the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#map)
    */
  var map: Map = js.native
  /**
    * Options to configure the navigation behavior of the View.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#navigation)
    */
  var navigation: Navigation = js.native
  /**
    * Use the padding property to make the [center](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#center), and [extent](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#extent), etc. work off a subsection of the full view. This is particularly useful when layering UI elements or semi-transparent content on top of portions of the view. See the [view padding sample](https://developers.arcgis.com/javascript/latest/sample-code/view-padding/index.html) for an example of how this works.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#padding)
    *
    * @default {left: 0, top: 0, right: 0, bottom: 0}
    */
  var padding: ViewPadding = js.native
  /**
    * When `true`, this property indicates whether the view successfully satisfied all dependencies, signaling that the following conditions are met.
    *   * The view has a [map](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#map). If [map](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#map) is a [WebMap](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html) or a [WebScene](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html), then the map or scene must be [loaded](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html#loaded).
    *   * The view has a [container](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#container) with a size greater than `0`.
    *   * The view has a [spatialReference](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#spatialReference), a [center](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#center), and a [scale](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#scale). These also can be inferred by setting an [extent](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#extent).
    *
    *
    * When a view becomes ready it will resolve itself and invoke the callback defined in [when()](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#when) where code can execute on a working view. Subsequent changes to a view's readiness would typically be handled by watching `view.ready` and providing logic for cases where the [map](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#map) or [container](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#container) change.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#ready)
    *
    * @default false
    */
  val ready: Boolean = js.native
  /**
    * Represents the current value of one pixel in the unit of the view's [spatialReference](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#spatialReference). The value of resolution is calculated by dividing the view's [extent width](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html#width) by [its width](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#width).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#resolution)
    */
  val resolution: Double = js.native
  /**
    * The spatial reference of the view. This indicates the [Projected Coordinate System](https://developers.arcgis.com/rest/services-reference/projected-coordinate-systems.htm) or the [Geographic Coordinate System](https://developers.arcgis.com/rest/services-reference/geographic-coordinate-systems.htm) used to locate geographic features in the map. In a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html) the following [supported coordinate systems](esri-views-SceneView.html#supported-coordinate-systems) are available.  The spatial reference can either be set explicitly or automatically derived from the following:
    *   * In the case of a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html), if the [map](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#map) is a [WebScene](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html) instance, the [WebScene.initialViewProperties.spatialReference](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html#initialViewProperties) is used.
    *   * In all other cases, the spatial reference is derived from the first layer that loads in this order:
    *   * [map.basemap.baseLayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-Basemap.html#baseLayers)
    *   * [map.layers](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html#layers)
    *   * [map.ground.layers](https://developers.arcgis.com/javascript/latest/api-reference/esri-Ground.html#layers)
    *
    *
    * When using an [Esri basemap](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html#basemap), the default spatial reference is Web Mercator Auxiliary Sphere.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#spatialReference)
    *
    * @default null
    */
  var spatialReference: SpatialReference = js.native
  /**
    * Indication whether the view is animating, being interacted with or resizing.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#stationary)
    */
  val stationary: Boolean = js.native
  /**
    * The view's time extent. Time-aware layers display their temporal data that falls within the view's time extent. Setting the view's time extent is similar to setting the spatial [extent](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#extent) because once the time extent is set, the view updates automatically to conform to the change.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#timeExtent)
    *
    * @default null
    */
  var timeExtent: TimeExtent = js.native
  /**
    * The type of the view is either `2d` (indicating a [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html)) or `3d` (indicating a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html)).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#type)
    */
  val `type`: String = js.native
  /**
    * Indicates whether the view is being updated by additional data requests to the network, or by processing received data.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#updating)
    *
    * @default false
    */
  val updating: Boolean = js.native
  /**
    * Sets the focus on the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#focus)
    *
    *
    */
  def focus(): Unit = js.native
  /**
    * Registers an event handler on the instance. Call this method to hook an event with a listener. See the [Events summary table](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#events-summary) for a list of listened events.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#on)
    *
    * @param type The name of the event or events to listen for.
    * @param modifiersOrHandler Additional modifier keys to filter events. Please see [Key Values](https://developer.mozilla.org/en-US/docs/Web/API/KeyboardEvent/key/Key_Values) for possible values. All the standard key values are supported. Alternatively, if no modifiers are required, the function will call when the event fires.  The following events don't support modifier keys: `blur`, `focus`, `layerview-create`, `layerview-destroy`, `resize`.
    * @param handler The function to call when the event is fired, if modifiers were specified.
    *
    */
  def on(`type`: String, modifiersOrHandler: js.Array[String]): js.Any = js.native
  def on(`type`: String, modifiersOrHandler: js.Array[String], handler: js.Function): js.Any = js.native
  def on(`type`: String, modifiersOrHandler: js.Function): js.Any = js.native
  def on(`type`: String, modifiersOrHandler: js.Function, handler: js.Function): js.Any = js.native
  def on(`type`: js.Array[String], modifiersOrHandler: js.Array[String]): js.Any = js.native
  def on(`type`: js.Array[String], modifiersOrHandler: js.Array[String], handler: js.Function): js.Any = js.native
  def on(`type`: js.Array[String], modifiersOrHandler: js.Function): js.Any = js.native
  def on(`type`: js.Array[String], modifiersOrHandler: js.Function, handler: js.Function): js.Any = js.native
  @JSName("on")
  def on_blur(name: blur, eventHandler: ViewBlurEventHandler): IHandle = js.native
  @JSName("on")
  def on_blur(name: blur, modifiers: js.Array[String], eventHandler: ViewBlurEventHandler): IHandle = js.native
  @JSName("on")
  def on_click(name: click, eventHandler: ViewClickEventHandler): IHandle = js.native
  @JSName("on")
  def on_click(name: click, modifiers: js.Array[String], eventHandler: ViewClickEventHandler): IHandle = js.native
  @JSName("on")
  def on_doubleclick(name: `double-click`, eventHandler: ViewDoubleClickEventHandler): IHandle = js.native
  @JSName("on")
  def on_doubleclick(name: `double-click`, modifiers: js.Array[String], eventHandler: ViewDoubleClickEventHandler): IHandle = js.native
  @JSName("on")
  def on_drag(name: drag, eventHandler: ViewDragEventHandler): IHandle = js.native
  @JSName("on")
  def on_drag(name: drag, modifiers: js.Array[String], eventHandler: ViewDragEventHandler): IHandle = js.native
  @JSName("on")
  def on_focus(name: focus, eventHandler: ViewFocusEventHandler): IHandle = js.native
  @JSName("on")
  def on_focus(name: focus, modifiers: js.Array[String], eventHandler: ViewFocusEventHandler): IHandle = js.native
  @JSName("on")
  def on_hold(name: hold, eventHandler: ViewHoldEventHandler): IHandle = js.native
  @JSName("on")
  def on_hold(name: hold, modifiers: js.Array[String], eventHandler: ViewHoldEventHandler): IHandle = js.native
  @JSName("on")
  def on_immediateclick(name: `immediate-click`, eventHandler: ViewImmediateClickEventHandler): IHandle = js.native
  @JSName("on")
  def on_immediateclick(name: `immediate-click`, modifiers: js.Array[String], eventHandler: ViewImmediateClickEventHandler): IHandle = js.native
  @JSName("on")
  def on_keydown(name: `key-down`, eventHandler: ViewKeyDownEventHandler): IHandle = js.native
  @JSName("on")
  def on_keydown(name: `key-down`, modifiers: js.Array[String], eventHandler: ViewKeyDownEventHandler): IHandle = js.native
  @JSName("on")
  def on_keyup(name: `key-up`, eventHandler: ViewKeyUpEventHandler): IHandle = js.native
  @JSName("on")
  def on_keyup(name: `key-up`, modifiers: js.Array[String], eventHandler: ViewKeyUpEventHandler): IHandle = js.native
  @JSName("on")
  def on_layerviewcreate(name: `layerview-create`, eventHandler: ViewLayerviewCreateEventHandler): IHandle = js.native
  @JSName("on")
  def on_layerviewcreate(
    name: `layerview-create`,
    modifiers: js.Array[String],
    eventHandler: ViewLayerviewCreateEventHandler
  ): IHandle = js.native
  @JSName("on")
  def on_layerviewcreateerror(name: `layerview-create-error`, eventHandler: ViewLayerviewCreateErrorEventHandler): IHandle = js.native
  @JSName("on")
  def on_layerviewcreateerror(
    name: `layerview-create-error`,
    modifiers: js.Array[String],
    eventHandler: ViewLayerviewCreateErrorEventHandler
  ): IHandle = js.native
  @JSName("on")
  def on_layerviewdestroy(name: `layerview-destroy`, eventHandler: ViewLayerviewDestroyEventHandler): IHandle = js.native
  @JSName("on")
  def on_layerviewdestroy(
    name: `layerview-destroy`,
    modifiers: js.Array[String],
    eventHandler: ViewLayerviewDestroyEventHandler
  ): IHandle = js.native
  @JSName("on")
  def on_mousewheel(name: `mouse-wheel`, eventHandler: ViewMouseWheelEventHandler): IHandle = js.native
  @JSName("on")
  def on_mousewheel(name: `mouse-wheel`, modifiers: js.Array[String], eventHandler: ViewMouseWheelEventHandler): IHandle = js.native
  @JSName("on")
  def on_pointerdown(name: `pointer-down`, eventHandler: ViewPointerDownEventHandler): IHandle = js.native
  @JSName("on")
  def on_pointerdown(name: `pointer-down`, modifiers: js.Array[String], eventHandler: ViewPointerDownEventHandler): IHandle = js.native
  @JSName("on")
  def on_pointerenter(name: `pointer-enter`, eventHandler: ViewPointerEnterEventHandler): IHandle = js.native
  @JSName("on")
  def on_pointerenter(name: `pointer-enter`, modifiers: js.Array[String], eventHandler: ViewPointerEnterEventHandler): IHandle = js.native
  @JSName("on")
  def on_pointerleave(name: `pointer-leave`, eventHandler: ViewPointerLeaveEventHandler): IHandle = js.native
  @JSName("on")
  def on_pointerleave(name: `pointer-leave`, modifiers: js.Array[String], eventHandler: ViewPointerLeaveEventHandler): IHandle = js.native
  @JSName("on")
  def on_pointermove(name: `pointer-move`, eventHandler: ViewPointerMoveEventHandler): IHandle = js.native
  @JSName("on")
  def on_pointermove(name: `pointer-move`, modifiers: js.Array[String], eventHandler: ViewPointerMoveEventHandler): IHandle = js.native
  @JSName("on")
  def on_pointerup(name: `pointer-up`, eventHandler: ViewPointerUpEventHandler): IHandle = js.native
  @JSName("on")
  def on_pointerup(name: `pointer-up`, modifiers: js.Array[String], eventHandler: ViewPointerUpEventHandler): IHandle = js.native
  @JSName("on")
  def on_resize(name: resize, eventHandler: ViewResizeEventHandler): IHandle = js.native
  @JSName("on")
  def on_resize(name: resize, modifiers: js.Array[String], eventHandler: ViewResizeEventHandler): IHandle = js.native
  /**
    * Call this method to clear any [fatal errors](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#fatalError) resulting from a lost WebGL context.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#tryFatalErrorRecovery)
    *
    *
    */
  def tryFatalErrorRecovery(): Unit = js.native
  /**
    * Gets the [LayerView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-LayerView.html) created on the view for the given layer. The returned promise resolves when the layer view for the given layer has been created, or rejects with an error (for example if the layer is not part of the view, or if the layer type is not supported in this view).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#whenLayerView)
    *
    * @param layer
    *
    */
  def whenLayerView(layer: CSVLayer): js.Promise[CSVLayerView] = js.native
  /**
    * Gets the [LayerView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-LayerView.html) created on the view for the given layer. The returned promise resolves when the layer view for the given layer has been created, or rejects with an error (for example if the layer is not part of the view, or if the layer type is not supported in this view).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#whenLayerView)
    *
    * @param layer
    *
    */
  def whenLayerView(layer: FeatureLayer): js.Promise[FeatureLayerView] = js.native
  /**
    * Gets the [LayerView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-LayerView.html) created on the view for the given layer. The returned promise resolves when the layer view for the given layer has been created, or rejects with an error (for example if the layer is not part of the view, or if the layer type is not supported in this view).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#whenLayerView)
    *
    * @param layer
    *
    */
  def whenLayerView(layer: GeoJSONLayer): js.Promise[GeoJSONLayerView] = js.native
  /**
    * Gets the [LayerView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-LayerView.html) created on the view for the given layer. The returned promise resolves when the layer view for the given layer has been created, or rejects with an error (for example if the layer is not part of the view, or if the layer type is not supported in this view).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#whenLayerView)
    *
    * @param layer
    *
    */
  def whenLayerView(layer: GeoRSSLayer): js.Promise[GeoRSSLayerView] = js.native
  /**
    * Gets the [LayerView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-LayerView.html) created on the view for the given layer. The returned promise resolves when the layer view for the given layer has been created, or rejects with an error (for example if the layer is not part of the view, or if the layer type is not supported in this view).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#whenLayerView)
    *
    * @param layer
    *
    */
  def whenLayerView(layer: GraphicsLayer): js.Promise[GraphicsLayerView] = js.native
  /**
    * Gets the [LayerView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-LayerView.html) created on the view for the given layer. The returned promise resolves when the layer view for the given layer has been created, or rejects with an error (for example if the layer is not part of the view, or if the layer type is not supported in this view).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#whenLayerView)
    *
    * @param layer
    *
    */
  def whenLayerView(layer: ImageryLayer): js.Promise[ImageryLayerView] = js.native
  /**
    * Gets the [LayerView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-LayerView.html) created on the view for the given layer. The returned promise resolves when the layer view for the given layer has been created, or rejects with an error (for example if the layer is not part of the view, or if the layer type is not supported in this view).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#whenLayerView)
    *
    * @param layer
    *
    */
  def whenLayerView(layer: KMLLayer): js.Promise[KMLLayerView] = js.native
  /**
    * Gets the [LayerView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-LayerView.html) created on the view for the given layer. The returned promise resolves when the layer view for the given layer has been created, or rejects with an error (for example if the layer is not part of the view, or if the layer type is not supported in this view).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#whenLayerView)
    *
    * @param layer The layer for which to obtain its LayerView.
    *
    */
  def whenLayerView(layer: Layer): js.Promise[LayerView] = js.native
  /**
    * Gets the [LayerView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-LayerView.html) created on the view for the given layer. The returned promise resolves when the layer view for the given layer has been created, or rejects with an error (for example if the layer is not part of the view, or if the layer type is not supported in this view).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#whenLayerView)
    *
    * @param layer
    *
    */
  def whenLayerView(layer: PointCloudLayer): js.Promise[PointCloudLayerView] = js.native
  /**
    * Gets the [LayerView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-LayerView.html) created on the view for the given layer. The returned promise resolves when the layer view for the given layer has been created, or rejects with an error (for example if the layer is not part of the view, or if the layer type is not supported in this view).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#whenLayerView)
    *
    * @param layer
    *
    */
  def whenLayerView(layer: SceneLayer): js.Promise[SceneLayerView] = js.native
  /**
    * Gets the [LayerView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-LayerView.html) created on the view for the given layer. The returned promise resolves when the layer view for the given layer has been created, or rejects with an error (for example if the layer is not part of the view, or if the layer type is not supported in this view).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#whenLayerView)
    *
    * @param layer
    *
    */
  def whenLayerView(layer: StreamLayer): js.Promise[StreamLayerView] = js.native
}

@JSGlobal("__esri.View")
@js.native
object View extends TopLevel[ViewConstructor]


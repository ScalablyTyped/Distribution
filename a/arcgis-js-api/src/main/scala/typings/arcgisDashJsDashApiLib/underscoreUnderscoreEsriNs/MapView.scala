package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapView
  extends View
     with BreakpointsOwner {
  /**
    * Represents the view's center point; when setting the center, you may pass a [Point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html) instance or an array of numbers representing a longitude/latitude pair (`[-100.4593, 36.9014]`). Setting the center immediately changes the current view. For animating the view, see [goTo()](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#goTo).  If set in the constructor, this property will be ignored if the [viewpoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#viewpoint) or [extent](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#extent) properties are also set in the constructor.  The returned [Point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html) object is always in the spatial reference of the [map](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#map) and may be modified internally. To persist the returned object, create a clone using [Point.clone()](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html#clone).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#center)
    */
  var center: Point = js.native
  /**
    * Specifies constraints to [scale](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#scale), [zoom](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#zoom), and [rotation](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#rotation) that may be applied to the MapView. See object specification below.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#constraints)
    */
  var constraints: MapViewConstraints = js.native
  /**
    * The extent represents the visible portion of a [map](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html) within the view as an instance of [Extent](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html). Setting the extent immediately changes the view without animation. To animate the view, see [goTo()](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#goTo).  The returned [Extent](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html) object is an internal reference which may be modified internally. To persist the returned object, create a copy using [Extent.clone()](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html#clone).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#extent)
    *
    * @default null
    */
  var extent: Extent = js.native
  /**
    * Options for configuring the highlight. Use the highlight method on the appropriate [LayerView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-LayerView.html) to highlight a feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#highlightOptions)
    */
  var highlightOptions: MapViewHighlightOptions = js.native
  /**
    * Defines which anchor stays still while resizing the browser window. The default, `center`, ensures the view's center point remains constantly visible as the window size changes. The other options allow  the respective portion of the view to remain visible when the window's size is changed.  **Possible values:** center | left | right | top | bottom | top-left | top-right | bottom-left | bottom-right
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#resizeAlign)
    *
    * @default center
    */
  var resizeAlign: java.lang.String = js.native
  /**
    * The clockwise rotation of due north in relation to the top of the view in degrees. The view may be rotated by directly setting the rotation or by using the following mouse event: `Right-click + Drag`. Map rotation may be disabled by setting the `rotationEnabled` property in [constraints](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#constraints) to `false`. See the code snippet below for an example of this.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#rotation)
    *
    * @default 0
    */
  var rotation: scala.Double = js.native
  /**
    * Represents the map scale at the center of the view. Setting the scale immediately changes the view. For animating the view, see [goTo()](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#goTo).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#scale)
    */
  var scale: scala.Double = js.native
  /**
    * Represents the current view as a [Viewpoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-Viewpoint.html) or point of observation on the view. Setting the viewpoint immediately changes the current view. For animating the view, see [goTo()](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#goTo).  The returned [Viewpoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-Viewpoint.html) object is an internal reference which may be modified internally. To persist the returned object, create a copy using [Viewpoint.clone()](https://developers.arcgis.com/javascript/latest/api-reference/esri-Viewpoint.html#clone).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#viewpoint)
    */
  var viewpoint: Viewpoint = js.native
  /**
    * Represents the level of detail (LOD) at the center of the view. Setting the zoom immediately changes the current view. For animating the view, see [goTo()](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#goTo).  Setting this property in conjunction with [center](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#center) is a convenient way to set the initial extent of the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#zoom)
    */
  var zoom: scala.Double = js.native
  /**
    * Sets the focus on the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#focus)
    *
    *
    */
  def focus(): scala.Unit = js.native
  def goTo(target: Geometry): arcgisDashJsDashApiLib.IPromise[_] = js.native
  def goTo(target: Geometry, options: MapViewGoToOptions): arcgisDashJsDashApiLib.IPromise[_] = js.native
  def goTo(target: Graphic): arcgisDashJsDashApiLib.IPromise[_] = js.native
  def goTo(target: Graphic, options: MapViewGoToOptions): arcgisDashJsDashApiLib.IPromise[_] = js.native
  def goTo(target: MapViewGoToTarget): arcgisDashJsDashApiLib.IPromise[_] = js.native
  def goTo(target: MapViewGoToTarget, options: MapViewGoToOptions): arcgisDashJsDashApiLib.IPromise[_] = js.native
  def goTo(target: Viewpoint): arcgisDashJsDashApiLib.IPromise[_] = js.native
  def goTo(target: Viewpoint, options: MapViewGoToOptions): arcgisDashJsDashApiLib.IPromise[_] = js.native
  /**
    * Sets the view to a given target. The target parameter can be one of the following:
    *   * `[longitude, latitude]` pair of coordinates
    *   * [Geometry](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Geometry.html) (or array of [Geometry[]](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Geometry.html))
    *   * [Graphic](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html) (or array of [Graphic[]](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html))
    *   * [Viewpoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-Viewpoint.html)
    *   * Object with a combination of `target`, `center` and `scale` properties (with `target` being any of the types listed above). The `center` property is provided as a convenience to animate the [MapView.center](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#center) and is equivalent to specifying the `target` with the center [Point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html).
    *
    *
    * This function returns a promise which resolves as soon as the new view has been set to the target. If the transition is animated, then the ongoing animation can be obtained using [MapView.animation](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#animation).  If a tiled map service is used as the basemap and `snapToZoom` property is set to `true` in [constraints](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#constraints), the `goTo` method will zoom in to fit the defined `target`. If `snapToZoom` property is set to `false`, the `goTo` method will zoom to the exact `target`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#goTo)
    *
    * @param target The target location/viewpoint to animate to. When using an object for `target`, use the properties in the table below.
    * @param target.target The target of the animation.
    * @param target.center The [MapView.center](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#center) to go to.
    * @param target.scale The [MapView.scale](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#scale) to go to.
    * @param target.zoom The [MapView.zoom](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#zoom) to go to.
    * @param options Animation options. See properties below for object specifications.
    * @param options.animate Indicates if the transition to the new view should be animated. If set to false, `duration` and `easing` properties are ignored.
    * @param options.duration The duration of the animation in milliseconds.
    * @param options.easing The easing function used for the animation. See [easing functions](https://easings.net/) for graphical representations of these functions.  **Possible Values:** linear | ease | ease-in | ease-out | ease-in-out
    *
    */
  def goTo(target: js.Array[scala.Double | Geometry | Graphic]): arcgisDashJsDashApiLib.IPromise[_] = js.native
  def goTo(target: js.Array[scala.Double | Geometry | Graphic], options: MapViewGoToOptions): arcgisDashJsDashApiLib.IPromise[_] = js.native
  /**
    * Indicates whether there is an event listener on the instance that matches the provided event name.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#hasEventListener)
    *
    *
    */
  def hasEventListener(): scala.Unit = js.native
  /**
    * Returns the topmost feature from each layer that intersects the specified screen coordinates. The following layer types will return a result if a hit is made on an intersecting feature: [GraphicsLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GraphicsLayer.html), [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html), [CSVLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html), [GeoRSSLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoRSSLayer.html), [KMLLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-KMLLayer.html), and [StreamLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html).  At 4.6 and later, a hit test will always return a result from [VectorTileLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html). However, the result will only indicate the ID and the name of the layer within the [vector tile style](https://doc.arcgis.com/en/arcgis-online/reference/tile-layers.htm#ESRI_SECTION1_8F68399EB47B48FF9EF46719FCC96978) that intersects the screen point. Detailed attribute and spatial information about the actual feature represented in the layer is not returned. HitTest results returned from VectorTileLayers are primarily used for [Vector tile style editor applications](https://maps.esri.com/jg/VectorBasemapStyleEditor/index.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#hitTest)
    *
    * @param screenPoint The screen coordinates of the click on the view.
    * @param screenPoint.x The horizontal screen coordinate of the click on the view.
    * @param screenPoint.y The vertical screen coordinate of the click on the view.
    *
    */
  def hitTest(screenPoint: MapViewHitTestScreenPoint): arcgisDashJsDashApiLib.IPromise[HitTestResult] = js.native
  def on(`type`: java.lang.String, modifiersOrHandler: EventHandler): arcgisDashJsDashApiLib.IHandle = js.native
  def on(`type`: java.lang.String, modifiersOrHandler: EventHandler, handler: EventHandler): arcgisDashJsDashApiLib.IHandle = js.native
  /**
    * Registers an event handler on the instance. Call this method to hook an event with a listener. See the [Events summary table](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#events-summary) for a list of listened events.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#on)
    *
    * @param type The name of the event or events to listen for.
    * @param modifiersOrHandler Additional modifier keys to filter events. Please see [Key Values](https://developer.mozilla.org/en-US/docs/Web/API/KeyboardEvent/key/Key_Values) for possible values. All the standard key values are supported. Alternatively, if no modifiers are required, the function will call when the event fires.  The following events don't support modifier keys: `blur`, `focus`, `layerview-create`, `layerview-destroy`, `resize`.
    * @param handler The function to call when the event is fired, if modifiers were specified.
    *
    */
  def on(`type`: java.lang.String, modifiersOrHandler: js.Array[java.lang.String]): arcgisDashJsDashApiLib.IHandle = js.native
  def on(`type`: java.lang.String, modifiersOrHandler: js.Array[java.lang.String], handler: EventHandler): arcgisDashJsDashApiLib.IHandle = js.native
  def on(`type`: js.Array[java.lang.String], modifiersOrHandler: EventHandler): arcgisDashJsDashApiLib.IHandle = js.native
  def on(`type`: js.Array[java.lang.String], modifiersOrHandler: EventHandler, handler: EventHandler): arcgisDashJsDashApiLib.IHandle = js.native
  def on(`type`: js.Array[java.lang.String], modifiersOrHandler: js.Array[java.lang.String]): arcgisDashJsDashApiLib.IHandle = js.native
  def on(
    `type`: js.Array[java.lang.String],
    modifiersOrHandler: js.Array[java.lang.String],
    handler: EventHandler
  ): arcgisDashJsDashApiLib.IHandle = js.native
  @JSName("on")
  def on_blur(
    name: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.blur,
    eventHandler: MapViewBlurEventHandler
  ): arcgisDashJsDashApiLib.IHandle = js.native
  @JSName("on")
  def on_blur(
    name: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.blur,
    modifiers: js.Array[java.lang.String],
    eventHandler: MapViewBlurEventHandler
  ): arcgisDashJsDashApiLib.IHandle = js.native
  @JSName("on")
  def on_click(
    name: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.click,
    eventHandler: MapViewClickEventHandler
  ): arcgisDashJsDashApiLib.IHandle = js.native
  @JSName("on")
  def on_click(
    name: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.click,
    modifiers: js.Array[java.lang.String],
    eventHandler: MapViewClickEventHandler
  ): arcgisDashJsDashApiLib.IHandle = js.native
  @JSName("on")
  def `on_double-click`(
    name: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`double-click`,
    eventHandler: MapViewDoubleClickEventHandler
  ): arcgisDashJsDashApiLib.IHandle = js.native
  @JSName("on")
  def `on_double-click`(
    name: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`double-click`,
    modifiers: js.Array[java.lang.String],
    eventHandler: MapViewDoubleClickEventHandler
  ): arcgisDashJsDashApiLib.IHandle = js.native
  @JSName("on")
  def on_drag(
    name: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.drag,
    eventHandler: MapViewDragEventHandler
  ): arcgisDashJsDashApiLib.IHandle = js.native
  @JSName("on")
  def on_drag(
    name: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.drag,
    modifiers: js.Array[java.lang.String],
    eventHandler: MapViewDragEventHandler
  ): arcgisDashJsDashApiLib.IHandle = js.native
  @JSName("on")
  def on_focus(
    name: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.focus,
    eventHandler: MapViewFocusEventHandler
  ): arcgisDashJsDashApiLib.IHandle = js.native
  @JSName("on")
  def on_focus(
    name: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.focus,
    modifiers: js.Array[java.lang.String],
    eventHandler: MapViewFocusEventHandler
  ): arcgisDashJsDashApiLib.IHandle = js.native
  @JSName("on")
  def on_hold(
    name: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.hold,
    eventHandler: MapViewHoldEventHandler
  ): arcgisDashJsDashApiLib.IHandle = js.native
  @JSName("on")
  def on_hold(
    name: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.hold,
    modifiers: js.Array[java.lang.String],
    eventHandler: MapViewHoldEventHandler
  ): arcgisDashJsDashApiLib.IHandle = js.native
  @JSName("on")
  def `on_immediate-click`(
    name: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`immediate-click`,
    eventHandler: MapViewImmediateClickEventHandler
  ): arcgisDashJsDashApiLib.IHandle = js.native
  @JSName("on")
  def `on_immediate-click`(
    name: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`immediate-click`,
    modifiers: js.Array[java.lang.String],
    eventHandler: MapViewImmediateClickEventHandler
  ): arcgisDashJsDashApiLib.IHandle = js.native
  @JSName("on")
  def `on_key-down`(
    name: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`key-down`,
    eventHandler: MapViewKeyDownEventHandler
  ): arcgisDashJsDashApiLib.IHandle = js.native
  @JSName("on")
  def `on_key-down`(
    name: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`key-down`,
    modifiers: js.Array[java.lang.String],
    eventHandler: MapViewKeyDownEventHandler
  ): arcgisDashJsDashApiLib.IHandle = js.native
  @JSName("on")
  def `on_key-up`(
    name: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`key-up`,
    eventHandler: MapViewKeyUpEventHandler
  ): arcgisDashJsDashApiLib.IHandle = js.native
  @JSName("on")
  def `on_key-up`(
    name: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`key-up`,
    modifiers: js.Array[java.lang.String],
    eventHandler: MapViewKeyUpEventHandler
  ): arcgisDashJsDashApiLib.IHandle = js.native
  @JSName("on")
  def `on_layerview-create`(
    name: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`layerview-create`,
    eventHandler: MapViewLayerviewCreateEventHandler
  ): arcgisDashJsDashApiLib.IHandle = js.native
  @JSName("on")
  def `on_layerview-create`(
    name: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`layerview-create`,
    modifiers: js.Array[java.lang.String],
    eventHandler: MapViewLayerviewCreateEventHandler
  ): arcgisDashJsDashApiLib.IHandle = js.native
  @JSName("on")
  def `on_layerview-destroy`(
    name: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`layerview-destroy`,
    eventHandler: MapViewLayerviewDestroyEventHandler
  ): arcgisDashJsDashApiLib.IHandle = js.native
  @JSName("on")
  def `on_layerview-destroy`(
    name: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`layerview-destroy`,
    modifiers: js.Array[java.lang.String],
    eventHandler: MapViewLayerviewDestroyEventHandler
  ): arcgisDashJsDashApiLib.IHandle = js.native
  @JSName("on")
  def `on_mouse-wheel`(
    name: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`mouse-wheel`,
    eventHandler: MapViewMouseWheelEventHandler
  ): arcgisDashJsDashApiLib.IHandle = js.native
  @JSName("on")
  def `on_mouse-wheel`(
    name: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`mouse-wheel`,
    modifiers: js.Array[java.lang.String],
    eventHandler: MapViewMouseWheelEventHandler
  ): arcgisDashJsDashApiLib.IHandle = js.native
  @JSName("on")
  def `on_pointer-down`(
    name: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`pointer-down`,
    eventHandler: MapViewPointerDownEventHandler
  ): arcgisDashJsDashApiLib.IHandle = js.native
  @JSName("on")
  def `on_pointer-down`(
    name: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`pointer-down`,
    modifiers: js.Array[java.lang.String],
    eventHandler: MapViewPointerDownEventHandler
  ): arcgisDashJsDashApiLib.IHandle = js.native
  @JSName("on")
  def `on_pointer-enter`(
    name: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`pointer-enter`,
    eventHandler: MapViewPointerEnterEventHandler
  ): arcgisDashJsDashApiLib.IHandle = js.native
  @JSName("on")
  def `on_pointer-enter`(
    name: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`pointer-enter`,
    modifiers: js.Array[java.lang.String],
    eventHandler: MapViewPointerEnterEventHandler
  ): arcgisDashJsDashApiLib.IHandle = js.native
  @JSName("on")
  def `on_pointer-leave`(
    name: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`pointer-leave`,
    eventHandler: MapViewPointerLeaveEventHandler
  ): arcgisDashJsDashApiLib.IHandle = js.native
  @JSName("on")
  def `on_pointer-leave`(
    name: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`pointer-leave`,
    modifiers: js.Array[java.lang.String],
    eventHandler: MapViewPointerLeaveEventHandler
  ): arcgisDashJsDashApiLib.IHandle = js.native
  @JSName("on")
  def `on_pointer-move`(
    name: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`pointer-move`,
    eventHandler: MapViewPointerMoveEventHandler
  ): arcgisDashJsDashApiLib.IHandle = js.native
  @JSName("on")
  def `on_pointer-move`(
    name: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`pointer-move`,
    modifiers: js.Array[java.lang.String],
    eventHandler: MapViewPointerMoveEventHandler
  ): arcgisDashJsDashApiLib.IHandle = js.native
  @JSName("on")
  def `on_pointer-up`(
    name: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`pointer-up`,
    eventHandler: MapViewPointerUpEventHandler
  ): arcgisDashJsDashApiLib.IHandle = js.native
  @JSName("on")
  def `on_pointer-up`(
    name: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`pointer-up`,
    modifiers: js.Array[java.lang.String],
    eventHandler: MapViewPointerUpEventHandler
  ): arcgisDashJsDashApiLib.IHandle = js.native
  @JSName("on")
  def on_resize(
    name: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.resize,
    eventHandler: MapViewResizeEventHandler
  ): arcgisDashJsDashApiLib.IHandle = js.native
  @JSName("on")
  def on_resize(
    name: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.resize,
    modifiers: js.Array[java.lang.String],
    eventHandler: MapViewResizeEventHandler
  ): arcgisDashJsDashApiLib.IHandle = js.native
  /**
    * Create a screenshot of the current view. Screenshots include only elements that are rendered on the canvas (all geographical elements), but excludes overlayed DOM elements (UI, popups, measurement labels, etc.). By default, a screenshot of the whole view is created. Different options allow for creating different types of screenshots, including taking screenshots at different aspect ratios, different resolutions and creating thumbnails.  Screenshots are always taken inside the padded area of the view (see [padding](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#padding)).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#takeScreenshot)
    *
    * @param options Screenshot options.
    * @param options.format The format of the resulting encoded data url.  **Possible values**: jpg | png.
    * @param options.layers When used, only the visible layers in this list will be included in the output.
    * @param options.quality The quality (0 to 100) of the encoded image when encoding as `jpg`.
    * @param options.width The width of the screenshot (defaults to the area width). The height will be derived automatically if left unspecified, according to the aspect ratio of the of the screenshot area.
    * @param options.height The height of the screenshot (defaults to the area height). The width will be derived automatically if left unspecified, according to the aspect ratio of the screenshot area.
    * @param options.area Specifies whether to take a screenshot of a specific area of the view. The area coordinates are relative to the origin of the padded view (see [padding](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#padding)) and will be clipped to the view size. Defaults to the whole view (padding excluded).
    *
    */
  def takeScreenshot(): arcgisDashJsDashApiLib.IPromise[Screenshot] = js.native
  def takeScreenshot(options: MapViewTakeScreenshotOptions): arcgisDashJsDashApiLib.IPromise[Screenshot] = js.native
  /**
    * Converts the given screen point to a [map point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html). The [screen point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-ScreenPoint.html) represents a point in terms of pixels relative to the top-left corner of the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#toMap)
    *
    * @param screenPoint The screen coordinates to convert.
    * @param screenPoint.x The horizontal screen coordinate to convert.
    * @param screenPoint.y The vertical screen coordinate to convert.
    *
    */
  def toMap(screenPoint: MapViewToMapScreenPoint): Point = js.native
  /**
    * Converts the given [map point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html) to a [screen point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-ScreenPoint.html). The [screen point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-ScreenPoint.html) represents a point in terms of pixels relative to the top-left corner of the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#toScreen)
    *
    * @param point A point geometry.
    * @param screenPoint ScreenPoint object that will reference the result.
    *
    */
  def toScreen(point: Point): ScreenPoint = js.native
  def toScreen(point: Point, screenPoint: ScreenPoint): ScreenPoint = js.native
}


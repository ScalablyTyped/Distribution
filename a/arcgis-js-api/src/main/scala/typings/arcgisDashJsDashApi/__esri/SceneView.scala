package typings.arcgisDashJsDashApi.__esri

import org.scalablytyped.runtime.TopLevel
import typings.arcgisDashJsDashApi.IHandle
import typings.arcgisDashJsDashApi.IPromise
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
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SceneView
  extends View
     with BreakpointsOwner {
  /**
    * Allows the view to be partially or fully transparent when composited with the webpage elements behind it. This property can only be set once at construction time. When alpha compositing is enabled, web scenes are less performant. It's important to set this property to `true` only when you need to apply transparency on the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#alphaCompositingEnabled)
    *
    * @default false
    */
  var alphaCompositingEnabled: Boolean = js.native
  /**
    * The observation point from which the visible portion (or perspective) of the SceneView is determined. Contains properties including the elevation, tilt, and heading (in degrees) of the current view. Setting the camera immediately changes the current view. For animating the view, see [goTo()](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#goTo).  When set in the constructor, this property overrides the [viewpoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#viewpoint), [extent](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#extent), [center](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#center), [scale](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#scale), and [zoom](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#zoom) properties.  The camera property contains an internal reference which may be modified in the future. To persist or modify the camera, create a clone using [camera.clone()](https://developers.arcgis.com/javascript/latest/api-reference/esri-Camera.html#clone).
    * > **Z-values** defined in a geographic or metric coordinate system are expressed in meters. However, in local scenes that use a projected coordinate system, vertical units are assumed to be the same as the horizontal units specified by the service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#camera)
    */
  var camera: Camera = js.native
  /**
    * Represents the view's center point; when setting the center you may pass a [Point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html) instance or an array of numbers representing at longitude/latitude pair (`[-100.4593, 36.9014]`). Setting the center immediately changes the current view. For animating the view, see [goTo()](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#goTo).  If set in the constructor, this property will be ignored if the [viewpoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#viewpoint), [camera](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#camera), or [extent](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#extent) properties are also set in the constructor.  The center property contains an internal reference which may be modified in the future. To persist or modify the center, create a clone using [center.clone()](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html#clone).
    * > **Z-values** defined in a geographic or metric coordinate system are expressed in meters. However, in local scenes that use a projected coordinate system, vertical units are assumed to be the same as the horizontal units specified by the service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#center)
    */
  var center: Point = js.native
  /**
    * Represents an optional clipping area used to define the visible [extent](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html) of a local scene. If defined, only data (including the basemap) within the area will be displayed.  The `clippingArea` property only applies to [local](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#viewingMode) scenes.  ![scene-clipping-area](https://developers.arcgis.com/javascript/assets/img/apiref/views/scene-clipping-area.png%20%22Local%20scene%20with%20clippingArea%22)  The clippingArea property contains an internal reference which may be modified in the future. To persist or modify the clippingArea, create a clone using [clippingArea.clone()](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html#clone).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#clippingArea)
    */
  var clippingArea: Extent = js.native
  /**
    * Specifies constraints for [Camera tilt](esri-Camera.html#tilt) and altitude that may be applied to the SceneView. See the object specification table below for details.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#constraints)
    */
  var constraints: SceneViewConstraints = js.native
  /**
    * Specifies various properties of the environment's visualization in the view. The SceneView will redraw automatically when any property of environment changes.
    * ```js
    * var view = new SceneView({
    *   map: map,
    *   container: "viewDiv"
    * });
    *
    * // Set the sun position to reflect the current time
    * view.environment.lighting.date = Date.now();
    *
    * // Disable automatic lighting updates by camera tracking
    * view.environment.lighting.cameraTrackingEnabled = true;
    *
    * // Enable displaying shadows cast by the sun
    * view.environment.lighting.directShadowsEnabled = true;
    *
    * // Set a background color
    * var view = new SceneView({
    *   container: "view",
    *   map: map,
    *   environment: {
    *     background: {
    *       type: "color",
    *       color: [255, 252, 244, 1]
    *     },
    *     starsEnabled: false,
    *     atmosphereEnabled: false
    *   }
    * });
    * ```
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#environment)
    */
  var environment: SceneViewEnvironment = js.native
  /**
    * The extent represents the visible portion of a [map](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html) within the view as an instance of [Extent](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html). Setting the extent immediately changes the view without animation. To animate the view, see [goTo()](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#goTo).  Rather than using extent to change the visible portion of the [map](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html) in a SceneView, you should use [camera](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#camera) since it easily allows you to define the heading, elevation and tilt of the observation point from which the view's perspective is created.  When set in the constructor, this property overrides the [center](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#center), [scale](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#scale), and [zoom](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#zoom) properties. This property will be ignored if the [viewpoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#viewpoint) or [camera](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#camera) are also set in the constructor.  The extent property contains an internal reference which may be modified in the future. To persist or modify the extent, create a clone using [extent.clone()](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html#clone).
    * > **Z-values** defined in a geographic or metric coordinate system are expressed in meters. However, in local scenes that use a projected coordinate system, vertical units are assumed to be the same as the horizontal units specified by the service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#extent)
    *
    * @default null
    */
  var extent: Extent = js.native
  /**
    * The view for the ground of the map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#groundView)
    */
  val groundView: GroundView = js.native
  /**
    * Options for configuring the highlight. Use the highlight method on the appropriate [LayerView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-LayerView.html) to highlight a feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#highlightOptions)
    */
  var highlightOptions: SceneViewHighlightOptions = js.native
  /**
    * SceneView can draw scenes in three different quality modes: `high`, `medium` and `low`.  The `low` quality profile significantly increases performance on slower browsers and devices by reducing the memory limit and the visual quality in the following aspects:
    *   * Map resolution
    *   * Scene layer detail level
    *   * Anti-aliasing (edge smoothing)
    *
    *
    * The high and medium quality profiles only differ in the maximum amount of memory which the view is allowed to use. A higher memory limit improves quality in complex web scenes with many layers, but can have a negative impact on drawing performance and stability.  The default value is based on the detected browser:
    *   * `low` for Internet Explorer 11 and certain mobile devices
    *   * `medium` for any other browser
    *
    *
    * Overriding the default value is best done in the constructor (see example below). If the value is modified after construction, only a subset of the quality aspects are affected.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#qualityProfile)
    */
  var qualityProfile: String = js.native
  /**
    * Represents an approximation of the map scale at the center of the view. Setting the scale immediately changes the current view. For animating the view, see [goTo()](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#goTo).  When set in the constructor, this property overrides the [zoom](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#zoom) property. This property will be ignored if the [viewpoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#viewpoint), [camera](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#camera), or [extent](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#extent) properties are also set in the constructor.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#scale)
    */
  var scale: Double = js.native
  /**
    * The viewing mode (`local` or `global`). Global scenes render the earth as a sphere. Local scenes render the earth on a flat plane and allow for navigation and feature display in a localized or [clipped](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#clippingArea) area. Users may also navigate the camera of a local scene below the surface of a basemap.
    *
    * Value | Example | Description
    * ------|-------|------------
    * global | ![scene-global](https://developers.arcgis.com/javascript/assets/img/apiref/views/scene-global.png) | Global scenes allow the entire globe to render in the view, showing the curvature of the earth.
    * local | ![scene-local](https://developers.arcgis.com/javascript/assets/img/apiref/views/scene-local.png) | Local scenes render the earth on a flat surface. They can be constrained to only show a "local" area by setting the [clippingArea](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#clipplingArea) property. Local scenes also allow for displaying and exploring data that would otherwise be hidden by the surface of the earth.
    *
    * Depending on the viewing mode different [supported coordinate systems](esri-views-SceneView.html#supported-coordinate-systems) are available.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#viewingMode)
    *
    * @default global
    */
  var viewingMode: String = js.native
  /**
    * Represents the current view as a [Viewpoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-Viewpoint.html) or point of observation on the view. In SceneViews, [camera](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#camera) should be used in favor of viewpoint for watching or changing the point of view. Setting the viewpoint immediately changes the current view. For animating the view, see [goTo()](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#goTo).  When set in the constructor, this property overrides the [extent](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#extent), [center](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#center), [scale](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#scale), and [zoom](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#zoom) properties. This property will be ignored if [camera](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#camera) is also set in the constructor.  The viewpoint property contains an internal reference which may be modified in the future. To persist or modify the viewpoint, create a clone using [viewpoint.clone()](https://developers.arcgis.com/javascript/latest/api-reference/esri-Viewpoint.html#clone).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#viewpoint)
    */
  var viewpoint: Viewpoint = js.native
  /**
    * Represents the level of detail (LOD) at the center of the view. Setting the zoom immediately changes the current view. For animating the view, see [goTo()](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#goTo).  Setting this property in conjunction with [center](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#center) is a convenient way to set the initial extent of the view.  If set in the constructor, this property will be ignored if the [viewpoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#viewpoint), [camera](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#camera), [extent](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#extent), or [scale](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#scale) properties are also set in the constructor.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#zoom)
    */
  var zoom: Double = js.native
  /**
    * Sets the focus on the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#focus)
    *
    *
    */
  def focus(): Unit = js.native
  /**
    * Sets the view to a given target. The target parameter can be one of the following:
    *   * `[longitude, latitude]` pair of coordinates
    *   * [Geometry](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Geometry.html) (or array of [Geometry[]](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Geometry.html))
    *   * [Graphic](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html) (or array of [Graphic[]](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html))
    *   * [Viewpoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-Viewpoint.html)
    *   * [Camera](https://developers.arcgis.com/javascript/latest/api-reference/esri-Camera.html)
    *   * Object with a combination of `target`, `center`, `scale`, `position`, `heading` and `tilt` properties (with `target` being any of the types listed above). The `center` property is provided as a convenience to animate the [SceneView.center](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#center) and is the equivalent of specifying the `target` with the center [Point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html). The target must be provided in the spatial reference of the view.
    *
    *
    * This function returns a promise which resolves as soon as the new view has been set to the target. If the transition is animated, then the ongoing animation can be obtained using [SceneView.animation](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#animation).  If the given target is far away from the current camera position, then heading and tilt will be automatically set to their neutral values (facing north, looking top down). Tilt and heading can always be explicitly set to override this behavior.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#goTo)
    *
    * @param target The target location/viewpoint to go to. When using an object for `target`, use the properties in the table below.
    * @param target.target The target of the animation.
    * @param target.center The [SceneView.center](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#center) to go to.
    * @param target.scale The [SceneView.scale](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#scale) to go to.
    * @param target.zoom The final [zoom](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#zoom) value to go to.
    * @param target.heading The [Camera.heading](https://developers.arcgis.com/javascript/latest/api-reference/esri-Camera.html#heading) to go to.
    * @param target.tilt The [Camera.tilt](https://developers.arcgis.com/javascript/latest/api-reference/esri-Camera.html#position) to go to.
    * @param target.position The [Camera.position](https://developers.arcgis.com/javascript/latest/api-reference/esri-Camera.html#position) to go to.
    * @param options View transition options.
    * @param options.animate Indicates if the transition to the new view should be animated. If set to false, `speedFactor`, `duration`, `maxDuration`, and `easing` properties are ignored.
    * @param options.speedFactor Increases or decreases the animation speed by the specified factor. A speedFactor of 2 will make the animation twice as fast, while a speedFactor of 0.5 will make the animation half as fast. Setting the speed factor will automatically adapt the default maxDuration accordingly.
    * @param options.duration Set the exact duration (in milliseconds) of the animation. Note that by default, animation duration is calculated based on the time required to reach the target at a constant speed. Setting duration overrides the speedFactor option. Note that the resulting duration is still limited to the maxDuration.
    * @param options.maxDuration The maximum allowed duration (in milliseconds) of the animation. The default maxDuration value takes the specified speedFactor into account.
    * @param options.easing The easing function to use for the animation. This may either be a preset (named) function, or a user specified function. Supported named presets are: `linear`, `in-cubic`, `out-cubic`, `in-out-cubic`, `in-expo`, `out-expo`, `in-out-expo`, `in-out-coast-quadratic`. See [easing functions](https://easings.net/) for graphical representations of these functions.  By default, animations that are less than 1000 ms use the `out-expo` easing function; longer animations use the `in-out-coast-quadratic` easing function.
    * @param options.signal An [AbortSignal](https://developer.mozilla.org/en-US/docs/Web/API/AbortSignal) to abort the animation. If canceled, the promise will be rejected with an error named `AbortError`. See also [AbortController](https://developer.mozilla.org/en-US/docs/Web/API/AbortController).
    *
    */
  def goTo(
    target: (js.Array[Double | Geometry | Graphic]) | Geometry | (Collection[Geometry | Graphic]) | Graphic | Viewpoint | Camera | SceneViewGoToTarget
  ): IPromise[_] = js.native
  def goTo(
    target: (js.Array[Double | Geometry | Graphic]) | Geometry | (Collection[Geometry | Graphic]) | Graphic | Viewpoint | Camera | SceneViewGoToTarget,
    options: SceneViewGoToOptions
  ): IPromise[_] = js.native
  /**
    * Returns graphics that intersect the specified screen coordinate. The following layer types will return a result if a hit is made on an intersecting feature: [GraphicsLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GraphicsLayer.html), [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html), [SceneLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html), [BuildingSceneLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BuildingSceneLayer.html), [PointCloudLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-PointCloudLayer.html), [CSVLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html), [StreamLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html), [GeoJSONLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoJSONLayer.html) and [SceneView.graphics](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#graphics).  If no options are specified, graphics that are behind the ground surface will not be returned unless the ground surface is semi-transparent. Otherwise, using the [map.ground](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html#ground) in the include and exclude options determines whether the ground surface prevents hit testing graphics that are under it.  Starting with version 4.11, if a label intersects the specified screen coordinates then the result of the hitTest will contain the graphic associated with that label.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#hitTest)
    *
    * @param screenPoint The screen coordinates (or native mouse event) of the click on the view.
    * @param options Intersection test options. By default the [map.ground](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html#ground) is excluded if its opacity is smaller than one.
    * @param options.include A list of layers and graphics to include for intersection testing. All layers and graphics will be included if include is not specified.
    * @param options.exclude A list of layers and graphics to include for intersection testing. No layers or graphics will be excluded if exclude is not specified.
    *
    */
  def hitTest(screenPoint: SceneViewScreenPoint): IPromise[SceneViewHitTestResult] = js.native
  def hitTest(screenPoint: SceneViewScreenPoint, options: SceneViewHitTestOptions): IPromise[SceneViewHitTestResult] = js.native
  def hitTest(screenPoint: MouseEvent): IPromise[SceneViewHitTestResult] = js.native
  def hitTest(screenPoint: MouseEvent, options: SceneViewHitTestOptions): IPromise[SceneViewHitTestResult] = js.native
  /**
    * Registers an event handler on the instance. Call this method to hook an event with a listener. See the [Events summary table](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#events-summary) for a list of listened events.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#on)
    *
    * @param type The name of the event or events to listen for.
    * @param modifiersOrHandler Additional modifier keys to filter events. Please see [Key Values](https://developer.mozilla.org/en-US/docs/Web/API/KeyboardEvent/key/Key_Values) for possible values. All the standard key values are supported. Alternatively, if no modifiers are required, the function will call when the event fires.  The following events don't support modifier keys: `blur`, `focus`, `layerview-create`, `layerview-destroy`, `resize`.
    * @param handler The function to call when the event is fired, if modifiers were specified.
    *
    */
  def on(`type`: String, modifiersOrHandler: js.Array[String]): IHandle = js.native
  def on(`type`: String, modifiersOrHandler: js.Array[String], handler: EventHandler): IHandle = js.native
  def on(`type`: String, modifiersOrHandler: EventHandler, handler: EventHandler): IHandle = js.native
  def on(`type`: js.Array[String], modifiersOrHandler: js.Array[String]): IHandle = js.native
  def on(`type`: js.Array[String], modifiersOrHandler: js.Array[String], handler: EventHandler): IHandle = js.native
  def on(`type`: js.Array[String], modifiersOrHandler: EventHandler, handler: EventHandler): IHandle = js.native
  @JSName("on")
  def on_blur(name: blur, eventHandler: SceneViewBlurEventHandler): IHandle = js.native
  @JSName("on")
  def on_blur(name: blur, modifiers: js.Array[String], eventHandler: SceneViewBlurEventHandler): IHandle = js.native
  @JSName("on")
  def on_click(name: click, eventHandler: SceneViewClickEventHandler): IHandle = js.native
  @JSName("on")
  def on_click(name: click, modifiers: js.Array[String], eventHandler: SceneViewClickEventHandler): IHandle = js.native
  @JSName("on")
  def on_doubleclick(name: `double-click`, eventHandler: SceneViewDoubleClickEventHandler): IHandle = js.native
  @JSName("on")
  def on_doubleclick(name: `double-click`, modifiers: js.Array[String], eventHandler: SceneViewDoubleClickEventHandler): IHandle = js.native
  @JSName("on")
  def on_drag(name: drag, eventHandler: SceneViewDragEventHandler): IHandle = js.native
  @JSName("on")
  def on_drag(name: drag, modifiers: js.Array[String], eventHandler: SceneViewDragEventHandler): IHandle = js.native
  @JSName("on")
  def on_focus(name: focus, eventHandler: SceneViewFocusEventHandler): IHandle = js.native
  @JSName("on")
  def on_focus(name: focus, modifiers: js.Array[String], eventHandler: SceneViewFocusEventHandler): IHandle = js.native
  @JSName("on")
  def on_hold(name: hold, eventHandler: SceneViewHoldEventHandler): IHandle = js.native
  @JSName("on")
  def on_hold(name: hold, modifiers: js.Array[String], eventHandler: SceneViewHoldEventHandler): IHandle = js.native
  @JSName("on")
  def on_immediateclick(name: `immediate-click`, eventHandler: SceneViewImmediateClickEventHandler): IHandle = js.native
  @JSName("on")
  def on_immediateclick(
    name: `immediate-click`,
    modifiers: js.Array[String],
    eventHandler: SceneViewImmediateClickEventHandler
  ): IHandle = js.native
  @JSName("on")
  def on_keydown(name: `key-down`, eventHandler: SceneViewKeyDownEventHandler): IHandle = js.native
  @JSName("on")
  def on_keydown(name: `key-down`, modifiers: js.Array[String], eventHandler: SceneViewKeyDownEventHandler): IHandle = js.native
  @JSName("on")
  def on_keyup(name: `key-up`, eventHandler: SceneViewKeyUpEventHandler): IHandle = js.native
  @JSName("on")
  def on_keyup(name: `key-up`, modifiers: js.Array[String], eventHandler: SceneViewKeyUpEventHandler): IHandle = js.native
  @JSName("on")
  def on_layerviewcreate(name: `layerview-create`, eventHandler: SceneViewLayerviewCreateEventHandler): IHandle = js.native
  @JSName("on")
  def on_layerviewcreate(
    name: `layerview-create`,
    modifiers: js.Array[String],
    eventHandler: SceneViewLayerviewCreateEventHandler
  ): IHandle = js.native
  @JSName("on")
  def on_layerviewcreateerror(name: `layerview-create-error`, eventHandler: SceneViewLayerviewCreateErrorEventHandler): IHandle = js.native
  @JSName("on")
  def on_layerviewcreateerror(
    name: `layerview-create-error`,
    modifiers: js.Array[String],
    eventHandler: SceneViewLayerviewCreateErrorEventHandler
  ): IHandle = js.native
  @JSName("on")
  def on_layerviewdestroy(name: `layerview-destroy`, eventHandler: SceneViewLayerviewDestroyEventHandler): IHandle = js.native
  @JSName("on")
  def on_layerviewdestroy(
    name: `layerview-destroy`,
    modifiers: js.Array[String],
    eventHandler: SceneViewLayerviewDestroyEventHandler
  ): IHandle = js.native
  @JSName("on")
  def on_mousewheel(name: `mouse-wheel`, eventHandler: SceneViewMouseWheelEventHandler): IHandle = js.native
  @JSName("on")
  def on_mousewheel(name: `mouse-wheel`, modifiers: js.Array[String], eventHandler: SceneViewMouseWheelEventHandler): IHandle = js.native
  @JSName("on")
  def on_pointerdown(name: `pointer-down`, eventHandler: SceneViewPointerDownEventHandler): IHandle = js.native
  @JSName("on")
  def on_pointerdown(name: `pointer-down`, modifiers: js.Array[String], eventHandler: SceneViewPointerDownEventHandler): IHandle = js.native
  @JSName("on")
  def on_pointerenter(name: `pointer-enter`, eventHandler: SceneViewPointerEnterEventHandler): IHandle = js.native
  @JSName("on")
  def on_pointerenter(
    name: `pointer-enter`,
    modifiers: js.Array[String],
    eventHandler: SceneViewPointerEnterEventHandler
  ): IHandle = js.native
  @JSName("on")
  def on_pointerleave(name: `pointer-leave`, eventHandler: SceneViewPointerLeaveEventHandler): IHandle = js.native
  @JSName("on")
  def on_pointerleave(
    name: `pointer-leave`,
    modifiers: js.Array[String],
    eventHandler: SceneViewPointerLeaveEventHandler
  ): IHandle = js.native
  @JSName("on")
  def on_pointermove(name: `pointer-move`, eventHandler: SceneViewPointerMoveEventHandler): IHandle = js.native
  @JSName("on")
  def on_pointermove(name: `pointer-move`, modifiers: js.Array[String], eventHandler: SceneViewPointerMoveEventHandler): IHandle = js.native
  @JSName("on")
  def on_pointerup(name: `pointer-up`, eventHandler: SceneViewPointerUpEventHandler): IHandle = js.native
  @JSName("on")
  def on_pointerup(name: `pointer-up`, modifiers: js.Array[String], eventHandler: SceneViewPointerUpEventHandler): IHandle = js.native
  @JSName("on")
  def on_resize(name: resize, eventHandler: SceneViewResizeEventHandler): IHandle = js.native
  @JSName("on")
  def on_resize(name: resize, modifiers: js.Array[String], eventHandler: SceneViewResizeEventHandler): IHandle = js.native
  /**
    * Create a screenshot of the current view. Screenshots include only elements that are rendered on the canvas (all geographical elements), but excludes overlayed DOM elements (UI, popups, etc.). By default, a screenshot of the whole view is created. Different options allow for creating different types of screenshots, including taking screenshots at different aspect ratios, different resolutions and creating thumbnails.  Screenshots are always taken inside the padded area of the view (see [padding](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#padding)).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#takeScreenshot)
    *
    * @param options Screenshot options.
    * @param options.format The format of the resulting encoded data url.  **Possible values**: jpg | png.
    * @param options.quality The quality (0 to 100) of the encoded image when encoding as `jpg`.
    * @param options.width The width of the screenshot (defaults to the area width). The height will be derived automatically if left unspecified, according to the aspect ratio of the of the screenshot area.
    * @param options.height The height of the screenshot (defaults to the area height). The width will be derived automatically if left unspecified, according to the aspect ratio of the screenshot area.
    * @param options.area Specifies whether to take a screenshot of a specific area of the view. The area coordinates are relative to the origin of the padded view (see [padding](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#padding)) and will be clipped to the view size. Defaults to the whole view (padding excluded).
    * @param options.ignorePadding Indicates whether view padding should be ignored. Set this property to `true` to allow padded areas to be included in the screenshot.
    *
    */
  def takeScreenshot(): IPromise[SceneViewScreenshot] = js.native
  def takeScreenshot(options: SceneViewTakeScreenshotOptions): IPromise[SceneViewScreenshot] = js.native
  /**
    * Converts the given screen point to a [map point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#toMap)
    *
    * @param screenPoint The location on the screen (or native mouse event) to convert.
    * @param options Intersection test options. By default only the [map.ground](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html#ground) and any [IntegratedMeshLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-IntegratedMeshLayer.html) are included.
    * @param options.include A list of layers and graphics to include for intersection testing. All layers and graphics will be included if include is not specified.
    * @param options.exclude A list of layers and graphics to include for intersection testing. No layers or graphics will be excluded if exclude is not specified.
    *
    */
  def toMap(screenPoint: SceneViewScreenPoint): Point = js.native
  def toMap(screenPoint: SceneViewScreenPoint, options: SceneViewToMapOptions): Point = js.native
  def toMap(screenPoint: MouseEvent): Point = js.native
  def toMap(screenPoint: MouseEvent, options: SceneViewToMapOptions): Point = js.native
  /**
    * Converts the given [map point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html) to a screen point.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#toScreen)
    *
    * @param point A point geometry.
    *
    */
  def toScreen(point: Point): SceneViewScreenPoint = js.native
}

@JSGlobal("__esri.SceneView")
@js.native
object SceneView extends TopLevel[SceneViewConstructor]


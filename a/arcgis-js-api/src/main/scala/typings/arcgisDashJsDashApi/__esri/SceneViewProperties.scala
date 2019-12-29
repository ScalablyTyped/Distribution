package typings.arcgisDashJsDashApi.__esri

import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.global
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.high
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.large
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.local
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.low
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.medium
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.small
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.xlarge
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.xsmall
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SceneViewProperties
  extends ViewProperties
     with BreakpointsOwnerProperties {
  /**
    * Allows the view to be partially or fully transparent when composited with the webpage elements behind it. This property can only be set once at construction time. When alpha compositing is enabled, web scenes are less performant. It's important to set this property to `true` only when you need to apply transparency on the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#alphaCompositingEnabled)
    *
    * @default false
    */
  var alphaCompositingEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * The observation point from which the visible portion (or perspective) of the SceneView is determined. Contains properties including the elevation, tilt, and heading (in degrees) of the current view. Setting the camera immediately changes the current view. For animating the view, see [goTo()](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#goTo).  When set in the constructor, this property overrides the [viewpoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#viewpoint), [extent](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#extent), [center](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#center), [scale](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#scale), and [zoom](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#zoom) properties.  The camera property contains an internal reference which may be modified in the future. To persist or modify the camera, create a clone using [camera.clone()](https://developers.arcgis.com/javascript/latest/api-reference/esri-Camera.html#clone).
    * > **Z-values** defined in a geographic or metric coordinate system are expressed in meters. However, in local scenes that use a projected coordinate system, vertical units are assumed to be the same as the horizontal units specified by the service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#camera)
    */
  var camera: js.UndefOr[CameraProperties] = js.undefined
  /**
    * Represents the view's center point; when setting the center you may pass a [Point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html) instance or an array of numbers representing at longitude/latitude pair (`[-100.4593, 36.9014]`). Setting the center immediately changes the current view. For animating the view, see [goTo()](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#goTo).  If set in the constructor, this property will be ignored if the [viewpoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#viewpoint), [camera](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#camera), or [extent](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#extent) properties are also set in the constructor.  The center property contains an internal reference which may be modified in the future. To persist or modify the center, create a clone using [center.clone()](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html#clone).
    * > **Z-values** defined in a geographic or metric coordinate system are expressed in meters. However, in local scenes that use a projected coordinate system, vertical units are assumed to be the same as the horizontal units specified by the service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#center)
    */
  var center: js.UndefOr[PointProperties | js.Array[Double]] = js.undefined
  /**
    * Represents an optional clipping area used to define the visible [extent](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html) of a local scene. If defined, only features that intersect the area will be displayed. The clipping area applies to all layers types, including the ground and the basemap.  The `clippingArea` property only applies to [local](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#viewingMode) scenes.  ![scene-clipping-area](https://developers.arcgis.com/javascript/assets/img/apiref/views/scene-clipping-area.png%20%22Local%20scene%20with%20clippingArea%22)  The clippingArea property contains an internal reference which may be modified in the future. To persist or modify the clippingArea, create a clone using [clippingArea.clone()](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html#clone).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#clippingArea)
    */
  var clippingArea: js.UndefOr[ExtentProperties] = js.undefined
  /**
    * Specifies constraints for [Camera tilt](esri-Camera.html#tilt) and altitude that may be applied to the SceneView. See the object specification table below for details.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#constraints)
    */
  var constraints: js.UndefOr[SceneViewConstraintsProperties] = js.undefined
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
  var environment: js.UndefOr[SceneViewEnvironmentProperties] = js.undefined
  /**
    * The extent represents the visible portion of a [map](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html) within the view as an instance of [Extent](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html). Setting the extent immediately changes the view without animation. To animate the view, see [goTo()](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#goTo).  Rather than using extent to change the visible portion of the [map](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html) in a SceneView, you should use [camera](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#camera) since it easily allows you to define the heading, elevation and tilt of the observation point from which the view's perspective is created.  When set in the constructor, this property overrides the [center](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#center), [scale](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#scale), and [zoom](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#zoom) properties. This property will be ignored if the [viewpoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#viewpoint) or [camera](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#camera) are also set in the constructor.  The extent property contains an internal reference which may be modified in the future. To persist or modify the extent, create a clone using [extent.clone()](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html#clone).
    * > **Z-values** defined in a geographic or metric coordinate system are expressed in meters. However, in local scenes that use a projected coordinate system, vertical units are assumed to be the same as the horizontal units specified by the service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#extent)
    *
    * @default null
    */
  var extent: js.UndefOr[ExtentProperties] = js.undefined
  /**
    * Options for configuring the highlight. Use the highlight method on the appropriate [LayerView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-LayerView.html) to highlight a feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#highlightOptions)
    */
  var highlightOptions: js.UndefOr[SceneViewHighlightOptionsProperties] = js.undefined
  /**
    * SceneView can draw scenes in three different quality modes: `high`, `medium` and `low`.  The `low` quality profile significantly increases performance on slower browsers and devices by reducing the memory limit and the visual quality in the following aspects:
    *   * Map resolution
    *   * Scene layer detail level
    *   * Anti-aliasing (edge smoothing)
    *
    *
    * The high and medium quality profiles differ in the maximum amount of memory which the view is allowed to use. A higher memory limit improves quality in complex web scenes with many layers, but can have a negative impact on drawing performance and stability.  [Physically based rendering](https://en.wikipedia.org/wiki/Physically_based_rendering) (PBR) materials are enabled on all 3D objects in a SceneView in "high" quality mode. However, if a [GLTF model](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html#resource) or a 3D Object [SceneLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html) has PBR settings defined on the material, then these will be rendered in all quality modes.  In "high" quality mode, on a HiDPI display, graphics are rendered at a higher resolution depending on the browser's [devicePixelRatio](https://developer.mozilla.org/en-US/docs/Web/API/Window/devicePixelRatio) property.  The default value is based on the detected browser:
    *   * `low` for Internet Explorer 11 and certain mobile devices
    *   * `medium` for any other browser
    *
    *
    * Overriding the default value is best done in the constructor (see example below). If the value is modified after construction, only a subset of the quality aspects are affected.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#qualityProfile)
    */
  var qualityProfile: js.UndefOr[low | medium | high] = js.undefined
  /**
    * Represents an approximation of the map scale at the center of the view. Setting the scale immediately changes the current view. For animating the view, see [goTo()](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#goTo).  When set in the constructor, this property overrides the [zoom](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#zoom) property. This property will be ignored if the [viewpoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#viewpoint), [camera](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#camera), or [extent](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#extent) properties are also set in the constructor.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#scale)
    */
  var scale: js.UndefOr[Double] = js.undefined
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
  var viewingMode: js.UndefOr[global | local] = js.undefined
  /**
    * Represents the current view as a [Viewpoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-Viewpoint.html) or point of observation on the view. In SceneViews, [camera](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#camera) should be used in favor of viewpoint for watching or changing the point of view. Setting the viewpoint immediately changes the current view. For animating the view, see [goTo()](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#goTo).  When set in the constructor, this property overrides the [extent](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#extent), [center](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#center), [scale](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#scale), and [zoom](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#zoom) properties. This property will be ignored if [camera](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#camera) is also set in the constructor.  The viewpoint property contains an internal reference which may be modified in the future. To persist or modify the viewpoint, create a clone using [viewpoint.clone()](https://developers.arcgis.com/javascript/latest/api-reference/esri-Viewpoint.html#clone).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#viewpoint)
    */
  var viewpoint: js.UndefOr[ViewpointProperties] = js.undefined
  /**
    * Represents the level of detail (LOD) at the center of the view. Setting the zoom immediately changes the current view. For animating the view, see [goTo()](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#goTo).  Setting this property in conjunction with [center](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#center) is a convenient way to set the initial extent of the view.  If set in the constructor, this property will be ignored if the [viewpoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#viewpoint), [camera](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#camera), [extent](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#extent), or [scale](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#scale) properties are also set in the constructor.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#zoom)
    */
  var zoom: js.UndefOr[Double] = js.undefined
}

object SceneViewProperties {
  @scala.inline
  def apply(
    allLayerViews: CollectionProperties[LayerViewProperties] = null,
    alphaCompositingEnabled: js.UndefOr[Boolean] = js.undefined,
    animation: ViewAnimationProperties = null,
    basemapView: BasemapViewProperties = null,
    breakpoints: BreakpointsOwnerBreakpoints = null,
    camera: CameraProperties = null,
    center: PointProperties | js.Array[Double] = null,
    clippingArea: ExtentProperties = null,
    constraints: SceneViewConstraintsProperties = null,
    container: HTMLDivElement | String = null,
    environment: SceneViewEnvironmentProperties = null,
    extent: ExtentProperties = null,
    fatalError: Error = null,
    graphics: CollectionProperties[GraphicProperties] = null,
    heightBreakpoint: xsmall | small | medium | large | xlarge = null,
    highlightOptions: SceneViewHighlightOptionsProperties = null,
    layerViews: CollectionProperties[LayerViewProperties] = null,
    map: MapProperties = null,
    navigation: NavigationProperties = null,
    padding: ViewPadding = null,
    popup: PopupProperties = null,
    qualityProfile: low | medium | high = null,
    scale: Int | Double = null,
    spatialReference: SpatialReferenceProperties = null,
    timeExtent: TimeExtentProperties = null,
    ui: DefaultUIProperties = null,
    viewingMode: global | local = null,
    viewpoint: ViewpointProperties = null,
    widthBreakpoint: xsmall | small | medium | large | xlarge = null,
    zoom: Int | Double = null
  ): SceneViewProperties = {
    val __obj = js.Dynamic.literal()
    if (allLayerViews != null) __obj.updateDynamic("allLayerViews")(allLayerViews.asInstanceOf[js.Any])
    if (!js.isUndefined(alphaCompositingEnabled)) __obj.updateDynamic("alphaCompositingEnabled")(alphaCompositingEnabled.asInstanceOf[js.Any])
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (basemapView != null) __obj.updateDynamic("basemapView")(basemapView.asInstanceOf[js.Any])
    if (breakpoints != null) __obj.updateDynamic("breakpoints")(breakpoints.asInstanceOf[js.Any])
    if (camera != null) __obj.updateDynamic("camera")(camera.asInstanceOf[js.Any])
    if (center != null) __obj.updateDynamic("center")(center.asInstanceOf[js.Any])
    if (clippingArea != null) __obj.updateDynamic("clippingArea")(clippingArea.asInstanceOf[js.Any])
    if (constraints != null) __obj.updateDynamic("constraints")(constraints.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (environment != null) __obj.updateDynamic("environment")(environment.asInstanceOf[js.Any])
    if (extent != null) __obj.updateDynamic("extent")(extent.asInstanceOf[js.Any])
    if (fatalError != null) __obj.updateDynamic("fatalError")(fatalError.asInstanceOf[js.Any])
    if (graphics != null) __obj.updateDynamic("graphics")(graphics.asInstanceOf[js.Any])
    if (heightBreakpoint != null) __obj.updateDynamic("heightBreakpoint")(heightBreakpoint.asInstanceOf[js.Any])
    if (highlightOptions != null) __obj.updateDynamic("highlightOptions")(highlightOptions.asInstanceOf[js.Any])
    if (layerViews != null) __obj.updateDynamic("layerViews")(layerViews.asInstanceOf[js.Any])
    if (map != null) __obj.updateDynamic("map")(map.asInstanceOf[js.Any])
    if (navigation != null) __obj.updateDynamic("navigation")(navigation.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (popup != null) __obj.updateDynamic("popup")(popup.asInstanceOf[js.Any])
    if (qualityProfile != null) __obj.updateDynamic("qualityProfile")(qualityProfile.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (spatialReference != null) __obj.updateDynamic("spatialReference")(spatialReference.asInstanceOf[js.Any])
    if (timeExtent != null) __obj.updateDynamic("timeExtent")(timeExtent.asInstanceOf[js.Any])
    if (ui != null) __obj.updateDynamic("ui")(ui.asInstanceOf[js.Any])
    if (viewingMode != null) __obj.updateDynamic("viewingMode")(viewingMode.asInstanceOf[js.Any])
    if (viewpoint != null) __obj.updateDynamic("viewpoint")(viewpoint.asInstanceOf[js.Any])
    if (widthBreakpoint != null) __obj.updateDynamic("widthBreakpoint")(widthBreakpoint.asInstanceOf[js.Any])
    if (zoom != null) __obj.updateDynamic("zoom")(zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[SceneViewProperties]
  }
}


package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.global
import typings.arcgisJsApi.arcgisJsApiStrings.high
import typings.arcgisJsApi.arcgisJsApiStrings.local
import typings.arcgisJsApi.arcgisJsApiStrings.low
import typings.arcgisJsApi.arcgisJsApiStrings.medium
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
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
  var alphaCompositingEnabled: js.UndefOr[Boolean] = js.native
  /**
    * The observation point from which the visible portion (or perspective) of the SceneView is determined. Contains properties including the elevation, tilt, and heading (in degrees) of the current view. Setting the camera immediately changes the current view. For animating the view, see [goTo()](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#goTo).  When set in the constructor, this property overrides the [viewpoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#viewpoint), [extent](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#extent), [center](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#center), [scale](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#scale), and [zoom](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#zoom) properties.  The camera property contains an internal reference which may be modified in the future. To persist or modify the camera, create a clone using [camera.clone()](https://developers.arcgis.com/javascript/latest/api-reference/esri-Camera.html#clone).
    * > **Z-values** defined in a geographic or metric coordinate system are expressed in meters. However, in local scenes that use a projected coordinate system, vertical units are assumed to be the same as the horizontal units specified by the service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#camera)
    */
  var camera: js.UndefOr[CameraProperties] = js.native
  /**
    * Represents the view's center point; when setting the center you may pass a [Point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html) instance or an array of numbers representing at longitude/latitude pair (`[-100.4593, 36.9014]`). Setting the center immediately changes the current view. For animating the view, see [goTo()](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#goTo).  If set in the constructor, this property will be ignored if the [viewpoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#viewpoint), [camera](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#camera), or [extent](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#extent) properties are also set in the constructor.  The center property contains an internal reference which may be modified in the future. To persist or modify the center, create a clone using [center.clone()](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html#clone).
    * > **Z-values** defined in a geographic or metric coordinate system are expressed in meters. However, in local scenes that use a projected coordinate system, vertical units are assumed to be the same as the horizontal units specified by the service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#center)
    */
  var center: js.UndefOr[PointProperties | js.Array[Double]] = js.native
  /**
    * Represents an optional clipping area used to define the visible [extent](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html) of a local scene. If defined, only features that intersect the area will be displayed. The clipping area applies to all layers types, including the ground and the basemap.  The `clippingArea` property only applies to [local](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#viewingMode) scenes.  ![scene-clipping-area](https://developers.arcgis.com/javascript/assets/img/apiref/views/scene-clipping-area.png%20%22Local%20scene%20with%20clippingArea%22)  The clippingArea property contains an internal reference which may be modified in the future. To persist or modify the clippingArea, create a clone using [clippingArea.clone()](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html#clone).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#clippingArea)
    */
  var clippingArea: js.UndefOr[ExtentProperties] = js.native
  /**
    * Specifies constraints for [Camera tilt](esri-Camera.html#tilt) and altitude that may be applied to the SceneView. See the object specification table below for details.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#constraints)
    */
  var constraints: js.UndefOr[SceneViewConstraintsProperties] = js.native
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
  var environment: js.UndefOr[SceneViewEnvironmentProperties] = js.native
  /**
    * The extent represents the visible portion of a [map](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html) within the view as an instance of [Extent](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html). Setting the extent immediately changes the view without animation. To animate the view, see [goTo()](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#goTo).  Rather than using extent to change the visible portion of the [map](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html) in a SceneView, you should use [camera](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#camera) since it easily allows you to define the heading, elevation and tilt of the observation point from which the view's perspective is created.  When set in the constructor, this property overrides the [center](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#center), [scale](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#scale), and [zoom](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#zoom) properties. This property will be ignored if the [viewpoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#viewpoint) or [camera](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#camera) are also set in the constructor.  The extent property contains an internal reference which may be modified in the future. To persist or modify the extent, create a clone using [extent.clone()](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html#clone).
    * > **Z-values** defined in a geographic or metric coordinate system are expressed in meters. However, in local scenes that use a projected coordinate system, vertical units are assumed to be the same as the horizontal units specified by the service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#extent)
    *
    * @default null
    */
  var extent: js.UndefOr[ExtentProperties] = js.native
  /**
    * Options for configuring the highlight. Use the highlight method on the appropriate [LayerView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-LayerView.html) to highlight a feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#highlightOptions)
    */
  var highlightOptions: js.UndefOr[SceneViewHighlightOptionsProperties] = js.native
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
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#qualityProfile)
    */
  var qualityProfile: js.UndefOr[low | medium | high] = js.native
  /**
    * Represents an approximation of the map scale at the center of the view. Setting the scale immediately changes the current view. For animating the view, see [goTo()](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#goTo).  When set in the constructor, this property overrides the [zoom](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#zoom) property. This property will be ignored if the [viewpoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#viewpoint), [camera](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#camera), or [extent](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#extent) properties are also set in the constructor.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#scale)
    */
  var scale: js.UndefOr[Double] = js.native
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
  var viewingMode: js.UndefOr[global | local] = js.native
  /**
    * Represents the current view as a [Viewpoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-Viewpoint.html) or point of observation on the view. In SceneViews, [camera](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#camera) should be used in favor of viewpoint for watching or changing the point of view. Setting the viewpoint immediately changes the current view. For animating the view, see [goTo()](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#goTo).  When set in the constructor, this property overrides the [extent](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#extent), [center](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#center), [scale](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#scale), and [zoom](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#zoom) properties. This property will be ignored if [camera](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#camera) is also set in the constructor.  The viewpoint property contains an internal reference which may be modified in the future. To persist or modify the viewpoint, create a clone using [viewpoint.clone()](https://developers.arcgis.com/javascript/latest/api-reference/esri-Viewpoint.html#clone).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#viewpoint)
    */
  var viewpoint: js.UndefOr[ViewpointProperties] = js.native
  /**
    * Represents the level of detail (LOD) at the center of the view. Setting the zoom immediately changes the current view. For animating the view, see [goTo()](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#goTo).  Setting this property in conjunction with [center](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#center) is a convenient way to set the initial extent of the view.  If set in the constructor, this property will be ignored if the [viewpoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#viewpoint), [camera](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#camera), [extent](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#extent), or [scale](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#scale) properties are also set in the constructor.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#zoom)
    */
  var zoom: js.UndefOr[Double] = js.native
}

object SceneViewProperties {
  @scala.inline
  def apply(): SceneViewProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SceneViewProperties]
  }
  @scala.inline
  implicit class SceneViewPropertiesOps[Self <: SceneViewProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAlphaCompositingEnabled(value: Boolean): Self = this.set("alphaCompositingEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlphaCompositingEnabled: Self = this.set("alphaCompositingEnabled", js.undefined)
    @scala.inline
    def setCamera(value: CameraProperties): Self = this.set("camera", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCamera: Self = this.set("camera", js.undefined)
    @scala.inline
    def setCenterVarargs(value: Double*): Self = this.set("center", js.Array(value :_*))
    @scala.inline
    def setCenter(value: PointProperties | js.Array[Double]): Self = this.set("center", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCenter: Self = this.set("center", js.undefined)
    @scala.inline
    def setClippingArea(value: ExtentProperties): Self = this.set("clippingArea", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClippingArea: Self = this.set("clippingArea", js.undefined)
    @scala.inline
    def setConstraints(value: SceneViewConstraintsProperties): Self = this.set("constraints", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConstraints: Self = this.set("constraints", js.undefined)
    @scala.inline
    def setEnvironment(value: SceneViewEnvironmentProperties): Self = this.set("environment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnvironment: Self = this.set("environment", js.undefined)
    @scala.inline
    def setExtent(value: ExtentProperties): Self = this.set("extent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtent: Self = this.set("extent", js.undefined)
    @scala.inline
    def setHighlightOptions(value: SceneViewHighlightOptionsProperties): Self = this.set("highlightOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHighlightOptions: Self = this.set("highlightOptions", js.undefined)
    @scala.inline
    def setQualityProfile(value: low | medium | high): Self = this.set("qualityProfile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQualityProfile: Self = this.set("qualityProfile", js.undefined)
    @scala.inline
    def setScale(value: Double): Self = this.set("scale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScale: Self = this.set("scale", js.undefined)
    @scala.inline
    def setViewingMode(value: global | local): Self = this.set("viewingMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteViewingMode: Self = this.set("viewingMode", js.undefined)
    @scala.inline
    def setViewpoint(value: ViewpointProperties): Self = this.set("viewpoint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteViewpoint: Self = this.set("viewpoint", js.undefined)
    @scala.inline
    def setZoom(value: Double): Self = this.set("zoom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoom: Self = this.set("zoom", js.undefined)
  }
  
}


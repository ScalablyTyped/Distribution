package typings.arcgisDashJsDashApi.__esri

import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`bottom-left`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`bottom-right`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`top-left`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`top-right`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.bottom
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.center
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.large
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.left
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.medium
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.right
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.small
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.top
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.xlarge
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.xsmall
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapViewProperties
  extends ViewProperties
     with BreakpointsOwnerProperties {
  /**
    * Represents the view's center point; when setting the center, you may pass a [Point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html) instance or an array of numbers representing a longitude/latitude pair (`[-100.4593, 36.9014]`). Setting the center immediately changes the current view. For animating the view, see [goTo()](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#goTo).  If set in the constructor, this property will be ignored if the [viewpoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#viewpoint) or [extent](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#extent) properties are also set in the constructor.  The returned [Point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html) object is always in the spatial reference of the [map](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#map) and may be modified internally. To persist the returned object, create a clone using [Point.clone()](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html#clone).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#center)
    */
  var center: js.UndefOr[PointProperties | js.Array[Double]] = js.undefined
  /**
    * Specifies constraints to [scale](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#scale), [zoom](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#zoom), and [rotation](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#rotation) that may be applied to the MapView. See object specification below.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#constraints)
    */
  var constraints: js.UndefOr[MapViewConstraints] = js.undefined
  /**
    * The extent represents the visible portion of a [map](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html) within the view as an instance of [Extent](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html). Setting the extent immediately changes the view without animation. To animate the view, see [goTo()](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#goTo).  The returned [Extent](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html) object is an internal reference which may be modified internally. To persist the returned object, create a copy using [Extent.clone()](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html#clone).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#extent)
    *
    * @default null
    */
  var extent: js.UndefOr[ExtentProperties] = js.undefined
  /**
    * Options for configuring the highlight. Use the highlight method on the appropriate [LayerView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-LayerView.html) to highlight a feature.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#highlightOptions)
    */
  var highlightOptions: js.UndefOr[MapViewHighlightOptionsProperties] = js.undefined
  /**
    * Defines which anchor stays still while resizing the browser window. The default, `center`, ensures the view's center point remains constantly visible as the window size changes. The other options allow  the respective portion of the view to remain visible when the window's size is changed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#resizeAlign)
    *
    * @default center
    */
  var resizeAlign: js.UndefOr[
    center | left | right | top | bottom | `top-left` | `top-right` | `bottom-left` | `bottom-right`
  ] = js.undefined
  /**
    * The clockwise rotation of due north in relation to the top of the view in degrees. The view may be rotated by directly setting the rotation or by using the following mouse event: `Right-click + Drag`. Map rotation may be disabled by setting the `rotationEnabled` property in [constraints](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#constraints) to `false`. See the code snippet below for an example of this.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#rotation)
    *
    * @default 0
    */
  var rotation: js.UndefOr[Double] = js.undefined
  /**
    * Represents the map scale at the center of the view. Setting the scale immediately changes the view. For animating the view, see [goTo()](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#goTo).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#scale)
    */
  var scale: js.UndefOr[Double] = js.undefined
  /**
    * Represents the current view as a [Viewpoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-Viewpoint.html) or point of observation on the view. Setting the viewpoint immediately changes the current view. For animating the view, see [goTo()](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#goTo).  The returned [Viewpoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-Viewpoint.html) object is an internal reference which may be modified internally. To persist the returned object, create a copy using [Viewpoint.clone()](https://developers.arcgis.com/javascript/latest/api-reference/esri-Viewpoint.html#clone).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#viewpoint)
    */
  var viewpoint: js.UndefOr[ViewpointProperties] = js.undefined
  /**
    * Represents the level of detail (LOD) at the center of the view. Setting the zoom immediately changes the current view. For animating the view, see [goTo()](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#goTo).  Setting this property in conjunction with [center](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#center) is a convenient way to set the initial extent of the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#zoom)
    */
  var zoom: js.UndefOr[Double] = js.undefined
}

object MapViewProperties {
  @scala.inline
  def apply(
    allLayerViews: CollectionProperties[LayerViewProperties] = null,
    animation: ViewAnimationProperties = null,
    basemapView: BasemapViewProperties = null,
    breakpoints: BreakpointsOwnerBreakpoints = null,
    center: PointProperties | js.Array[Double] = null,
    constraints: MapViewConstraints = null,
    container: HTMLDivElement | String = null,
    extent: ExtentProperties = null,
    fatalError: Error = null,
    graphics: CollectionProperties[GraphicProperties] = null,
    heightBreakpoint: xsmall | small | medium | large | xlarge = null,
    highlightOptions: MapViewHighlightOptionsProperties = null,
    layerViews: CollectionProperties[LayerViewProperties] = null,
    map: MapProperties = null,
    padding: ViewPadding = null,
    popup: PopupProperties = null,
    resizeAlign: center | left | right | top | bottom | `top-left` | `top-right` | `bottom-left` | `bottom-right` = null,
    rotation: Int | Double = null,
    scale: Int | Double = null,
    spatialReference: SpatialReferenceProperties = null,
    timeExtent: TimeExtentProperties = null,
    ui: DefaultUIProperties = null,
    viewpoint: ViewpointProperties = null,
    widthBreakpoint: xsmall | small | medium | large | xlarge = null,
    zoom: Int | Double = null
  ): MapViewProperties = {
    val __obj = js.Dynamic.literal()
    if (allLayerViews != null) __obj.updateDynamic("allLayerViews")(allLayerViews.asInstanceOf[js.Any])
    if (animation != null) __obj.updateDynamic("animation")(animation.asInstanceOf[js.Any])
    if (basemapView != null) __obj.updateDynamic("basemapView")(basemapView.asInstanceOf[js.Any])
    if (breakpoints != null) __obj.updateDynamic("breakpoints")(breakpoints.asInstanceOf[js.Any])
    if (center != null) __obj.updateDynamic("center")(center.asInstanceOf[js.Any])
    if (constraints != null) __obj.updateDynamic("constraints")(constraints.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (extent != null) __obj.updateDynamic("extent")(extent.asInstanceOf[js.Any])
    if (fatalError != null) __obj.updateDynamic("fatalError")(fatalError.asInstanceOf[js.Any])
    if (graphics != null) __obj.updateDynamic("graphics")(graphics.asInstanceOf[js.Any])
    if (heightBreakpoint != null) __obj.updateDynamic("heightBreakpoint")(heightBreakpoint.asInstanceOf[js.Any])
    if (highlightOptions != null) __obj.updateDynamic("highlightOptions")(highlightOptions.asInstanceOf[js.Any])
    if (layerViews != null) __obj.updateDynamic("layerViews")(layerViews.asInstanceOf[js.Any])
    if (map != null) __obj.updateDynamic("map")(map.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (popup != null) __obj.updateDynamic("popup")(popup.asInstanceOf[js.Any])
    if (resizeAlign != null) __obj.updateDynamic("resizeAlign")(resizeAlign.asInstanceOf[js.Any])
    if (rotation != null) __obj.updateDynamic("rotation")(rotation.asInstanceOf[js.Any])
    if (scale != null) __obj.updateDynamic("scale")(scale.asInstanceOf[js.Any])
    if (spatialReference != null) __obj.updateDynamic("spatialReference")(spatialReference.asInstanceOf[js.Any])
    if (timeExtent != null) __obj.updateDynamic("timeExtent")(timeExtent.asInstanceOf[js.Any])
    if (ui != null) __obj.updateDynamic("ui")(ui.asInstanceOf[js.Any])
    if (viewpoint != null) __obj.updateDynamic("viewpoint")(viewpoint.asInstanceOf[js.Any])
    if (widthBreakpoint != null) __obj.updateDynamic("widthBreakpoint")(widthBreakpoint.asInstanceOf[js.Any])
    if (zoom != null) __obj.updateDynamic("zoom")(zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapViewProperties]
  }
}


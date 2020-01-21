package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.TopLevel
import typings.arcgisJsApi.IHandle
import typings.arcgisJsApi.arcgisJsApiStrings.`2d`
import typings.arcgisJsApi.arcgisJsApiStrings.`bottom-left`
import typings.arcgisJsApi.arcgisJsApiStrings.`bottom-right`
import typings.arcgisJsApi.arcgisJsApiStrings.`top-left`
import typings.arcgisJsApi.arcgisJsApiStrings.`top-right`
import typings.arcgisJsApi.arcgisJsApiStrings.bottom
import typings.arcgisJsApi.arcgisJsApiStrings.center
import typings.arcgisJsApi.arcgisJsApiStrings.left
import typings.arcgisJsApi.arcgisJsApiStrings.right
import typings.arcgisJsApi.arcgisJsApiStrings.top
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapView
  extends View
     with MapViewBase
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
    * Defines which anchor stays still while resizing the browser window. The default, `center`, ensures the view's center point remains constantly visible as the window size changes. The other options allow  the respective portion of the view to remain visible when the window's size is changed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#resizeAlign)
    *
    * @default center
    */
  var resizeAlign: center | left | right | top | bottom | `top-left` | `top-right` | `bottom-left` | `bottom-right` = js.native
  /**
    * The clockwise rotation of due north in relation to the top of the view in degrees. The view may be rotated by directly setting the rotation or by using the following mouse event: `Right-click + Drag`. Map rotation may be disabled by setting the `rotationEnabled` property in [constraints](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#constraints) to `false`. See the code snippet below for an example of this.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#rotation)
    *
    * @default 0
    */
  var rotation: Double = js.native
  /**
    * Represents the map scale at the center of the view. Setting the scale immediately changes the view. For animating the view, see [goTo()](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#goTo).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#scale)
    */
  var scale: Double = js.native
  /**
    * The dimension of the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#type)
    */
  @JSName("type")
  val type_MapView: `2d` = js.native
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
  var zoom: Double = js.native
  /**
    * Returns the topmost feature from each layer that intersects the specified screen coordinates. The following layer types will return a result if a hit is made on an intersecting feature: [GraphicsLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GraphicsLayer.html), [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html), [CSVLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html), [GeoRSSLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GeoRSSLayer.html), [KMLLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-KMLLayer.html), and [StreamLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html).  At 4.6 and later, a hit test will always return a result from [VectorTileLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html). However, the result will only indicate the ID and the name of the layer within the [vector tile style](https://doc.arcgis.com/en/arcgis-online/reference/tile-layers.htm#ESRI_SECTION1_8F68399EB47B48FF9EF46719FCC96978) that intersects the screen point. Detailed attribute and spatial information about the actual feature represented in the layer is not returned. HitTest results returned from VectorTileLayers are primarily used for [Vector tile style editor applications](https://maps.esri.com/jg/VectorBasemapStyleEditor/index.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#hitTest)
    *
    * @param screenPoint The screen coordinates (or native mouse event) of the click on the view.
    *
    */
  def hitTest(screenPoint: ScreenPoint): js.Promise[HitTestResult] = js.native
  def hitTest(screenPoint: MouseEvent): js.Promise[HitTestResult] = js.native
  def on(`type`: String, modifiersOrHandler: js.Array[String], handler: EventHandler): IHandle = js.native
  def on(`type`: String, modifiersOrHandler: EventHandler, handler: EventHandler): IHandle = js.native
  def on(`type`: js.Array[String], modifiersOrHandler: js.Array[String], handler: EventHandler): IHandle = js.native
  def on(`type`: js.Array[String], modifiersOrHandler: EventHandler, handler: EventHandler): IHandle = js.native
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
    * @param options.ignoreBackground Indicates whether to ignore the background color set in the [initial view properties](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html#initialViewProperties) of the web map.
    * @param options.ignorePadding Indicates whether view padding should be ignored. Set this property to `true` to allow padded areas to be included in the screenshot.
    *
    */
  def takeScreenshot(): js.Promise[Screenshot] = js.native
  def takeScreenshot(options: MapViewTakeScreenshotOptions): js.Promise[Screenshot] = js.native
  /**
    * Converts the given screen point to a [map point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html). The screen point represents a point in terms of pixels relative to the top-left corner of the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#toMap)
    *
    * @param screenPoint The location on the screen (or native mouse event) to convert.
    *
    */
  def toMap(screenPoint: ScreenPoint): Point = js.native
  def toMap(screenPoint: MouseEvent): Point = js.native
  /**
    * Converts the given [map point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html) to a screen point. The screen point represents a point in terms of pixels relative to the top-left corner of the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#toScreen)
    *
    * @param point A point geometry.
    *
    */
  def toScreen(point: Point): ScreenPoint = js.native
}

@JSGlobal("__esri.MapView")
@js.native
object MapView extends TopLevel[MapViewConstructor]


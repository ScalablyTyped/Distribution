package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

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
  val interacting: scala.Boolean = js.native
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
  val navigation: Navigation = js.native
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
  val ready: scala.Boolean = js.native
  /**
    * Represents the current value of one pixel in the unit of the view's [spatialReference](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#spatialReference). The value of resolution is calculated by dividing the view's [extent width](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html#width) by [its width](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#width).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#resolution)
    */
  val resolution: scala.Double = js.native
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
  val stationary: scala.Boolean = js.native
  /**
    * The type of the view is either `2d` (indicating a [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html)) or `3d` (indicating a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html)).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#type)
    */
  val `type`: java.lang.String = js.native
  /**
    * Indicates whether the view is being updated by additional data requests to the network, or by processing received data.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#updating)
    *
    * @default false
    */
  val updating: scala.Boolean = js.native
  /**
    * Gets the [LayerView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-LayerView.html) created on the view for the given layer. The returned promise resolves when the layer view for the given layer has been created, or rejects with an error (for example if the layer is not part of the view, or if the layer type is not supported in this view).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#whenLayerView)
    *
    * @param layer The layer for which to obtain its LayerView.
    *
    */
  def whenLayerView(layer: Layer): arcgisDashJsDashApiLib.IPromise[LayerView] = js.native
}

@JSGlobal("__esri.View")
@js.native
/**
  * A view provides the means of viewing and interacting with the components of a [Map](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html). The [Map](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html) is merely a container, storing the geographic information contained in base layers and operational layers. The View renders the [Map](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html) and its various [layers](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html#layers), making them visible to the user.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html)
  */
class ViewCls () extends View {
  def this(properties: ViewProperties) = this()
  /**
    * The `id` or node representing the DOM element containing the view. This is typically set in the view's constructor.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-DOMContainer.html#container)
    */
  /* CompleteClass */
  override var container: stdLib.HTMLDivElement = js.native
  /**
    * Indicates if the browser focus is on the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-DOMContainer.html#focused)
    */
  /* CompleteClass */
  override val focused: scala.Boolean = js.native
  /**
    * The height of the view in pixels read from the view container element.  The view container needs to have a height greater than 0 to be displayed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-DOMContainer.html#height)
    *
    * @default 0
    */
  /* CompleteClass */
  override val height: scala.Double = js.native
  /**
    * A Popup object that displays general content or attributes from [layers](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html#layers) in the [map](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-DOMContainer.html#map).  The view has a default instance of [Popup](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html) with predefined styles and a template for defining content. The content in this default instance may be modified directly in the [popup's content](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#content) or in a layer's [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html).  You may create a new [Popup](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html) instance and set it to this property to customize the style, positioning, and content of the popup in favor of using the default popup instance on the view.  In addition, if wanting to prevent any popups from opening, use the syntax below:
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-DOMContainer.html#popup)
    */
  /* CompleteClass */
  override var popup: Popup = js.native
  /**
    * Indicates if the view is being resized.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-DOMContainer.html#resizing)
    *
    * @default false
    */
  /* CompleteClass */
  override val resizing: scala.Boolean = js.native
  /**
    * An array containing the width and height of the view in pixels, e.g. `[width, height]`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-DOMContainer.html#size)
    */
  /* CompleteClass */
  override val size: js.Array[scala.Double] = js.native
  /**
    * Indicates if the view is visible on the page. Is `true` if the view has no [container](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-DOMContainer.html#container), a [height](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-DOMContainer.html#height) or [width](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-DOMContainer.html#width) equal to 0, or the CSS `visibility` is `hidden`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-DOMContainer.html#suspended)
    *
    * @default true
    */
  /* CompleteClass */
  override val suspended: scala.Boolean = js.native
  /**
    * Exposes the default widgets available in the view and allows you to toggle them on and off. See [DefaultUI](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-ui-DefaultUI.html) for more details.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-DOMContainer.html#ui)
    */
  /* CompleteClass */
  override var ui: DefaultUI = js.native
  /**
    * The width of the view in pixels read from the view container element.  The view container needs to have a width greater than 0 to be displayed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-DOMContainer.html#width)
    *
    * @default 0
    */
  /* CompleteClass */
  override val width: scala.Double = js.native
}


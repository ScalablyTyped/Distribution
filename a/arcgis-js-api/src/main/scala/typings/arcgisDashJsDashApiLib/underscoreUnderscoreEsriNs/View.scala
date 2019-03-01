package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait View
  extends Accessor
     with corePromise
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
    * The view for the ground of the map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#groundView)
    */
  val groundView: GroundView = js.native
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
    *   * The view has a [spatialReference](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#spatialReference).
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
    *
    * @default true
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


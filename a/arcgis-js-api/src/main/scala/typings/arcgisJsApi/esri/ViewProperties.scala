package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ViewProperties extends DOMContainerProperties {
  /**
    * Collection containing a flat list of all the created [LayerViews](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-LayerView.html) related to the basemap, operational layers, and group layers in this view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#allLayerViews)
    */
  var allLayerViews: js.UndefOr[CollectionProperties[LayerViewProperties]] = js.native
  /**
    * Represents an ongoing view animation initialized by [goTo()](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#goTo). You may [watch](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Accessor.html#watch) this property to be notified when the view's extent changes .
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#animation)
    */
  var animation: js.UndefOr[ViewAnimationProperties] = js.native
  /**
    * Represents the view for a single basemap after it has been added to the map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#basemapView)
    */
  var basemapView: js.UndefOr[BasemapViewProperties] = js.native
  /**
    * A fatal [error](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Error.html) returned when the view loses its WebGL context. Watch this property to properly handle the error and attempt to recover the WebGL context.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#fatalError)
    */
  var fatalError: js.UndefOr[Error] = js.native
  /**
    * Allows for adding [graphics](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html) directly to the default graphics in the View.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#graphics)
    */
  var graphics: js.UndefOr[CollectionProperties[GraphicProperties]] = js.native
  /**
    * A collection containing a hierarchical list of all the created [LayerViews](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-LayerView.html) of the [operational layers](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html#layers) in the map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#layerViews)
    */
  var layerViews: js.UndefOr[CollectionProperties[LayerViewProperties]] = js.native
  /**
    * An instance of a [Map](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html) object to display in the view. A view may only display one map at a time. On the other hand, one [Map](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html) may be viewed by multiple [MapViews](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) and/or [SceneViews](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html) simultaneously.  This property is typically set in the constructor of the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). See the [class description](#) for examples demonstrating the relationship between the map and the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#map)
    */
  var map: js.UndefOr[MapProperties] = js.native
  /**
    * Options to configure the navigation behavior of the View.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#navigation)
    */
  var navigation: js.UndefOr[NavigationProperties] = js.native
  /**
    * Use the padding property to make the [center](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#center), and [extent](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#extent), etc. work off a subsection of the full view. This is particularly useful when layering UI elements or semi-transparent content on top of portions of the view. See the [view padding sample](https://developers.arcgis.com/javascript/latest/sample-code/view-padding/index.html) for an example of how this works.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#padding)
    *
    * @default {left: 0, top: 0, right: 0, bottom: 0}
    */
  var padding: js.UndefOr[ViewPadding] = js.native
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
  var spatialReference: js.UndefOr[SpatialReferenceProperties] = js.native
  /**
    * The view's time extent. Time-aware layers display their temporal data that falls within the view's time extent. Setting the view's time extent is similar to setting the spatial [extent](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#extent) because once the time extent is set, the view updates automatically to conform to the change.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#timeExtent)
    *
    * @default null
    */
  var timeExtent: js.UndefOr[TimeExtentProperties] = js.native
}

object ViewProperties {
  @scala.inline
  def apply(): ViewProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ViewProperties]
  }
  @scala.inline
  implicit class ViewPropertiesOps[Self <: ViewProperties] (val x: Self) extends AnyVal {
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
    def setAllLayerViewsVarargs(value: LayerViewProperties*): Self = this.set("allLayerViews", js.Array(value :_*))
    @scala.inline
    def setAllLayerViews(value: CollectionProperties[LayerViewProperties]): Self = this.set("allLayerViews", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllLayerViews: Self = this.set("allLayerViews", js.undefined)
    @scala.inline
    def setAnimation(value: ViewAnimationProperties): Self = this.set("animation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimation: Self = this.set("animation", js.undefined)
    @scala.inline
    def setBasemapView(value: BasemapViewProperties): Self = this.set("basemapView", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBasemapView: Self = this.set("basemapView", js.undefined)
    @scala.inline
    def setFatalError(value: Error): Self = this.set("fatalError", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFatalError: Self = this.set("fatalError", js.undefined)
    @scala.inline
    def setGraphicsVarargs(value: GraphicProperties*): Self = this.set("graphics", js.Array(value :_*))
    @scala.inline
    def setGraphics(value: CollectionProperties[GraphicProperties]): Self = this.set("graphics", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGraphics: Self = this.set("graphics", js.undefined)
    @scala.inline
    def setLayerViewsVarargs(value: LayerViewProperties*): Self = this.set("layerViews", js.Array(value :_*))
    @scala.inline
    def setLayerViews(value: CollectionProperties[LayerViewProperties]): Self = this.set("layerViews", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayerViews: Self = this.set("layerViews", js.undefined)
    @scala.inline
    def setMap(value: MapProperties): Self = this.set("map", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMap: Self = this.set("map", js.undefined)
    @scala.inline
    def setNavigation(value: NavigationProperties): Self = this.set("navigation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNavigation: Self = this.set("navigation", js.undefined)
    @scala.inline
    def setPadding(value: ViewPadding): Self = this.set("padding", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    @scala.inline
    def setSpatialReference(value: SpatialReferenceProperties): Self = this.set("spatialReference", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpatialReference: Self = this.set("spatialReference", js.undefined)
    @scala.inline
    def setTimeExtent(value: TimeExtentProperties): Self = this.set("timeExtent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeExtent: Self = this.set("timeExtent", js.undefined)
  }
  
}


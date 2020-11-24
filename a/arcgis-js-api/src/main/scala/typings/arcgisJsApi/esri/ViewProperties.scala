package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ViewProperties extends DOMContainerProperties {
  
  /**
    * Collection containing a flat list of all the created [LayerViews](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-LayerView.html) related to the basemap, operational layers, and group layers in this view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#allLayerViews)
    */
  var allLayerViews: js.UndefOr[CollectionProperties[LayerViewProperties]] = js.native
  
  /**
    * Represents an ongoing view animation initialized by [goTo()](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#goTo).
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
    * A fatal [error](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Error.html) returned when the view loses its WebGL context.
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
    * An instance of a [Map](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html) object to display in the view.
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
    * Use the padding property to make the [center](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#center), and [extent](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#extent), etc.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#padding)
    */
  var padding: js.UndefOr[ViewPadding] = js.native
  
  /**
    * The spatial reference of the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#spatialReference)
    */
  var spatialReference: js.UndefOr[SpatialReferenceProperties] = js.native
  
  /**
    * The view's time extent.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#timeExtent)
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

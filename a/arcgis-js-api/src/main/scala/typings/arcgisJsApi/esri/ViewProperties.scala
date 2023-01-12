package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ViewProperties
  extends StObject
     with DOMContainerProperties {
  
  /**
    * Collection containing a flat list of all the created [LayerViews](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-LayerView.html) related to the basemap, operational layers, and group layers in this view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#allLayerViews)
    */
  var allLayerViews: js.UndefOr[CollectionProperties[LayerViewProperties]] = js.undefined
  
  /**
    * Represents an ongoing view animation initialized by [goTo()](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#goTo).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#animation)
    */
  var animation: js.UndefOr[ViewAnimationProperties] = js.undefined
  
  /**
    * Represents the view for a single basemap after it has been added to the map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#basemapView)
    */
  var basemapView: js.UndefOr[BasemapViewProperties] = js.undefined
  
  /**
    * A fatal [error](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Error.html) returned when the view loses its WebGL context.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#fatalError)
    */
  var fatalError: js.UndefOr[Error] = js.undefined
  
  /**
    * Allows for adding [graphics](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html) directly to the default graphics in the View.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#graphics)
    */
  var graphics: js.UndefOr[CollectionProperties[GraphicProperties]] = js.undefined
  
  /**
    * A collection containing a hierarchical list of all the created [LayerViews](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-LayerView.html) of the [operational layers](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html#layers) in the map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#layerViews)
    */
  var layerViews: js.UndefOr[CollectionProperties[LayerViewProperties]] = js.undefined
  
  /**
    * An instance of a [Map](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html) object to display in the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#map)
    */
  var map: js.UndefOr[MapProperties] = js.undefined
  
  /**
    * Options to configure the navigation behavior of the View.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#navigation)
    */
  var navigation: js.UndefOr[NavigationProperties] = js.undefined
  
  /**
    * Use the padding property to make the [center](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#center), and [extent](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#extent), etc.
    *
    * @default {left: 0, top: 0, right: 0, bottom: 0}
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#padding)
    */
  var padding: js.UndefOr[ViewPadding] = js.undefined
  
  /**
    * The spatial reference of the view.
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#spatialReference)
    */
  var spatialReference: js.UndefOr[SpatialReferenceProperties] = js.undefined
  
  /**
    * The view's time extent.
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#timeExtent)
    */
  var timeExtent: js.UndefOr[TimeExtentProperties] = js.undefined
}
object ViewProperties {
  
  inline def apply(): ViewProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ViewProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ViewProperties] (val x: Self) extends AnyVal {
    
    inline def setAllLayerViews(value: CollectionProperties[LayerViewProperties]): Self = StObject.set(x, "allLayerViews", value.asInstanceOf[js.Any])
    
    inline def setAllLayerViewsUndefined: Self = StObject.set(x, "allLayerViews", js.undefined)
    
    inline def setAllLayerViewsVarargs(value: LayerViewProperties*): Self = StObject.set(x, "allLayerViews", js.Array(value*))
    
    inline def setAnimation(value: ViewAnimationProperties): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    inline def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    inline def setBasemapView(value: BasemapViewProperties): Self = StObject.set(x, "basemapView", value.asInstanceOf[js.Any])
    
    inline def setBasemapViewUndefined: Self = StObject.set(x, "basemapView", js.undefined)
    
    inline def setFatalError(value: Error): Self = StObject.set(x, "fatalError", value.asInstanceOf[js.Any])
    
    inline def setFatalErrorUndefined: Self = StObject.set(x, "fatalError", js.undefined)
    
    inline def setGraphics(value: CollectionProperties[GraphicProperties]): Self = StObject.set(x, "graphics", value.asInstanceOf[js.Any])
    
    inline def setGraphicsUndefined: Self = StObject.set(x, "graphics", js.undefined)
    
    inline def setGraphicsVarargs(value: GraphicProperties*): Self = StObject.set(x, "graphics", js.Array(value*))
    
    inline def setLayerViews(value: CollectionProperties[LayerViewProperties]): Self = StObject.set(x, "layerViews", value.asInstanceOf[js.Any])
    
    inline def setLayerViewsUndefined: Self = StObject.set(x, "layerViews", js.undefined)
    
    inline def setLayerViewsVarargs(value: LayerViewProperties*): Self = StObject.set(x, "layerViews", js.Array(value*))
    
    inline def setMap(value: MapProperties): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
    
    inline def setNavigation(value: NavigationProperties): Self = StObject.set(x, "navigation", value.asInstanceOf[js.Any])
    
    inline def setNavigationUndefined: Self = StObject.set(x, "navigation", js.undefined)
    
    inline def setPadding(value: ViewPadding): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    inline def setSpatialReference(value: SpatialReferenceProperties): Self = StObject.set(x, "spatialReference", value.asInstanceOf[js.Any])
    
    inline def setSpatialReferenceUndefined: Self = StObject.set(x, "spatialReference", js.undefined)
    
    inline def setTimeExtent(value: TimeExtentProperties): Self = StObject.set(x, "timeExtent", value.asInstanceOf[js.Any])
    
    inline def setTimeExtentUndefined: Self = StObject.set(x, "timeExtent", js.undefined)
  }
}

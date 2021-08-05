package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.horizontal
import typings.arcgisJsApi.arcgisJsApiStrings.vertical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SwipeViewModelProperties extends StObject {
  
  /**
    * The direction the Swipe widget moves across the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Swipe-SwipeViewModel.html#direction)
    */
  var direction: js.UndefOr[horizontal | vertical] = js.undefined
  
  /**
    * A collection of [Layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html)s that will show on the left or top side of Swipe widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Swipe-SwipeViewModel.html#leadingLayers)
    */
  var leadingLayers: js.UndefOr[CollectionProperties[LayerProperties]] = js.undefined
  
  /**
    * The position of the Swipe widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Swipe-SwipeViewModel.html#position)
    */
  var position: js.UndefOr[Double] = js.undefined
  
  /**
    * A collection of [Layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html)s that will show on the right or bottom side of Swipe widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Swipe-SwipeViewModel.html#trailingLayers)
    */
  var trailingLayers: js.UndefOr[CollectionProperties[LayerProperties]] = js.undefined
  
  /**
    * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Swipe-SwipeViewModel.html#view)
    */
  var view: js.UndefOr[MapViewProperties] = js.undefined
}
object SwipeViewModelProperties {
  
  inline def apply(): SwipeViewModelProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SwipeViewModelProperties]
  }
  
  extension [Self <: SwipeViewModelProperties](x: Self) {
    
    inline def setDirection(value: horizontal | vertical): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    inline def setLeadingLayers(value: CollectionProperties[LayerProperties]): Self = StObject.set(x, "leadingLayers", value.asInstanceOf[js.Any])
    
    inline def setLeadingLayersUndefined: Self = StObject.set(x, "leadingLayers", js.undefined)
    
    inline def setLeadingLayersVarargs(value: LayerProperties*): Self = StObject.set(x, "leadingLayers", js.Array(value :_*))
    
    inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setTrailingLayers(value: CollectionProperties[LayerProperties]): Self = StObject.set(x, "trailingLayers", value.asInstanceOf[js.Any])
    
    inline def setTrailingLayersUndefined: Self = StObject.set(x, "trailingLayers", js.undefined)
    
    inline def setTrailingLayersVarargs(value: LayerProperties*): Self = StObject.set(x, "trailingLayers", js.Array(value :_*))
    
    inline def setView(value: MapViewProperties): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}

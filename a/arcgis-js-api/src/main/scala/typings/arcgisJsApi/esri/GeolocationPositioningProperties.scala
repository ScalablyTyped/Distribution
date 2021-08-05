package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeolocationPositioningProperties extends StObject {
  
  /**
    * The HTML5 Geolocation Position options for locating.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-GeolocationPositioning.html#geolocationOptions)
    */
  var geolocationOptions: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Indicates whether to navigate the view to the position and scale of the geolocated result.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-GeolocationPositioning.html#goToLocationEnabled)
    */
  var goToLocationEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The graphic used to show the user's location on the map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-GeolocationPositioning.html#graphic)
    */
  var graphic: js.UndefOr[GraphicProperties] = js.undefined
  
  /**
    * The scale to set on the view when navigating to the position of the geolocated result.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-GeolocationPositioning.html#scale)
    */
  var scale: js.UndefOr[Double] = js.undefined
  
  /**
    * The view associated with the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-GeolocationPositioning.html#view)
    */
  var view: js.UndefOr[MapViewProperties | SceneViewProperties] = js.undefined
}
object GeolocationPositioningProperties {
  
  inline def apply(): GeolocationPositioningProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeolocationPositioningProperties]
  }
  
  extension [Self <: GeolocationPositioningProperties](x: Self) {
    
    inline def setGeolocationOptions(value: js.Any): Self = StObject.set(x, "geolocationOptions", value.asInstanceOf[js.Any])
    
    inline def setGeolocationOptionsUndefined: Self = StObject.set(x, "geolocationOptions", js.undefined)
    
    inline def setGoToLocationEnabled(value: Boolean): Self = StObject.set(x, "goToLocationEnabled", value.asInstanceOf[js.Any])
    
    inline def setGoToLocationEnabledUndefined: Self = StObject.set(x, "goToLocationEnabled", js.undefined)
    
    inline def setGraphic(value: GraphicProperties): Self = StObject.set(x, "graphic", value.asInstanceOf[js.Any])
    
    inline def setGraphicUndefined: Self = StObject.set(x, "graphic", js.undefined)
    
    inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    inline def setView(value: MapViewProperties | SceneViewProperties): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}

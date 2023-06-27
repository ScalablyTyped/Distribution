package typings.arcgisJsApi.esri

import typings.arcgisJsApi.anon.MapViewPropertiestype2d
import typings.arcgisJsApi.anon.SceneViewPropertiestype3d
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocateProperties
  extends StObject
     with WidgetProperties
     with GoToProperties {
  
  /**
  		 * The browser's Geolocation API Position options for locating.
  		 *
  		 * @default null
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Locate.html#geolocationOptions)
  		 */
  var geolocationOptions: js.UndefOr[Any] = js.undefined
  
  /**
  		 * Indicates whether the widget should navigate the view to the position and scale of the geolocated result.
  		 *
  		 * @default true
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Locate.html#goToLocationEnabled)
  		 */
  var goToLocationEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * The graphic used to show the user's location on the map.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Locate.html#graphic)
  		 */
  var graphic: js.UndefOr[GraphicProperties] = js.undefined
  
  /**
  		 * The widget's default CSS icon class.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Locate.html#iconClass)
  		 */
  var iconClass: js.UndefOr[String] = js.undefined
  
  /**
  		 * Indicates whether to display the [Popup](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html) of the result graphic from the [locate()](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Locate-LocateViewModel.html#locate) method.
  		 *
  		 * @default true
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Locate.html#popupEnabled)
  		 */
  var popupEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * Indicates whether the widget will automatically rotate to the device heading based on the Geolocation APIs [`GeolocationCoordinates.heading`](https://developer.mozilla.org/en-US/docs/Web/API/GeolocationCoordinates/heading) property.
  		 *
  		 * @default true
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Locate.html#rotationEnabled)
  		 */
  var rotationEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * Indicates the scale to set on the view when navigating to the position of the geolocated result once a location is returned from the [track](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Locate.html#event-track) event.
  		 *
  		 * @default null
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Locate.html#scale)
  		 */
  var scale: js.UndefOr[Double] = js.undefined
  
  /**
  		 * Indicates whether the widget will automatically [rotate to user's direction](https://www.w3.org/TR/geolocation-API/#coordinates_interface).
  		 *
  		 * @default true
  		 * @deprecated since 4.27. Use `rotationEnabled` instead.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Locate.html#useHeadingEnabled)
  		 */
  var useHeadingEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Locate.html#view)
  		 */
  var view: js.UndefOr[MapViewPropertiestype2d | SceneViewPropertiestype3d] = js.undefined
  
  /**
  		 * The view model for this widget.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Locate.html#viewModel)
  		 */
  var viewModel: js.UndefOr[LocateViewModelProperties] = js.undefined
}
object LocateProperties {
  
  inline def apply(): LocateProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocateProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LocateProperties] (val x: Self) extends AnyVal {
    
    inline def setGeolocationOptions(value: Any): Self = StObject.set(x, "geolocationOptions", value.asInstanceOf[js.Any])
    
    inline def setGeolocationOptionsUndefined: Self = StObject.set(x, "geolocationOptions", js.undefined)
    
    inline def setGoToLocationEnabled(value: Boolean): Self = StObject.set(x, "goToLocationEnabled", value.asInstanceOf[js.Any])
    
    inline def setGoToLocationEnabledUndefined: Self = StObject.set(x, "goToLocationEnabled", js.undefined)
    
    inline def setGraphic(value: GraphicProperties): Self = StObject.set(x, "graphic", value.asInstanceOf[js.Any])
    
    inline def setGraphicUndefined: Self = StObject.set(x, "graphic", js.undefined)
    
    inline def setIconClass(value: String): Self = StObject.set(x, "iconClass", value.asInstanceOf[js.Any])
    
    inline def setIconClassUndefined: Self = StObject.set(x, "iconClass", js.undefined)
    
    inline def setPopupEnabled(value: Boolean): Self = StObject.set(x, "popupEnabled", value.asInstanceOf[js.Any])
    
    inline def setPopupEnabledUndefined: Self = StObject.set(x, "popupEnabled", js.undefined)
    
    inline def setRotationEnabled(value: Boolean): Self = StObject.set(x, "rotationEnabled", value.asInstanceOf[js.Any])
    
    inline def setRotationEnabledUndefined: Self = StObject.set(x, "rotationEnabled", js.undefined)
    
    inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    inline def setUseHeadingEnabled(value: Boolean): Self = StObject.set(x, "useHeadingEnabled", value.asInstanceOf[js.Any])
    
    inline def setUseHeadingEnabledUndefined: Self = StObject.set(x, "useHeadingEnabled", js.undefined)
    
    inline def setView(value: MapViewPropertiestype2d | SceneViewPropertiestype3d): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewModel(value: LocateViewModelProperties): Self = StObject.set(x, "viewModel", value.asInstanceOf[js.Any])
    
    inline def setViewModelUndefined: Self = StObject.set(x, "viewModel", js.undefined)
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}

package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocateProperties
  extends StObject
     with WidgetProperties
     with GoToProperties {
  
  /**
    * The HTML5 Geolocation Position options for locating.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Locate.html#geolocationOptions)
    */
  var geolocationOptions: js.UndefOr[js.Any] = js.undefined
  
  /**
    * Indicates whether the widget should navigate the view to the position and scale of the geolocated result.
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
    * Indicates the scale to set on the view when navigating to the position of the geolocated result once a location is returned from the [track](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Locate.html#event-track) event.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Locate.html#scale)
    */
  var scale: js.UndefOr[Double] = js.undefined
  
  /**
    * Indicates whether the widget will automatically [rotate to user's direction](https://www.w3.org/TR/geolocation-API/#coordinates_interface).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Locate.html#useHeadingEnabled)
    */
  var useHeadingEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Locate.html#view)
    */
  var view: js.UndefOr[MapViewProperties | SceneViewProperties] = js.undefined
  
  /**
    * The view model for this widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Locate.html#viewModel)
    */
  var viewModel: js.UndefOr[LocateViewModelProperties] = js.undefined
}
object LocateProperties {
  
  @scala.inline
  def apply(): LocateProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocateProperties]
  }
  
  @scala.inline
  implicit class LocatePropertiesMutableBuilder[Self <: LocateProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGeolocationOptions(value: js.Any): Self = StObject.set(x, "geolocationOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeolocationOptionsUndefined: Self = StObject.set(x, "geolocationOptions", js.undefined)
    
    @scala.inline
    def setGoToLocationEnabled(value: Boolean): Self = StObject.set(x, "goToLocationEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGoToLocationEnabledUndefined: Self = StObject.set(x, "goToLocationEnabled", js.undefined)
    
    @scala.inline
    def setGraphic(value: GraphicProperties): Self = StObject.set(x, "graphic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGraphicUndefined: Self = StObject.set(x, "graphic", js.undefined)
    
    @scala.inline
    def setIconClass(value: String): Self = StObject.set(x, "iconClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconClassUndefined: Self = StObject.set(x, "iconClass", js.undefined)
    
    @scala.inline
    def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    @scala.inline
    def setUseHeadingEnabled(value: Boolean): Self = StObject.set(x, "useHeadingEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseHeadingEnabledUndefined: Self = StObject.set(x, "useHeadingEnabled", js.undefined)
    
    @scala.inline
    def setView(value: MapViewProperties | SceneViewProperties): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewModel(value: LocateViewModelProperties): Self = StObject.set(x, "viewModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewModelUndefined: Self = StObject.set(x, "viewModel", js.undefined)
    
    @scala.inline
    def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}

package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TrackProperties
  extends WidgetProperties
     with GoToProperties {
  
  /**
    * The HTML5 Geolocation Position options for locating.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Track.html#geolocationOptions)
    */
  var geolocationOptions: js.UndefOr[js.Any] = js.native
  
  /**
    * Indicates whether the widget will automatically navigate the view to the user's position when a geolocation result is found.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Track.html#goToLocationEnabled)
    */
  var goToLocationEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * The graphic used to show the user's location in the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Track.html#graphic)
    */
  var graphic: js.UndefOr[GraphicProperties] = js.native
  
  /**
    * The widget's default CSS icon class.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Track.html#iconClass)
    */
  var iconClass: js.UndefOr[String] = js.native
  
  /**
    * Indicates the scale to set on the view when navigating to the position of the geolocated result once a location is returned from the [track](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Track.html#event-track) event.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Track.html#scale)
    */
  var scale: js.UndefOr[Double] = js.native
  
  /**
    * Indicates whether the widget will automatically [rotate to user's direction](https://www.w3.org/TR/geolocation-API/#coordinates_interface).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Track.html#useHeadingEnabled)
    */
  var useHeadingEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Track.html#view)
    */
  var view: js.UndefOr[MapViewProperties | SceneViewProperties] = js.native
  
  /**
    * The view model for this widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Track.html#viewModel)
    */
  var viewModel: js.UndefOr[TrackViewModelProperties] = js.native
}
object TrackProperties {
  
  @scala.inline
  def apply(): TrackProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrackProperties]
  }
  
  @scala.inline
  implicit class TrackPropertiesMutableBuilder[Self <: TrackProperties] (val x: Self) extends AnyVal {
    
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
    def setViewModel(value: TrackViewModelProperties): Self = StObject.set(x, "viewModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewModelUndefined: Self = StObject.set(x, "viewModel", js.undefined)
    
    @scala.inline
    def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}

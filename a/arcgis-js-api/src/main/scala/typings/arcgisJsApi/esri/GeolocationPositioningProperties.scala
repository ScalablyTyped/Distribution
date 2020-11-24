package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GeolocationPositioningProperties extends js.Object {
  
  /**
    * The HTML5 Geolocation Position options for locating.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-GeolocationPositioning.html#geolocationOptions)
    */
  var geolocationOptions: js.UndefOr[js.Any] = js.native
  
  /**
    * Indicates whether to navigate the view to the position and scale of the geolocated result.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-GeolocationPositioning.html#goToLocationEnabled)
    */
  var goToLocationEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * The graphic used to show the user's location on the map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-GeolocationPositioning.html#graphic)
    */
  var graphic: js.UndefOr[GraphicProperties] = js.native
  
  /**
    * The scale to set on the view when navigating to the position of the geolocated result.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-GeolocationPositioning.html#scale)
    */
  var scale: js.UndefOr[Double] = js.native
  
  /**
    * The view associated with the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-GeolocationPositioning.html#view)
    */
  var view: js.UndefOr[MapViewProperties | SceneViewProperties] = js.native
}
object GeolocationPositioningProperties {
  
  @scala.inline
  def apply(): GeolocationPositioningProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeolocationPositioningProperties]
  }
  
  @scala.inline
  implicit class GeolocationPositioningPropertiesOps[Self <: GeolocationPositioningProperties] (val x: Self) extends AnyVal {
    
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
    def setGeolocationOptions(value: js.Any): Self = this.set("geolocationOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGeolocationOptions: Self = this.set("geolocationOptions", js.undefined)
    
    @scala.inline
    def setGoToLocationEnabled(value: Boolean): Self = this.set("goToLocationEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGoToLocationEnabled: Self = this.set("goToLocationEnabled", js.undefined)
    
    @scala.inline
    def setGraphic(value: GraphicProperties): Self = this.set("graphic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGraphic: Self = this.set("graphic", js.undefined)
    
    @scala.inline
    def setScale(value: Double): Self = this.set("scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScale: Self = this.set("scale", js.undefined)
    
    @scala.inline
    def setView(value: MapViewProperties | SceneViewProperties): Self = this.set("view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteView: Self = this.set("view", js.undefined)
  }
}

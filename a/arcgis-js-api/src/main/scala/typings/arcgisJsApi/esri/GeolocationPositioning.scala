package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GeolocationPositioning extends js.Object {
  
  /**
    * The HTML5 Geolocation Position options for locating.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-GeolocationPositioning.html#geolocationOptions)
    */
  var geolocationOptions: js.Any = js.native
  
  /**
    * Indicates whether to navigate the view to the position and scale of the geolocated result.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-GeolocationPositioning.html#goToLocationEnabled)
    */
  var goToLocationEnabled: Boolean = js.native
  
  /**
    * The graphic used to show the user's location on the map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-GeolocationPositioning.html#graphic)
    */
  var graphic: Graphic = js.native
  
  /**
    * The scale to set on the view when navigating to the position of the geolocated result.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-GeolocationPositioning.html#scale)
    */
  var scale: Double = js.native
  
  /**
    * The view associated with the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-GeolocationPositioning.html#view)
    */
  var view: MapView | SceneView = js.native
}
object GeolocationPositioning {
  
  @scala.inline
  def apply(
    geolocationOptions: js.Any,
    goToLocationEnabled: Boolean,
    graphic: Graphic,
    scale: Double,
    view: MapView | SceneView
  ): GeolocationPositioning = {
    val __obj = js.Dynamic.literal(geolocationOptions = geolocationOptions.asInstanceOf[js.Any], goToLocationEnabled = goToLocationEnabled.asInstanceOf[js.Any], graphic = graphic.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeolocationPositioning]
  }
  
  @scala.inline
  implicit class GeolocationPositioningOps[Self <: GeolocationPositioning] (val x: Self) extends AnyVal {
    
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
    def setGoToLocationEnabled(value: Boolean): Self = this.set("goToLocationEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGraphic(value: Graphic): Self = this.set("graphic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScale(value: Double): Self = this.set("scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setView(value: MapView | SceneView): Self = this.set("view", value.asInstanceOf[js.Any])
  }
}

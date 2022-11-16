package typings.arcgisJsApi.global.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.GeolocationPositioning")
@js.native
open class GeolocationPositioning ()
  extends StObject
     with typings.arcgisJsApi.esri.GeolocationPositioning {
  
  /**
    * An object used for setting optional position parameters.
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-GeolocationPositioning.html#geolocationOptions)
    */
  /* CompleteClass */
  var geolocationOptions: Any = js.native
  
  /**
    * Indicates whether to navigate the view to the position and scale of the geolocated result.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-GeolocationPositioning.html#goToLocationEnabled)
    */
  /* CompleteClass */
  var goToLocationEnabled: Boolean = js.native
  
  /**
    * The graphic used to show the user's location on the map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-GeolocationPositioning.html#graphic)
    */
  /* CompleteClass */
  var graphic: typings.arcgisJsApi.esri.Graphic = js.native
  
  /**
    * Indicates the scale to set on the view when navigating to the position of the geolocated result, after a location is returned from the [track](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-GeolocationPositioning.html#event-track) event.
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-GeolocationPositioning.html#scale)
    */
  /* CompleteClass */
  var scale: Double = js.native
  
  /**
    * The view associated with the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-GeolocationPositioning.html#view)
    */
  /* CompleteClass */
  var view: typings.arcgisJsApi.esri.MapView | typings.arcgisJsApi.esri.SceneView = js.native
}

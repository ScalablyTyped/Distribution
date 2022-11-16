package typings.arcgisJsApi

import typings.arcgisJsApi.esri.GeolocationPositioning
import typings.arcgisJsApi.esri.Graphic
import typings.arcgisJsApi.esri.MapView
import typings.arcgisJsApi.esri.SceneView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWidgetsSupportGeolocationPositioningMod {
  
  @JSImport("esri/widgets/support/GeolocationPositioning", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with GeolocationPositioning {
    
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
    var graphic: Graphic = js.native
    
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
    var view: MapView | SceneView = js.native
  }
}

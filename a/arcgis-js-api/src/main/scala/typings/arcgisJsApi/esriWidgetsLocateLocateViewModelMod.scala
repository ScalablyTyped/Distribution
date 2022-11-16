package typings.arcgisJsApi

import typings.arcgisJsApi.esri.GoToOverride
import typings.arcgisJsApi.esri.Graphic
import typings.arcgisJsApi.esri.LocateViewModel
import typings.arcgisJsApi.esri.LocateViewModelProperties
import typings.arcgisJsApi.esri.MapView
import typings.arcgisJsApi.esri.SceneView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWidgetsLocateLocateViewModelMod {
  
  @JSImport("esri/widgets/Locate/LocateViewModel", JSImport.Namespace)
  @js.native
  /**
    * Provides the logic for the [Locate](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Locate.html) widget, which animates the [View](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html) to the user's current location.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Locate-LocateViewModel.html)
    */
  open class ^ ()
    extends StObject
       with LocateViewModel {
    def this(properties: LocateViewModelProperties) = this()
    
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
      * This function provides the ability to override either the [MapView goTo()](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#goTo) or [SceneView goTo()](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#goTo) methods.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-GoTo.html#goToOverride)
      */
    /* CompleteClass */
    override def goToOverride(view: MapView, goToParameters: Any): Unit = js.native
    /* CompleteClass */
    override def goToOverride(view: SceneView, goToParameters: Any): Unit = js.native
    /**
      * This function provides the ability to override either the [MapView goTo()](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#goTo) or [SceneView goTo()](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#goTo) methods.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-GoTo.html#goToOverride)
      */
    /* CompleteClass */
    @JSName("goToOverride")
    var goToOverride_Original: GoToOverride = js.native
    
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

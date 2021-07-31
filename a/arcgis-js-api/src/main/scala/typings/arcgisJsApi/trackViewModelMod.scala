package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.GoToOverride
import typings.arcgisJsApi.esri.Graphic
import typings.arcgisJsApi.esri.MapView
import typings.arcgisJsApi.esri.SceneView
import typings.arcgisJsApi.esri.TrackViewModel
import typings.arcgisJsApi.esri.TrackViewModelConstructor
import typings.arcgisJsApi.esri.TrackViewModelProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object trackViewModelMod extends Shortcut {
  
  @JSImport("esri/widgets/Track/TrackViewModel", JSImport.Namespace)
  @js.native
  val ^ : js.Object & TrackViewModelConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/Track/TrackViewModel", JSImport.Namespace)
  @js.native
  /**
    * Provides the logic for the [Track](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Track.html) widget, which animates the [View](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html) to the user's location when clicked and tracks it as the location is updated.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Track-TrackViewModel.html)
    */
  class Class ()
    extends StObject
       with TrackViewModel {
    def this(properties: TrackViewModelProperties) = this()
    
    /**
      * The HTML5 Geolocation Position options for locating.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-GeolocationPositioning.html#geolocationOptions)
      */
    /* CompleteClass */
    var geolocationOptions: js.Any = js.native
    
    /**
      * Indicates whether to navigate the view to the position and scale of the geolocated result.
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
    override def goToOverride(view: MapView, goToParameters: js.Any): Unit = js.native
    /* CompleteClass */
    override def goToOverride(view: SceneView, goToParameters: js.Any): Unit = js.native
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
      * The scale to set on the view when navigating to the position of the geolocated result.
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
  
  type _To = js.Object & TrackViewModelConstructor
  
  /* This means you don't have to write `^`, but can instead just say `trackViewModelMod.foo` */
  override def _to: js.Object & TrackViewModelConstructor = ^
}

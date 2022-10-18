package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.DirectionsViewModel
import typings.arcgisJsApi.esri.DirectionsViewModelConstructor
import typings.arcgisJsApi.esri.DirectionsViewModelProperties
import typings.arcgisJsApi.esri.GoToOverride
import typings.arcgisJsApi.esri.MapView
import typings.arcgisJsApi.esri.SceneView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWidgetsDirectionsDirectionsViewModelMod extends Shortcut {
  
  @JSImport("esri/widgets/Directions/DirectionsViewModel", JSImport.Namespace)
  @js.native
  val ^ : js.Object & DirectionsViewModelConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/Directions/DirectionsViewModel", JSImport.Namespace)
  @js.native
  /**
    * Provides the communication and data manipulation logic for the [Directions](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions.html) widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html)
    */
  open class Class ()
    extends StObject
       with DirectionsViewModel {
    def this(properties: DirectionsViewModelProperties) = this()
    
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
  }
  
  type _To = js.Object & DirectionsViewModelConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriWidgetsDirectionsDirectionsViewModelMod.foo` */
  override def _to: js.Object & DirectionsViewModelConstructor = ^
}

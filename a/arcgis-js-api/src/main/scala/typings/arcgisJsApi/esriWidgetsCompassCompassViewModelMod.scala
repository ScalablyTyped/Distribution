package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.CompassViewModel
import typings.arcgisJsApi.esri.CompassViewModelConstructor
import typings.arcgisJsApi.esri.CompassViewModelProperties
import typings.arcgisJsApi.esri.GoToOverride
import typings.arcgisJsApi.esri.MapView
import typings.arcgisJsApi.esri.SceneView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWidgetsCompassCompassViewModelMod extends Shortcut {
  
  @JSImport("esri/widgets/Compass/CompassViewModel", JSImport.Namespace)
  @js.native
  val ^ : js.Object & CompassViewModelConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/Compass/CompassViewModel", JSImport.Namespace)
  @js.native
  /**
    * Provides the logic for the [Compass](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Compass.html) widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Compass-CompassViewModel.html)
    */
  open class Class ()
    extends StObject
       with CompassViewModel {
    def this(properties: CompassViewModelProperties) = this()
    
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
  
  type _To = js.Object & CompassViewModelConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriWidgetsCompassCompassViewModelMod.foo` */
  override def _to: js.Object & CompassViewModelConstructor = ^
}

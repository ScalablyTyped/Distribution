package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.GoToOverride
import typings.arcgisJsApi.esri.HomeViewModel
import typings.arcgisJsApi.esri.HomeViewModelConstructor
import typings.arcgisJsApi.esri.HomeViewModelProperties
import typings.arcgisJsApi.esri.MapView
import typings.arcgisJsApi.esri.SceneView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWidgetsHomeHomeViewModelMod extends Shortcut {
  
  @JSImport("esri/widgets/Home/HomeViewModel", JSImport.Namespace)
  @js.native
  val ^ : js.Object & HomeViewModelConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/Home/HomeViewModel", JSImport.Namespace)
  @js.native
  /**
    * Provides the logic for the [Home](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Home.html) widget that animates the [View](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html) to its initial [Viewpoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-Viewpoint.html) or a previously defined [viewpoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Home-HomeViewModel.html#viewpoint).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Home-HomeViewModel.html)
    */
  open class Class ()
    extends StObject
       with HomeViewModel {
    def this(properties: HomeViewModelProperties) = this()
    
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
  
  type _To = js.Object & HomeViewModelConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriWidgetsHomeHomeViewModelMod.foo` */
  override def _to: js.Object & HomeViewModelConstructor = ^
}

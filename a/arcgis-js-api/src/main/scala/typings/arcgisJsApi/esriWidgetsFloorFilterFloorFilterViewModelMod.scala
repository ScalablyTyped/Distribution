package typings.arcgisJsApi

import typings.arcgisJsApi.esri.FloorFilterViewModel
import typings.arcgisJsApi.esri.FloorFilterViewModelProperties
import typings.arcgisJsApi.esri.GoToOverride
import typings.arcgisJsApi.esri.MapView
import typings.arcgisJsApi.esri.SceneView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWidgetsFloorFilterFloorFilterViewModelMod {
  
  @JSImport("esri/widgets/FloorFilter/FloorFilterViewModel", JSImport.Namespace)
  @js.native
  /**
  		 * Provides the logic for the [FloorFilter](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FloorFilter.html) widget.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FloorFilter-FloorFilterViewModel.html)
  		 */
  open class ^ ()
    extends StObject
       with FloorFilterViewModel {
    def this(properties: FloorFilterViewModelProperties) = this()
    
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
}

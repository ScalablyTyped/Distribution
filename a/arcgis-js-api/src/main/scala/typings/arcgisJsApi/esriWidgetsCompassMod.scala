package typings.arcgisJsApi

import typings.arcgisJsApi.esri.Compass
import typings.arcgisJsApi.esri.CompassProperties
import typings.arcgisJsApi.esri.GoToOverride
import typings.arcgisJsApi.esri.MapView
import typings.arcgisJsApi.esri.SceneView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWidgetsCompassMod {
  
  @JSImport("esri/widgets/Compass", JSImport.Namespace)
  @js.native
  /**
  		 * The Compass widget indicates where north is in relation to the current view [rotation](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#rotation) or [camera heading](https://developers.arcgis.com/javascript/latest/api-reference/esri-Camera.html#heading).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Compass.html)
  		 */
  open class ^ ()
    extends StObject
       with Compass {
    def this(properties: CompassProperties) = this()
    
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

package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.GoToOverride
import typings.arcgisJsApi.esri.LocateProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.Locate")
@js.native
/**
		 * Provides a simple widget that animates the [View](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html) to the user's current location.
		 *
		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Locate.html)
		 */
open class Locate ()
  extends StObject
     with typings.arcgisJsApi.esri.Locate {
  def this(properties: LocateProperties) = this()
  
  /**
  		 * This function provides the ability to override either the [MapView goTo()](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#goTo) or [SceneView goTo()](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#goTo) methods.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-GoTo.html#goToOverride)
  		 */
  /* CompleteClass */
  override def goToOverride(view: typings.arcgisJsApi.esri.MapView, goToParameters: Any): Unit = js.native
  /* CompleteClass */
  override def goToOverride(view: typings.arcgisJsApi.esri.SceneView, goToParameters: Any): Unit = js.native
  /**
  		 * This function provides the ability to override either the [MapView goTo()](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#goTo) or [SceneView goTo()](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#goTo) methods.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-GoTo.html#goToOverride)
  		 */
  /* CompleteClass */
  @JSName("goToOverride")
  var goToOverride_Original: GoToOverride = js.native
}

package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoTo extends StObject {
  
  /**
  		 * This function provides the ability to override either the [MapView goTo()](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#goTo) or [SceneView goTo()](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#goTo) methods.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-GoTo.html#goToOverride)
  		 */
  def goToOverride(view: MapView, goToParameters: Any): scala.Unit
  def goToOverride(view: SceneView, goToParameters: Any): scala.Unit
  /**
  		 * This function provides the ability to override either the [MapView goTo()](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#goTo) or [SceneView goTo()](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#goTo) methods.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-GoTo.html#goToOverride)
  		 */
  @JSName("goToOverride")
  var goToOverride_Original: GoToOverride
}
object GoTo {
  
  inline def apply(goToOverride: (/* view */ MapView | SceneView, /* goToParameters */ Any) => scala.Unit): GoTo = {
    val __obj = js.Dynamic.literal(goToOverride = js.Any.fromFunction2(goToOverride))
    __obj.asInstanceOf[GoTo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoTo] (val x: Self) extends AnyVal {
    
    inline def setGoToOverride(value: (/* view */ MapView | SceneView, /* goToParameters */ Any) => scala.Unit): Self = StObject.set(x, "goToOverride", js.Any.fromFunction2(value))
  }
}

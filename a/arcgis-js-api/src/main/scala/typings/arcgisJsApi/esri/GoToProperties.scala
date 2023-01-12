package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoToProperties extends StObject {
  
  /**
    * This function provides the ability to override either the [MapView goTo()](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html#goTo) or [SceneView goTo()](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#goTo) methods.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-support-GoTo.html#goToOverride)
    */
  var goToOverride: js.UndefOr[GoToOverride] = js.undefined
}
object GoToProperties {
  
  inline def apply(): GoToProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoToProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoToProperties] (val x: Self) extends AnyVal {
    
    inline def setGoToOverride(value: (/* view */ MapView | SceneView, /* goToParameters */ Any) => scala.Unit): Self = StObject.set(x, "goToOverride", js.Any.fromFunction2(value))
    
    inline def setGoToOverrideUndefined: Self = StObject.set(x, "goToOverride", js.undefined)
  }
}

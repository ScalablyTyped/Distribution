package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttributionViewModelProperties extends StObject {
  
  /**
    * The view from which the view model will operate.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Attribution-AttributionViewModel.html#view)
    */
  var view: js.UndefOr[MapViewProperties | SceneViewProperties] = js.undefined
}
object AttributionViewModelProperties {
  
  inline def apply(): AttributionViewModelProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttributionViewModelProperties]
  }
  
  extension [Self <: AttributionViewModelProperties](x: Self) {
    
    inline def setView(value: MapViewProperties | SceneViewProperties): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}

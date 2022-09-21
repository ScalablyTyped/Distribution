package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WeatherViewModelProperties extends StObject {
  
  /**
    * A reference to the [View](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Weather-WeatherViewModel.html#view)
    */
  var view: js.UndefOr[SceneViewProperties] = js.undefined
}
object WeatherViewModelProperties {
  
  inline def apply(): WeatherViewModelProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WeatherViewModelProperties]
  }
  
  extension [Self <: WeatherViewModelProperties](x: Self) {
    
    inline def setView(value: SceneViewProperties): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}

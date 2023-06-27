package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.cloudy
import typings.arcgisJsApi.arcgisJsApiStrings.disabled
import typings.arcgisJsApi.arcgisJsApiStrings.foggy
import typings.arcgisJsApi.arcgisJsApiStrings.rainy
import typings.arcgisJsApi.arcgisJsApiStrings.ready
import typings.arcgisJsApi.arcgisJsApiStrings.snowy
import typings.arcgisJsApi.arcgisJsApiStrings.sunny
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WeatherViewModel
  extends StObject
     with Accessor {
  
  /**
  		 * Sets the weather to the specified type.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Weather-WeatherViewModel.html#setWeatherByType)
  		 */
  def setWeatherByType(`type`: sunny | cloudy | rainy | snowy | foggy): scala.Unit = js.native
  
  /**
  		 * The current state of the view model that can be used for rendering the UI of the widget.
  		 *
  		 * @default disabled
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Weather-WeatherViewModel.html#state)
  		 */
  val state: disabled | ready = js.native
  
  /**
  		 * A reference to the [View](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Weather-WeatherViewModel.html#view)
  		 */
  var view: SceneView = js.native
}

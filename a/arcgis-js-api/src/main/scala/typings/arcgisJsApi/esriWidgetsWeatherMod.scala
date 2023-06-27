package typings.arcgisJsApi

import typings.arcgisJsApi.esri.Weather
import typings.arcgisJsApi.esri.WeatherProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWidgetsWeatherMod {
  
  @JSImport("esri/widgets/Weather", JSImport.Namespace)
  @js.native
  /**
  		 * The Weather widget provides an interface for easily selecting and configuring the weather effects in a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Weather.html)
  		 */
  open class ^ ()
    extends StObject
       with Weather {
    def this(properties: WeatherProperties) = this()
  }
}

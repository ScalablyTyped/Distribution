package typings.arcgisJsApi

import typings.arcgisJsApi.esri.SunnyWeather
import typings.arcgisJsApi.esri.SunnyWeatherProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriViews3dEnvironmentSunnyWeatherMod {
  
  @JSImport("esri/views/3d/environment/SunnyWeather", JSImport.Namespace)
  @js.native
  /**
  		 * The SunnyWeather class allows you to change the weather conditions in the scene to sunny weather.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-environment-SunnyWeather.html)
  		 */
  open class ^ ()
    extends StObject
       with SunnyWeather {
    def this(properties: SunnyWeatherProperties) = this()
  }
}

package typings.arcgisJsApi

import typings.arcgisJsApi.esri.FoggyWeather
import typings.arcgisJsApi.esri.FoggyWeatherProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriViews3dEnvironmentFoggyWeatherMod {
  
  @JSImport("esri/views/3d/environment/FoggyWeather", JSImport.Namespace)
  @js.native
  /**
  		 * The FoggyWeather class allows you to change the weather conditions in the scene to foggy weather.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-environment-FoggyWeather.html)
  		 */
  open class ^ ()
    extends StObject
       with FoggyWeather {
    def this(properties: FoggyWeatherProperties) = this()
  }
}

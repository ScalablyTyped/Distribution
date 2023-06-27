package typings.arcgisJsApi

import typings.arcgisJsApi.esri.CloudyWeather
import typings.arcgisJsApi.esri.CloudyWeatherProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriViews3dEnvironmentCloudyWeatherMod {
  
  @JSImport("esri/views/3d/environment/CloudyWeather", JSImport.Namespace)
  @js.native
  /**
  		 * The CloudyWeather class allows you to change the weather conditions in the scene to cloudy weather.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-environment-CloudyWeather.html)
  		 */
  open class ^ ()
    extends StObject
       with CloudyWeather {
    def this(properties: CloudyWeatherProperties) = this()
  }
}

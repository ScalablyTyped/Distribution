package typings.arcgisJsApi

import typings.arcgisJsApi.esri.RainyWeather
import typings.arcgisJsApi.esri.RainyWeatherProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriViews3dEnvironmentRainyWeatherMod {
  
  @JSImport("esri/views/3d/environment/RainyWeather", JSImport.Namespace)
  @js.native
  /**
    * The RainyWeather class allows you to change the weather conditions in the scene to rainy weather.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-environment-RainyWeather.html)
    */
  open class ^ ()
    extends StObject
       with RainyWeather {
    def this(properties: RainyWeatherProperties) = this()
  }
}

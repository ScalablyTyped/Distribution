package typings.arcgisJsApi

import typings.arcgisJsApi.esri.SnowyWeather
import typings.arcgisJsApi.esri.SnowyWeatherProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriViews3dEnvironmentSnowyWeatherMod {
  
  @JSImport("esri/views/3d/environment/SnowyWeather", JSImport.Namespace)
  @js.native
  /**
    * The SnowyWeather class allows you to change the weather conditions in the scene to snowy weather.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-environment-SnowyWeather.html)
    */
  open class ^ ()
    extends StObject
       with SnowyWeather {
    def this(properties: SnowyWeatherProperties) = this()
  }
}

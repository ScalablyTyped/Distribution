package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.rainy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RainyWeather
  extends StObject
     with Accessor {
  
  /**
    * Specifies the amount of cloud cover in the sky for a certain weather type.
    *
    * @default 0.5
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-environment-RainyWeather.html#cloudCover)
    */
  var cloudCover: Double = js.native
  
  /**
    * Specifies the amount of falling rain.
    *
    * @default 0.5
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-environment-RainyWeather.html#precipitation)
    */
  var precipitation: Double = js.native
  
  /**
    * The type of Weather
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-environment-RainyWeather.html#type)
    */
  val `type`: rainy = js.native
}

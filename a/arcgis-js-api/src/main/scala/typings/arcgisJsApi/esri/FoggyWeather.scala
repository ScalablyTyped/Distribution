package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.foggy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FoggyWeather
  extends StObject
     with Accessor {
  
  /**
    * Specifies the amount of fog used in the scene.
    *
    * @default 0.5
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-environment-FoggyWeather.html#fogStrength)
    */
  var fogStrength: Double = js.native
  
  /**
    * The type of Weather
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-environment-FoggyWeather.html#type)
    */
  val `type`: foggy = js.native
}

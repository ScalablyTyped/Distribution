package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.FoggyWeatherProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.FoggyWeather")
@js.native
/**
  * The FoggyWeather class allows you to change the weather conditions in the scene to foggy weather.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-environment-FoggyWeather.html)
  */
open class FoggyWeather ()
  extends StObject
     with typings.arcgisJsApi.esri.FoggyWeather {
  def this(properties: FoggyWeatherProperties) = this()
}

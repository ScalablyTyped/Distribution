package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.FoggyWeather
import typings.arcgisJsApi.esri.FoggyWeatherConstructor
import typings.arcgisJsApi.esri.FoggyWeatherProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriViews3dEnvironmentFoggyWeatherMod extends Shortcut {
  
  @JSImport("esri/views/3d/environment/FoggyWeather", JSImport.Namespace)
  @js.native
  val ^ : js.Object & FoggyWeatherConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/views/3d/environment/FoggyWeather", JSImport.Namespace)
  @js.native
  /**
    * The FoggyWeather class allows you to change the weather conditions in the scene to foggy weather.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-environment-FoggyWeather.html)
    */
  open class Class ()
    extends StObject
       with FoggyWeather {
    def this(properties: FoggyWeatherProperties) = this()
  }
  
  type _To = js.Object & FoggyWeatherConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriViews3dEnvironmentFoggyWeatherMod.foo` */
  override def _to: js.Object & FoggyWeatherConstructor = ^
}

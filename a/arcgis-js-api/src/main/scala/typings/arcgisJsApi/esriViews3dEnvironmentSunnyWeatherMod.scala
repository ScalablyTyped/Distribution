package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.SunnyWeather
import typings.arcgisJsApi.esri.SunnyWeatherConstructor
import typings.arcgisJsApi.esri.SunnyWeatherProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriViews3dEnvironmentSunnyWeatherMod extends Shortcut {
  
  @JSImport("esri/views/3d/environment/SunnyWeather", JSImport.Namespace)
  @js.native
  val ^ : js.Object & SunnyWeatherConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/views/3d/environment/SunnyWeather", JSImport.Namespace)
  @js.native
  /**
    * The SunnyWeather class allows you to change the weather conditions in the scene to sunny weather.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-environment-SunnyWeather.html)
    */
  open class Class ()
    extends StObject
       with SunnyWeather {
    def this(properties: SunnyWeatherProperties) = this()
  }
  
  type _To = js.Object & SunnyWeatherConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriViews3dEnvironmentSunnyWeatherMod.foo` */
  override def _to: js.Object & SunnyWeatherConstructor = ^
}

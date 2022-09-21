package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.RainyWeather
import typings.arcgisJsApi.esri.RainyWeatherConstructor
import typings.arcgisJsApi.esri.RainyWeatherProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rainyWeatherMod extends Shortcut {
  
  @JSImport("esri/views/3d/environment/RainyWeather", JSImport.Namespace)
  @js.native
  val ^ : js.Object & RainyWeatherConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/views/3d/environment/RainyWeather", JSImport.Namespace)
  @js.native
  /**
    * The RainyWeather class allows you to change the weather conditions in the scene to rainy weather.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-environment-RainyWeather.html)
    */
  open class Class ()
    extends StObject
       with RainyWeather {
    def this(properties: RainyWeatherProperties) = this()
  }
  
  type _To = js.Object & RainyWeatherConstructor
  
  /* This means you don't have to write `^`, but can instead just say `rainyWeatherMod.foo` */
  override def _to: js.Object & RainyWeatherConstructor = ^
}

package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.CloudyWeather
import typings.arcgisJsApi.esri.CloudyWeatherConstructor
import typings.arcgisJsApi.esri.CloudyWeatherProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cloudyWeatherMod extends Shortcut {
  
  @JSImport("esri/views/3d/environment/CloudyWeather", JSImport.Namespace)
  @js.native
  val ^ : js.Object & CloudyWeatherConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/views/3d/environment/CloudyWeather", JSImport.Namespace)
  @js.native
  /**
    * The CloudyWeather class allows you to change the weather conditions in the scene to cloudy weather.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-environment-CloudyWeather.html)
    */
  open class Class ()
    extends StObject
       with CloudyWeather {
    def this(properties: CloudyWeatherProperties) = this()
  }
  
  type _To = js.Object & CloudyWeatherConstructor
  
  /* This means you don't have to write `^`, but can instead just say `cloudyWeatherMod.foo` */
  override def _to: js.Object & CloudyWeatherConstructor = ^
}

package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.SnowyWeather
import typings.arcgisJsApi.esri.SnowyWeatherConstructor
import typings.arcgisJsApi.esri.SnowyWeatherProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object snowyWeatherMod extends Shortcut {
  
  @JSImport("esri/views/3d/environment/SnowyWeather", JSImport.Namespace)
  @js.native
  val ^ : js.Object & SnowyWeatherConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/views/3d/environment/SnowyWeather", JSImport.Namespace)
  @js.native
  /**
    * The SnowyWeather class allows you to change the weather conditions in the scene to snowy weather.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-environment-SnowyWeather.html)
    */
  open class Class ()
    extends StObject
       with SnowyWeather {
    def this(properties: SnowyWeatherProperties) = this()
  }
  
  type _To = js.Object & SnowyWeatherConstructor
  
  /* This means you don't have to write `^`, but can instead just say `snowyWeatherMod.foo` */
  override def _to: js.Object & SnowyWeatherConstructor = ^
}

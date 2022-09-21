package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.Weather
import typings.arcgisJsApi.esri.WeatherConstructor
import typings.arcgisJsApi.esri.WeatherProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object weatherMod extends Shortcut {
  
  @JSImport("esri/widgets/Weather", JSImport.Namespace)
  @js.native
  val ^ : js.Object & WeatherConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/widgets/Weather", JSImport.Namespace)
  @js.native
  /**
    * The Weather widget provides an interface for easily selecting and configuring the weather effects in a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Weather.html)
    */
  open class Class ()
    extends StObject
       with Weather {
    def this(properties: WeatherProperties) = this()
  }
  
  type _To = js.Object & WeatherConstructor
  
  /* This means you don't have to write `^`, but can instead just say `weatherMod.foo` */
  override def _to: js.Object & WeatherConstructor = ^
}

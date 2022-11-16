package typings.arcgisJsApi

import typings.arcgisJsApi.esri.Slider
import typings.arcgisJsApi.esri.SliderProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWidgetsSliderMod {
  
  @JSImport("esri/widgets/Slider", JSImport.Namespace)
  @js.native
  /**
    * A slider widget that can be used for filtering data, or gathering numeric input from a user.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html)
    */
  open class ^ ()
    extends StObject
       with Slider {
    def this(properties: SliderProperties) = this()
  }
}

package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClassedColorSliderViewModel extends SmartMappingSliderViewModel {
  /**
    * An array of class breaks with associated colors. The colors mapped to each break can be used to update the renderer of a layer. A minimum of two breaks must be provided to the slider.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ClassedColorSlider-ClassedColorSliderViewModel.html#breaks)
    */
  var breaks: js.Array[ClassedColorSliderViewModelBreaks] = js.native
  /**
    * Generates the color ramp rendered on the slider.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ClassedColorSlider-ClassedColorSliderViewModel.html#getStopInfo)
    *
    *
    */
  def getStopInfo(): js.Array[StopInfo] = js.native
}

@JSGlobal("__esri.ClassedColorSliderViewModel")
@js.native
object ClassedColorSliderViewModel extends TopLevel[ClassedColorSliderViewModelConstructor]


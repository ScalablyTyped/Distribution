package typings.arcgisDashJsDashApi.__esri

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClassedSizeSliderViewModel extends SmartMappingSliderViewModel {
  /**
    * An array of class breaks with associated sizes. The size mapped to each break can be used to update the renderer of a layer. A minimum of two breaks must be provided to the slider.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ClassedSizeSlider-ClassedSizeSliderViewModel.html#breaks)
    */
  var breaks: js.Array[ClassedSizeSliderViewModelBreaks] = js.native
}

@JSGlobal("__esri.ClassedSizeSliderViewModel")
@js.native
object ClassedSizeSliderViewModel extends TopLevel[ClassedSizeSliderViewModelConstructor]


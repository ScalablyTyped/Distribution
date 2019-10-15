package typings.arcgisDashJsDashApi.__esri

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SizeSliderViewModel extends SliderViewModel {
  /**
    * The size stops from the [SizeVariable](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html) to link to the slider.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SizeSlider-SizeSliderViewModel.html#stops)
    */
  var stops: js.Array[SizeStop] = js.native
}

@JSGlobal("__esri.SizeSliderViewModel")
@js.native
object SizeSliderViewModel extends TopLevel[SizeSliderViewModelConstructor]


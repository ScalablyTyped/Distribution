package typings.arcgisDashJsDashApi.__esri

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColorSliderViewModel extends SliderViewModel {
  /**
    * Only applicable when three thumbs (i.e. handles) are set on the slider [values](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ColorSlider-ColorSliderViewModel.html#values). This property indicates whether the position of the outside handles are synced with the middle, or primary, handle. When enabled, if the primary handle is moved then the outside handle positions are updated while maintaining a fixed distance from the primary handle.  Only applicable when [primaryHandleEnabled](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ColorSlider-ColorSliderViewModel.html#primaryHandleEnabled) is `true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ColorSlider-ColorSliderViewModel.html#handlesSyncedToPrimary)
    *
    * @default true
    */
  var handlesSyncedToPrimary: Boolean = js.native
  /**
    * When `true`, the slider will render a third handle between the two handles already provided by default. This is the primary handle. When [handlesSyncedToPrimary](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ColorSlider-ColorSliderViewModel.html#handlesSyncedToPrimary) is `true`, then this handle will control the position of the others when moved.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ColorSlider-ColorSliderViewModel.html#primaryHandleEnabled)
    *
    * @default false
    */
  var primaryHandleEnabled: Boolean = js.native
  /**
    * The color stops from the [ColorVariable](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-ColorVariable.html) to link to the slider. The colors in these stops will be used to render the color gradient on the slider's track. They should match the colors rendered in the associated layer's renderer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ColorSlider-ColorSliderViewModel.html#stops)
    */
  var stops: js.Array[ColorStop] = js.native
  /**
    * Generates the color ramp gradient rendered on the slider track.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ColorSlider-ColorSliderViewModel.html#getStopInfo)
    *
    *
    */
  def getStopInfo(): js.Array[ColorSliderViewModelStopInfo] = js.native
}

@JSGlobal("__esri.ColorSliderViewModel")
@js.native
object ColorSliderViewModel extends TopLevel[ColorSliderViewModelConstructor]


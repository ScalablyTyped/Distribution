package typings.arcgisJsApi.esri

import typings.arcgisJsApi.IHandle
import typings.arcgisJsApi.arcgisJsApiStrings.`max-change`
import typings.arcgisJsApi.arcgisJsApiStrings.`min-change`
import typings.arcgisJsApi.arcgisJsApiStrings.average
import typings.arcgisJsApi.arcgisJsApiStrings.disabled
import typings.arcgisJsApi.arcgisJsApiStrings.max
import typings.arcgisJsApi.arcgisJsApiStrings.min
import typings.arcgisJsApi.arcgisJsApiStrings.ready
import typings.arcgisJsApi.arcgisJsApiStrings.tick
import typings.arcgisJsApi.arcgisJsApiStrings.value
import typings.arcgisJsApi.arcgisJsApiStrings.values
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SliderViewModel
  extends StObject
     with Accessor
     with Evented {
  
  /**
  		 * The default input format function available for use as a fallback in custom formatting implementations.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider-SliderViewModel.html#defaultInputFormatFunction)
  		 */
  def defaultInputFormatFunction(value: Double): String = js.native
  
  /**
  		 * The default input parsing function available for use as a fallback in custom parsing implementations.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider-SliderViewModel.html#defaultInputParseFunction)
  		 */
  def defaultInputParseFunction(value: String): Double = js.native
  
  /**
  		 * The default label format function, available for use as a fallback in custom formatting implementations.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider-SliderViewModel.html#defaultLabelFormatFunction)
  		 */
  def defaultLabelFormatFunction(value: Double): String = js.native
  
  /**
  		 * When set, the user is restricted from moving slider thumbs to positions higher than this value.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider-SliderViewModel.html#effectiveMax)
  		 */
  var effectiveMax: Double = js.native
  
  /**
  		 * When set, the user is restricted from moving slider thumbs to positions less than this value.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider-SliderViewModel.html#effectiveMin)
  		 */
  var effectiveMin: Double = js.native
  
  /**
  		 * Returns the effective bounds of the slider.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider-SliderViewModel.html#getBounds)
  		 */
  def getBounds(): Bounds = js.native
  
  /**
  		 * Returns the min and max bounds for a 'value' at the provided index.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider-SliderViewModel.html#getBoundsForValueAtIndex)
  		 */
  def getBoundsForValueAtIndex(index: Double): Any = js.native
  
  /**
  		 * Returns the formatted label for a provided value.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider-SliderViewModel.html#getLabelForValue)
  		 */
  def getLabelForValue(value: Double): String = js.native
  def getLabelForValue(value: Double, `type`: min | max | tick | values): String = js.native
  def getLabelForValue(value: Double, `type`: min | max | tick | values, index: Double): String = js.native
  def getLabelForValue(value: Double, `type`: scala.Unit, index: Double): String = js.native
  
  /**
  		 * A function used to format user inputs.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider-SliderViewModel.html#inputFormatFunction)
  		 */
  def inputFormatFunction(value: Double): String = js.native
  def inputFormatFunction(value: Double, `type`: average | min | max | tick | value): String = js.native
  def inputFormatFunction(value: Double, `type`: average | min | max | tick | value, index: Double): String = js.native
  def inputFormatFunction(value: Double, `type`: scala.Unit, index: Double): String = js.native
  /**
  		 * A function used to format user inputs.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider-SliderViewModel.html#inputFormatFunction)
  		 */
  @JSName("inputFormatFunction")
  var inputFormatFunction_Original: SliderLabelFormatter = js.native
  
  /**
  		 * Function used to parse slider inputs formatted by the [inputFormatFunction](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider-SliderViewModel.html#inputFormatFunction).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider-SliderViewModel.html#inputParseFunction)
  		 */
  def inputParseFunction(value: String): Double = js.native
  def inputParseFunction(value: String, `type`: average | min | max | tick | value): Double = js.native
  def inputParseFunction(value: String, `type`: average | min | max | tick | value, index: Double): Double = js.native
  def inputParseFunction(value: String, `type`: scala.Unit, index: Double): Double = js.native
  /**
  		 * Function used to parse slider inputs formatted by the [inputFormatFunction](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider-SliderViewModel.html#inputFormatFunction).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider-SliderViewModel.html#inputParseFunction)
  		 */
  @JSName("inputParseFunction")
  var inputParseFunction_Original: InputParser = js.native
  
  /**
  		 * A function used to format labels.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider-SliderViewModel.html#labelFormatFunction)
  		 */
  def labelFormatFunction(value: Double): String = js.native
  def labelFormatFunction(value: Double, `type`: average | min | max | tick | value): String = js.native
  def labelFormatFunction(value: Double, `type`: average | min | max | tick | value, index: Double): String = js.native
  def labelFormatFunction(value: Double, `type`: scala.Unit, index: Double): String = js.native
  /**
  		 * A function used to format labels.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider-SliderViewModel.html#labelFormatFunction)
  		 */
  @JSName("labelFormatFunction")
  var labelFormatFunction_Original: SliderLabelFormatter = js.native
  
  /**
  		 * An array of strings associated with [values](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider-SliderViewModel.html#values) generated using an internal label formatter or the values returned from [labelFormatFunction](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider-SliderViewModel.html#labelFormatFunction).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider-SliderViewModel.html#labels)
  		 */
  val labels: js.Array[String] = js.native
  
  /**
  		 * The maximum possible data/thumb value of the slider.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider-SliderViewModel.html#max)
  		 */
  var max: Double = js.native
  
  /**
  		 * The minimum possible data/thumb value of the slider.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider-SliderViewModel.html#min)
  		 */
  var min: Double = js.native
  
  @JSName("on")
  def on_maxchange(name: `max-change`, eventHandler: SliderViewModelMaxChangeEventHandler): IHandle = js.native
  @JSName("on")
  def on_minchange(name: `min-change`, eventHandler: SliderViewModelMinChangeEventHandler): IHandle = js.native
  
  /**
  		 * Defines how slider values should be rounded.
  		 *
  		 * @default 4
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider-SliderViewModel.html#precision)
  		 */
  var precision: Double = js.native
  
  /**
  		 * Updates a thumb [value](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider-SliderViewModel.html#values) based on the provided index.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider-SliderViewModel.html#setValue)
  		 */
  def setValue(index: Double, value: Double): scala.Unit = js.native
  
  /**
  		 * The state of the view model.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider-SliderViewModel.html#state)
  		 */
  val state: ready | disabled = js.native
  
  /**
  		 * When `false`, the user can freely move any slider thumb to any position along the track.
  		 *
  		 * @default true
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider-SliderViewModel.html#thumbsConstrained)
  		 */
  var thumbsConstrained: Boolean = js.native
  
  /**
  		 * Rounds the given value to the number of decimal places specified in the [precision](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider-SliderViewModel.html#precision) property set on the view model.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider-SliderViewModel.html#toPrecision)
  		 */
  def toPrecision(value: Double): String = js.native
  
  /**
  		 * An array of numbers representing absolute thumb positions on the slider.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider-SliderViewModel.html#values)
  		 */
  var values: js.Array[Double] = js.native
}

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
    * Returns the min and max bounds for a 'value' at the provided index.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider-SliderViewModel.html#getBoundsForValueAtIndex)
    */
  def getBoundsForValueAtIndex(index: Double): js.Any = js.native
  
  /**
    * Returns the formatted label for a provided value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider-SliderViewModel.html#getLabelForValue)
    */
  def getLabelForValue(value: Double): String = js.native
  def getLabelForValue(value: Double, `type`: Unit, index: Double): String = js.native
  @JSName("getLabelForValue")
  def getLabelForValue_max(value: Double, `type`: max): String = js.native
  @JSName("getLabelForValue")
  def getLabelForValue_max(value: Double, `type`: max, index: Double): String = js.native
  @JSName("getLabelForValue")
  def getLabelForValue_min(value: Double, `type`: min): String = js.native
  @JSName("getLabelForValue")
  def getLabelForValue_min(value: Double, `type`: min, index: Double): String = js.native
  @JSName("getLabelForValue")
  def getLabelForValue_tick(value: Double, `type`: tick): String = js.native
  @JSName("getLabelForValue")
  def getLabelForValue_tick(value: Double, `type`: tick, index: Double): String = js.native
  @JSName("getLabelForValue")
  def getLabelForValue_values(value: Double, `type`: values): String = js.native
  @JSName("getLabelForValue")
  def getLabelForValue_values(value: Double, `type`: values, index: Double): String = js.native
  
  /**
    * A function used to format user inputs.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider-SliderViewModel.html#inputFormatFunction)
    */
  def inputFormatFunction(value: Double): String = js.native
  def inputFormatFunction(value: Double, `type`: Unit, index: Double): String = js.native
  /**
    * A function used to format user inputs.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider-SliderViewModel.html#inputFormatFunction)
    */
  @JSName("inputFormatFunction")
  var inputFormatFunction_Original: SliderLabelFormatter = js.native
  @JSName("inputFormatFunction")
  def inputFormatFunction_average(value: Double, `type`: average): String = js.native
  @JSName("inputFormatFunction")
  def inputFormatFunction_average(value: Double, `type`: average, index: Double): String = js.native
  @JSName("inputFormatFunction")
  def inputFormatFunction_max(value: Double, `type`: max): String = js.native
  @JSName("inputFormatFunction")
  def inputFormatFunction_max(value: Double, `type`: max, index: Double): String = js.native
  @JSName("inputFormatFunction")
  def inputFormatFunction_min(value: Double, `type`: min): String = js.native
  @JSName("inputFormatFunction")
  def inputFormatFunction_min(value: Double, `type`: min, index: Double): String = js.native
  @JSName("inputFormatFunction")
  def inputFormatFunction_tick(value: Double, `type`: tick): String = js.native
  @JSName("inputFormatFunction")
  def inputFormatFunction_tick(value: Double, `type`: tick, index: Double): String = js.native
  @JSName("inputFormatFunction")
  def inputFormatFunction_value(value: Double, `type`: value): String = js.native
  @JSName("inputFormatFunction")
  def inputFormatFunction_value(value: Double, `type`: value, index: Double): String = js.native
  
  /**
    * Function used to parse slider inputs formatted by the [inputFormatFunction](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider-SliderViewModel.html#inputFormatFunction).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider-SliderViewModel.html#inputParseFunction)
    */
  def inputParseFunction(value: String): Double = js.native
  def inputParseFunction(value: String, `type`: Unit, index: Double): Double = js.native
  /**
    * Function used to parse slider inputs formatted by the [inputFormatFunction](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider-SliderViewModel.html#inputFormatFunction).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider-SliderViewModel.html#inputParseFunction)
    */
  @JSName("inputParseFunction")
  var inputParseFunction_Original: InputParser = js.native
  @JSName("inputParseFunction")
  def inputParseFunction_average(value: String, `type`: average): Double = js.native
  @JSName("inputParseFunction")
  def inputParseFunction_average(value: String, `type`: average, index: Double): Double = js.native
  @JSName("inputParseFunction")
  def inputParseFunction_max(value: String, `type`: max): Double = js.native
  @JSName("inputParseFunction")
  def inputParseFunction_max(value: String, `type`: max, index: Double): Double = js.native
  @JSName("inputParseFunction")
  def inputParseFunction_min(value: String, `type`: min): Double = js.native
  @JSName("inputParseFunction")
  def inputParseFunction_min(value: String, `type`: min, index: Double): Double = js.native
  @JSName("inputParseFunction")
  def inputParseFunction_tick(value: String, `type`: tick): Double = js.native
  @JSName("inputParseFunction")
  def inputParseFunction_tick(value: String, `type`: tick, index: Double): Double = js.native
  @JSName("inputParseFunction")
  def inputParseFunction_value(value: String, `type`: value): Double = js.native
  @JSName("inputParseFunction")
  def inputParseFunction_value(value: String, `type`: value, index: Double): Double = js.native
  
  /**
    * A function used to format labels.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider-SliderViewModel.html#labelFormatFunction)
    */
  def labelFormatFunction(value: Double): String = js.native
  def labelFormatFunction(value: Double, `type`: Unit, index: Double): String = js.native
  /**
    * A function used to format labels.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider-SliderViewModel.html#labelFormatFunction)
    */
  @JSName("labelFormatFunction")
  var labelFormatFunction_Original: SliderLabelFormatter = js.native
  @JSName("labelFormatFunction")
  def labelFormatFunction_average(value: Double, `type`: average): String = js.native
  @JSName("labelFormatFunction")
  def labelFormatFunction_average(value: Double, `type`: average, index: Double): String = js.native
  @JSName("labelFormatFunction")
  def labelFormatFunction_max(value: Double, `type`: max): String = js.native
  @JSName("labelFormatFunction")
  def labelFormatFunction_max(value: Double, `type`: max, index: Double): String = js.native
  @JSName("labelFormatFunction")
  def labelFormatFunction_min(value: Double, `type`: min): String = js.native
  @JSName("labelFormatFunction")
  def labelFormatFunction_min(value: Double, `type`: min, index: Double): String = js.native
  @JSName("labelFormatFunction")
  def labelFormatFunction_tick(value: Double, `type`: tick): String = js.native
  @JSName("labelFormatFunction")
  def labelFormatFunction_tick(value: Double, `type`: tick, index: Double): String = js.native
  @JSName("labelFormatFunction")
  def labelFormatFunction_value(value: Double, `type`: value): String = js.native
  @JSName("labelFormatFunction")
  def labelFormatFunction_value(value: Double, `type`: value, index: Double): String = js.native
  
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
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider-SliderViewModel.html#precision)
    */
  var precision: Double = js.native
  
  /**
    * Updates a thumb [value](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider-SliderViewModel.html#values) based on the provided index.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider-SliderViewModel.html#setValue)
    */
  def setValue(index: Double, value: Double): Unit = js.native
  
  /**
    * The state of the view model.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider-SliderViewModel.html#state)
    */
  val state: ready | disabled = js.native
  
  /**
    * When `false`, the user can freely move any slider thumb to any position along the track.
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

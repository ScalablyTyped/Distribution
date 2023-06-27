package typings.arcgisJsApi.anon

import typings.arcgisJsApi.arcgisJsApiStrings.average
import typings.arcgisJsApi.arcgisJsApiStrings.max
import typings.arcgisJsApi.arcgisJsApiStrings.min
import typings.arcgisJsApi.arcgisJsApiStrings.slider
import typings.arcgisJsApi.arcgisJsApiStrings.tick
import typings.arcgisJsApi.arcgisJsApiStrings.value
import typings.arcgisJsApi.esri.SliderLabelFormatter
import typings.arcgisJsApi.esri.ValuePickerSliderVisibleElements
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined arcgis-js-api.__esri.ValuePickerSlider & {  type :'slider'} */
trait ValuePickerSlidertypeslid extends StObject {
  
  /**
  		 * A function used to format labels.
  		 *
  		 * @default null
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ValuePicker-ValuePickerSlider.html#labelFormatFunction)
  		 */
  def labelFormatFunction(value: Double): String
  def labelFormatFunction(value: Double, `type`: average | min | max | tick | value): String
  def labelFormatFunction(value: Double, `type`: average | min | max | tick | value, index: Double): String
  def labelFormatFunction(value: Double, `type`: Unit, index: Double): String
  /**
  		 * A function used to format labels.
  		 *
  		 * @default null
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ValuePicker-ValuePickerSlider.html#labelFormatFunction)
  		 */
  @JSName("labelFormatFunction")
  var labelFormatFunction_Original: SliderLabelFormatter
  
  /**
  		 * Slider tick labels.
  		 *
  		 * @default null
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ValuePicker-ValuePickerSlider.html#labels)
  		 */
  var labels: js.Array[Double]
  
  /**
  		 * The positions of major ticks.
  		 *
  		 * @default null
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ValuePicker-ValuePickerSlider.html#majorTicks)
  		 */
  var majorTicks: js.Array[Double]
  
  /**
  		 * The maximum possible data/thumb value of the slider.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ValuePicker-ValuePickerSlider.html#max)
  		 */
  var max: Double
  
  /**
  		 * The minimum possible data/thumb value on the slider.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ValuePicker-ValuePickerSlider.html#min)
  		 */
  var min: Double
  
  /**
  		 * The positions of minor ticks.
  		 *
  		 * @default null
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ValuePicker-ValuePickerSlider.html#minorTicks)
  		 */
  var minorTicks: js.Array[Double]
  
  /**
  		 * When true, slider values will ascend right to left and bottom to top when horizontal and vertical respectively.
  		 *
  		 * @default false
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ValuePicker-ValuePickerSlider.html#reversed)
  		 */
  var reversed: Double
  
  /**
  		 * Positions along the slider that the thumb will snap to when interacted with.
  		 *
  		 * @default null
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ValuePicker-ValuePickerSlider.html#steps)
  		 */
  var steps: js.Array[Double]
  
  val `type`: slider
  
  /**
  		 * This property provides the ability to display or hide the individual elements of the widget.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ValuePicker-ValuePickerSlider.html#visibleElements)
  		 */
  var visibleElements: ValuePickerSliderVisibleElements
}
object ValuePickerSlidertypeslid {
  
  inline def apply(
    labelFormatFunction: (/* value */ Double, /* type */ js.UndefOr[average | min | max | tick | value], /* index */ js.UndefOr[Double]) => String,
    labels: js.Array[Double],
    majorTicks: js.Array[Double],
    max: Double,
    min: Double,
    minorTicks: js.Array[Double],
    reversed: Double,
    steps: js.Array[Double],
    visibleElements: ValuePickerSliderVisibleElements
  ): ValuePickerSlidertypeslid = {
    val __obj = js.Dynamic.literal(labelFormatFunction = js.Any.fromFunction3(labelFormatFunction), labels = labels.asInstanceOf[js.Any], majorTicks = majorTicks.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], minorTicks = minorTicks.asInstanceOf[js.Any], reversed = reversed.asInstanceOf[js.Any], steps = steps.asInstanceOf[js.Any], visibleElements = visibleElements.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("slider")
    __obj.asInstanceOf[ValuePickerSlidertypeslid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ValuePickerSlidertypeslid] (val x: Self) extends AnyVal {
    
    inline def setLabelFormatFunction(
      value: (/* value */ Double, /* type */ js.UndefOr[average | min | max | tick | value], /* index */ js.UndefOr[Double]) => String
    ): Self = StObject.set(x, "labelFormatFunction", js.Any.fromFunction3(value))
    
    inline def setLabels(value: js.Array[Double]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsVarargs(value: Double*): Self = StObject.set(x, "labels", js.Array(value*))
    
    inline def setMajorTicks(value: js.Array[Double]): Self = StObject.set(x, "majorTicks", value.asInstanceOf[js.Any])
    
    inline def setMajorTicksVarargs(value: Double*): Self = StObject.set(x, "majorTicks", js.Array(value*))
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinorTicks(value: js.Array[Double]): Self = StObject.set(x, "minorTicks", value.asInstanceOf[js.Any])
    
    inline def setMinorTicksVarargs(value: Double*): Self = StObject.set(x, "minorTicks", js.Array(value*))
    
    inline def setReversed(value: Double): Self = StObject.set(x, "reversed", value.asInstanceOf[js.Any])
    
    inline def setSteps(value: js.Array[Double]): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
    
    inline def setStepsVarargs(value: Double*): Self = StObject.set(x, "steps", js.Array(value*))
    
    inline def setType(value: slider): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setVisibleElements(value: ValuePickerSliderVisibleElements): Self = StObject.set(x, "visibleElements", value.asInstanceOf[js.Any])
  }
}

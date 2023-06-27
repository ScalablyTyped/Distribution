package typings.arcgisJsApi

import typings.arcgisJsApi.arcgisJsApiStrings.average
import typings.arcgisJsApi.arcgisJsApiStrings.max
import typings.arcgisJsApi.arcgisJsApiStrings.min
import typings.arcgisJsApi.arcgisJsApiStrings.slider
import typings.arcgisJsApi.arcgisJsApiStrings.tick
import typings.arcgisJsApi.arcgisJsApiStrings.value
import typings.arcgisJsApi.esri.SliderLabelFormatter
import typings.arcgisJsApi.esri.ValuePickerSlider
import typings.arcgisJsApi.esri.ValuePickerSliderVisibleElements
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriWidgetsValuePickerValuePickerSliderMod {
  
  @JSImport("esri/widgets/ValuePicker/ValuePickerSlider", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with ValuePickerSlider {
    def this(properties: Any) = this()
    
    /**
    		 * A function used to format labels.
    		 *
    		 * @default null
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ValuePicker-ValuePickerSlider.html#labelFormatFunction)
    		 */
    /* CompleteClass */
    override def labelFormatFunction(value: Double): String = js.native
    /* CompleteClass */
    override def labelFormatFunction(value: Double, `type`: average | min | max | tick | value): String = js.native
    /* CompleteClass */
    override def labelFormatFunction(value: Double, `type`: average | min | max | tick | value, index: Double): String = js.native
    /* CompleteClass */
    override def labelFormatFunction(value: Double, `type`: Unit, index: Double): String = js.native
    /**
    		 * A function used to format labels.
    		 *
    		 * @default null
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ValuePicker-ValuePickerSlider.html#labelFormatFunction)
    		 */
    /* CompleteClass */
    @JSName("labelFormatFunction")
    var labelFormatFunction_Original: SliderLabelFormatter = js.native
    
    /**
    		 * Slider tick labels.
    		 *
    		 * @default null
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ValuePicker-ValuePickerSlider.html#labels)
    		 */
    /* CompleteClass */
    var labels: js.Array[Double] = js.native
    
    /**
    		 * The positions of major ticks.
    		 *
    		 * @default null
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ValuePicker-ValuePickerSlider.html#majorTicks)
    		 */
    /* CompleteClass */
    var majorTicks: js.Array[Double] = js.native
    
    /**
    		 * The maximum possible data/thumb value of the slider.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ValuePicker-ValuePickerSlider.html#max)
    		 */
    /* CompleteClass */
    var max: Double = js.native
    
    /**
    		 * The minimum possible data/thumb value on the slider.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ValuePicker-ValuePickerSlider.html#min)
    		 */
    /* CompleteClass */
    var min: Double = js.native
    
    /**
    		 * The positions of minor ticks.
    		 *
    		 * @default null
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ValuePicker-ValuePickerSlider.html#minorTicks)
    		 */
    /* CompleteClass */
    var minorTicks: js.Array[Double] = js.native
    
    /**
    		 * When true, slider values will ascend right to left and bottom to top when horizontal and vertical respectively.
    		 *
    		 * @default false
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ValuePicker-ValuePickerSlider.html#reversed)
    		 */
    /* CompleteClass */
    var reversed: Double = js.native
    
    /**
    		 * Positions along the slider that the thumb will snap to when interacted with.
    		 *
    		 * @default null
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ValuePicker-ValuePickerSlider.html#steps)
    		 */
    /* CompleteClass */
    var steps: js.Array[Double] = js.native
    
    /* CompleteClass */
    override val `type`: slider = js.native
    
    /**
    		 * This property provides the ability to display or hide the individual elements of the widget.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ValuePicker-ValuePickerSlider.html#visibleElements)
    		 */
    /* CompleteClass */
    var visibleElements: ValuePickerSliderVisibleElements = js.native
  }
}

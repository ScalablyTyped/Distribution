package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`horizontal-reversed`
import typings.arcgisJsApi.arcgisJsApiStrings.`vertical-reversed`
import typings.arcgisJsApi.arcgisJsApiStrings.average
import typings.arcgisJsApi.arcgisJsApiStrings.horizontal
import typings.arcgisJsApi.arcgisJsApiStrings.max
import typings.arcgisJsApi.arcgisJsApiStrings.min
import typings.arcgisJsApi.arcgisJsApiStrings.thumb
import typings.arcgisJsApi.arcgisJsApiStrings.tick
import typings.arcgisJsApi.arcgisJsApiStrings.value
import typings.arcgisJsApi.arcgisJsApiStrings.vertical
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SliderProperties
  extends StObject
     with WidgetProperties {
  
  /**
    * When `true`, sets the slider to a disabled state so the user cannot interact with it.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#disabled)
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates if the user can drag the segment between thumbs to update thumb positions.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#draggableSegmentsEnabled)
    */
  var draggableSegmentsEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A function that provides the developer with access to the input elements when [rangeLabelInputsEnabled](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#rangeLabelInputsEnabled) and/or [labelInputsEnabled](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#labelInputsEnabled) are set to `true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#inputCreatedFunction)
    */
  var inputCreatedFunction: js.UndefOr[InputCreatedFunction] = js.undefined
  
  /**
    * A function used to format user inputs.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#inputFormatFunction)
    */
  var inputFormatFunction: js.UndefOr[SliderLabelFormatter] = js.undefined
  
  /**
    * Function used to parse slider inputs formatted by the [inputFormatFunction](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#inputFormatFunction).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#inputParseFunction)
    */
  var inputParseFunction: js.UndefOr[InputParser] = js.undefined
  
  /**
    * A function used to format labels.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#labelFormatFunction)
    */
  var labelFormatFunction: js.UndefOr[SliderLabelFormatter] = js.undefined
  
  /**
    * Indicates whether to enable editing input values via keyboard input when the user clicks a label.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#labelInputsEnabled)
    */
  var labelInputsEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether to display labels alongside slider thumbs.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#labelsVisible)
    */
  var labelsVisible: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Determines the layout/orientation of the Slider widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#layout)
    */
  var layout: js.UndefOr[horizontal | `horizontal-reversed` | vertical | `vertical-reversed`] = js.undefined
  
  /**
    * The maximum possible data/thumb value of the slider.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#max)
    */
  var max: js.UndefOr[Double] = js.undefined
  
  /**
    * The minimum possible data/thumb value of the slider.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#min)
    */
  var min: js.UndefOr[Double] = js.undefined
  
  /**
    * Defines how slider thumb values should be rounded.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#precision)
    */
  var precision: js.UndefOr[Double] = js.undefined
  
  /**
    * Indicates whether to enable editing range values via keyboard input when the user clicks a [min](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#min) or [max](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#max) label.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#rangeLabelInputsEnabled)
    */
  var rangeLabelInputsEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether to display [min](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#min) or [max](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#max) range values on the slider.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#rangeLabelsVisible)
    */
  var rangeLabelsVisible: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates if the closest thumb will snap to the clicked location on the track.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#snapOnClickEnabled)
    */
  var snapOnClickEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Sets steps, or intervals, on the slider that restrict user input to specific values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#steps)
    */
  var steps: js.UndefOr[Double | js.Array[Double]] = js.undefined
  
  /**
    * Function that executes each time a thumb is created on the slider.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#thumbCreatedFunction)
    */
  var thumbCreatedFunction: js.UndefOr[ThumbCreatedFunction] = js.undefined
  
  /**
    * When `false`, the user can freely move any slider thumb to any position along the track.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#thumbsConstrained)
    */
  var thumbsConstrained: js.UndefOr[Boolean] = js.undefined
  
  /**
    * When set, renders ticks along the slider track.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#tickConfigs)
    */
  var tickConfigs: js.UndefOr[js.Array[TickConfig]] = js.undefined
  
  /**
    * The HTML Element node representing the slider track.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#trackElement)
    */
  var trackElement: js.UndefOr[HTMLElement] = js.undefined
  
  /**
    * An array of numbers representing absolute thumb positions on the slider.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#values)
    */
  var values: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
    * The view model for the Slider widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#viewModel)
    */
  var viewModel: js.UndefOr[SliderViewModelProperties] = js.undefined
  
  /**
    * The visible elements that are displayed within the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#visibleElements)
    */
  var visibleElements: js.UndefOr[SliderVisibleElements] = js.undefined
}
object SliderProperties {
  
  @scala.inline
  def apply(): SliderProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SliderProperties]
  }
  
  @scala.inline
  implicit class SliderPropertiesMutableBuilder[Self <: SliderProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setDraggableSegmentsEnabled(value: Boolean): Self = StObject.set(x, "draggableSegmentsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDraggableSegmentsEnabledUndefined: Self = StObject.set(x, "draggableSegmentsEnabled", js.undefined)
    
    @scala.inline
    def setInputCreatedFunction(
      value: (/* inputElement */ js.Any, /* type */ max | min | thumb, /* thumbIndex */ js.UndefOr[Double]) => Unit
    ): Self = StObject.set(x, "inputCreatedFunction", js.Any.fromFunction3(value))
    
    @scala.inline
    def setInputCreatedFunctionUndefined: Self = StObject.set(x, "inputCreatedFunction", js.undefined)
    
    @scala.inline
    def setInputFormatFunction(
      value: (/* value */ Double, /* type */ js.UndefOr[average | min | max | tick | value], /* index */ js.UndefOr[Double]) => String
    ): Self = StObject.set(x, "inputFormatFunction", js.Any.fromFunction3(value))
    
    @scala.inline
    def setInputFormatFunctionUndefined: Self = StObject.set(x, "inputFormatFunction", js.undefined)
    
    @scala.inline
    def setInputParseFunction(
      value: (/* value */ String, /* type */ js.UndefOr[average | min | max | tick | value], /* index */ js.UndefOr[Double]) => Double
    ): Self = StObject.set(x, "inputParseFunction", js.Any.fromFunction3(value))
    
    @scala.inline
    def setInputParseFunctionUndefined: Self = StObject.set(x, "inputParseFunction", js.undefined)
    
    @scala.inline
    def setLabelFormatFunction(
      value: (/* value */ Double, /* type */ js.UndefOr[average | min | max | tick | value], /* index */ js.UndefOr[Double]) => String
    ): Self = StObject.set(x, "labelFormatFunction", js.Any.fromFunction3(value))
    
    @scala.inline
    def setLabelFormatFunctionUndefined: Self = StObject.set(x, "labelFormatFunction", js.undefined)
    
    @scala.inline
    def setLabelInputsEnabled(value: Boolean): Self = StObject.set(x, "labelInputsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelInputsEnabledUndefined: Self = StObject.set(x, "labelInputsEnabled", js.undefined)
    
    @scala.inline
    def setLabelsVisible(value: Boolean): Self = StObject.set(x, "labelsVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsVisibleUndefined: Self = StObject.set(x, "labelsVisible", js.undefined)
    
    @scala.inline
    def setLayout(value: horizontal | `horizontal-reversed` | vertical | `vertical-reversed`): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    @scala.inline
    def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    @scala.inline
    def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    @scala.inline
    def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
    
    @scala.inline
    def setRangeLabelInputsEnabled(value: Boolean): Self = StObject.set(x, "rangeLabelInputsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeLabelInputsEnabledUndefined: Self = StObject.set(x, "rangeLabelInputsEnabled", js.undefined)
    
    @scala.inline
    def setRangeLabelsVisible(value: Boolean): Self = StObject.set(x, "rangeLabelsVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeLabelsVisibleUndefined: Self = StObject.set(x, "rangeLabelsVisible", js.undefined)
    
    @scala.inline
    def setSnapOnClickEnabled(value: Boolean): Self = StObject.set(x, "snapOnClickEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapOnClickEnabledUndefined: Self = StObject.set(x, "snapOnClickEnabled", js.undefined)
    
    @scala.inline
    def setSteps(value: Double | js.Array[Double]): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepsUndefined: Self = StObject.set(x, "steps", js.undefined)
    
    @scala.inline
    def setStepsVarargs(value: Double*): Self = StObject.set(x, "steps", js.Array(value :_*))
    
    @scala.inline
    def setThumbCreatedFunction(
      value: (/* index */ Double, /* value */ Double, /* thumbElement */ HTMLElement, /* labelElement */ js.UndefOr[HTMLElement]) => Unit
    ): Self = StObject.set(x, "thumbCreatedFunction", js.Any.fromFunction4(value))
    
    @scala.inline
    def setThumbCreatedFunctionUndefined: Self = StObject.set(x, "thumbCreatedFunction", js.undefined)
    
    @scala.inline
    def setThumbsConstrained(value: Boolean): Self = StObject.set(x, "thumbsConstrained", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbsConstrainedUndefined: Self = StObject.set(x, "thumbsConstrained", js.undefined)
    
    @scala.inline
    def setTickConfigs(value: js.Array[TickConfig]): Self = StObject.set(x, "tickConfigs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTickConfigsUndefined: Self = StObject.set(x, "tickConfigs", js.undefined)
    
    @scala.inline
    def setTickConfigsVarargs(value: TickConfig*): Self = StObject.set(x, "tickConfigs", js.Array(value :_*))
    
    @scala.inline
    def setTrackElement(value: HTMLElement): Self = StObject.set(x, "trackElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrackElementUndefined: Self = StObject.set(x, "trackElement", js.undefined)
    
    @scala.inline
    def setValues(value: js.Array[Double]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: Double*): Self = StObject.set(x, "values", js.Array(value :_*))
    
    @scala.inline
    def setViewModel(value: SliderViewModelProperties): Self = StObject.set(x, "viewModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewModelUndefined: Self = StObject.set(x, "viewModel", js.undefined)
    
    @scala.inline
    def setVisibleElements(value: SliderVisibleElements): Self = StObject.set(x, "visibleElements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleElementsUndefined: Self = StObject.set(x, "visibleElements", js.undefined)
  }
}

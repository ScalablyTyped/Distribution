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
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#disabled)
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates if the user can drag the segment between thumbs to update thumb positions.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#draggableSegmentsEnabled)
    */
  var draggableSegmentsEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * When set, the user is restricted from moving slider thumbs to positions higher than this value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#effectiveMax)
    */
  var effectiveMax: js.UndefOr[Double] = js.undefined
  
  /**
    * When set, the user is restricted from moving slider thumbs to positions less than this value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#effectiveMin)
    */
  var effectiveMin: js.UndefOr[Double] = js.undefined
  
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
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#labelInputsEnabled)
    */
  var labelInputsEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Determines the layout/orientation of the Slider widget.
    *
    * @default horizontal
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
    * @default 4
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#precision)
    */
  var precision: js.UndefOr[Double] = js.undefined
  
  /**
    * Indicates whether to enable editing range values via keyboard input when the user clicks a [min](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#min) or [max](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#max) label.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#rangeLabelInputsEnabled)
    */
  var rangeLabelInputsEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates if the closest thumb will snap to the clicked location on the track.
    *
    * @default true
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
    * When `true`, all segments will sync together in updating thumb values when the user drags any segment.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#syncedSegmentsEnabled)
    */
  var syncedSegmentsEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Function that executes each time a thumb is created on the slider.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#thumbCreatedFunction)
    */
  var thumbCreatedFunction: js.UndefOr[ThumbCreatedFunction] = js.undefined
  
  /**
    * When `false`, the user can freely move any slider thumb to any position along the track.
    *
    * @default true
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
  
  inline def apply(): SliderProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SliderProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SliderProperties] (val x: Self) extends AnyVal {
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setDraggableSegmentsEnabled(value: Boolean): Self = StObject.set(x, "draggableSegmentsEnabled", value.asInstanceOf[js.Any])
    
    inline def setDraggableSegmentsEnabledUndefined: Self = StObject.set(x, "draggableSegmentsEnabled", js.undefined)
    
    inline def setEffectiveMax(value: Double): Self = StObject.set(x, "effectiveMax", value.asInstanceOf[js.Any])
    
    inline def setEffectiveMaxUndefined: Self = StObject.set(x, "effectiveMax", js.undefined)
    
    inline def setEffectiveMin(value: Double): Self = StObject.set(x, "effectiveMin", value.asInstanceOf[js.Any])
    
    inline def setEffectiveMinUndefined: Self = StObject.set(x, "effectiveMin", js.undefined)
    
    inline def setInputCreatedFunction(
      value: (/* inputElement */ Any, /* type */ max | min | thumb, /* thumbIndex */ js.UndefOr[Double]) => scala.Unit
    ): Self = StObject.set(x, "inputCreatedFunction", js.Any.fromFunction3(value))
    
    inline def setInputCreatedFunctionUndefined: Self = StObject.set(x, "inputCreatedFunction", js.undefined)
    
    inline def setInputFormatFunction(
      value: (/* value */ Double, /* type */ js.UndefOr[average | min | max | tick | value], /* index */ js.UndefOr[Double]) => String
    ): Self = StObject.set(x, "inputFormatFunction", js.Any.fromFunction3(value))
    
    inline def setInputFormatFunctionUndefined: Self = StObject.set(x, "inputFormatFunction", js.undefined)
    
    inline def setInputParseFunction(
      value: (/* value */ String, /* type */ js.UndefOr[average | min | max | tick | value], /* index */ js.UndefOr[Double]) => Double
    ): Self = StObject.set(x, "inputParseFunction", js.Any.fromFunction3(value))
    
    inline def setInputParseFunctionUndefined: Self = StObject.set(x, "inputParseFunction", js.undefined)
    
    inline def setLabelFormatFunction(
      value: (/* value */ Double, /* type */ js.UndefOr[average | min | max | tick | value], /* index */ js.UndefOr[Double]) => String
    ): Self = StObject.set(x, "labelFormatFunction", js.Any.fromFunction3(value))
    
    inline def setLabelFormatFunctionUndefined: Self = StObject.set(x, "labelFormatFunction", js.undefined)
    
    inline def setLabelInputsEnabled(value: Boolean): Self = StObject.set(x, "labelInputsEnabled", value.asInstanceOf[js.Any])
    
    inline def setLabelInputsEnabledUndefined: Self = StObject.set(x, "labelInputsEnabled", js.undefined)
    
    inline def setLayout(value: horizontal | `horizontal-reversed` | vertical | `vertical-reversed`): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
    
    inline def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
    
    inline def setRangeLabelInputsEnabled(value: Boolean): Self = StObject.set(x, "rangeLabelInputsEnabled", value.asInstanceOf[js.Any])
    
    inline def setRangeLabelInputsEnabledUndefined: Self = StObject.set(x, "rangeLabelInputsEnabled", js.undefined)
    
    inline def setSnapOnClickEnabled(value: Boolean): Self = StObject.set(x, "snapOnClickEnabled", value.asInstanceOf[js.Any])
    
    inline def setSnapOnClickEnabledUndefined: Self = StObject.set(x, "snapOnClickEnabled", js.undefined)
    
    inline def setSteps(value: Double | js.Array[Double]): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
    
    inline def setStepsUndefined: Self = StObject.set(x, "steps", js.undefined)
    
    inline def setStepsVarargs(value: Double*): Self = StObject.set(x, "steps", js.Array(value*))
    
    inline def setSyncedSegmentsEnabled(value: Boolean): Self = StObject.set(x, "syncedSegmentsEnabled", value.asInstanceOf[js.Any])
    
    inline def setSyncedSegmentsEnabledUndefined: Self = StObject.set(x, "syncedSegmentsEnabled", js.undefined)
    
    inline def setThumbCreatedFunction(
      value: (/* index */ Double, /* value */ Double, /* thumbElement */ HTMLElement, /* labelElement */ js.UndefOr[HTMLElement]) => scala.Unit
    ): Self = StObject.set(x, "thumbCreatedFunction", js.Any.fromFunction4(value))
    
    inline def setThumbCreatedFunctionUndefined: Self = StObject.set(x, "thumbCreatedFunction", js.undefined)
    
    inline def setThumbsConstrained(value: Boolean): Self = StObject.set(x, "thumbsConstrained", value.asInstanceOf[js.Any])
    
    inline def setThumbsConstrainedUndefined: Self = StObject.set(x, "thumbsConstrained", js.undefined)
    
    inline def setTickConfigs(value: js.Array[TickConfig]): Self = StObject.set(x, "tickConfigs", value.asInstanceOf[js.Any])
    
    inline def setTickConfigsUndefined: Self = StObject.set(x, "tickConfigs", js.undefined)
    
    inline def setTickConfigsVarargs(value: TickConfig*): Self = StObject.set(x, "tickConfigs", js.Array(value*))
    
    inline def setTrackElement(value: HTMLElement): Self = StObject.set(x, "trackElement", value.asInstanceOf[js.Any])
    
    inline def setTrackElementUndefined: Self = StObject.set(x, "trackElement", js.undefined)
    
    inline def setValues(value: js.Array[Double]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: Double*): Self = StObject.set(x, "values", js.Array(value*))
    
    inline def setViewModel(value: SliderViewModelProperties): Self = StObject.set(x, "viewModel", value.asInstanceOf[js.Any])
    
    inline def setViewModelUndefined: Self = StObject.set(x, "viewModel", js.undefined)
    
    inline def setVisibleElements(value: SliderVisibleElements): Self = StObject.set(x, "visibleElements", value.asInstanceOf[js.Any])
    
    inline def setVisibleElementsUndefined: Self = StObject.set(x, "visibleElements", js.undefined)
  }
}

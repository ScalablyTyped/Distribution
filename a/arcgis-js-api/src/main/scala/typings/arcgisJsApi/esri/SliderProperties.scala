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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SliderProperties extends WidgetProperties {
  
  /**
    * When `true`, sets the slider to a disabled state so the user cannot interact with it.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#disabled)
    */
  var disabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates if the user can drag the segment between thumbs to update thumb positions.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#draggableSegmentsEnabled)
    */
  var draggableSegmentsEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * A function that provides the developer with access to the input elements when [rangeLabelInputsEnabled](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#rangeLabelInputsEnabled) and/or [labelInputsEnabled](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#labelInputsEnabled) are set to `true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#inputCreatedFunction)
    */
  var inputCreatedFunction: js.UndefOr[InputCreatedFunction] = js.native
  
  /**
    * A function used to format user inputs.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#inputFormatFunction)
    */
  var inputFormatFunction: js.UndefOr[SliderLabelFormatter] = js.native
  
  /**
    * Function used to parse slider inputs formatted by the [inputFormatFunction](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#inputFormatFunction).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#inputParseFunction)
    */
  var inputParseFunction: js.UndefOr[InputParser] = js.native
  
  /**
    * A function used to format labels.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#labelFormatFunction)
    */
  var labelFormatFunction: js.UndefOr[SliderLabelFormatter] = js.native
  
  /**
    * Indicates whether to enable editing input values via keyboard input when the user clicks a label.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#labelInputsEnabled)
    */
  var labelInputsEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates whether to display labels alongside slider thumbs.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#labelsVisible)
    */
  var labelsVisible: js.UndefOr[Boolean] = js.native
  
  /**
    * Determines the layout/orientation of the Slider widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#layout)
    */
  var layout: js.UndefOr[horizontal | `horizontal-reversed` | vertical | `vertical-reversed`] = js.native
  
  /**
    * The maximum possible data/thumb value of the slider.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#max)
    */
  var max: js.UndefOr[Double] = js.native
  
  /**
    * The minimum possible data/thumb value of the slider.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#min)
    */
  var min: js.UndefOr[Double] = js.native
  
  /**
    * Defines how slider thumb values should be rounded.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#precision)
    */
  var precision: js.UndefOr[Double] = js.native
  
  /**
    * Indicates whether to enable editing range values via keyboard input when the user clicks a [min](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#min) or [max](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#max) label.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#rangeLabelInputsEnabled)
    */
  var rangeLabelInputsEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates whether to display [min](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#min) or [max](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#max) range values on the slider.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#rangeLabelsVisible)
    */
  var rangeLabelsVisible: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates if the closest thumb will snap to the clicked location on the track.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#snapOnClickEnabled)
    */
  var snapOnClickEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Sets steps, or intervals, on the slider that restrict user input to specific values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#steps)
    */
  var steps: js.UndefOr[Double | js.Array[Double]] = js.native
  
  /**
    * Function that executes each time a thumb is created on the slider.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#thumbCreatedFunction)
    */
  var thumbCreatedFunction: js.UndefOr[ThumbCreatedFunction] = js.native
  
  /**
    * When `false`, the user can freely move any slider thumb to any position along the track.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#thumbsConstrained)
    */
  var thumbsConstrained: js.UndefOr[Boolean] = js.native
  
  /**
    * When set, renders ticks along the slider track.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#tickConfigs)
    */
  var tickConfigs: js.UndefOr[js.Array[TickConfig]] = js.native
  
  /**
    * The HTML Element node representing the slider track.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#trackElement)
    */
  var trackElement: js.UndefOr[HTMLElement] = js.native
  
  /**
    * An array of numbers representing absolute thumb positions on the slider.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#values)
    */
  var values: js.UndefOr[js.Array[Double]] = js.native
  
  /**
    * The view model for the Slider widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#viewModel)
    */
  var viewModel: js.UndefOr[SliderViewModelProperties] = js.native
  
  /**
    * The visible elements that are displayed within the widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#visibleElements)
    */
  var visibleElements: js.UndefOr[SliderVisibleElements] = js.native
}
object SliderProperties {
  
  @scala.inline
  def apply(): SliderProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SliderProperties]
  }
  
  @scala.inline
  implicit class SliderPropertiesOps[Self <: SliderProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setDraggableSegmentsEnabled(value: Boolean): Self = this.set("draggableSegmentsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDraggableSegmentsEnabled: Self = this.set("draggableSegmentsEnabled", js.undefined)
    
    @scala.inline
    def setInputCreatedFunction(
      value: (/* inputElement */ js.Any, /* type */ max | min | thumb, /* thumbIndex */ js.UndefOr[Double]) => Unit
    ): Self = this.set("inputCreatedFunction", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteInputCreatedFunction: Self = this.set("inputCreatedFunction", js.undefined)
    
    @scala.inline
    def setInputFormatFunction(
      value: (/* value */ Double, /* type */ js.UndefOr[average | min | max | tick | value], /* index */ js.UndefOr[Double]) => String
    ): Self = this.set("inputFormatFunction", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteInputFormatFunction: Self = this.set("inputFormatFunction", js.undefined)
    
    @scala.inline
    def setInputParseFunction(
      value: (/* value */ String, /* type */ js.UndefOr[average | min | max | tick | value], /* index */ js.UndefOr[Double]) => Double
    ): Self = this.set("inputParseFunction", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteInputParseFunction: Self = this.set("inputParseFunction", js.undefined)
    
    @scala.inline
    def setLabelFormatFunction(
      value: (/* value */ Double, /* type */ js.UndefOr[average | min | max | tick | value], /* index */ js.UndefOr[Double]) => String
    ): Self = this.set("labelFormatFunction", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteLabelFormatFunction: Self = this.set("labelFormatFunction", js.undefined)
    
    @scala.inline
    def setLabelInputsEnabled(value: Boolean): Self = this.set("labelInputsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelInputsEnabled: Self = this.set("labelInputsEnabled", js.undefined)
    
    @scala.inline
    def setLabelsVisible(value: Boolean): Self = this.set("labelsVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelsVisible: Self = this.set("labelsVisible", js.undefined)
    
    @scala.inline
    def setLayout(value: horizontal | `horizontal-reversed` | vertical | `vertical-reversed`): Self = this.set("layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLayout: Self = this.set("layout", js.undefined)
    
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    
    @scala.inline
    def setPrecision(value: Double): Self = this.set("precision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrecision: Self = this.set("precision", js.undefined)
    
    @scala.inline
    def setRangeLabelInputsEnabled(value: Boolean): Self = this.set("rangeLabelInputsEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRangeLabelInputsEnabled: Self = this.set("rangeLabelInputsEnabled", js.undefined)
    
    @scala.inline
    def setRangeLabelsVisible(value: Boolean): Self = this.set("rangeLabelsVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRangeLabelsVisible: Self = this.set("rangeLabelsVisible", js.undefined)
    
    @scala.inline
    def setSnapOnClickEnabled(value: Boolean): Self = this.set("snapOnClickEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnapOnClickEnabled: Self = this.set("snapOnClickEnabled", js.undefined)
    
    @scala.inline
    def setStepsVarargs(value: Double*): Self = this.set("steps", js.Array(value :_*))
    
    @scala.inline
    def setSteps(value: Double | js.Array[Double]): Self = this.set("steps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSteps: Self = this.set("steps", js.undefined)
    
    @scala.inline
    def setThumbCreatedFunction(
      value: (/* index */ Double, /* value */ Double, /* thumbElement */ HTMLElement, /* labelElement */ js.UndefOr[HTMLElement]) => Unit
    ): Self = this.set("thumbCreatedFunction", js.Any.fromFunction4(value))
    
    @scala.inline
    def deleteThumbCreatedFunction: Self = this.set("thumbCreatedFunction", js.undefined)
    
    @scala.inline
    def setThumbsConstrained(value: Boolean): Self = this.set("thumbsConstrained", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThumbsConstrained: Self = this.set("thumbsConstrained", js.undefined)
    
    @scala.inline
    def setTickConfigsVarargs(value: TickConfig*): Self = this.set("tickConfigs", js.Array(value :_*))
    
    @scala.inline
    def setTickConfigs(value: js.Array[TickConfig]): Self = this.set("tickConfigs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTickConfigs: Self = this.set("tickConfigs", js.undefined)
    
    @scala.inline
    def setTrackElement(value: HTMLElement): Self = this.set("trackElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrackElement: Self = this.set("trackElement", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: Double*): Self = this.set("values", js.Array(value :_*))
    
    @scala.inline
    def setValues(value: js.Array[Double]): Self = this.set("values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValues: Self = this.set("values", js.undefined)
    
    @scala.inline
    def setViewModel(value: SliderViewModelProperties): Self = this.set("viewModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViewModel: Self = this.set("viewModel", js.undefined)
    
    @scala.inline
    def setVisibleElements(value: SliderVisibleElements): Self = this.set("visibleElements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisibleElements: Self = this.set("visibleElements", js.undefined)
  }
}

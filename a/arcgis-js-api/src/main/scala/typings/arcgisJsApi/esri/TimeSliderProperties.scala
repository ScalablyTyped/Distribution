package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`cumulative-from-end`
import typings.arcgisJsApi.arcgisJsApiStrings.`cumulative-from-start`
import typings.arcgisJsApi.arcgisJsApiStrings.`time-window`
import typings.arcgisJsApi.arcgisJsApiStrings.auto
import typings.arcgisJsApi.arcgisJsApiStrings.compact
import typings.arcgisJsApi.arcgisJsApiStrings.extent
import typings.arcgisJsApi.arcgisJsApiStrings.instant
import typings.arcgisJsApi.arcgisJsApiStrings.max
import typings.arcgisJsApi.arcgisJsApiStrings.min
import typings.arcgisJsApi.arcgisJsApiStrings.wide
import typings.std.Date
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TimeSliderProperties extends WidgetProperties {
  
  /**
    * When `true`, sets the widget to a disabled state so the user cannot interact with it.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider.html#disabled)
    */
  var disabled: js.UndefOr[Boolean] = js.native
  
  /**
    * The temporal extent of the entire slider.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider.html#fullTimeExtent)
    */
  var fullTimeExtent: js.UndefOr[TimeExtentProperties] = js.native
  
  /**
    * A function used to specify custom formatting and styling of the min, max, and extent labels of the TimeSlider.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider.html#labelFormatFunction)
    */
  var labelFormatFunction: js.UndefOr[DateLabelFormatter] = js.native
  
  /**
    * Determines the layout used by the TimeSlider widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider.html#layout)
    */
  var layout: js.UndefOr[auto | compact | wide] = js.native
  
  /**
    * When `true`, the time slider will play its animation in a loop.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider.html#loop)
    */
  var loop: js.UndefOr[Boolean] = js.native
  
  /**
    * The time slider mode.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider.html#mode)
    */
  var mode: js.UndefOr[instant | `time-window` | `cumulative-from-start` | `cumulative-from-end`] = js.native
  
  /**
    * The time (in milliseconds) between animation steps.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider.html#playRate)
    */
  var playRate: js.UndefOr[Double] = js.native
  
  /**
    * Defines specific locations on the time slider where thumbs will snap to when manipulated.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider.html#stops)
    */
  var stops: js.UndefOr[StopsByDates | StopsByCount | StopsByInterval] = js.native
  
  /**
    * When set, overrides the default TimeSlider ticks labelling system.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider.html#tickConfigs)
    */
  var tickConfigs: js.UndefOr[js.Array[TickConfig]] = js.native
  
  /**
    * Shows/hides time in the display.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider.html#timeVisible)
    */
  var timeVisible: js.UndefOr[Boolean] = js.native
  
  /**
    * The user defined time extent.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider.html#values)
    */
  var values: js.UndefOr[js.Array[DateProperties]] = js.native
  
  /**
    * A reference to the [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider.html#view)
    */
  var view: js.UndefOr[MapViewProperties | SceneViewProperties] = js.native
  
  /**
    * The view model for this widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TimeSlider.html#viewModel)
    */
  var viewModel: js.UndefOr[TimeSliderViewModelProperties] = js.native
}
object TimeSliderProperties {
  
  @scala.inline
  def apply(): TimeSliderProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeSliderProperties]
  }
  
  @scala.inline
  implicit class TimeSliderPropertiesMutableBuilder[Self <: TimeSliderProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setFullTimeExtent(value: TimeExtentProperties): Self = StObject.set(x, "fullTimeExtent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullTimeExtentUndefined: Self = StObject.set(x, "fullTimeExtent", js.undefined)
    
    @scala.inline
    def setLabelFormatFunction(
      value: (/* value */ Date | js.Array[Date], /* type */ js.UndefOr[min | max | extent], /* element */ js.UndefOr[HTMLElement], /* layout */ js.UndefOr[compact | wide]) => Unit
    ): Self = StObject.set(x, "labelFormatFunction", js.Any.fromFunction4(value))
    
    @scala.inline
    def setLabelFormatFunctionUndefined: Self = StObject.set(x, "labelFormatFunction", js.undefined)
    
    @scala.inline
    def setLayout(value: auto | compact | wide): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    @scala.inline
    def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
    
    @scala.inline
    def setMode(value: instant | `time-window` | `cumulative-from-start` | `cumulative-from-end`): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    @scala.inline
    def setPlayRate(value: Double): Self = StObject.set(x, "playRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlayRateUndefined: Self = StObject.set(x, "playRate", js.undefined)
    
    @scala.inline
    def setStops(value: StopsByDates | StopsByCount | StopsByInterval): Self = StObject.set(x, "stops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStopsUndefined: Self = StObject.set(x, "stops", js.undefined)
    
    @scala.inline
    def setTickConfigs(value: js.Array[TickConfig]): Self = StObject.set(x, "tickConfigs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTickConfigsUndefined: Self = StObject.set(x, "tickConfigs", js.undefined)
    
    @scala.inline
    def setTickConfigsVarargs(value: TickConfig*): Self = StObject.set(x, "tickConfigs", js.Array(value :_*))
    
    @scala.inline
    def setTimeVisible(value: Boolean): Self = StObject.set(x, "timeVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeVisibleUndefined: Self = StObject.set(x, "timeVisible", js.undefined)
    
    @scala.inline
    def setValues(value: js.Array[DateProperties]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: DateProperties*): Self = StObject.set(x, "values", js.Array(value :_*))
    
    @scala.inline
    def setView(value: MapViewProperties | SceneViewProperties): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewModel(value: TimeSliderViewModelProperties): Self = StObject.set(x, "viewModel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewModelUndefined: Self = StObject.set(x, "viewModel", js.undefined)
    
    @scala.inline
    def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
  }
}

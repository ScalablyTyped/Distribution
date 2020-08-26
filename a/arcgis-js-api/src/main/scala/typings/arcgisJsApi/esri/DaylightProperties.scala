package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.date
import typings.arcgisJsApi.arcgisJsApiStrings.season
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DaylightProperties extends WidgetProperties {
  /**
    * Controls whether the widget displays a date or a season picker. When the date picker is set, the user selects the date from a calendar. The season picker allows the user to choose a season from a drop-down list. Each season uses a fixed date corresponding to the equinoxes and solstices of 2014.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Daylight.html#dateOrSeason)
    *
    * @default "date"
    */
  var dateOrSeason: js.UndefOr[season | date] = js.native
  /**
    * Controls the speed of the daytime and date animation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Daylight.html#playSpeedMultiplier)
    *
    * @default 1.0
    */
  var playSpeedMultiplier: js.UndefOr[Double] = js.native
  /**
    * Sets steps, or intervals, on the time slider to restrict the times of the day that can be selected when dragging the thumb. All values are in minutes, where `0` is midnight and `23 * 60 + 59` is just before midnight the following day.  If an array of numbers is passed to this property, the slider thumbs may only be moved to the times specified in the array.  If a single number is set, then steps are set for the entire day at an interval of `timeSliderSteps` minutes. For example, if a value of `60` is set here, dragging the slider will allow selecting each of 24 hours of the day.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Daylight.html#timeSliderSteps)
    *
    * @default 5
    */
  var timeSliderSteps: js.UndefOr[Double | js.Array[Double]] = js.native
  /**
    * A reference to the [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). Set this to link the widget to a specific view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Daylight.html#view)
    */
  var view: js.UndefOr[SceneViewProperties] = js.native
  /**
    * The view model for the Daylight widget. This is a class that contains all the logic (properties and methods) that controls this widget's behavior. See the [DaylightViewModel](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Daylight-DaylightViewModel.html) class.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Daylight.html#viewModel)
    */
  var viewModel: js.UndefOr[DaylightViewModelProperties] = js.native
  /**
    * This property provides the ability to display or hide the individual elements of the widget. Play buttons, shadow toggle button, date picker and timezone selector can be displayed or hidden by setting their corresponding properties to `true` or `false`. By default, all the elements are displayed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Daylight.html#visibleElements)
    */
  var visibleElements: js.UndefOr[DaylightVisibleElements] = js.native
}

object DaylightProperties {
  @scala.inline
  def apply(): DaylightProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DaylightProperties]
  }
  @scala.inline
  implicit class DaylightPropertiesOps[Self <: DaylightProperties] (val x: Self) extends AnyVal {
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
    def setDateOrSeason(value: season | date): Self = this.set("dateOrSeason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDateOrSeason: Self = this.set("dateOrSeason", js.undefined)
    @scala.inline
    def setPlaySpeedMultiplier(value: Double): Self = this.set("playSpeedMultiplier", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaySpeedMultiplier: Self = this.set("playSpeedMultiplier", js.undefined)
    @scala.inline
    def setTimeSliderStepsVarargs(value: Double*): Self = this.set("timeSliderSteps", js.Array(value :_*))
    @scala.inline
    def setTimeSliderSteps(value: Double | js.Array[Double]): Self = this.set("timeSliderSteps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeSliderSteps: Self = this.set("timeSliderSteps", js.undefined)
    @scala.inline
    def setView(value: SceneViewProperties): Self = this.set("view", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteView: Self = this.set("view", js.undefined)
    @scala.inline
    def setViewModel(value: DaylightViewModelProperties): Self = this.set("viewModel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteViewModel: Self = this.set("viewModel", js.undefined)
    @scala.inline
    def setVisibleElements(value: DaylightVisibleElements): Self = this.set("visibleElements", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisibleElements: Self = this.set("visibleElements", js.undefined)
  }
  
}


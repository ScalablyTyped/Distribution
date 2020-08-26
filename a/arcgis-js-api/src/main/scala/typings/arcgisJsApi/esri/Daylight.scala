package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.date
import typings.arcgisJsApi.arcgisJsApiStrings.season
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Daylight extends Widget_ {
  /**
    * Controls whether the widget displays a date or a season picker. When the date picker is set, the user selects the date from a calendar. The season picker allows the user to choose a season from a drop-down list. Each season uses a fixed date corresponding to the equinoxes and solstices of 2014.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Daylight.html#dateOrSeason)
    *
    * @default "date"
    */
  var dateOrSeason: season | date = js.native
  /**
    * Controls the speed of the daytime and date animation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Daylight.html#playSpeedMultiplier)
    *
    * @default 1.0
    */
  var playSpeedMultiplier: Double = js.native
  /**
    * Sets steps, or intervals, on the time slider to restrict the times of the day that can be selected when dragging the thumb. All values are in minutes, where `0` is midnight and `23 * 60 + 59` is just before midnight the following day.  If an array of numbers is passed to this property, the slider thumbs may only be moved to the times specified in the array.  If a single number is set, then steps are set for the entire day at an interval of `timeSliderSteps` minutes. For example, if a value of `60` is set here, dragging the slider will allow selecting each of 24 hours of the day.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Daylight.html#timeSliderSteps)
    *
    * @default 5
    */
  var timeSliderSteps: Double | js.Array[Double] = js.native
  /**
    * A reference to the [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). Set this to link the widget to a specific view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Daylight.html#view)
    */
  var view: SceneView = js.native
  /**
    * The view model for the Daylight widget. This is a class that contains all the logic (properties and methods) that controls this widget's behavior. See the [DaylightViewModel](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Daylight-DaylightViewModel.html) class.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Daylight.html#viewModel)
    */
  var viewModel: DaylightViewModel = js.native
  /**
    * This property provides the ability to display or hide the individual elements of the widget. Play buttons, shadow toggle button, date picker and timezone selector can be displayed or hidden by setting their corresponding properties to `true` or `false`. By default, all the elements are displayed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Daylight.html#visibleElements)
    */
  var visibleElements: DaylightVisibleElements = js.native
}


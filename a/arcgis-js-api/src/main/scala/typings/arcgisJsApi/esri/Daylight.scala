package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.TopLevel
import typings.arcgisJsApi.arcgisJsApiStrings.date
import typings.arcgisJsApi.arcgisJsApiStrings.season
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Daylight extends Widget_ {
  /**
    * Controls whether the widget displays a date or a season picker. When the date picker is set, the user selects the date from a calendar. The season picker allows the user to choose a season from a drop-down list. Each season uses a fixed date corresponding to the Northern equinoxes and solstices.
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

@JSGlobal("__esri.Daylight")
@js.native
object Daylight extends TopLevel[DaylightConstructor]


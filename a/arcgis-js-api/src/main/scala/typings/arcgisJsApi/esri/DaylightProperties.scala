package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.date
import typings.arcgisJsApi.arcgisJsApiStrings.season
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DaylightProperties extends WidgetProperties {
  /**
    * Controls whether the widget displays a date or a season picker. When the date picker is set, the user selects the date from a calendar. The season picker allows the user to choose a season from a drop-down list. Each season uses a fixed date corresponding to the Northern equinoxes and solstices.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Daylight.html#dateOrSeason)
    *
    * @default "date"
    */
  var dateOrSeason: js.UndefOr[season | date] = js.undefined
  /**
    * Controls the speed of the daytime and date animation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Daylight.html#playSpeedMultiplier)
    *
    * @default 1.0
    */
  var playSpeedMultiplier: js.UndefOr[Double] = js.undefined
  /**
    * A reference to the [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html). Set this to link the widget to a specific view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Daylight.html#view)
    */
  var view: js.UndefOr[SceneViewProperties] = js.undefined
  /**
    * The view model for the Daylight widget. This is a class that contains all the logic (properties and methods) that controls this widget's behavior. See the [DaylightViewModel](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Daylight-DaylightViewModel.html) class.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Daylight.html#viewModel)
    */
  var viewModel: js.UndefOr[DaylightViewModelProperties] = js.undefined
  /**
    * This property provides the ability to display or hide the individual elements of the widget. Play buttons, shadow toggle button, date picker and timezone selector can be displayed or hidden by setting their corresponding properties to `true` or `false`. By default, all the elements are displayed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Daylight.html#visibleElements)
    */
  var visibleElements: js.UndefOr[DaylightVisibleElements] = js.undefined
}

object DaylightProperties {
  @scala.inline
  def apply(
    container: String | HTMLElement = null,
    dateOrSeason: season | date = null,
    destroyed: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    label: String = null,
    playSpeedMultiplier: js.UndefOr[Double] = js.undefined,
    view: SceneViewProperties = null,
    viewModel: DaylightViewModelProperties = null,
    visibleElements: DaylightVisibleElements = null
  ): DaylightProperties = {
    val __obj = js.Dynamic.literal()
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (dateOrSeason != null) __obj.updateDynamic("dateOrSeason")(dateOrSeason.asInstanceOf[js.Any])
    if (!js.isUndefined(destroyed)) __obj.updateDynamic("destroyed")(destroyed.get.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (!js.isUndefined(playSpeedMultiplier)) __obj.updateDynamic("playSpeedMultiplier")(playSpeedMultiplier.get.asInstanceOf[js.Any])
    if (view != null) __obj.updateDynamic("view")(view.asInstanceOf[js.Any])
    if (viewModel != null) __obj.updateDynamic("viewModel")(viewModel.asInstanceOf[js.Any])
    if (visibleElements != null) __obj.updateDynamic("visibleElements")(visibleElements.asInstanceOf[js.Any])
    __obj.asInstanceOf[DaylightProperties]
  }
}


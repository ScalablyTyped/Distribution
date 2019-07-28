package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrintViewModelProperties extends js.Object {
  /**
    * The URL of the REST endpoint of the Export Web Map Task.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print-PrintViewModel.html#printServiceUrl)
    */
  var printServiceUrl: js.UndefOr[String] = js.undefined
  /**
    * When `true`, scale is used in the printed map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print-PrintViewModel.html#scaleEnabled)
    *
    * @default false
    */
  var scaleEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * The time interval in milliseconds between each job status request sent to an asynchronous GP task.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print-PrintViewModel.html#updateDelay)
    *
    * @default 1000
    */
  var updateDelay: js.UndefOr[Double] = js.undefined
  /**
    * The view from which the widget will operate.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print-PrintViewModel.html#view)
    */
  var view: js.UndefOr[MapViewProperties] = js.undefined
}

object PrintViewModelProperties {
  @scala.inline
  def apply(
    printServiceUrl: String = null,
    scaleEnabled: js.UndefOr[Boolean] = js.undefined,
    updateDelay: Int | Double = null,
    view: MapViewProperties = null
  ): PrintViewModelProperties = {
    val __obj = js.Dynamic.literal()
    if (printServiceUrl != null) __obj.updateDynamic("printServiceUrl")(printServiceUrl)
    if (!js.isUndefined(scaleEnabled)) __obj.updateDynamic("scaleEnabled")(scaleEnabled)
    if (updateDelay != null) __obj.updateDynamic("updateDelay")(updateDelay.asInstanceOf[js.Any])
    if (view != null) __obj.updateDynamic("view")(view)
    __obj.asInstanceOf[PrintViewModelProperties]
  }
}


package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrintViewModelProperties extends js.Object {
  /**
    * Specify the print output file format(s) that the user can select based on the options available from the print service. This property can take a string value or an array of string values.  When this value is "all" (default value), all the print service formats are available to be used. When an array of string values is used, only those values that match the options available from the print service will be used. If none of the input string values match those available from the print service, `allowedFormats` will fallback to default behavior.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print-PrintViewModel.html#allowedFormats)
    *
    * @default "all"
    */
  var allowedFormats: js.UndefOr[String | js.Array[String]] = js.undefined
  /**
    * Specify the print output layout(s) that the user can select based on the options available from the print service. This property can take a string value or an array of string values.  When this value is "all" (default value), all the print service layouts are available to be used. When an array of string values is used, only those values that match the options available from the print service will be used. If none of the input string values match those available from the print service, `allowedLayouts` will fallback to default behavior.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print-PrintViewModel.html#allowedLayouts)
    *
    * @default "all"
    */
  var allowedLayouts: js.UndefOr[String | js.Array[String]] = js.undefined
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
    allowedFormats: String | js.Array[String] = null,
    allowedLayouts: String | js.Array[String] = null,
    printServiceUrl: String = null,
    scaleEnabled: js.UndefOr[Boolean] = js.undefined,
    updateDelay: Int | Double = null,
    view: MapViewProperties = null
  ): PrintViewModelProperties = {
    val __obj = js.Dynamic.literal()
    if (allowedFormats != null) __obj.updateDynamic("allowedFormats")(allowedFormats.asInstanceOf[js.Any])
    if (allowedLayouts != null) __obj.updateDynamic("allowedLayouts")(allowedLayouts.asInstanceOf[js.Any])
    if (printServiceUrl != null) __obj.updateDynamic("printServiceUrl")(printServiceUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(scaleEnabled)) __obj.updateDynamic("scaleEnabled")(scaleEnabled.asInstanceOf[js.Any])
    if (updateDelay != null) __obj.updateDynamic("updateDelay")(updateDelay.asInstanceOf[js.Any])
    if (view != null) __obj.updateDynamic("view")(view.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrintViewModelProperties]
  }
}


package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.TopLevel
import typings.arcgisJsApi.arcgisJsApiStrings.disabled
import typings.arcgisJsApi.arcgisJsApiStrings.error
import typings.arcgisJsApi.arcgisJsApiStrings.initializing
import typings.arcgisJsApi.arcgisJsApiStrings.ready
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrintViewModel extends Accessor {
  /**
    * Specify the print output file format(s) that the user can select based on the options available from the print service. This property can take a string value or an array of string values.  When this value is "all" (default value), all the print service formats are available to be used. When an array of string values is used, only those values that match the options available from the print service will be used. If none of the input string values match those available from the print service, `allowedFormats` will fallback to default behavior.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print-PrintViewModel.html#allowedFormats)
    *
    * @default "all"
    */
  var allowedFormats: String | js.Array[String] = js.native
  /**
    * Specify the print output layout(s) that the user can select based on the options available from the print service. This property can take a string value or an array of string values.  When this value is "all" (default value), all the print service layouts are available to be used. When an array of string values is used, only those values that match the options available from the print service will be used. If none of the input string values match those available from the print service, `allowedLayouts` will fallback to default behavior.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print-PrintViewModel.html#allowedLayouts)
    *
    * @default "all"
    */
  var allowedLayouts: String | js.Array[String] = js.native
  /**
    * The URL of the REST endpoint of the Export Web Map Task.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print-PrintViewModel.html#printServiceUrl)
    */
  var printServiceUrl: String = js.native
  /**
    * When `true`, scale is used in the printed map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print-PrintViewModel.html#scaleEnabled)
    *
    * @default false
    */
  var scaleEnabled: Boolean = js.native
  /**
    * The view model's state.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print-PrintViewModel.html#state)
    *
    * @default disabled
    */
  val state: disabled | initializing | ready | error = js.native
  /**
    * The service metadata that contains the [format](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print-TemplateOptions.html#format) and [layout](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print-TemplateOptions.html#layout) information for the printout.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print-PrintViewModel.html#templatesInfo)
    */
  val templatesInfo: js.Any = js.native
  /**
    * The time interval in milliseconds between each job status request sent to an asynchronous GP task.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print-PrintViewModel.html#updateDelay)
    *
    * @default 1000
    */
  var updateDelay: Double = js.native
  /**
    * The view from which the widget will operate.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print-PrintViewModel.html#view)
    */
  var view: MapView = js.native
  /**
    * This method should be called to load the view model's printing resources.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print-PrintViewModel.html#load)
    *
    *
    */
  def load(): js.Promise[_] = js.native
  /**
    * Prints (exports) the current MapView according to selected options.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print-PrintViewModel.html#print)
    *
    * @param printTemplate The [PrintTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-PrintTemplate.html) is used to specify the layout template options which is then used by the PrintTask to generate the print page.
    *
    */
  def print(printTemplate: PrintTemplate): js.Promise[_] = js.native
}

@JSGlobal("__esri.PrintViewModel")
@js.native
object PrintViewModel extends TopLevel[PrintViewModelConstructor]


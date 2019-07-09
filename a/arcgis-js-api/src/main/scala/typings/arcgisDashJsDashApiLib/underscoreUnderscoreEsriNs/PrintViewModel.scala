package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrintViewModel extends Accessor {
  /**
    * The URL of the REST endpoint of the Export Web Map Task.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print-PrintViewModel.html#printServiceUrl)
    */
  var printServiceUrl: java.lang.String = js.native
  /**
    * When `true`, scale is used in the printed map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print-PrintViewModel.html#scaleEnabled)
    *
    * @default false
    */
  var scaleEnabled: scala.Boolean = js.native
  /**
    * The view model's state.  **Possible Values:** disabled | ready | complete
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print-PrintViewModel.html#state)
    *
    * @default disabled
    */
  val state: java.lang.String = js.native
  /**
    * The service metadata that contains the layout/format information for the printout.
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
  var updateDelay: scala.Double = js.native
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
  def load(): arcgisDashJsDashApiLib.IPromise[_] = js.native
  /**
    * Prints (exports) the current MapView according to selected options.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print-PrintViewModel.html#print)
    *
    * @param printTemplate The [PrintTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-PrintTemplate.html) is used to specify the layout template options which is then used by the PrintTask to generate the print page.
    *
    */
  def print(printTemplate: PrintTemplate): arcgisDashJsDashApiLib.IPromise[_] = js.native
}

@JSGlobal("__esri.PrintViewModel")
@js.native
class PrintViewModelCls () extends PrintViewModel {
  def this(properties: PrintViewModelProperties) = this()
}


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


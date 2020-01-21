package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("__esri.PrintTask")
@js.native
/**
  * The PrintTask generates a printer-ready version of the map using an [Export Web Map Task](https://developers.arcgis.com/rest/services-reference/export-web-map-task.htm) available with ArGIS Server 10.1 and later. This class is used when you want to have more granular control over the user interface, for example, if you want to provide users the ability to define what appears on the printed page.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-PrintTask.html)
  */
class PrintTaskCls () extends PrintTask {
  def this(properties: PrintTaskProperties) = this()
}


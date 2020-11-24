package typings.arcgisJsApi.printTaskMod

import typings.arcgisJsApi.esri.PrintTask
import typings.arcgisJsApi.esri.PrintTaskProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("esri/tasks/PrintTask", JSImport.Namespace)
@js.native
/**
  * The PrintTask generates a printer-ready version of the map using an [Export Web Map Task](https://developers.arcgis.com/rest/services-reference/export-web-map-task.htm) available with ArGIS Server 10.1 and later.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-PrintTask.html)
  */
class Class () extends PrintTask {
  def this(properties: PrintTaskProperties) = this()
}

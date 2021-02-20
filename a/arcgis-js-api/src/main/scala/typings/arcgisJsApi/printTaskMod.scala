package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.PrintTask
import typings.arcgisJsApi.esri.PrintTaskConstructor
import typings.arcgisJsApi.esri.PrintTaskProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object printTaskMod extends Shortcut {
  
  @JSImport("esri/tasks/PrintTask", JSImport.Namespace)
  @js.native
  val ^ : PrintTaskConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
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
  
  type _To = PrintTaskConstructor
  
  /* This means you don't have to write `^`, but can instead just say `printTaskMod.foo` */
  override def _to: PrintTaskConstructor = ^
}

package typings.agGrid.mainMod

import typings.agGrid.gridOptionsMod.GridOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/main", "ComponentUtil")
@js.native
class ComponentUtil ()
  extends typings.agGrid.componentUtilMod.ComponentUtil

/* static members */
@JSImport("ag-grid/dist/lib/main", "ComponentUtil")
@js.native
object ComponentUtil extends js.Object {
  var ALL_PROPERTIES: js.Array[String] = js.native
  var ARRAY_PROPERTIES: js.Array[String] = js.native
  var BOOLEAN_PROPERTIES: js.Array[String] = js.native
  var EVENTS: js.Array[String] = js.native
  var EVENT_CALLBACKS: js.Any = js.native
  var EVENT_CALLBACKS_NO_PREFIX: js.Any = js.native
  var FUNCTION_PROPERTIES: js.Array[String] = js.native
  var NUMBER_PROPERTIES: js.Array[String] = js.native
  var OBJECT_PROPERTIES: js.Array[String] = js.native
  var STRING_PROPERTIES: js.Array[String] = js.native
  def copyAttributesToGridOptions(gridOptions: GridOptions, component: js.Any): GridOptions = js.native
  def copyAttributesToGridOptions(gridOptions: GridOptions, component: js.Any, skipEventDeprecationCheck: Boolean): GridOptions = js.native
  def getCallbackForEvent(eventName: String): String = js.native
  def getEventCallbacks(): js.Array[String] = js.native
  def processOnChange(
    changes: js.Any,
    gridOptions: GridOptions,
    api: typings.agGrid.gridApiMod.GridApi,
    columnApi: typings.agGrid.columnApiMod.ColumnApi
  ): Unit = js.native
  def toBoolean(value: js.Any): Boolean = js.native
  def toNumber(value: js.Any): Double = js.native
}


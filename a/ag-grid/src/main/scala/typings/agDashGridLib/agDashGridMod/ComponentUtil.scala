package typings
package agDashGridLib.agDashGridMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid", "ComponentUtil")
@js.native
class ComponentUtil ()
  extends agDashGridLib.distLibComponentsComponentUtilMod.ComponentUtil

/* static members */
@JSImport("ag-grid", "ComponentUtil")
@js.native
object ComponentUtil extends js.Object {
  var ALL_PROPERTIES: js.Array[java.lang.String] = js.native
  var ARRAY_PROPERTIES: js.Array[java.lang.String] = js.native
  var BOOLEAN_PROPERTIES: js.Array[java.lang.String] = js.native
  var EVENTS: js.Array[java.lang.String] = js.native
  var EVENT_CALLBACKS: js.Any = js.native
  var EVENT_CALLBACKS_NO_PREFIX: js.Any = js.native
  var FUNCTION_PROPERTIES: js.Array[java.lang.String] = js.native
  var NUMBER_PROPERTIES: js.Array[java.lang.String] = js.native
  var OBJECT_PROPERTIES: js.Array[java.lang.String] = js.native
  var STRING_PROPERTIES: js.Array[java.lang.String] = js.native
  def copyAttributesToGridOptions(gridOptions: agDashGridLib.distLibEntitiesGridOptionsMod.GridOptions, component: js.Any): agDashGridLib.distLibEntitiesGridOptionsMod.GridOptions = js.native
  def copyAttributesToGridOptions(
    gridOptions: agDashGridLib.distLibEntitiesGridOptionsMod.GridOptions,
    component: js.Any,
    skipEventDeprecationCheck: scala.Boolean
  ): agDashGridLib.distLibEntitiesGridOptionsMod.GridOptions = js.native
  def getCallbackForEvent(eventName: java.lang.String): java.lang.String = js.native
  def getEventCallbacks(): js.Array[java.lang.String] = js.native
  def processOnChange(
    changes: js.Any,
    gridOptions: agDashGridLib.distLibEntitiesGridOptionsMod.GridOptions,
    api: agDashGridLib.distLibGridApiMod.GridApi,
    columnApi: agDashGridLib.distLibColumnControllerColumnApiMod.ColumnApi
  ): scala.Unit = js.native
  def toBoolean(value: js.Any): scala.Boolean = js.native
  def toNumber(value: js.Any): scala.Double = js.native
}


package typings.agGrid.mod

import typings.agGrid.gridOptionsMod.GridOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ag-grid", "ComponentUtil")
@js.native
class ComponentUtil ()
  extends typings.agGrid.componentUtilMod.ComponentUtil
/* static members */
object ComponentUtil {
  
  @JSImport("ag-grid", "ComponentUtil")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ag-grid", "ComponentUtil.ALL_PROPERTIES")
  @js.native
  def ALL_PROPERTIES: js.Array[String] = js.native
  @scala.inline
  def ALL_PROPERTIES_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ALL_PROPERTIES")(x.asInstanceOf[js.Any])
  
  @JSImport("ag-grid", "ComponentUtil.ARRAY_PROPERTIES")
  @js.native
  def ARRAY_PROPERTIES: js.Array[String] = js.native
  @scala.inline
  def ARRAY_PROPERTIES_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ARRAY_PROPERTIES")(x.asInstanceOf[js.Any])
  
  @JSImport("ag-grid", "ComponentUtil.BOOLEAN_PROPERTIES")
  @js.native
  def BOOLEAN_PROPERTIES: js.Array[String] = js.native
  @scala.inline
  def BOOLEAN_PROPERTIES_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BOOLEAN_PROPERTIES")(x.asInstanceOf[js.Any])
  
  @JSImport("ag-grid", "ComponentUtil.EVENTS")
  @js.native
  def EVENTS: js.Array[String] = js.native
  @scala.inline
  def EVENTS_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EVENTS")(x.asInstanceOf[js.Any])
  
  @JSImport("ag-grid", "ComponentUtil.EVENT_CALLBACKS")
  @js.native
  def EVENT_CALLBACKS: js.Any = js.native
  @scala.inline
  def EVENT_CALLBACKS_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EVENT_CALLBACKS")(x.asInstanceOf[js.Any])
  
  @JSImport("ag-grid", "ComponentUtil.EVENT_CALLBACKS_NO_PREFIX")
  @js.native
  def EVENT_CALLBACKS_NO_PREFIX: js.Any = js.native
  @scala.inline
  def EVENT_CALLBACKS_NO_PREFIX_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EVENT_CALLBACKS_NO_PREFIX")(x.asInstanceOf[js.Any])
  
  @JSImport("ag-grid", "ComponentUtil.FUNCTION_PROPERTIES")
  @js.native
  def FUNCTION_PROPERTIES: js.Array[String] = js.native
  @scala.inline
  def FUNCTION_PROPERTIES_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FUNCTION_PROPERTIES")(x.asInstanceOf[js.Any])
  
  @JSImport("ag-grid", "ComponentUtil.NUMBER_PROPERTIES")
  @js.native
  def NUMBER_PROPERTIES: js.Array[String] = js.native
  @scala.inline
  def NUMBER_PROPERTIES_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NUMBER_PROPERTIES")(x.asInstanceOf[js.Any])
  
  @JSImport("ag-grid", "ComponentUtil.OBJECT_PROPERTIES")
  @js.native
  def OBJECT_PROPERTIES: js.Array[String] = js.native
  @scala.inline
  def OBJECT_PROPERTIES_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OBJECT_PROPERTIES")(x.asInstanceOf[js.Any])
  
  @JSImport("ag-grid", "ComponentUtil.STRING_PROPERTIES")
  @js.native
  def STRING_PROPERTIES: js.Array[String] = js.native
  @scala.inline
  def STRING_PROPERTIES_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("STRING_PROPERTIES")(x.asInstanceOf[js.Any])
  
  @JSImport("ag-grid", "ComponentUtil.copyAttributesToGridOptions")
  @js.native
  def copyAttributesToGridOptions(gridOptions: GridOptions, component: js.Any): GridOptions = js.native
  @JSImport("ag-grid", "ComponentUtil.copyAttributesToGridOptions")
  @js.native
  def copyAttributesToGridOptions(gridOptions: GridOptions, component: js.Any, skipEventDeprecationCheck: Boolean): GridOptions = js.native
  
  @JSImport("ag-grid", "ComponentUtil.getCallbackForEvent")
  @js.native
  def getCallbackForEvent(eventName: String): String = js.native
  
  @JSImport("ag-grid", "ComponentUtil.getEventCallbacks")
  @js.native
  def getEventCallbacks(): js.Array[String] = js.native
  
  @JSImport("ag-grid", "ComponentUtil.processOnChange")
  @js.native
  def processOnChange(
    changes: js.Any,
    gridOptions: GridOptions,
    api: typings.agGrid.gridApiMod.GridApi,
    columnApi: typings.agGrid.columnApiMod.ColumnApi
  ): Unit = js.native
  
  @JSImport("ag-grid", "ComponentUtil.toBoolean")
  @js.native
  def toBoolean(value: js.Any): Boolean = js.native
  
  @JSImport("ag-grid", "ComponentUtil.toNumber")
  @js.native
  def toNumber(value: js.Any): Double = js.native
}

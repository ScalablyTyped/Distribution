package typings.agGrid

import typings.agGrid.columnApiMod.ColumnApi
import typings.agGrid.gridApiMod.GridApi
import typings.agGrid.gridOptionsMod.GridOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentUtilMod {
  
  @JSImport("ag-grid/dist/lib/components/componentUtil", "ComponentUtil")
  @js.native
  class ComponentUtil () extends StObject
  /* static members */
  object ComponentUtil {
    
    @JSImport("ag-grid/dist/lib/components/componentUtil", "ComponentUtil")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ag-grid/dist/lib/components/componentUtil", "ComponentUtil.ALL_PROPERTIES")
    @js.native
    def ALL_PROPERTIES: js.Array[String] = js.native
    @scala.inline
    def ALL_PROPERTIES_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ALL_PROPERTIES")(x.asInstanceOf[js.Any])
    
    @JSImport("ag-grid/dist/lib/components/componentUtil", "ComponentUtil.ARRAY_PROPERTIES")
    @js.native
    def ARRAY_PROPERTIES: js.Array[String] = js.native
    @scala.inline
    def ARRAY_PROPERTIES_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ARRAY_PROPERTIES")(x.asInstanceOf[js.Any])
    
    @JSImport("ag-grid/dist/lib/components/componentUtil", "ComponentUtil.BOOLEAN_PROPERTIES")
    @js.native
    def BOOLEAN_PROPERTIES: js.Array[String] = js.native
    @scala.inline
    def BOOLEAN_PROPERTIES_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BOOLEAN_PROPERTIES")(x.asInstanceOf[js.Any])
    
    @JSImport("ag-grid/dist/lib/components/componentUtil", "ComponentUtil.EVENTS")
    @js.native
    def EVENTS: js.Array[String] = js.native
    @scala.inline
    def EVENTS_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EVENTS")(x.asInstanceOf[js.Any])
    
    @JSImport("ag-grid/dist/lib/components/componentUtil", "ComponentUtil.EVENT_CALLBACKS")
    @js.native
    def EVENT_CALLBACKS: js.Any = js.native
    @scala.inline
    def EVENT_CALLBACKS_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EVENT_CALLBACKS")(x.asInstanceOf[js.Any])
    
    @JSImport("ag-grid/dist/lib/components/componentUtil", "ComponentUtil.EVENT_CALLBACKS_NO_PREFIX")
    @js.native
    def EVENT_CALLBACKS_NO_PREFIX: js.Any = js.native
    @scala.inline
    def EVENT_CALLBACKS_NO_PREFIX_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EVENT_CALLBACKS_NO_PREFIX")(x.asInstanceOf[js.Any])
    
    @JSImport("ag-grid/dist/lib/components/componentUtil", "ComponentUtil.FUNCTION_PROPERTIES")
    @js.native
    def FUNCTION_PROPERTIES: js.Array[String] = js.native
    @scala.inline
    def FUNCTION_PROPERTIES_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FUNCTION_PROPERTIES")(x.asInstanceOf[js.Any])
    
    @JSImport("ag-grid/dist/lib/components/componentUtil", "ComponentUtil.NUMBER_PROPERTIES")
    @js.native
    def NUMBER_PROPERTIES: js.Array[String] = js.native
    @scala.inline
    def NUMBER_PROPERTIES_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NUMBER_PROPERTIES")(x.asInstanceOf[js.Any])
    
    @JSImport("ag-grid/dist/lib/components/componentUtil", "ComponentUtil.OBJECT_PROPERTIES")
    @js.native
    def OBJECT_PROPERTIES: js.Array[String] = js.native
    @scala.inline
    def OBJECT_PROPERTIES_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OBJECT_PROPERTIES")(x.asInstanceOf[js.Any])
    
    @JSImport("ag-grid/dist/lib/components/componentUtil", "ComponentUtil.STRING_PROPERTIES")
    @js.native
    def STRING_PROPERTIES: js.Array[String] = js.native
    @scala.inline
    def STRING_PROPERTIES_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("STRING_PROPERTIES")(x.asInstanceOf[js.Any])
    
    @JSImport("ag-grid/dist/lib/components/componentUtil", "ComponentUtil.copyAttributesToGridOptions")
    @js.native
    def copyAttributesToGridOptions(gridOptions: GridOptions, component: js.Any): GridOptions = js.native
    @JSImport("ag-grid/dist/lib/components/componentUtil", "ComponentUtil.copyAttributesToGridOptions")
    @js.native
    def copyAttributesToGridOptions(gridOptions: GridOptions, component: js.Any, skipEventDeprecationCheck: Boolean): GridOptions = js.native
    
    @JSImport("ag-grid/dist/lib/components/componentUtil", "ComponentUtil.getCallbackForEvent")
    @js.native
    def getCallbackForEvent(eventName: String): String = js.native
    
    @JSImport("ag-grid/dist/lib/components/componentUtil", "ComponentUtil.getEventCallbacks")
    @js.native
    def getEventCallbacks(): js.Array[String] = js.native
    
    @JSImport("ag-grid/dist/lib/components/componentUtil", "ComponentUtil.processOnChange")
    @js.native
    def processOnChange(changes: js.Any, gridOptions: GridOptions, api: GridApi, columnApi: ColumnApi): Unit = js.native
    
    @JSImport("ag-grid/dist/lib/components/componentUtil", "ComponentUtil.toBoolean")
    @js.native
    def toBoolean(value: js.Any): Boolean = js.native
    
    @JSImport("ag-grid/dist/lib/components/componentUtil", "ComponentUtil.toNumber")
    @js.native
    def toNumber(value: js.Any): Double = js.native
  }
}

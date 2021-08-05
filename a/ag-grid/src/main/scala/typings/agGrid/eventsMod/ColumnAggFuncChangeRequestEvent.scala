package typings.agGrid.eventsMod

import typings.agGrid.columnApiMod.ColumnApi
import typings.agGrid.columnMod.Column
import typings.agGrid.gridApiMod.GridApi
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnAggFuncChangeRequestEvent
  extends StObject
     with ColumnRequestEvent {
  
  var aggFunc: js.Any
}
object ColumnAggFuncChangeRequestEvent {
  
  inline def apply(aggFunc: js.Any, api: GridApi, columnApi: ColumnApi, columns: js.Array[Column], `type`: String): ColumnAggFuncChangeRequestEvent = {
    val __obj = js.Dynamic.literal(aggFunc = aggFunc.asInstanceOf[js.Any], api = api.asInstanceOf[js.Any], columnApi = columnApi.asInstanceOf[js.Any], columns = columns.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnAggFuncChangeRequestEvent]
  }
  
  extension [Self <: ColumnAggFuncChangeRequestEvent](x: Self) {
    
    inline def setAggFunc(value: js.Any): Self = StObject.set(x, "aggFunc", value.asInstanceOf[js.Any])
  }
}

package typings.agGrid.eventsMod

import typings.agGrid.columnApiMod.ColumnApi
import typings.agGrid.gridApiMod.GridApi
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FlashCellsEvent extends AgGridEvent {
  
  var cells: js.Any = js.native
}
object FlashCellsEvent {
  
  @scala.inline
  def apply(api: GridApi, cells: js.Any, columnApi: ColumnApi, `type`: String): FlashCellsEvent = {
    val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], cells = cells.asInstanceOf[js.Any], columnApi = columnApi.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlashCellsEvent]
  }
  
  @scala.inline
  implicit class FlashCellsEventMutableBuilder[Self <: FlashCellsEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCells(value: js.Any): Self = StObject.set(x, "cells", value.asInstanceOf[js.Any])
  }
}

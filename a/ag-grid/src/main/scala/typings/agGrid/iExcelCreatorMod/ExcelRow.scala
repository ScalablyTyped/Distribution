package typings.agGrid.iExcelCreatorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExcelRow extends StObject {
  
  var cells: js.Array[ExcelCell]
}
object ExcelRow {
  
  @scala.inline
  def apply(cells: js.Array[ExcelCell]): ExcelRow = {
    val __obj = js.Dynamic.literal(cells = cells.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExcelRow]
  }
  
  @scala.inline
  implicit class ExcelRowMutableBuilder[Self <: ExcelRow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCells(value: js.Array[ExcelCell]): Self = StObject.set(x, "cells", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellsVarargs(value: ExcelCell*): Self = StObject.set(x, "cells", js.Array(value :_*))
  }
}

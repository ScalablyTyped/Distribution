package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cell extends StObject {
  
  /**
    * For a Microsoft Excel workbook, provides the location of the cell, as an absolute cell reference, that contains the data. For example, Sheet2!C5 for cell C5 on Sheet2.
    */
  var CellReference: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The column number of the column that contains the data. For a Microsoft Excel workbook, the column number corresponds to the alphabetical column identifiers. For example, a value of 1 for Column corresponds to the A column in the workbook.
    */
  var Column: js.UndefOr[Long] = js.undefined
  
  /**
    * The name of the column that contains the data.
    */
  var ColumnName: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The row number of the row that contains the data.
    */
  var Row: js.UndefOr[Long] = js.undefined
}
object Cell {
  
  inline def apply(): Cell = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cell]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Cell] (val x: Self) extends AnyVal {
    
    inline def setCellReference(value: NonEmptyString): Self = StObject.set(x, "CellReference", value.asInstanceOf[js.Any])
    
    inline def setCellReferenceUndefined: Self = StObject.set(x, "CellReference", js.undefined)
    
    inline def setColumn(value: Long): Self = StObject.set(x, "Column", value.asInstanceOf[js.Any])
    
    inline def setColumnName(value: NonEmptyString): Self = StObject.set(x, "ColumnName", value.asInstanceOf[js.Any])
    
    inline def setColumnNameUndefined: Self = StObject.set(x, "ColumnName", js.undefined)
    
    inline def setColumnUndefined: Self = StObject.set(x, "Column", js.undefined)
    
    inline def setRow(value: Long): Self = StObject.set(x, "Row", value.asInstanceOf[js.Any])
    
    inline def setRowUndefined: Self = StObject.set(x, "Row", js.undefined)
  }
}

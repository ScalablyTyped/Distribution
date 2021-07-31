package typings.activexLibreoffice.com_.sun.star.sheet

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * describes a page break in a spreadsheet.
  * @see com.sun.star.sheet.XSheetPageBreak
  */
trait TablePageBreakData extends StObject {
  
  /** is `TRUE` for a manual page break, `FALSE` for an automatic one. */
  var ManualBreak: Boolean
  
  /** the position (column or row index) of the page break. */
  var Position: Double
}
object TablePageBreakData {
  
  @scala.inline
  def apply(ManualBreak: Boolean, Position: Double): TablePageBreakData = {
    val __obj = js.Dynamic.literal(ManualBreak = ManualBreak.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any])
    __obj.asInstanceOf[TablePageBreakData]
  }
  
  @scala.inline
  implicit class TablePageBreakDataMutableBuilder[Self <: TablePageBreakData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setManualBreak(value: Boolean): Self = StObject.set(x, "ManualBreak", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: Double): Self = StObject.set(x, "Position", value.asInstanceOf[js.Any])
  }
}

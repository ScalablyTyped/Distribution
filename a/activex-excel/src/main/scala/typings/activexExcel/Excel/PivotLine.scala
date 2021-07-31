package typings.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PivotLine extends StObject {
  
  val Application: typings.activexExcel.Excel.Application
  
  val Creator: XlCreator
  
  @JSName("Excel.PivotLine_typekey")
  var ExcelDotPivotLine_typekey: PivotLine
  
  val LineType: XlPivotLineType
  
  val Parent: js.Any
  
  def PivotLineCells(Index: Double): PivotCell
  @JSName("PivotLineCells")
  val PivotLineCells_Original: PivotLineCells
  
  val Position: Double
}
object PivotLine {
  
  @scala.inline
  def apply(
    Application: Application,
    Creator: XlCreator,
    ExcelDotPivotLine_typekey: PivotLine,
    LineType: XlPivotLineType,
    Parent: js.Any,
    PivotLineCells: PivotLineCells,
    Position: Double
  ): PivotLine = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], LineType = LineType.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], PivotLineCells = PivotLineCells.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.PivotLine_typekey")(ExcelDotPivotLine_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[PivotLine]
  }
  
  @scala.inline
  implicit class PivotLineMutableBuilder[Self <: PivotLine] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: XlCreator): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcelDotPivotLine_typekey(value: PivotLine): Self = StObject.set(x, "Excel.PivotLine_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineType(value: XlPivotLineType): Self = StObject.set(x, "LineType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPivotLineCells(value: PivotLineCells): Self = StObject.set(x, "PivotLineCells", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: Double): Self = StObject.set(x, "Position", value.asInstanceOf[js.Any])
  }
}

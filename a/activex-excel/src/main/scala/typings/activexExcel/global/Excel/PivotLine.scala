package typings.activexExcel.global.Excel

import typings.activexExcel.Excel.PivotLineCells
import typings.activexExcel.Excel.XlCreator
import typings.activexExcel.Excel.XlPivotLineType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Excel.PivotLine")
@js.native
/* private */ open class PivotLine ()
  extends StObject
     with typings.activexExcel.Excel.PivotLine {
  
  /* CompleteClass */
  override val Application: typings.activexExcel.Excel.Application = js.native
  
  /* CompleteClass */
  override val Creator: XlCreator = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Excel.PivotLine_typekey")
  var ExcelDotPivotLine_typekey: typings.activexExcel.Excel.PivotLine = js.native
  
  /* CompleteClass */
  override val LineType: XlPivotLineType = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
  
  /* CompleteClass */
  override def PivotLineCells(Index: Double): typings.activexExcel.Excel.PivotCell = js.native
  /* CompleteClass */
  @JSName("PivotLineCells")
  override val PivotLineCells_Original: PivotLineCells = js.native
  
  /* CompleteClass */
  override val Position: Double = js.native
}

package typings.activexExcel.global.Excel

import typings.activexExcel.Excel.Range
import typings.activexExcel.Excel.XlCreator
import typings.activexExcel.Excel.XlDirection
import typings.activexExcel.Excel.XlPageBreak
import typings.activexExcel.Excel.XlPageBreakExtent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Excel.VPageBreak")
@js.native
/* private */ open class VPageBreak ()
  extends StObject
     with typings.activexExcel.Excel.VPageBreak {
  
  /* CompleteClass */
  override val Application: typings.activexExcel.Excel.Application = js.native
  
  /* CompleteClass */
  override val Creator: XlCreator = js.native
  
  /* CompleteClass */
  override def Delete(): Unit = js.native
  
  /* CompleteClass */
  override def DragOff(Direction: XlDirection, RegionIndex: Double): Unit = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Excel.VPageBreak_typekey")
  var ExcelDotVPageBreak_typekey: typings.activexExcel.Excel.VPageBreak = js.native
  
  /* CompleteClass */
  override val Extent: XlPageBreakExtent = js.native
  
  /* CompleteClass */
  override def Location(Address: String): Range = js.native
  /* CompleteClass */
  override def Location(RowIndex: Double): Range = js.native
  /* CompleteClass */
  override def Location(RowIndex: Double, ColumnIndex: Double): Range = js.native
  /* CompleteClass */
  @JSName("Location")
  var Location_Original: Range = js.native
  
  /* CompleteClass */
  override val Parent: typings.activexExcel.Excel.Worksheet = js.native
  
  /* CompleteClass */
  var Type: XlPageBreak = js.native
}

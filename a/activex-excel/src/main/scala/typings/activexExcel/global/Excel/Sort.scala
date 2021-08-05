package typings.activexExcel.global.Excel

import typings.activexExcel.Excel.Range
import typings.activexExcel.Excel.SortFields
import typings.activexExcel.Excel.XlCreator
import typings.activexExcel.Excel.XlSortMethod
import typings.activexExcel.Excel.XlSortOrientation
import typings.activexExcel.Excel.XlYesNoGuess
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Excel.Sort")
@js.native
/* private */ class Sort ()
  extends StObject
     with typings.activexExcel.Excel.Sort {
  
  /* CompleteClass */
  override val Application: typings.activexExcel.Excel.Application = js.native
  
  /* CompleteClass */
  override def Apply(): Unit = js.native
  
  /* CompleteClass */
  override val Creator: XlCreator = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Excel.Sort_typekey")
  var ExcelDotSort_typekey: typings.activexExcel.Excel.Sort = js.native
  
  /* CompleteClass */
  var Header: XlYesNoGuess = js.native
  
  /* CompleteClass */
  var MatchCase: Boolean = js.native
  
  /* CompleteClass */
  var Orientation: XlSortOrientation = js.native
  
  /* CompleteClass */
  override val Parent: js.Any = js.native
  
  /* CompleteClass */
  override def Rng(Address: String): Range = js.native
  /* CompleteClass */
  override def Rng(RowIndex: Double): Range = js.native
  /* CompleteClass */
  override def Rng(RowIndex: Double, ColumnIndex: Double): Range = js.native
  /* CompleteClass */
  @JSName("Rng")
  override val Rng_Original: Range = js.native
  
  /* CompleteClass */
  override def SetRange(Rng: Range): Unit = js.native
  
  /* CompleteClass */
  override def SortFields(Index: js.Any): typings.activexExcel.Excel.SortField = js.native
  /* CompleteClass */
  @JSName("SortFields")
  override val SortFields_Original: SortFields = js.native
  
  /* CompleteClass */
  var SortMethod: XlSortMethod = js.native
}

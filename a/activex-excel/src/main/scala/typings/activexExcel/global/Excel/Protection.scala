package typings.activexExcel.global.Excel

import typings.activexExcel.Excel.AllowEditRanges
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Excel.Protection")
@js.native
class Protection protected ()
  extends StObject
     with typings.activexExcel.Excel.Protection {
  
  /* CompleteClass */
  override val AllowDeletingColumns: Boolean = js.native
  
  /* CompleteClass */
  override val AllowDeletingRows: Boolean = js.native
  
  /* CompleteClass */
  override def AllowEditRanges(Index: String): typings.activexExcel.Excel.AllowEditRange = js.native
  /* CompleteClass */
  override def AllowEditRanges(Index: Double): typings.activexExcel.Excel.AllowEditRange = js.native
  /* CompleteClass */
  @JSName("AllowEditRanges")
  override val AllowEditRanges_Original: AllowEditRanges = js.native
  
  /* CompleteClass */
  override val AllowFiltering: Boolean = js.native
  
  /* CompleteClass */
  override val AllowFormattingCells: Boolean = js.native
  
  /* CompleteClass */
  override val AllowFormattingColumns: Boolean = js.native
  
  /* CompleteClass */
  override val AllowFormattingRows: Boolean = js.native
  
  /* CompleteClass */
  override val AllowInsertingColumns: Boolean = js.native
  
  /* CompleteClass */
  override val AllowInsertingHyperlinks: Boolean = js.native
  
  /* CompleteClass */
  override val AllowInsertingRows: Boolean = js.native
  
  /* CompleteClass */
  override val AllowSorting: Boolean = js.native
  
  /* CompleteClass */
  override val AllowUsingPivotTables: Boolean = js.native
  
  /* CompleteClass */
  @JSName("Excel.Protection_typekey")
  var ExcelDotProtection_typekey: typings.activexExcel.Excel.Protection = js.native
}

package typings.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Protection extends StObject {
  
  val AllowDeletingColumns: Boolean = js.native
  
  val AllowDeletingRows: Boolean = js.native
  
  def AllowEditRanges(Index: String): AllowEditRange = js.native
  def AllowEditRanges(Index: Double): AllowEditRange = js.native
  @JSName("AllowEditRanges")
  val AllowEditRanges_Original: AllowEditRanges = js.native
  
  val AllowFiltering: Boolean = js.native
  
  val AllowFormattingCells: Boolean = js.native
  
  val AllowFormattingColumns: Boolean = js.native
  
  val AllowFormattingRows: Boolean = js.native
  
  val AllowInsertingColumns: Boolean = js.native
  
  val AllowInsertingHyperlinks: Boolean = js.native
  
  val AllowInsertingRows: Boolean = js.native
  
  val AllowSorting: Boolean = js.native
  
  val AllowUsingPivotTables: Boolean = js.native
  
  @JSName("Excel.Protection_typekey")
  var ExcelDotProtection_typekey: Protection = js.native
}

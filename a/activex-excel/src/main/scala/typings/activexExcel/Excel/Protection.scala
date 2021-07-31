package typings.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Protection extends StObject {
  
  val AllowDeletingColumns: Boolean
  
  val AllowDeletingRows: Boolean
  
  def AllowEditRanges(Index: String): AllowEditRange
  def AllowEditRanges(Index: Double): AllowEditRange
  @JSName("AllowEditRanges")
  val AllowEditRanges_Original: AllowEditRanges
  
  val AllowFiltering: Boolean
  
  val AllowFormattingCells: Boolean
  
  val AllowFormattingColumns: Boolean
  
  val AllowFormattingRows: Boolean
  
  val AllowInsertingColumns: Boolean
  
  val AllowInsertingHyperlinks: Boolean
  
  val AllowInsertingRows: Boolean
  
  val AllowSorting: Boolean
  
  val AllowUsingPivotTables: Boolean
  
  @JSName("Excel.Protection_typekey")
  var ExcelDotProtection_typekey: Protection
}
object Protection {
  
  @scala.inline
  def apply(
    AllowDeletingColumns: Boolean,
    AllowDeletingRows: Boolean,
    AllowEditRanges: AllowEditRanges,
    AllowFiltering: Boolean,
    AllowFormattingCells: Boolean,
    AllowFormattingColumns: Boolean,
    AllowFormattingRows: Boolean,
    AllowInsertingColumns: Boolean,
    AllowInsertingHyperlinks: Boolean,
    AllowInsertingRows: Boolean,
    AllowSorting: Boolean,
    AllowUsingPivotTables: Boolean,
    ExcelDotProtection_typekey: Protection
  ): Protection = {
    val __obj = js.Dynamic.literal(AllowDeletingColumns = AllowDeletingColumns.asInstanceOf[js.Any], AllowDeletingRows = AllowDeletingRows.asInstanceOf[js.Any], AllowEditRanges = AllowEditRanges.asInstanceOf[js.Any], AllowFiltering = AllowFiltering.asInstanceOf[js.Any], AllowFormattingCells = AllowFormattingCells.asInstanceOf[js.Any], AllowFormattingColumns = AllowFormattingColumns.asInstanceOf[js.Any], AllowFormattingRows = AllowFormattingRows.asInstanceOf[js.Any], AllowInsertingColumns = AllowInsertingColumns.asInstanceOf[js.Any], AllowInsertingHyperlinks = AllowInsertingHyperlinks.asInstanceOf[js.Any], AllowInsertingRows = AllowInsertingRows.asInstanceOf[js.Any], AllowSorting = AllowSorting.asInstanceOf[js.Any], AllowUsingPivotTables = AllowUsingPivotTables.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.Protection_typekey")(ExcelDotProtection_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Protection]
  }
  
  @scala.inline
  implicit class ProtectionMutableBuilder[Self <: Protection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowDeletingColumns(value: Boolean): Self = StObject.set(x, "AllowDeletingColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowDeletingRows(value: Boolean): Self = StObject.set(x, "AllowDeletingRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowEditRanges(value: AllowEditRanges): Self = StObject.set(x, "AllowEditRanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowFiltering(value: Boolean): Self = StObject.set(x, "AllowFiltering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowFormattingCells(value: Boolean): Self = StObject.set(x, "AllowFormattingCells", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowFormattingColumns(value: Boolean): Self = StObject.set(x, "AllowFormattingColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowFormattingRows(value: Boolean): Self = StObject.set(x, "AllowFormattingRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowInsertingColumns(value: Boolean): Self = StObject.set(x, "AllowInsertingColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowInsertingHyperlinks(value: Boolean): Self = StObject.set(x, "AllowInsertingHyperlinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowInsertingRows(value: Boolean): Self = StObject.set(x, "AllowInsertingRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowSorting(value: Boolean): Self = StObject.set(x, "AllowSorting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowUsingPivotTables(value: Boolean): Self = StObject.set(x, "AllowUsingPivotTables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcelDotProtection_typekey(value: Protection): Self = StObject.set(x, "Excel.Protection_typekey", value.asInstanceOf[js.Any])
  }
}

package typings.awsSdk.clientsDatabrewMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ViewFrame extends StObject {
  
  /**
    * Controls if analytics computation is enabled or disabled. Enabled by default.
    */
  var Analytics: js.UndefOr[AnalyticsMode] = js.undefined
  
  /**
    * The number of columns to include in the view frame, beginning with the StartColumnIndex value and ignoring any columns in the HiddenColumns list.
    */
  var ColumnRange: js.UndefOr[typings.awsSdk.clientsDatabrewMod.ColumnRange] = js.undefined
  
  /**
    * A list of columns to hide in the view frame.
    */
  var HiddenColumns: js.UndefOr[HiddenColumnList] = js.undefined
  
  /**
    * The number of rows to include in the view frame, beginning with the StartRowIndex value.
    */
  var RowRange: js.UndefOr[typings.awsSdk.clientsDatabrewMod.RowRange] = js.undefined
  
  /**
    * The starting index for the range of columns to return in the view frame.
    */
  var StartColumnIndex: typings.awsSdk.clientsDatabrewMod.StartColumnIndex
  
  /**
    * The starting index for the range of rows to return in the view frame.
    */
  var StartRowIndex: js.UndefOr[typings.awsSdk.clientsDatabrewMod.StartRowIndex] = js.undefined
}
object ViewFrame {
  
  inline def apply(StartColumnIndex: StartColumnIndex): ViewFrame = {
    val __obj = js.Dynamic.literal(StartColumnIndex = StartColumnIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewFrame]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ViewFrame] (val x: Self) extends AnyVal {
    
    inline def setAnalytics(value: AnalyticsMode): Self = StObject.set(x, "Analytics", value.asInstanceOf[js.Any])
    
    inline def setAnalyticsUndefined: Self = StObject.set(x, "Analytics", js.undefined)
    
    inline def setColumnRange(value: ColumnRange): Self = StObject.set(x, "ColumnRange", value.asInstanceOf[js.Any])
    
    inline def setColumnRangeUndefined: Self = StObject.set(x, "ColumnRange", js.undefined)
    
    inline def setHiddenColumns(value: HiddenColumnList): Self = StObject.set(x, "HiddenColumns", value.asInstanceOf[js.Any])
    
    inline def setHiddenColumnsUndefined: Self = StObject.set(x, "HiddenColumns", js.undefined)
    
    inline def setHiddenColumnsVarargs(value: ColumnName*): Self = StObject.set(x, "HiddenColumns", js.Array(value*))
    
    inline def setRowRange(value: RowRange): Self = StObject.set(x, "RowRange", value.asInstanceOf[js.Any])
    
    inline def setRowRangeUndefined: Self = StObject.set(x, "RowRange", js.undefined)
    
    inline def setStartColumnIndex(value: StartColumnIndex): Self = StObject.set(x, "StartColumnIndex", value.asInstanceOf[js.Any])
    
    inline def setStartRowIndex(value: StartRowIndex): Self = StObject.set(x, "StartRowIndex", value.asInstanceOf[js.Any])
    
    inline def setStartRowIndexUndefined: Self = StObject.set(x, "StartRowIndex", js.undefined)
  }
}
